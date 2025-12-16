package org.webrtc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SurfaceTextureHelper f422309c;

    public /* synthetic */ p(SurfaceTextureHelper surfaceTextureHelper, int i12) {
        this.f422308b = i12;
        this.f422309c = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f422308b) {
            case 0:
                this.f422309c.lambda$stopListening$1();
                break;
            case 1:
                this.f422309c.lambda$dispose$6();
                break;
            case 2:
                this.f422309c.lambda$returnTextureFrame$5();
                break;
            default:
                this.f422309c.lambda$forceFrame$3();
                break;
        }
    }
}
