package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class zd3 {
    public static final /* synthetic */ yy7[] l;
    public final Context a;
    public final ViewGroup b;
    public int c;
    public int d;
    public boolean e;
    public final os0 f;
    public final nk g;
    public final us h;
    public em6 i;
    public float[] j;
    public final int k;

    static {
        z8a z8aVar = new z8a(zd3.class, "imageAttaches", "getImageAttaches()Ljava/util/List;");
        vid.a.getClass();
        l = new yy7[]{z8aVar};
    }

    public zd3(Context context, ViewGroup viewGroup) {
        this.a = context;
        this.b = viewGroup;
        os0 os0Var = new os0();
        os0Var.a = false;
        os0Var.b = new ArrayList();
        this.f = os0Var;
        this.g = new nk(this);
        this.h = new us(0);
        this.i = new d73(2);
        this.j = ee4.a;
        this.k = kti.d(1 * vw4.d().getDisplayMetrics().density);
        viewGroup.addOnAttachStateChangeListener(new rk(3, this));
    }

    public static int f(int i) {
        return (int) Math.rint(i * 0.4f);
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, k18] */
    public static void k(pd7 pd7Var, ld3 ld3Var, pd3 pd3Var) {
        ld3Var.b = pd3Var;
        jdc jdcVar = ld3Var.c;
        Drawable drawable = pd3Var instanceof nd3 ? (r00) jdcVar.c.getValue() : pd3Var instanceof od3 ? (w2c) jdcVar.b.getValue() : ld3Var.a instanceof s0h ? (w2c) jdcVar.d.getValue() : null;
        l45 l45Var = pd7Var.d;
        l45Var.getClass();
        ((gr6) l45Var).k(drawable);
    }

    public final void a() {
        os0 os0Var = this.f;
        os0Var.l();
        us usVar = this.h;
        Iterator it = ((ts) usVar.values()).iterator();
        while (it.hasNext()) {
            ((ld3) it.next()).a();
        }
        usVar.clear();
        ArrayList arrayList = (ArrayList) os0Var.b;
        if (os0Var.a) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((m45) arrayList.get(i)).g();
            }
        }
        arrayList.clear();
    }

    public final jd3 b(int i, int i2) {
        qsd qsdVarD;
        int length = this.j.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            m45 m45VarC = this.f.c(i3);
            pd7 pd7Var = m45VarC instanceof pd7 ? (pd7) m45VarC : null;
            if (pd7Var != null && (qsdVarD = pd7Var.d()) != null && qsdVarD.getBounds().contains(i, i2)) {
                yy7 yy7Var = l[0];
                jd3 jd3Var = (jd3) ue3.J(i3, (List) this.g.b);
                if (jd3Var == null) {
                    break;
                }
                return jd3Var;
            }
            i3++;
        }
        return null;
    }

    public final boolean c(MotionEvent motionEvent) {
        ld3 ld3Var;
        qsd qsdVarD;
        if (motionEvent.getAction() == 1) {
            int length = this.j.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                m45 m45VarC = this.f.c(i);
                pd7 pd7Var = m45VarC instanceof pd7 ? (pd7) m45VarC : null;
                if (pd7Var != null && (ld3Var = (ld3) this.h.get(pd7Var)) != null && (qsdVarD = pd7Var.d()) != null) {
                    if (qsdVarD.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        pd3 pd3Var = ld3Var.b;
                        if (pd3Var instanceof nd3) {
                            ld3Var.a();
                            k(pd7Var, ld3Var, od3.a);
                            return true;
                        }
                        if (pd3Var instanceof od3) {
                            h(pd7Var, ld3Var.a, true);
                            return true;
                        }
                    }
                }
                i++;
            }
        }
        return false;
    }

    public final void d(int i, int i2) {
        qsd qsdVarD;
        int length = this.j.length;
        int i3 = i;
        for (int i4 = 0; i4 < length; i4++) {
            os0 os0Var = this.f;
            m45 m45VarC = os0Var.c(i4);
            pd7 pd7Var = m45VarC instanceof pd7 ? (pd7) m45VarC : null;
            if (pd7Var != null && (qsdVarD = pd7Var.d()) != null) {
                int i5 = pd7Var.g + i3;
                int i6 = this.c + i;
                int i7 = this.k;
                if (i5 > i6) {
                    i2 += ((pd7) os0Var.c(i4 - 1)).h + i7;
                    i3 = i;
                }
                qsdVarD.setBounds(i3, i2, pd7Var.g + i3, pd7Var.h + i2);
                i3 += pd7Var.g + i7;
            }
        }
    }

    public final void e(int i) {
        os0 os0Var;
        int iF;
        int i2;
        int i3;
        if (this.j.length == 0) {
            return;
        }
        os0 os0Var2 = this.f;
        if (((ArrayList) os0Var2.b).size() <= 0) {
            return;
        }
        int i4 = 0;
        this.d = 0;
        if (this.j.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        float f = i;
        double d = 0.45f * f;
        double d2 = f * 0.6f;
        int iC = n7j.c((int) Math.rint(((int) Math.rint(d)) / r4[0]), (int) Math.rint(d), (int) Math.rint(d2));
        int length = this.j.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.k;
            if (i5 >= length) {
                this.d -= i8;
                this.c = i;
                return;
            }
            m45 m45VarC = os0Var2.c(i5);
            int i9 = i4;
            pd7 pd7Var = m45VarC instanceof pd7 ? (pd7) m45VarC : null;
            if (pd7Var == null) {
                os0Var = os0Var2;
            } else {
                float f2 = iC;
                os0Var = os0Var2;
                int iRint = (int) Math.rint(this.j[i5] * f2);
                float[] fArr = this.j;
                int i10 = iC;
                if (fArr.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                int i11 = (fArr[i9] <= 1.0f || i5 != 0) ? i9 : 1;
                int i12 = i5 == fArr.length + (-1) ? 1 : i9;
                int i13 = (i5 >= fArr.length + (-1) || Float.compare(fArr[i5], fArr[i5 + 1]) != 0) ? i9 : 1;
                if (i11 != 0 || i12 != 0) {
                    iC = (i11 == 0 || this.j.length <= 3) ? i10 : (int) Math.rint(d2);
                    iF = i - i6;
                    i2 = 1;
                    i3 = 1;
                } else if (i13 == 0 || i7 != 0) {
                    if (i7 == 1) {
                        iF = i - i6;
                    } else {
                        int i14 = i - i6;
                        if (i14 - iRint >= f(i)) {
                            iF = iRint < f(i) ? f(i) : (int) Math.rint(f2 * this.j[i5]);
                        } else if (i14 - f(i) < f(i)) {
                            i3 = i9;
                            iC = i10;
                            iF = i14;
                            i2 = 1;
                        } else {
                            iF = i14 - f(i);
                        }
                    }
                    i3 = i9;
                    iC = i10;
                    i2 = 1;
                } else {
                    iF = i / 2;
                    i3 = i9;
                    iC = i10;
                    i2 = 1;
                }
                if (i7 == i2 && i3 == 0) {
                    i3 = i2;
                }
                pd7Var.h = iC;
                pd7Var.g = iF;
                i7++;
                i6 += iF + i8;
                if (i3 != 0) {
                    this.d = iC + i8 + this.d;
                    iC = n7j.c((int) Math.rint(((int) Math.rint(d)) / this.j[i5]), (int) Math.rint(d), (int) Math.rint(d2));
                    i6 = i9;
                    i7 = i6;
                }
            }
            i5++;
            i4 = i9;
            os0Var2 = os0Var;
        }
    }

    public final void g(int i, int i2, int[] iArr) {
        ld3 ld3Var;
        Drawable drawableB;
        qsd qsdVarD;
        int length = this.j.length;
        for (int i3 = 0; i3 < length; i3++) {
            m45 m45VarC = this.f.c(i3);
            pd7 pd7Var = m45VarC instanceof pd7 ? (pd7) m45VarC : null;
            if (pd7Var != null && (ld3Var = (ld3) this.h.get(pd7Var)) != null && (drawableB = ld3Var.b()) != null && (qsdVarD = pd7Var.d()) != null && qsdVarD.getBounds().contains(i, i2)) {
                drawableB.setHotspot(drawableB.getBounds().centerX(), drawableB.getBounds().centerY());
                drawableB.setState(iArr);
                return;
            }
        }
    }

    public final void h(pd7 pd7Var, jd3 jd3Var, boolean z) {
        Uri uri;
        Uri uri2;
        ynd yndVar;
        us usVar = this.h;
        ld3 ld3Var = (ld3) usVar.get(pd7Var);
        if (ld3Var != null) {
            ld3Var.a();
        }
        ld3 ld3Var2 = new ld3(jd3Var, i(jd3Var), new jdc(this.b));
        usVar.put(pd7Var, ld3Var2);
        k(pd7Var, ld3Var2, ld3Var2.b);
        l45 l45Var = pd7Var.d;
        l45Var.getClass();
        ((gr6) l45Var).h(tyd.c);
        boolean z2 = !jd3Var.j() || z;
        boolean z3 = jd3Var instanceof od7;
        rf7 rf7VarA = null;
        if (z3) {
            od7 od7Var = (od7) jd3Var;
            uri = od7Var.e ? od7Var.h : z2 ? od7Var.b : null;
        } else {
            if (!(jd3Var instanceof s0h)) {
                throw new NoWhenBranchMatchedException();
            }
            uri = ((s0h) jd3Var).b;
        }
        if (uri != null) {
            sf7 sf7VarD = sf7.d(uri);
            if (z3) {
                yndVar = ((od7) jd3Var).i;
            } else {
                if (!(jd3Var instanceof s0h)) {
                    throw new NoWhenBranchMatchedException();
                }
                yndVar = ((s0h) jd3Var).i;
            }
            sf7VarD.d = yndVar;
            sf7VarD.l = new yd3(this, pd7Var, ld3Var2, jd3Var);
            rf7VarA = sf7VarD.a();
        }
        rf7 rf7Var = rf7VarA;
        i45 i45Var = pd7Var.e;
        c2c c2cVarA = zk6.a.a();
        c2cVarA.i = i45Var;
        c2cVarA.h = true;
        c2cVarA.b = rf7Var;
        c2cVarA.e = new ud3(this, rf7Var, ld3Var2, pd7Var, jd3Var);
        if (z3) {
            uri2 = ((od7) jd3Var).h;
        } else {
            if (!(jd3Var instanceof s0h)) {
                throw new NoWhenBranchMatchedException();
            }
            uri2 = ((s0h) jd3Var).h;
        }
        if (uri2 != null) {
            c2cVarA.c = sf7.d(uri2).a();
        }
        pd7Var.i(c2cVarA.a());
    }

    public final pd3 i(jd3 jd3Var) {
        if (jd3Var instanceof od7) {
            if (((od7) jd3Var).g) {
                return od3.a;
            }
            if (!this.e) {
                return null;
            }
        } else {
            if (!(jd3Var instanceof s0h)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.e) {
                return null;
            }
        }
        return nd3.a;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    public final void j() {
        Iterator it = ((ts) this.h.values()).iterator();
        while (it.hasNext()) {
            ld3 ld3Var = (ld3) it.next();
            yeb yebVarK = a93.s0.x(this.a).k();
            jdc jdcVar = ld3Var.c;
            ?? r3 = jdcVar.b;
            if (r3.e()) {
                ((w2c) r3.getValue()).onThemeChanged(yebVarK);
            }
            ?? r32 = jdcVar.d;
            if (r32.e()) {
                ((w2c) r32.getValue()).onThemeChanged(yebVarK);
            }
            ?? r1 = jdcVar.c;
            if (r1.e()) {
                r00 r00Var = (r00) r1.getValue();
                yebVarK.a();
                r00Var.setTint(-1);
                r00Var.b(-1);
                r00Var.q = 1543503872;
                r00Var.invalidateSelf();
            }
        }
    }

    public final boolean l(Drawable drawable) {
        int i = 0;
        while (true) {
            os0 os0Var = this.f;
            if (i >= ((ArrayList) os0Var.b).size()) {
                us usVar = this.h;
                ArrayList arrayList = new ArrayList(usVar.c);
                Iterator it = ((ps) usVar.entrySet()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((ld3) ((Map.Entry) it.next()).getValue()).b());
                }
                return arrayList.contains(drawable);
            }
            if (drawable == os0Var.c(i).d()) {
                return true;
            }
            i++;
        }
    }
}
