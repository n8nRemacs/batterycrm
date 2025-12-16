package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class dz1 extends CameraDevice.StateCallback {
    public final qee a;
    public final a07 b;
    public cz1 c;
    public ScheduledFuture d;
    public final bz1 e;
    public final /* synthetic */ ez1 f;

    public dz1(ez1 ez1Var, qee qeeVar, a07 a07Var, long j) {
        this.f = ez1Var;
        this.a = qeeVar;
        this.b = a07Var;
        bz1 bz1Var = new bz1();
        bz1Var.c = this;
        bz1Var.b = -1L;
        bz1Var.a = j;
        this.e = bz1Var;
    }

    public final boolean a() {
        if (this.d == null) {
            return false;
        }
        this.f.t("Cancelling scheduled re-open: " + this.c, null);
        this.c.b = true;
        this.c = null;
        this.d.cancel(false);
        this.d = null;
        return true;
    }

    public final void b() {
        z5j.f(null, this.c == null);
        z5j.f(null, this.d == null);
        bz1 bz1Var = this.e;
        bz1Var.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (bz1Var.b == -1) {
            bz1Var.b = jUptimeMillis;
        }
        long j = jUptimeMillis - bz1Var.b;
        long jB = bz1Var.b();
        ez1 ez1Var = this.f;
        if (j >= jB) {
            bz1Var.b = -1L;
            gri.b("Camera2CameraImpl", "Camera reopening attempted for " + bz1Var.b() + "ms without success.");
            ez1Var.E(4, null, false);
            return;
        }
        this.c = new cz1(this, this.a);
        ez1Var.t("Attempting camera re-open in " + bz1Var.a() + "ms: " + this.c + " activeResuming = " + ez1Var.M0, null);
        this.d = this.b.schedule(this.c, (long) bz1Var.a(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        ez1 ez1Var = this.f;
        if (!ez1Var.M0) {
            return false;
        }
        int i = ez1Var.u0;
        return i == 1 || i == 2;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f.t("CameraDevice.onClosed()", null);
        z5j.f("Unexpected onClose callback on camera device: " + cameraDevice, this.f.t0 == null);
        int iV = az1.v(this.f.R0);
        if (iV == 1 || iV == 4) {
            z5j.f(null, this.f.w0.isEmpty());
            this.f.r();
        } else {
            if (iV != 5 && iV != 6) {
                throw new IllegalStateException("Camera closed while in state: ".concat(wy1.u(this.f.R0)));
            }
            ez1 ez1Var = this.f;
            int i = ez1Var.u0;
            if (i == 0) {
                ez1Var.J(false);
            } else {
                ez1Var.t("Camera closed due to error: ".concat(ez1.v(i)), null);
                b();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f.t("CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        ez1 ez1Var = this.f;
        ez1Var.t0 = cameraDevice;
        ez1Var.u0 = i;
        h79 h79Var = ez1Var.Q0;
        ((ez1) h79Var.c).t("Camera receive onErrorCallback", null);
        h79Var.v();
        int iV = az1.v(this.f.R0);
        if (iV != 1) {
            switch (iV) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    String id = cameraDevice.getId();
                    String strV = ez1.v(i);
                    String strT = wy1.t(this.f.R0);
                    StringBuilder sbL = wy1.l("CameraDevice.onError(): ", id, " failed with ", strV, " while in ");
                    sbL.append(strT);
                    sbL.append(" state. Will attempt recovering from error.");
                    gri.a("Camera2CameraImpl", sbL.toString());
                    z5j.f("Attempt to handle open error from non open state: ".concat(wy1.u(this.f.R0)), this.f.R0 == 8 || this.f.R0 == 9 || this.f.R0 == 10 || this.f.R0 == 7 || this.f.R0 == 6);
                    int i2 = 3;
                    if (i != 1 && i != 2 && i != 4) {
                        gri.b("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + ez1.v(i) + " closing camera.");
                        this.f.E(5, new n90(i == 3 ? 5 : 6, null), true);
                        this.f.q();
                        return;
                    }
                    gri.a("Camera2CameraImpl", wy1.j("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", ez1.v(i), "]"));
                    ez1 ez1Var2 = this.f;
                    z5j.f("Can only reopen camera device after error if the camera device is actually in an error state.", ez1Var2.u0 != 0);
                    if (i == 1) {
                        i2 = 2;
                    } else if (i == 2) {
                        i2 = 1;
                    }
                    ez1Var2.E(7, new n90(i2, null), true);
                    ez1Var2.q();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(wy1.u(this.f.R0)));
            }
        }
        String id2 = cameraDevice.getId();
        String strV2 = ez1.v(i);
        String strT2 = wy1.t(this.f.R0);
        StringBuilder sbL2 = wy1.l("CameraDevice.onError(): ", id2, " failed with ", strV2, " while in ");
        sbL2.append(strT2);
        sbL2.append(" state. Will finish closing camera.");
        gri.b("Camera2CameraImpl", sbL2.toString());
        this.f.q();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f.t("CameraDevice.onOpened()", null);
        ez1 ez1Var = this.f;
        ez1Var.t0 = cameraDevice;
        ez1Var.u0 = 0;
        this.e.b = -1L;
        int iV = az1.v(ez1Var.R0);
        if (iV == 1 || iV == 4) {
            z5j.f(null, this.f.w0.isEmpty());
            this.f.t0.close();
            this.f.t0 = null;
        } else {
            if (iV != 5 && iV != 6 && iV != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(wy1.u(this.f.R0)));
            }
            this.f.F(9);
            j32 j32Var = this.f.A0;
            String id = cameraDevice.getId();
            ez1 ez1Var2 = this.f;
            if (j32Var.e(id, ez1Var2.z0.M(ez1Var2.t0.getId()))) {
                this.f.B();
            }
        }
    }
}
