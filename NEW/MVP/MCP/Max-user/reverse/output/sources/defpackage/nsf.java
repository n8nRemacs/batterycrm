package defpackage;

import org.webrtc.SurfaceTextureHelper;

/* loaded from: classes2.dex */
public final /* synthetic */ class nsf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceTextureHelper b;

    public /* synthetic */ nsf(SurfaceTextureHelper surfaceTextureHelper, int i) {
        this.a = i;
        this.b = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$stopListening$1();
                break;
            case 1:
                this.b.lambda$dispose$6();
                break;
            case 2:
                this.b.lambda$returnTextureFrame$5();
                break;
            default:
                this.b.lambda$forceFrame$3();
                break;
        }
    }
}
