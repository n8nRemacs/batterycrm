package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
public final /* synthetic */ class x02 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y02 b;
    public final /* synthetic */ CameraCaptureSession c;

    public /* synthetic */ x02(y02 y02Var, CameraCaptureSession cameraCaptureSession, int i) {
        this.a = i;
        this.b = y02Var;
        this.c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.onActive(this.c);
                break;
            case 1:
                this.b.a.onClosed(this.c);
                break;
            case 2:
                this.b.a.onCaptureQueueEmpty(this.c);
                break;
            case 3:
                this.b.a.onConfigured(this.c);
                break;
            case 4:
                this.b.a.onReady(this.c);
                break;
            default:
                this.b.a.onConfigureFailed(this.c);
                break;
        }
    }
}
