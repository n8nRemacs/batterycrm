package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;

/* loaded from: classes.dex */
public final /* synthetic */ class gy1 implements uu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy1 b;

    public /* synthetic */ gy1(iy1 iy1Var, int i) {
        this.a = i;
        this.b = iy1Var;
    }

    @Override // defpackage.uu1
    public final String m(final tu1 tu1Var) {
        switch (this.a) {
            case 0:
                final iy1 iy1Var = this.b;
                final int i = 1;
                ((qee) iy1Var.d).execute(new Runnable() { // from class: hy1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                iy1 iy1Var2 = iy1Var;
                                iy1Var2.b = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                tu1 tu1Var2 = (tu1) iy1Var2.g;
                                if (tu1Var2 != null) {
                                    tu1Var2.d(cameraControl$OperationCanceledException);
                                    iy1Var2.g = null;
                                }
                                iy1Var2.g = tu1Var;
                                if (iy1Var2.a) {
                                    ry1 ry1Var = (ry1) iy1Var2.c;
                                    ry1Var.getClass();
                                    wsf.g(ixi.a(new xtd(21, ry1Var))).d(new o3(29, iy1Var2), (qee) iy1Var2.d);
                                    iy1Var2.b = false;
                                    break;
                                }
                                break;
                            default:
                                iy1 iy1Var3 = iy1Var;
                                iy1Var3.b = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                tu1 tu1Var3 = (tu1) iy1Var3.g;
                                if (tu1Var3 != null) {
                                    tu1Var3.d(cameraControl$OperationCanceledException2);
                                    iy1Var3.g = null;
                                }
                                iy1Var3.g = tu1Var;
                                if (iy1Var3.a) {
                                    ry1 ry1Var2 = (ry1) iy1Var3.c;
                                    ry1Var2.getClass();
                                    wsf.g(ixi.a(new xtd(21, ry1Var2))).d(new o3(29, iy1Var3), (qee) iy1Var3.d);
                                    iy1Var3.b = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final iy1 iy1Var2 = this.b;
                final int i2 = 0;
                ((qee) iy1Var2.d).execute(new Runnable() { // from class: hy1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                iy1 iy1Var22 = iy1Var2;
                                iy1Var22.b = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                tu1 tu1Var2 = (tu1) iy1Var22.g;
                                if (tu1Var2 != null) {
                                    tu1Var2.d(cameraControl$OperationCanceledException);
                                    iy1Var22.g = null;
                                }
                                iy1Var22.g = tu1Var;
                                if (iy1Var22.a) {
                                    ry1 ry1Var = (ry1) iy1Var22.c;
                                    ry1Var.getClass();
                                    wsf.g(ixi.a(new xtd(21, ry1Var))).d(new o3(29, iy1Var22), (qee) iy1Var22.d);
                                    iy1Var22.b = false;
                                    break;
                                }
                                break;
                            default:
                                iy1 iy1Var3 = iy1Var2;
                                iy1Var3.b = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                tu1 tu1Var3 = (tu1) iy1Var3.g;
                                if (tu1Var3 != null) {
                                    tu1Var3.d(cameraControl$OperationCanceledException2);
                                    iy1Var3.g = null;
                                }
                                iy1Var3.g = tu1Var;
                                if (iy1Var3.a) {
                                    ry1 ry1Var2 = (ry1) iy1Var3.c;
                                    ry1Var2.getClass();
                                    wsf.g(ixi.a(new xtd(21, ry1Var2))).d(new o3(29, iy1Var3), (qee) iy1Var3.d);
                                    iy1Var3.b = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
