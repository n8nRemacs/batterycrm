package org.webrtc;

import java.util.concurrent.CountDownLatch;
import org.webrtc.TextureBufferImpl;

/* compiled from: R8$$SyntheticClass */
/* renamed from: org.webrtc.r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class RunnableC44928r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f422312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f422313d;

    public /* synthetic */ RunnableC44928r(int i12, Object obj, Object obj2) {
        this.f422311b = i12;
        this.f422312c = obj;
        this.f422313d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f422311b) {
            case 0:
                ((TextureBufferImpl) this.f422312c).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.f422313d);
                break;
            case 1:
                ((EglRenderer) this.f422312c).lambda$releaseEglSurface$3((Runnable) this.f422313d);
                break;
            case 2:
                ((EglRenderer) this.f422312c).lambda$release$0((CountDownLatch) this.f422313d);
                break;
            case 3:
                ((VideoFileRenderer) this.f422312c).lambda$onFrame$0((VideoFrame) this.f422313d);
                break;
            case 4:
                ((VideoFileRenderer) this.f422312c).lambda$release$2((CountDownLatch) this.f422313d);
                break;
            default:
                ((VideoSource) this.f422312c).lambda$setVideoProcessor$0((VideoFrame) this.f422313d);
                break;
        }
    }
}
