package defpackage;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* loaded from: classes.dex */
public final class e32 implements wpd {
    public final /* synthetic */ int b;
    public final wpd c;

    public e32(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new x9g(j, new d32(j));
                break;
            default:
                this.c = new e32(j, 1);
                break;
        }
    }

    @Override // defpackage.wpd
    public final long a() {
        switch (this.b) {
            case 0:
                return ((x9g) ((e32) this.c).c).b;
            default:
                return ((x9g) this.c).b;
        }
    }

    @Override // defpackage.wpd
    public final vpd b(c32 c32Var) {
        switch (this.b) {
            case 0:
                if (((x9g) ((e32) this.c).c).b(c32Var).b) {
                    return vpd.e;
                }
                Throwable th = (Throwable) c32Var.d;
                if (th instanceof CameraValidator$CameraIdListIncorrectException) {
                    gri.b("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((CameraValidator$CameraIdListIncorrectException) th).a > 0) {
                        return vpd.f;
                    }
                }
                return vpd.d;
            default:
                return ((x9g) this.c).b(c32Var);
        }
    }
}
