package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class die extends cie {
    public static die i(xwg xwgVar, Size size) {
        if (((f02) xwgVar.d(xwg.j0, null)) == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) xwgVar.d(a2g.e0, xwgVar.toString())));
        }
        die dieVar = new die();
        hie hieVar = (hie) xwgVar.d(xwg.h0, null);
        fjb fjbVar = fjb.c;
        int i = hie.a().g.c;
        if (hieVar != null) {
            i = hieVar.g.c;
            for (CameraDevice.StateCallback stateCallback : hieVar.c) {
                ArrayList arrayList = (ArrayList) dieVar.c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : hieVar.d) {
                ArrayList arrayList2 = (ArrayList) dieVar.d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            ((w30) dieVar.b).a(hieVar.g.e);
            fjbVar = hieVar.g.b;
        }
        w30 w30Var = (w30) dieVar.b;
        w30Var.getClass();
        w30Var.f = x8a.k(fjbVar);
        if (xwgVar instanceof s8c) {
            Rational rational = t8c.a;
            if (((PreviewPixelHDRnetQuirk) rv4.a.e(PreviewPixelHDRnetQuirk.class)) != null && !t8c.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                x8a x8aVarB = x8a.b();
                x8aVarB.n(e02.N(CaptureRequest.TONEMAP_MODE), 2);
                ((w30) dieVar.b).c(new e02(9, fjb.a(x8aVarB)));
            }
        }
        ((w30) dieVar.b).c = ((Integer) xwgVar.d(e02.X, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) xwgVar.d(e02.Z, new c22());
        ArrayList arrayList3 = (ArrayList) dieVar.c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) xwgVar.d(e02.s0, new c12());
        ArrayList arrayList4 = (ArrayList) dieVar.d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        g52 g52Var = new g52((CameraCaptureSession.CaptureCallback) xwgVar.d(e02.t0, new jz1()));
        ((w30) dieVar.b).b(g52Var);
        ArrayList arrayList5 = (ArrayList) dieVar.e;
        if (!arrayList5.contains(g52Var)) {
            arrayList5.add(g52Var);
        }
        int iX = xwgVar.x();
        if (iX != 0) {
            w30 w30Var2 = (w30) dieVar.b;
            w30Var2.getClass();
            if (iX != 0) {
                ((x8a) w30Var2.f).n(xwg.r0, Integer.valueOf(iX));
            }
        }
        int iB = xwgVar.B();
        if (iB != 0) {
            w30 w30Var3 = (w30) dieVar.b;
            w30Var3.getClass();
            if (iB != 0) {
                ((x8a) w30Var3.f).n(xwg.q0, Integer.valueOf(iB));
            }
        }
        x8a x8aVarB2 = x8a.b();
        s90 s90Var = e02.u0;
        x8aVarB2.n(s90Var, (String) xwgVar.d(s90Var, null));
        s90 s90Var2 = e02.Y;
        Long l = (Long) xwgVar.d(s90Var2, -1L);
        l.getClass();
        x8aVarB2.n(s90Var2, l);
        ((w30) dieVar.b).c(x8aVarB2);
        ((w30) dieVar.b).c(a3b.m(xwgVar).l());
        return dieVar;
    }

    public final void f(ao3 ao3Var) {
        ((w30) this.b).c(ao3Var);
    }

    public final void g(zr4 zr4Var, u75 u75Var, int i) {
        w86 w86VarA = kb0.a(zr4Var);
        if (u75Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        w86VarA.e = u75Var;
        w86VarA.c = Integer.valueOf(i);
        ((LinkedHashSet) this.a).add(w86VarA.b());
        ((HashSet) ((w30) this.b).e).add(zr4Var);
    }

    public final hie h() {
        return new hie(new ArrayList((LinkedHashSet) this.a), new ArrayList((ArrayList) this.c), new ArrayList((ArrayList) this.d), new ArrayList((ArrayList) this.e), ((w30) this.b).d(), (eie) this.f, (InputConfiguration) this.g, (kb0) this.h);
    }
}
