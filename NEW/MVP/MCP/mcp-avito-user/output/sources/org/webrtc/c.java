package org.webrtc;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import org.webrtc.VideoFrame;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f422279c;

    public /* synthetic */ c(Object obj, int i12) {
        this.f422278b = i12;
        this.f422279c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f422278b) {
            case 0:
                ((EglBase10Impl.EglConnection) this.f422279c).lambda$new$0();
                break;
            case 1:
                ((EglBase14Impl.EglConnection) this.f422279c).lambda$new$0();
                break;
            case 2:
                ((EglRenderer) this.f422279c).renderFrameOnRenderThread();
                break;
            case 3:
                ((EglBase.EglConnection) this.f422279c).release();
                break;
            case 4:
                ((VideoFrame.I420Buffer) this.f422279c).release();
                break;
            case 5:
                ((ScreenCapturerAndroid) this.f422279c).updateVirtualDisplay();
                break;
            case 6:
                ((CountDownLatch) this.f422279c).countDown();
                break;
            default:
                ((VideoFileRenderer) this.f422279c).lambda$release$3();
                break;
        }
    }
}
