package defpackage;

import android.hardware.camera2.CameraDevice;

/* loaded from: classes.dex */
public final /* synthetic */ class x12 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy1 b;
    public final /* synthetic */ CameraDevice c;

    public /* synthetic */ x12(xy1 xy1Var, CameraDevice cameraDevice, int i) {
        this.a = i;
        this.b = xy1Var;
        this.c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CameraDevice.StateCallback) this.b.b).onClosed(this.c);
                break;
            case 1:
                ((CameraDevice.StateCallback) this.b.b).onDisconnected(this.c);
                break;
            default:
                ((CameraDevice.StateCallback) this.b.b).onOpened(this.c);
                break;
        }
    }
}
