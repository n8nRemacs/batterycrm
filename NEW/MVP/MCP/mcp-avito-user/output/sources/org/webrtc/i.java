package org.webrtc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EglThread f422297c;

    public /* synthetic */ i(EglThread eglThread, int i12) {
        this.f422296b = i12;
        this.f422297c = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f422296b) {
            case 0:
                this.f422297c.lambda$onRenderWindowOpen$2();
                break;
            default:
                this.f422297c.lambda$onRenderWindowClose$3();
                break;
        }
    }
}
