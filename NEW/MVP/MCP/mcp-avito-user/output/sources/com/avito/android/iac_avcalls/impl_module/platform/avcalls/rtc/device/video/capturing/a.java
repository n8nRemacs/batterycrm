package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.webrtc.CameraVideoCapturer;

/* compiled from: CameraVideoCapturerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/a;", "Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;", "<init>", "()V", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements CameraVideoCapturer.CameraEventsHandler {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final com.avito.avcalls.utils.logs.a f164408a;

    /* compiled from: CameraVideoCapturerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/a$a;", "", "<init>", "()V", "Lcom/avito/avcalls/utils/logs/a;", "logs", "Lcom/avito/avcalls/utils/logs/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing.a$a, reason: collision with other inner class name */
    public static final class C4808a {
        public /* synthetic */ C4808a(C42822w c42822w) {
            this();
        }

        public C4808a() {
        }
    }

    static {
        new C4808a(null);
        f164408a = new com.avito.avcalls.utils.logs.a("CameraEventsHandler");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraClosed() {
        f164408a.b("onCameraClosed", new Object[0]);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraDisconnected() {
        f164408a.b("onCameraDisconnected", new Object[0]);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraError(@l String str) {
        f164408a.b("onCameraError", str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraFreezed(@l String str) {
        f164408a.b("onCameraFreezed", str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraOpening(@l String str) {
        f164408a.b("onCameraOpening", str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onFirstFrameAvailable() {
        f164408a.b("onFirstFrameAvailable", new Object[0]);
    }
}
