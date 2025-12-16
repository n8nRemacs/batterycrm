package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.a9h;
import defpackage.bwf;
import defpackage.cm6;
import defpackage.fni;
import defpackage.gq5;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.hz5;
import defpackage.k18;
import defpackage.qqg;
import defpackage.tk4;
import defpackage.u08;
import defpackage.vmf;
import defpackage.wy1;
import defpackage.ys;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 B2\u00020\u0001:\u0003BCDBW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020+2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\"H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020+2\u0006\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u0010!J\u000f\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u0010\u001aJ\u0019\u00105\u001a\u00020\u00152\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010:\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010;\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00108R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006E"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "looperProvider", "Ljava/io/File;", "dir", "Ljava/util/concurrent/locks/Lock;", "lock", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "", "isContentCompressed", "autoDetectContentCompression", "", "fileCountLimit", "", "timeBeforeNextUploadMs", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;ZZILjava/lang/Long;)V", "now", "Lqqg;", "scheduleNextUpload", "(Z)V", "scheduleNextUploadUnsafe", "requestContinueUpload", "()V", "uploadImpl", "()Z", "file", "uploadFileWithResultCheck", "(Ljava/io/File;)Z", "createNewFile", "()Ljava/io/File;", "", "getAllFiles", "()Ljava/util/List;", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "getStorageInfo", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "dropOldestFile", "(Ljava/io/File;)V", "files", "", "calcBestNameForNewFile", "(Ljava/util/List;)Ljava/lang/String;", "index", "getFileNameForIndex", "(I)Ljava/lang/String;", "getSink", "upload", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "Ljavax/inject/Provider;", "I", "Ljava/lang/Long;", "fileIndexStringLength", "scaleUpNextUploadTimeout", "Landroid/os/Handler;", "handler$delegate", "Lk18;", "getHandler", "()Landroid/os/Handler;", "handler", "Companion", "LooperCallback", "StorageInfo", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiFileUploader extends AbstractUploader {

    @Deprecated
    public static final String CHUNK_FILE_NAME_PREFIX = "chunk";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsUploaderV2";

    @Deprecated
    public static final int MSG_TRY_UPLOAD_NEXT = 1001;

    @Deprecated
    public static final long UPLOAD_NEXT_INTERVAL = 5000;
    private final int fileCountLimit;
    private final int fileIndexStringLength;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    private final k18 handler;
    private final Provider<Looper> looperProvider;
    private volatile int scaleUpNextUploadTimeout;
    private final Long timeBeforeNextUploadMs;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$Companion;", "", "()V", "CHUNK_FILE_NAME_PREFIX", "", "LOG_TAG", "MSG_TRY_UPLOAD_NEXT", "", "UPLOAD_NEXT_INTERVAL", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$LooperCallback;", "Landroid/os/Handler$Callback;", "uploader", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "(Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;)V", "getUploader", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "handleMessage", "", "msg", "Landroid/os/Message;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LooperCallback implements Handler.Callback {
        private final MultiFileUploader uploader;

        public LooperCallback(MultiFileUploader multiFileUploader) {
            this.uploader = multiFileUploader;
        }

        public final MultiFileUploader getUploader() {
            return this.uploader;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            if (msg.what != 1001) {
                return false;
            }
            this.uploader.requestContinueUpload();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "", "oldestFile", "Ljava/io/File;", "allFiles", "", "(Ljava/io/File;Ljava/util/List;)V", "getAllFiles", "()Ljava/util/List;", "getOldestFile", "()Ljava/io/File;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StorageInfo {
        private final List<File> allFiles;
        private final File oldestFile;

        /* JADX WARN: Multi-variable type inference failed */
        public StorageInfo(File file, List<? extends File> list) {
            this.oldestFile = file;
            this.allFiles = list;
        }

        public final List<File> getAllFiles() {
            return this.allFiles;
        }

        public final File getOldestFile() {
            return this.oldestFile;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractUploader.UploadResult.values().length];
            try {
                iArr[AbstractUploader.UploadResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractUploader.UploadResult.RECOVERABLE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractUploader.UploadResult.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractUploader.UploadResult.BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractUploader.UploadResult.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$createNewFile$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements cm6 {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
        @Override // defpackage.cm6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.File invoke() {
            /*
                r8 = this;
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r0 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                javax.inject.Provider r0 = r0.getStorage()
                java.lang.Object r0 = r0.get()
                java.io.File r0 = (java.io.File) r0
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r1 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$StorageInfo r1 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$getStorageInfo(r1)
                java.util.List r2 = r1.getAllFiles()
                int r2 = r2.size()
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r3 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                int r3 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$getFileCountLimit$p(r3)
                if (r2 < r3) goto L38
                java.io.File r2 = r1.getOldestFile()
                if (r2 == 0) goto L33
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r3 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$dropOldestFile(r3, r2)
                java.util.List r2 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$getAllFiles(r3)
                if (r2 != 0) goto L3c
            L33:
                java.util.List r2 = r1.getAllFiles()
                goto L3c
            L38:
                java.util.List r2 = r1.getAllFiles()
            L3c:
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r1 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                java.lang.String r1 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$calcBestNameForNewFile(r1, r2)
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r3 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r3 = r3.getLogger()
                byte[] r4 = defpackage.hz5.a
                r4 = 0
                if (r2 != 0) goto L4f
                goto L65
            L4f:
                java.util.Iterator r2 = r2.iterator()
            L53:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L65
                java.lang.Object r6 = r2.next()
                java.io.File r6 = (java.io.File) r6
                long r6 = defpackage.hz5.e(r6)
                long r4 = r4 + r6
                goto L53
            L65:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r6 = "Propose new file for upload cache: "
                r2.<init>(r6)
                r2.append(r1)
                java.lang.String r6 = ", total files size: "
                r2.append(r6)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "CallAnalyticsUploaderV2"
                r3.d(r4, r2)
                java.io.File r2 = new java.io.File
                r2.<init>(r0, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.AnonymousClass1.invoke():java.io.File");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$getSink$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00061 extends u08 implements cm6 {
        public C00061() {
            super(0);
        }

        @Override // defpackage.cm6
        public final File invoke() {
            MultiFileUploader.this.ensureStorageIsOfCorrectType(true);
            return MultiFileUploader.this.createNewFile();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$upload$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00071 extends u08 implements cm6 {
        public C00071() {
            super(0);
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m100invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m100invoke() {
            try {
                MultiFileUploader.this.uploadImpl();
            } catch (Throwable th) {
                MultiFileUploader.this.getLogger().report(MultiFileUploader.LOG_TAG, "Upload failed", new UploadException(MultiFileUploader.this.getChannel().getApiMethod(), th));
            }
            MultiFileUploader.scheduleNextUpload$default(MultiFileUploader.this, false, 1, null);
        }
    }

    public /* synthetic */ MultiFileUploader(Provider provider, Provider provider2, Lock lock, EventChannel eventChannel, boolean z, boolean z2, int i, Long l, int i2, tk4 tk4Var) {
        this(provider, provider2, lock, eventChannel, z, z2, (i2 & 64) != 0 ? 10 : i, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calcBestNameForNewFile(List<? extends File> files) {
        Object next;
        int i = this.fileCountLimit;
        for (int i2 = 0; i2 < i; i2++) {
            String fileNameForIndex = getFileNameForIndex(i2);
            Iterator<T> it = files.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (fni.a(fileNameForIndex, ((File) next).getName())) {
                    break;
                }
            }
            if (next == null) {
                if (!new File(getStorage().get(), fileNameForIndex).exists()) {
                    getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not found, provide it");
                    return fileNameForIndex;
                }
                getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not listed but file exists");
            }
        }
        String fileNameForIndex2 = getFileNameForIndex(0);
        getLogger().d(LOG_TAG, "Nothing found, default to " + fileNameForIndex2);
        return fileNameForIndex2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File createNewFile() {
        return (File) withLock(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dropOldestFile(File file) {
        try {
            hz5.b(file);
            getLogger().d(LOG_TAG, "Oldest file " + file.getPath() + " dropped");
        } catch (IOException e) {
            getLogger().e(LOG_TAG, ho7.i("Oldest file ", file.getPath(), " drop request failed"), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<File> getAllFiles() {
        File[] fileArrListFiles = getStorage().get().listFiles();
        return fileArrListFiles != null ? ys.t(fileArrListFiles) : hd5.a;
    }

    private final String getFileNameForIndex(int index) {
        return this.fileIndexStringLength > 1 ? wy1.h("chunk_", vmf.J(String.valueOf(index), this.fileIndexStringLength, '_')) : ho7.f(index, "chunk_");
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageInfo getStorageInfo() {
        List<File> allFiles = getAllFiles();
        File file = null;
        long jLastModified = 0;
        for (File file2 : allFiles) {
            if (file2.exists() && (file == null || file2.lastModified() < jLastModified)) {
                jLastModified = file2.lastModified();
                file = file2;
            }
        }
        return new StorageInfo(file, allFiles);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestContinueUpload() {
        try {
            UploadStarter.INSTANCE.resumeUpload(getChannel());
        } catch (Throwable th) {
            getLogger().e(LOG_TAG, "Resume upload failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleNextUpload(boolean now) {
        try {
            scheduleNextUploadUnsafe(now);
        } catch (Throwable th) {
            getLogger().e(LOG_TAG, "Error during upload schedule update", th);
        }
    }

    public static /* synthetic */ void scheduleNextUpload$default(MultiFileUploader multiFileUploader, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        multiFileUploader.scheduleNextUpload(z);
    }

    private final void scheduleNextUploadUnsafe(boolean now) {
        if (getStorageInfo().getAllFiles().isEmpty()) {
            getLogger().d(LOG_TAG, "empty storage, won't schedule new upload");
            return;
        }
        Handler handler = getHandler();
        if (handler.hasMessages(1001)) {
            return;
        }
        if (now) {
            getLogger().d(LOG_TAG, "schedule next upload pass now");
            handler.removeMessages(1001);
            handler.sendMessage(handler.obtainMessage(1001));
        } else {
            Long l = this.timeBeforeNextUploadMs;
            long jLongValue = (l != null ? l.longValue() : UPLOAD_NEXT_INTERVAL) * this.scaleUpNextUploadTimeout;
            getLogger().d(LOG_TAG, a9h.d(jLongValue, "schedule next upload pass in ", " ms"));
            handler.sendMessageDelayed(handler.obtainMessage(1001), jLongValue);
        }
    }

    public static /* synthetic */ void scheduleNextUploadUnsafe$default(MultiFileUploader multiFileUploader, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        multiFileUploader.scheduleNextUploadUnsafe(z);
    }

    private final boolean uploadFileWithResultCheck(File file) {
        int i = WhenMappings.$EnumSwitchMapping$0[uploadFile(file).ordinal()];
        if (i == 1 || i == 2) {
            this.scaleUpNextUploadTimeout = 1;
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.scaleUpNextUploadTimeout < 6) {
            this.scaleUpNextUploadTimeout *= 2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean uploadImpl() {
        StorageInfo storageInfo = getStorageInfo();
        File oldestFile = storageInfo.getOldestFile();
        getLogger().d(LOG_TAG, "Try to upload oldest file first");
        if (oldestFile != null && uploadFileWithResultCheck(oldestFile)) {
            getLogger().d(LOG_TAG, "Oldest file upload completed: " + oldestFile.getPath());
            return true;
        }
        getLogger().d(LOG_TAG, "Try to upload first from the list");
        for (File file : storageInfo.getAllFiles()) {
            if (uploadFileWithResultCheck(file)) {
                getLogger().d(LOG_TAG, "File upload completed: " + file.getPath());
                return true;
            }
        }
        getLogger().d(LOG_TAG, "No files were uploaded");
        return false;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        return (File) withLock(new C00061());
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader, ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        Uploader.IdleStateProvider idleState = getIdleState();
        Boolean boolValueOf = idleState != null ? Boolean.valueOf(idleState.isIdle()) : null;
        super.setIdleStateProvider(idleStateProvider);
        try {
            if (fni.a(boolValueOf, Boolean.TRUE) || idleStateProvider == null || !idleStateProvider.isIdle()) {
                return;
            }
            getHandler().post(new gq5(22, this));
        } catch (Throwable th) {
            getLogger().e(LOG_TAG, "Can't schedule next upload", th);
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void upload() {
        Uploader.IdleStateProvider idleState = getIdleState();
        if (idleState == null || idleState.isIdle()) {
            withLock(new C00071());
        } else {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
        }
    }

    public MultiFileUploader(Provider<Looper> provider, Provider<File> provider2, Lock lock, EventChannel eventChannel, boolean z, boolean z2, int i, Long l) {
        super(provider2, lock, eventChannel, z, z2, LOG_TAG);
        this.looperProvider = provider;
        this.fileCountLimit = i;
        this.timeBeforeNextUploadMs = l;
        int i2 = 10;
        if (i <= 10) {
            i2 = 1;
        } else if (i <= 100) {
            i2 = 2;
        } else if (i <= 1000) {
            i2 = 3;
        }
        this.fileIndexStringLength = i2;
        this.scaleUpNextUploadTimeout = 1;
        this.handler = new bwf(new MultiFileUploader$handler$2(this));
    }
}
