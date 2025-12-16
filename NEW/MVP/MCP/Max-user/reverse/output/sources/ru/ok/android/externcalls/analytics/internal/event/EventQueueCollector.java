package ru.ok.android.externcalls.analytics.internal.event;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.mri;
import defpackage.wo4;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.internal.upload.Worker;
import ru.ok.android.onelog.UploadService;

/* loaded from: classes2.dex */
public final class EventQueueCollector {
    private static final String APPEND_FILENAME = "append";
    private static final String LOG_DIRNAME = "calls-sdk-analytics";
    private static final String UPLOAD_FILENAME = "upload";

    @SuppressLint({"StaticFieldLeak"})
    private static volatile EventQueueCollector lastInstance;
    private final EventChannel channel;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;
    private static final ConcurrentHashMap<EventChannel, EventQueueCollector> INSTANCES = new ConcurrentHashMap<>();
    private static volatile Uploader.IdleStateProvider idleStateProvider = null;
    private static final LooperProvider looperProvider = new LooperProvider(0);
    private final AtomicReference<Boolean> compressionEnabled = new AtomicReference<>();
    private final AtomicReference<Worker> worker = new AtomicReference<>();
    private final AtomicReference<Uploader> uploader = new AtomicReference<>();
    private final Lock uploadLock = new ReentrantLock();

    public interface IdleStateProvider {
        boolean isIdle();
    }

    public static final class LooperProvider implements Provider<Looper> {
        private volatile Looper looper;

        public /* synthetic */ LooperProvider(int i) {
            this();
        }

        private LooperProvider() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // javax.inject.Provider
        public Looper get() {
            if (this.looper == null) {
                synchronized (this) {
                    try {
                        if (this.looper == null) {
                            HandlerThread handlerThread = new HandlerThread(UploadService.SCHEME);
                            handlerThread.start();
                            this.looper = handlerThread.getLooper();
                        }
                    } finally {
                    }
                }
            }
            return this.looper;
        }
    }

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
            File file2 = new File(new File(new File(EventQueueCollector.this.context.getFilesDir(), "calls-sdk-analytics"), EventQueueCollector.this.channel.getApiMethod()), this.name);
            this.cachedFile = file2;
            return file2;
        }
    }

    private EventQueueCollector(Context context, EventChannel eventChannel) {
        this.context = context;
        this.channel = eventChannel;
    }

    public static void clearAllMaxTimeToUpload() {
        Iterator<EventQueueCollector> it = INSTANCES.values().iterator();
        while (it.hasNext()) {
            it.next().getWorker().clearMaxMillisToUpload();
        }
    }

    public static void flushAll() {
        Iterator<EventQueueCollector> it = INSTANCES.values().iterator();
        while (it.hasNext()) {
            it.next().flush();
        }
    }

    public static EventQueueCollector getInstance(EventChannel eventChannel) {
        Application application = ApplicationProvider.a;
        Application applicationA = mri.a();
        EventQueueCollector eventQueueCollector = lastInstance;
        if (eventQueueCollector != null && eventQueueCollector.channel.equals(eventChannel)) {
            return eventQueueCollector;
        }
        ConcurrentHashMap<EventChannel, EventQueueCollector> concurrentHashMap = INSTANCES;
        EventQueueCollector eventQueueCollector2 = concurrentHashMap.get(eventChannel);
        if (eventQueueCollector2 != null) {
            lastInstance = eventQueueCollector2;
            return eventQueueCollector2;
        }
        EventQueueCollector eventQueueCollector3 = new EventQueueCollector(applicationA, eventChannel);
        EventQueueCollector eventQueueCollectorPutIfAbsent = concurrentHashMap.putIfAbsent(eventChannel, eventQueueCollector3);
        if (eventQueueCollectorPutIfAbsent != null) {
            lastInstance = eventQueueCollectorPutIfAbsent;
            return eventQueueCollectorPutIfAbsent;
        }
        eventQueueCollector3.getUploader().setIdleStateProvider(idleStateProvider);
        lastInstance = eventQueueCollector3;
        return eventQueueCollector3;
    }

    private Uploader getUploader() {
        Uploader uploader = this.uploader.get();
        if (uploader != null) {
            return uploader;
        }
        Uploader uploaderCreate = Uploader.create(looperProvider, new OneLogFile(UPLOAD_FILENAME), this.uploadLock, this.channel, isContentCompressionEnabled());
        AtomicReference<Uploader> atomicReference = this.uploader;
        while (!atomicReference.compareAndSet(null, uploaderCreate)) {
            if (atomicReference.get() != null) {
                return this.uploader.get();
            }
        }
        return uploaderCreate;
    }

    private Worker getWorker() {
        Worker worker = this.worker.get();
        if (worker != null) {
            return worker;
        }
        Worker worker2 = new Worker(looperProvider, new OneLogFile(APPEND_FILENAME), new ReentrantLock(), this.channel, isContentCompressionEnabled());
        AtomicReference<Worker> atomicReference = this.worker;
        while (!atomicReference.compareAndSet(null, worker2)) {
            if (atomicReference.get() != null) {
                return this.worker.get();
            }
        }
        return worker2;
    }

    private boolean isContentCompressionEnabled() {
        Boolean bool = this.compressionEnabled.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
        boolean z = config != null && config.getUpload().getCompressContent();
        AtomicReference<Boolean> atomicReference = this.compressionEnabled;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return this.compressionEnabled.get().booleanValue();
            }
        }
        return z;
    }

    public static void setIdleStateProvider(IdleStateProvider idleStateProvider2) {
        wo4 wo4Var = idleStateProvider2 == null ? null : new wo4(10, idleStateProvider2);
        idleStateProvider = wo4Var;
        for (EventQueueCollector eventQueueCollector : INSTANCES.values()) {
            Uploader uploader = eventQueueCollector.getUploader();
            if (uploader != null) {
                uploader.setIdleStateProvider(wo4Var);
            }
            Worker worker = eventQueueCollector.getWorker();
            if (worker != null) {
                worker.setIdleStateProvider(wo4Var);
            }
        }
    }

    public void addEvent(CallAnalyticsEvent callAnalyticsEvent) {
        if (this.channel.matches(callAnalyticsEvent)) {
            getWorker().scheduleEventSend(callAnalyticsEvent);
            return;
        }
        throw new IllegalArgumentException("Unexpected event " + callAnalyticsEvent.getApiMethodName() + ", collector=" + callAnalyticsEvent.getCollector());
    }

    public void drop() {
        getWorker().drop();
        getUploader().drop();
    }

    public void flush() {
        getWorker().flush();
    }

    public void grabAndUpload() throws IOException {
        try {
            this.uploadLock.lock();
            Worker worker = getWorker();
            Uploader uploader = getUploader();
            Objects.requireNonNull(uploader);
            worker.grab(new wo4(11, uploader));
            this.uploadLock.unlock();
            getUploader().upload();
        } catch (Throwable th) {
            this.uploadLock.unlock();
            throw th;
        }
    }

    public void uploadGrabbed() throws IOException {
        getUploader().upload();
    }
}
