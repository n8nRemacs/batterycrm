package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class gr6 implements l45 {
    public final ColorDrawable a;
    public final Resources b;
    public vtd c;
    public final qsd d;
    public final up5 e;
    public final ch6 f;

    public gr6(hr6 hr6Var) {
        int i;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        ml6.i();
        this.b = hr6Var.a;
        this.c = hr6Var.p;
        ch6 ch6Var = new ch6(colorDrawable);
        this.f = ch6Var;
        List list = hr6Var.n;
        int size = list != null ? list.size() : 1;
        int i2 = (size == 0 ? 1 : size) + (hr6Var.o != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i2 + 6];
        drawableArr[0] = a(hr6Var.m, null);
        drawableArr[1] = a(hr6Var.d, hr6Var.e);
        syd sydVar = hr6Var.l;
        ch6Var.setColorFilter(null);
        drawableArr[2] = m6i.e(ch6Var, sydVar);
        drawableArr[3] = a(hr6Var.j, hr6Var.k);
        drawableArr[4] = a(hr6Var.f, hr6Var.g);
        drawableArr[5] = a(hr6Var.h, hr6Var.i);
        if (i2 > 0) {
            List list2 = hr6Var.n;
            if (list2 != null) {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    drawableArr[i + 6] = a((Drawable) it.next(), null);
                    i++;
                }
            } else {
                i = 1;
            }
            StateListDrawable stateListDrawable = hr6Var.o;
            if (stateListDrawable != null) {
                drawableArr[i + 6] = a(stateListDrawable, null);
            }
        }
        up5 up5Var = new up5(drawableArr);
        this.e = up5Var;
        up5Var.v0 = hr6Var.b;
        if (up5Var.u0 == 1) {
            up5Var.u0 = 0;
        }
        qsd qsdVar = new qsd(m6i.d(up5Var, this.c));
        qsdVar.o = null;
        this.d = qsdVar;
        qsdVar.mutate();
        g();
        ml6.i();
    }

    public final Drawable a(Drawable drawable, syd sydVar) {
        return m6i.e(m6i.c(drawable, this.c, this.b), sydVar);
    }

    public final void b(int i) {
        if (i >= 0) {
            up5 up5Var = this.e;
            up5Var.u0 = 0;
            up5Var.A0[i] = true;
            up5Var.invalidateSelf();
        }
    }

    public final void c() {
        d(1);
        d(2);
        d(3);
        d(4);
        d(5);
    }

    public final void d(int i) {
        if (i >= 0) {
            up5 up5Var = this.e;
            up5Var.u0 = 0;
            up5Var.A0[i] = false;
            up5Var.invalidateSelf();
        }
    }

    public final w35 e(int i) {
        up5 up5Var = this.e;
        w35[] w35VarArr = up5Var.d;
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i < w35VarArr.length)) {
            throw new IllegalArgumentException();
        }
        if (w35VarArr[i] == null) {
            w35VarArr[i] = new ks(up5Var, i);
        }
        w35 w35Var = w35VarArr[i];
        w35Var.j();
        return w35Var.j() instanceof qyd ? (qyd) w35Var.j() : w35Var;
    }

    public final qyd f(int i) {
        w35 w35VarE = e(i);
        if (w35VarE instanceof qyd) {
            return (qyd) w35VarE;
        }
        Drawable drawableE = m6i.e(w35VarE.e(m6i.a), tyd.i);
        w35VarE.e(drawableE);
        l5j.e(drawableE, "Parent has no child drawable!");
        return (qyd) drawableE;
    }

    public final void g() {
        up5 up5Var = this.e;
        if (up5Var != null) {
            up5Var.B0++;
            up5Var.u0 = 0;
            Arrays.fill(up5Var.A0, true);
            up5Var.invalidateSelf();
            c();
            b(1);
            up5Var.b();
            up5Var.a();
        }
    }

    public final void h(syd sydVar) {
        sydVar.getClass();
        qyd qydVarF = f(2);
        if (yyi.b(qydVarF.o, sydVar)) {
            return;
        }
        qydVarF.o = sydVar;
        qydVarF.X = null;
        qydVarF.p();
        qydVarF.invalidateSelf();
    }

    public final void i(Drawable drawable, int i) {
        if (drawable == null) {
            this.e.e(null, i);
        } else {
            e(i).e(m6i.c(drawable, this.c, this.b));
        }
    }

    public final void j(Drawable drawable, float f, boolean z) {
        Drawable drawableC = m6i.c(drawable, this.c, this.b);
        drawableC.mutate();
        this.f.o(drawableC);
        up5 up5Var = this.e;
        up5Var.B0++;
        c();
        b(2);
        l(f);
        if (z) {
            up5Var.b();
        }
        up5Var.a();
    }

    public final void k(Drawable drawable) {
        l5j.b("The given index does not correspond to an overlay image.", 6 < this.e.c.length);
        i(drawable, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(float f) {
        Drawable drawableC = this.e.c(3);
        if (drawableC == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableC instanceof Animatable) {
                ((Animatable) drawableC).stop();
            }
            d(3);
        } else {
            if (drawableC instanceof Animatable) {
                ((Animatable) drawableC).start();
            }
            b(3);
        }
        drawableC.setLevel(Math.round(f * 10000.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(vtd vtdVar) {
        this.c = vtdVar;
        ColorDrawable colorDrawable = m6i.a;
        qsd qsdVar = this.d;
        Drawable drawable = qsdVar.a;
        if (vtdVar == null || vtdVar.a != 1) {
            if (drawable instanceof rtd) {
                qsdVar.o(((rtd) drawable).o(colorDrawable));
                colorDrawable.setCallback(null);
            }
        } else if (drawable instanceof rtd) {
            rtd rtdVar = (rtd) drawable;
            m6i.b(rtdVar, vtdVar);
            rtdVar.w0 = vtdVar.d;
            rtdVar.invalidateSelf();
        } else {
            qsdVar.o(m6i.d(qsdVar.o(colorDrawable), vtdVar));
        }
        for (int i = 0; i < this.e.c.length; i++) {
            w35 w35VarE = e(i);
            vtd vtdVar2 = this.c;
            while (true) {
                Object objJ = w35VarE.j();
                if (objJ == w35VarE || !(objJ instanceof w35)) {
                    break;
                } else {
                    w35VarE = (w35) objJ;
                }
            }
            Drawable drawableJ = w35VarE.j();
            if (vtdVar2 == null || vtdVar2.a != 2) {
                if (drawableJ instanceof mtd) {
                    mtd mtdVar = (mtd) drawableJ;
                    mtdVar.b(false);
                    mtdVar.c();
                    mtdVar.a(0, 0.0f);
                    mtdVar.h(0.0f);
                    mtdVar.k();
                    mtdVar.i();
                    int i2 = ntd.M0;
                    mtdVar.f();
                }
            } else if (drawableJ instanceof mtd) {
                m6i.b((mtd) drawableJ, vtdVar2);
            } else if (drawableJ != 0) {
                w35VarE.e(m6i.a);
                w35VarE.e(m6i.a(drawableJ, vtdVar2, this.b));
            }
        }
    }
}
