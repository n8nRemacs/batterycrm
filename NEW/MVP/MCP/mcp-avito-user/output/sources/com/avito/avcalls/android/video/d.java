package com.avito.avcalls.android.video;

import com.avito.avcalls.android.logger.g;
import kotlin.G0;
import kotlin.Metadata;
import org.webrtc.CameraVideoCapturer;

/* compiled from: CameraVideoCapturer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/video/d;", "Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements CameraVideoCapturer.CameraSwitchHandler {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f332477a;

    public d(@Y61.k Y41.a<G0> aVar) {
        this.f332477a = aVar;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchDone(boolean z12) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraSwitchHandler", "onCameraSwitchDone: isFrontCamera=" + z12);
        ((j) this.f332477a).invoke();
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchError(@Y61.l String str) {
        g.Companion.b(com.avito.avcalls.android.logger.g.INSTANCE, "CameraSwitchHandler", "onCameraSwitchError: " + str);
    }
}
