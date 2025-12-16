package ru.ok.android.externcalls.analytics.internal.storage;

import defpackage.hz5;
import defpackage.kkb;
import defpackage.o2c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.Lock;
import java.util.zip.GZIPOutputStream;
import javax.inject.Provider;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* loaded from: classes2.dex */
public final class FileCacheWriter {
    private static final String LOG_TAG = "CallAnalyticsFileCacheWriter";
    private static final long MAX_FILE_LENGTH = 10000000;
    private final boolean compressContent;
    private final Provider<File> file;
    private final Lock lock;
    private long length = -1;
    private final ByteArrayOutputStream proxyStream = new ByteArrayOutputStream();
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();

    public FileCacheWriter(Provider<File> provider, boolean z, Lock lock) {
        this.file = provider;
        this.lock = lock;
        this.compressContent = z;
    }

    private void atomicWrite(boolean z, CallAnalyticsEvent callAnalyticsEvent, OutputStream outputStream) throws IOException {
        try {
            this.proxyStream.reset();
            OutputStream gZIPOutputStream = this.compressContent ? new GZIPOutputStream(this.proxyStream, 1024, true) : this.proxyStream;
            try {
                write(z, callAnalyticsEvent, gZIPOutputStream);
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                this.proxyStream.writeTo(outputStream);
                outputStream.flush();
            } finally {
            }
        } catch (RuntimeException e) {
            this.logger.report(LOG_TAG, "Error writing event to file cache", new FileCacheException(e));
        }
    }

    private void verifyOutputFormat(File file) {
        this.logger.d(LOG_TAG, "Existing file is not empty, check compression state");
        try {
            if (hz5.d(file) != this.compressContent) {
                this.logger.d(LOG_TAG, "Existing file compression doesn't match expected compression state (" + this.compressContent + "), drop");
                try {
                    drop();
                } catch (IOException e) {
                    this.logger.e(LOG_TAG, "drop caused by compression conflict failed", e);
                }
            } else {
                this.logger.d(LOG_TAG, "Existing file compression state matches expected one (" + this.compressContent + ")");
            }
        } catch (Throwable th) {
            this.logger.e(LOG_TAG, "Can't check if file compressed or not, drop", th);
            try {
                drop();
            } catch (IOException e2) {
                this.logger.e(LOG_TAG, "drop caused by compression conflict check fault failed", e2);
            }
        }
    }

    private void write(boolean z, CallAnalyticsEvent callAnalyticsEvent, OutputStream outputStream) throws IOException {
        if (z) {
            outputStream.write(hz5.a);
        }
        o2c o2cVar = new o2c(new kkb(outputStream));
        try {
            EventSerializer.INSTANCE.serialize(o2cVar, callAnalyticsEvent);
            o2cVar.close();
        } catch (Throwable th) {
            try {
                o2cVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void drop() throws IOException {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (file.exists()) {
                hz5.b(file);
                this.logger.d(LOG_TAG, "drop " + file);
            } else {
                this.logger.d(LOG_TAG, "no drop " + file);
            }
        } finally {
            this.length = hz5.e(file);
            this.lock.unlock();
        }
    }

    public void grab(Provider<File> provider) throws IOException {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (this.length == 0) {
                this.logger.d(LOG_TAG, "grab | input file is empty, cancel");
            } else if (file.exists()) {
                File file2 = provider.get();
                this.logger.d(LOG_TAG, "grab | " + file + " >> " + file2);
                if (hz5.e(file2) > MAX_FILE_LENGTH) {
                    hz5.b(file2);
                }
                long jE = hz5.e(file2);
                hz5.a(file2, file, this.compressContent);
                long jE2 = hz5.e(file2);
                this.logger.d(LOG_TAG, "grab | done, size changed: " + jE + " -> " + jE2);
            } else {
                this.logger.d(LOG_TAG, "grab | file " + file + " doesn't exist, cancel");
            }
        } finally {
            this.length = hz5.e(file);
            this.lock.unlock();
        }
    }

    public long length() {
        long j = this.length;
        if (j >= 0) {
            return j;
        }
        File file = this.file.get();
        try {
            this.lock.lock();
            long jE = hz5.e(file);
            this.length = jE;
            if (jE > 0) {
                verifyOutputFormat(file);
            }
            this.lock.unlock();
            return this.length;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public void writeToCache(CallAnalyticsEvent callAnalyticsEvent) {
        FileOutputStream fileOutputStream;
        boolean z;
        File file = this.file.get();
        if (length() > MAX_FILE_LENGTH) {
            this.logger.w(LOG_TAG, "append file too big, drop");
            try {
                drop();
            } catch (IOException e) {
                this.logger.e(LOG_TAG, "drop failed", e);
            }
        }
        try {
            try {
                this.lock.lock();
                hz5.g(file);
                z = true;
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e2) {
                this.logger.e(LOG_TAG, "Error while writing to disk" + callAnalyticsEvent, e2);
                try {
                    hz5.b(file);
                } catch (IOException unused) {
                    this.logger.e(LOG_TAG, "Can not delete broken file " + file.getPath(), e2);
                }
            }
            try {
                if (hz5.e(file) <= 0) {
                    z = false;
                }
                atomicWrite(z, callAnalyticsEvent, fileOutputStream);
                fileOutputStream.close();
                this.logger.v(LOG_TAG, "append (c=" + this.compressContent + ") " + callAnalyticsEvent);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            this.length = hz5.e(file);
            this.lock.unlock();
        }
    }
}
