package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b2c extends v0 {
    public boolean A;
    public rf7 B;
    public rf7 C;
    public final ml4 v;
    public final sz w;
    public final jf9 x;
    public jp0 y;
    public brf z;

    public b2c(Resources resources, fs4 fs4Var, v35 v35Var, Executor executor, jf9 jf9Var, sz szVar) {
        super(fs4Var, executor);
        this.v = new ml4(resources, v35Var);
        this.w = szVar;
        this.x = jf9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qyd s(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof qyd) {
            return (qyd) drawable;
        }
        if (drawable instanceof w35) {
            return s(((w35) drawable).j());
        }
        if (!(drawable instanceof up5)) {
            return null;
        }
        up5 up5Var = (up5) drawable;
        int length = up5Var.c.length;
        for (int i = 0; i < length; i++) {
            qyd qydVarS = s(up5Var.c(i));
            if (qydVarS != null) {
                return qydVarS;
            }
        }
        return null;
    }

    @Override // defpackage.v0
    public final Drawable b(Object obj) {
        vc3 vc3Var = (vc3) obj;
        try {
            ml6.i();
            l5j.f(vc3.i0(vc3Var));
            sc3 sc3Var = (sc3) vc3Var.Z();
            t(sc3Var);
            sz szVar = this.w;
            if (szVar != null) {
                Iterator<E> it = szVar.iterator();
                while (it.hasNext()) {
                    v35 v35Var = (v35) it.next();
                    if (v35Var.b(sc3Var) && (drawableA = v35Var.a(sc3Var)) != null) {
                        break;
                    }
                }
            }
            Drawable drawableA = null;
            if (drawableA != null) {
                return drawableA;
            }
            Drawable drawableA2 = this.v.a(sc3Var);
            if (drawableA2 != null) {
                return drawableA2;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + sc3Var);
        } finally {
            ml6.i();
        }
    }

    @Override // defpackage.v0
    public final pe7 d(Object obj) {
        vc3 vc3Var = (vc3) obj;
        l5j.f(vc3.i0(vc3Var));
        return ((sc3) vc3Var.Z()).getImageInfo();
    }

    public final void t(sc3 sc3Var) {
        qyd qydVarS;
        if (this.A) {
            if (this.i == null) {
                qg4 qg4Var = new qg4();
                a(new ze7(qg4Var));
                this.i = qg4Var;
                gr6 gr6Var = this.h;
                if (gr6Var != null) {
                    qsd qsdVar = gr6Var.d;
                    qsdVar.o = qg4Var;
                    qsdVar.invalidateSelf();
                }
            }
            qg4 qg4Var2 = this.i;
            if (qg4Var2 != null) {
                String str = this.j;
                qg4Var2.getClass();
                if (str == null) {
                    str = "none";
                }
                qg4Var2.a = str;
                qg4Var2.invalidateSelf();
                gr6 gr6Var2 = this.h;
                syd sydVar = null;
                if (gr6Var2 != null && (qydVarS = s(gr6Var2.d)) != null) {
                    sydVar = qydVarS.o;
                }
                qg4Var2.e = sydVar;
                if (sc3Var == null) {
                    qg4Var2.b();
                    return;
                }
                int width = sc3Var.getWidth();
                int height = sc3Var.getHeight();
                qg4Var2.b = width;
                qg4Var2.c = height;
                qg4Var2.invalidateSelf();
                qg4Var2.d = sc3Var.getSizeInBytes();
            }
        }
    }

    @Override // defpackage.v0
    public final String toString() {
        hc8 hc8VarC = yyi.c(this);
        hc8VarC.r(super.toString(), "super");
        hc8VarC.r(this.z, "dataSourceSupplier");
        return hc8VarC.toString();
    }

    public final void u(l45 l45Var) {
        if (op5.a.h(2)) {
            op5.f(v0.u, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.j, l45Var);
        }
        this.a.a(l45Var != null ? j45.a : j45.b);
        if (this.l) {
            this.b.a(this);
            m();
        }
        gr6 gr6Var = this.h;
        if (gr6Var != null) {
            qsd qsdVar = gr6Var.d;
            qsdVar.o = null;
            qsdVar.invalidateSelf();
            this.h = null;
        }
        if (l45Var != null) {
            if (!(l45Var instanceof gr6)) {
                throw new IllegalArgumentException();
            }
            gr6 gr6Var2 = (gr6) l45Var;
            this.h = gr6Var2;
            qg4 qg4Var = this.i;
            qsd qsdVar2 = gr6Var2.d;
            qsdVar2.o = qg4Var;
            qsdVar2.invalidateSelf();
        }
        t(null);
    }
}
