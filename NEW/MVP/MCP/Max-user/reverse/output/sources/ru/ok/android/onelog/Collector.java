package ru.ok.android.onelog;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import defpackage.mri;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import ru.ok.android.commons.app.ApplicationProvider;

/* loaded from: classes2.dex */
final class Collector implements OneLogAppender {
    private static final String APPEND_FILENAME = "append";
    private static final ConcurrentHashMap<String, Collector> INSTANCES = new ConcurrentHashMap<>();
    private static final String LOG_DIRNAME = "onelog";
    private static final String UPLOAD_FILENAME = "upload";

    @SuppressLint({"StaticFieldLeak"})
    private static Collector lastInstance;
    private final String collector;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;
    private final AtomicReference<Worker> worker = new AtomicReference<>();
    private final AtomicReference<Uploader> uploader = new AtomicReference<>();
    private final Provider<File> uploadFile = new OneLogFile(UPLOAD_FILENAME);
    private final Lock uploadLock = new ReentrantLock();

    public final class OneLogFile implements Provider<File> {
        private File cachedFile;
        private final String name;

        public OneLogFile(String str) {
            this.name = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // javax.inject.Provider
        public File get() {
            File file = this.cachedFile;
            if (file != null) {
                return file;
            }
            File file2 = new File(new File(new File(Collector.this.context.getFilesDir(), Collector.LOG_DIRNAME), Collector.this.collector), this.name);
            this.cachedFile = file2;
            return file2;
        }
    }

    private Collector(Context context, String str) {
        this.context = context;
        this.collector = str;
    }

    public static void clearAllMaxTimeToUpload() {
        Iterator<Collector> it = INSTANCES.values().iterator();
        while (it.hasNext()) {
            it.next().getWorker().clearMaxMillisToUpload();
        }
    }

    public static void flushAll() {
        Iterator<Collector> it = INSTANCES.values().iterator();
        while (it.hasNext()) {
            it.next().flush();
        }
    }

    public static Collector getInstance(String str) {
        Application application = ApplicationProvider.a;
        Application applicationA = mri.a();
        Collector collector = lastInstance;
        if (collector != null && str.equals(collector.collector)) {
            return collector;
        }
        ConcurrentHashMap<String, Collector> concurrentHashMap = INSTANCES;
        Collector collector2 = concurrentHashMap.get(str);
        if (collector2 != null) {
            lastInstance = collector2;
            return collector2;
        }
        Collector collector3 = new Collector(applicationA, str);
        Collector collectorPutIfAbsent = concurrentHashMap.putIfAbsent(str, collector3);
        if (collectorPutIfAbsent != null) {
            lastInstance = collectorPutIfAbsent;
            return collectorPutIfAbsent;
        }
        lastInstance = collector3;
        return collector3;
    }

    private Uploader getUploader() {
        Uploader uploader = this.uploader.get();
        if (uploader != null) {
            return uploader;
        }
        Uploader uploader2 = new Uploader(this.uploadFile, this.uploadLock, this.collector);
        AtomicReference<Uploader> atomicReference = this.uploader;
        while (!atomicReference.compareAndSet(null, uploader2)) {
            if (atomicReference.get() != null) {
                return this.uploader.get();
            }
        }
        return uploader2;
    }

    private Worker getWorker() {
        Worker worker = this.worker.get();
        if (worker != null) {
            return worker;
        }
        Worker worker2 = new Worker(new OneLogFile(APPEND_FILENAME), new ReentrantLock(), this.collector);
        AtomicReference<Worker> atomicReference = this.worker;
        while (!atomicReference.compareAndSet(null, worker2)) {
            if (atomicReference.get() != null) {
                return this.worker.get();
            }
        }
        return worker2;
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(OneLogItem oneLogItem) {
        String strCollector = oneLogItem.collector();
        if (!strCollector.equals(this.collector)) {
            throw new IllegalArgumentException("Unexpected collector ".concat(strCollector));
        }
        getWorker().append(oneLogItem);
    }

    public void drop() {
        getWorker().drop();
        getUploader().drop();
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
        getWorker().flush();
    }

    public void setMaxMillisToUpload(String str, long j) {
        getWorker().setMaxMillisToUpload(str, j);
    }

    public void setMaxMillisToUploadAny(long j) {
        getWorker().setMaxMillisToUploadAny(j);
    }

    public void upload() throws IOException {
        try {
            this.uploadLock.lock();
            getWorker().grab(this.uploadFile.get());
            this.uploadLock.unlock();
            getUploader().upload();
        } catch (Throwable th) {
            this.uploadLock.unlock();
            throw th;
        }
    }
}
