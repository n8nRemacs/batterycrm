package ru.ok.android.onelog;

import defpackage.gy7;
import defpackage.kkb;
import defpackage.o2c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;

/* loaded from: classes2.dex */
final class FileAppender implements OneLogAppender {
    private final String collector;
    private final Provider<File> file;
    private long length = -1;
    private final Lock lock;

    public FileAppender(Provider<File> provider, Lock lock, String str) {
        this.file = provider;
        this.lock = lock;
        this.collector = str;
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(OneLogItem oneLogItem) {
        File file = this.file.get();
        try {
            try {
                this.lock.lock();
            } catch (IOException e) {
                file.delete();
                OneLogImpl.getInstance().getErrorHandler().handleFailedItemStore(e, oneLogItem);
            }
            if (OneLogImpl.getInstance().getForceFallbackLogs()) {
                throw new IOException("Testing log fallback");
            }
            Files.mkfile(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                if (file.length() > 0) {
                    fileOutputStream.write(Files.SEPARATOR);
                }
                o2c o2cVar = new o2c(new kkb(fileOutputStream));
                try {
                    ItemSerializer.INSTANCE.serialize((gy7) o2cVar, oneLogItem);
                    o2cVar.close();
                    fileOutputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            this.length = file.length();
            this.lock.unlock();
        }
    }

    public void drop() throws IOException {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (file.exists()) {
                Files.delete(file);
            }
        } finally {
            this.length = file.length();
            this.lock.unlock();
        }
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
    }

    public void grab(File file) throws IOException {
        File file2 = this.file.get();
        try {
            this.lock.lock();
            if (file2.exists()) {
                Files.cat(file, file2);
            }
        } finally {
            this.length = file2.length();
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
            this.length = file.length();
            this.lock.unlock();
            return this.length;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }
}
