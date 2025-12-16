package ru.ok.android.externcalls.analytics.internal.upload;

import defpackage.cm6;
import defpackage.tk4;
import defpackage.u08;
import java.io.File;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/SingleFileUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Ljavax/inject/Provider;", "Ljava/io/File;", "file", "Ljava/util/concurrent/locks/Lock;", "lock", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "", "disableUploadWhenCallIsActive", "isContentCompressed", "autoDetectContentCompression", "<init>", "(Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;ZZZ)V", "Lqqg;", "upload", "()V", "getSink", "()Ljava/io/File;", "Z", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleFileUploader extends AbstractUploader {
    private static final String LOG_TAG = "CallAnalyticsUploader";
    private final boolean disableUploadWhenCallIsActive;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.SingleFileUploader$getSink$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements cm6 {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.cm6
        public final File invoke() {
            return SingleFileUploader.this.ensureStorageIsOfCorrectType(false);
        }
    }

    public /* synthetic */ SingleFileUploader(Provider provider, Lock lock, EventChannel eventChannel, boolean z, boolean z2, boolean z3, int i, tk4 tk4Var) {
        this(provider, lock, eventChannel, (i & 8) != 0 ? false : z, z2, z3);
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        return (File) withLock(new AnonymousClass1());
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void upload() {
        Uploader.IdleStateProvider idleState;
        if (this.disableUploadWhenCallIsActive && (idleState = getIdleState()) != null && !idleState.isIdle()) {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
            return;
        }
        try {
            uploadFile(getStorage().get());
        } catch (Throwable th) {
            getLogger().report(LOG_TAG, "Upload failed", new UploadException(getChannel().getApiMethod(), th));
        }
    }

    public SingleFileUploader(Provider<File> provider, Lock lock, EventChannel eventChannel, boolean z, boolean z2, boolean z3) {
        super(provider, lock, eventChannel, z2, z3, LOG_TAG);
        this.disableUploadWhenCallIsActive = z;
    }
}
