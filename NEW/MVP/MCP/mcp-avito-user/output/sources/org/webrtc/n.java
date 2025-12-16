package org.webrtc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RenderSynchronizer f422306c;

    public /* synthetic */ n(RenderSynchronizer renderSynchronizer, int i12) {
        this.f422305b = i12;
        this.f422306c = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f422305b) {
            case 0:
                this.f422306c.lambda$registerListener$1();
                break;
            default:
                this.f422306c.lambda$new$0();
                break;
        }
    }
}
