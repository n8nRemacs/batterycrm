package org.webrtc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f422299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f422300d;

    public /* synthetic */ j(int i12, int i13, Object obj) {
        this.f422298b = i13;
        this.f422300d = obj;
        this.f422299c = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f422298b) {
            case 0:
                ((HardwareVideoEncoder) this.f422300d).lambda$deliverEncodedImage$0(this.f422299c);
                break;
            default:
                ((SurfaceTextureHelper) this.f422300d).lambda$setFrameRotation$4(this.f422299c);
                break;
        }
    }
}
