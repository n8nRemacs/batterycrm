package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing;

import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.webrtc.CameraVideoCapturer;

/* compiled from: CameraVideoCapturerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/b;", "Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements CameraVideoCapturer.CameraSwitchHandler {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final com.avito.avcalls.utils.logs.a f164409b;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f164410a;

    /* compiled from: CameraVideoCapturerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/b$a;", "", "<init>", "()V", "Lcom/avito/avcalls/utils/logs/a;", "logs", "Lcom/avito/avcalls/utils/logs/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f164409b = new com.avito.avcalls.utils.logs.a("CameraSwitchHandler");
    }

    public b(@k Y41.a<G0> aVar) {
        this.f164410a = aVar;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchDone(boolean z12) {
        f164409b.b("onCameraSwitchDone", com.avito.android.bxcontent.mvi.entity.f.l("isFrontCamera=", z12));
        this.f164410a.invoke();
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchError(@l String str) {
        f164409b.b("onCameraSwitchDone", G.f("errorDescription=", str));
    }
}
