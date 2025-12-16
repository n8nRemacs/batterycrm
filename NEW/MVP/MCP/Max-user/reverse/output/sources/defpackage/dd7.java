package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class dd7 extends uwg {
    public static final bd7 v = new bd7();
    public final gd7 p;
    public final Object q;
    public yc7 r;
    public die s;
    public cg7 t;
    public eie u;

    public dd7(id7 id7Var) {
        super(id7Var);
        this.q = new Object();
        if (((Integer) ((id7) this.f).d(id7.b, 0)).intValue() == 1) {
            this.p = new hd7();
        } else {
            this.p = new ld7((Executor) id7Var.d(n7g.g0, ayi.b()));
        }
        this.p.d = H();
        this.p.o = ((Boolean) ((id7) this.f).d(id7.Y, Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.uwg
    public final void A(Matrix matrix) {
        super.A(matrix);
        gd7 gd7Var = this.p;
        synchronized (gd7Var.B0) {
            gd7Var.v0 = matrix;
            gd7Var.w0 = new Matrix(gd7Var.v0);
        }
    }

    @Override // defpackage.uwg
    public final void C(Rect rect) {
        this.i = rect;
        gd7 gd7Var = this.p;
        synchronized (gd7Var.B0) {
            gd7Var.t0 = rect;
            gd7Var.u0 = new Rect(gd7Var.t0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.die F(defpackage.id7 r14, defpackage.ob0 r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd7.F(id7, ob0):die");
    }

    public final int G() {
        return ((Integer) ((id7) this.f).d(id7.c, 6)).intValue();
    }

    public final int H() {
        return ((Integer) ((id7) this.f).d(id7.o, 1)).intValue();
    }

    public final void I(ExecutorService executorService, yc7 yc7Var) {
        synchronized (this.q) {
            try {
                gd7 gd7Var = this.p;
                sl6 sl6Var = new sl6(3, yc7Var);
                synchronized (gd7Var.B0) {
                    gd7Var.a = sl6Var;
                    gd7Var.Y = executorService;
                }
                if (this.r == null) {
                    p();
                }
                this.r = yc7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uwg
    public final xwg f(boolean z, axg axgVar) {
        v.getClass();
        id7 id7Var = bd7.a;
        ao3 ao3VarA = axgVar.a(id7Var.w(), 1);
        if (z) {
            ao3VarA = ao3.s(ao3VarA, id7Var);
        }
        if (ao3VarA == null) {
            return null;
        }
        return new id7(fjb.a(((ad7) l(ao3VarA)).b));
    }

    @Override // defpackage.uwg
    public final wwg l(ao3 ao3Var) {
        return new ad7(x8a.k(ao3Var), 0);
    }

    @Override // defpackage.uwg
    public final void s() {
        this.p.C0 = true;
    }

    public final String toString() {
        return "ImageAnalysis:".concat(g());
    }

    @Override // defpackage.uwg
    public final xwg u(l22 l22Var, wwg wwgVar) {
        Size sizeG;
        hc8 hc8VarC;
        Boolean bool = (Boolean) ((id7) this.f).d(id7.X, null);
        boolean zD = l22Var.o().d(OnePixelShiftQuirk.class);
        gd7 gd7Var = this.p;
        if (bool != null) {
            zD = bool.booleanValue();
        }
        gd7Var.X = zD;
        synchronized (this.q) {
            try {
                yc7 yc7Var = this.r;
                sizeG = yc7Var != null ? yc7Var.g() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sizeG == null) {
            return wwgVar.q();
        }
        ao3 ao3VarO = wwgVar.o();
        s90 s90Var = bf7.A;
        Object objF = 0;
        fjb fjbVar = (fjb) ao3VarO;
        fjbVar.getClass();
        try {
            objF = fjbVar.f(s90Var);
        } catch (IllegalArgumentException unused) {
        }
        if (l22Var.l(((Integer) objF).intValue()) % 180 == 90) {
            sizeG = new Size(sizeG.getHeight(), sizeG.getWidth());
        }
        xwg xwgVarQ = wwgVar.q();
        s90 s90Var2 = bf7.D;
        if (!xwgVarQ.i(s90Var2)) {
            ((x8a) wwgVar.o()).n(s90Var2, sizeG);
        }
        xwg xwgVarQ2 = wwgVar.q();
        s90 s90Var3 = bf7.H;
        if (xwgVarQ2.i(s90Var3)) {
            aod aodVar = (aod) this.e.d(s90Var3, null);
            if (aodVar == null) {
                hc8VarC = new hc8(15, false);
                hc8VarC.b = l16.c;
                hc8VarC.c = null;
                hc8VarC.d = null;
            } else {
                hc8VarC = hc8.C(aodVar);
            }
            if (aodVar == null || aodVar.b == null) {
                hc8VarC.c = new bod(sizeG);
            }
            if (aodVar == null) {
                hc8VarC.d = new sl6(4, sizeG);
            }
            ((x8a) wwgVar.o()).n(s90Var3, new aod((l16) hc8VarC.b, (bod) hc8VarC.c, (sl6) hc8VarC.d));
        }
        return wwgVar.q();
    }

    @Override // defpackage.uwg
    public final ob0 x(ao3 ao3Var) {
        this.s.f(ao3Var);
        Object[] objArr = {this.s.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        xa6 xa6VarA = this.g.a();
        xa6VarA.d = ao3Var;
        return xa6VarA.b();
    }

    @Override // defpackage.uwg
    public final ob0 y(ob0 ob0Var, ob0 ob0Var2) {
        id7 id7Var = (id7) this.f;
        e();
        die dieVarF = F(id7Var, ob0Var);
        this.s = dieVarF;
        Object[] objArr = {dieVarF.h()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return ob0Var;
    }

    @Override // defpackage.uwg
    public final void z() {
        jei.b();
        eie eieVar = this.u;
        if (eieVar != null) {
            eieVar.b();
            this.u = null;
        }
        cg7 cg7Var = this.t;
        if (cg7Var != null) {
            cg7Var.a();
            this.t = null;
        }
        gd7 gd7Var = this.p;
        gd7Var.C0 = false;
        gd7Var.c();
    }
}
