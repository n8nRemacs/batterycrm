package defpackage;

import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public final class s22 extends CameraManager.AvailabilityCallback {
    public final qee a;
    public final yy1 b;
    public final Object c = new Object();
    public boolean d = false;

    public s22(qee qeeVar, yy1 yy1Var) {
        this.a = qeeVar;
        this.b = yy1Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new vy1(6, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new r22(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new r22(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
