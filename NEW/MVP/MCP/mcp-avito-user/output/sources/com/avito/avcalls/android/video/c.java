package com.avito.avcalls.android.video;

import com.avito.avcalls.android.logger.g;
import kotlin.Metadata;
import org.webrtc.CameraVideoCapturer;

/* compiled from: CameraVideoCapturer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/video/c;", "Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;", "<init>", "()V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements CameraVideoCapturer.CameraEventsHandler {
    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraClosed() {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraEvents", "onCameraClosed()");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraDisconnected() {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraEvents", "onCameraDisconnected()");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraError(@Y61.l String str) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraEvents", "onCameraError(" + str + ')');
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraFreezed(@Y61.l String str) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraEvents", "onCameraFreezed(" + str + ')');
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraOpening(@Y61.l String str) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraEvents", "onCameraOpening(" + str + ')');
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onFirstFrameAvailable() {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraEvents", "onFirstFrameAvailable()");
    }
}
