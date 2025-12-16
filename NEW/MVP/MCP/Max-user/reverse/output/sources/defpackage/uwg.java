package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class uwg {
    public xwg d;
    public xwg e;
    public xwg f;
    public ob0 g;
    public xwg h;
    public Rect i;
    public n22 k;
    public n22 l;
    public j5h m;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public int c = 2;
    public Matrix j = new Matrix();
    public hie n = hie.a();
    public hie o = hie.a();

    public uwg(xwg xwgVar) {
        this.e = xwgVar;
        this.f = xwgVar;
    }

    public void A(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    public final boolean B(int i) {
        Size size;
        int iG = ((bf7) this.f).G(-1);
        if (iG != -1 && iG == i) {
            return false;
        }
        wwg wwgVarL = l(this.e);
        bf7 bf7Var = (bf7) wwgVarL.q();
        int iG2 = bf7Var.G(-1);
        if (iG2 == -1 || iG2 != i) {
            ad7 ad7Var = (ad7) wwgVarL;
            switch (ad7Var.a) {
                case 0:
                    ad7Var.b.n(bf7.A, Integer.valueOf(i));
                    break;
                case 1:
                    ad7Var.b.n(bf7.A, Integer.valueOf(i));
                    break;
                case 2:
                    x8a x8aVar = ad7Var.b;
                    x8aVar.n(bf7.A, Integer.valueOf(i));
                    x8aVar.n(bf7.B, Integer.valueOf(i));
                    break;
                default:
                    ad7Var.b.n(bf7.A, Integer.valueOf(i));
                    break;
            }
        }
        if (iG2 != -1 && i != -1 && iG2 != i) {
            if (Math.abs(sxi.b(i) - sxi.b(iG2)) % 180 == 90 && (size = (Size) bf7Var.d(bf7.D, null)) != null) {
                ad7 ad7Var2 = (ad7) wwgVarL;
                Size size2 = new Size(size.getHeight(), size.getWidth());
                switch (ad7Var2.a) {
                    case 0:
                        ad7Var2.b.n(bf7.D, size2);
                        break;
                    case 1:
                        ad7Var2.b.n(bf7.D, size2);
                        break;
                    case 2:
                        ad7Var2.b.n(bf7.D, size2);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.e = wwgVarL.q();
        n22 n22VarC = c();
        if (n22VarC == null) {
            this.f = this.e;
            return true;
        }
        this.f = o(n22VarC.n(), this.d, this.h);
        return true;
    }

    public void C(Rect rect) {
        this.i = rect;
    }

    public final void D(n22 n22Var) {
        z();
        synchronized (this.b) {
            try {
                n22 n22Var2 = this.k;
                if (n22Var == n22Var2) {
                    this.a.remove(n22Var2);
                    this.k = null;
                }
                n22 n22Var3 = this.l;
                if (n22Var == n22Var3) {
                    this.a.remove(n22Var3);
                    this.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public final void E(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.n = (hie) list.get(0);
        if (list.size() > 1) {
            this.o = (hie) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (zr4 zr4Var : ((hie) it.next()).b()) {
                if (zr4Var.j == null) {
                    zr4Var.j = getClass();
                }
            }
        }
    }

    public final void a(n22 n22Var, n22 n22Var2, xwg xwgVar, xwg xwgVar2) {
        synchronized (this.b) {
            this.k = n22Var;
            this.l = n22Var2;
            this.a.add(n22Var);
            if (n22Var2 != null) {
                this.a.add(n22Var2);
            }
        }
        this.d = xwgVar;
        this.h = xwgVar2;
        this.f = o(n22Var.n(), this.d, this.h);
        s();
    }

    public final int b() {
        return ((Integer) ((bf7) this.f).d(bf7.B, -1)).intValue();
    }

    public final n22 c() {
        n22 n22Var;
        synchronized (this.b) {
            n22Var = this.k;
        }
        return n22Var;
    }

    public final s12 d() {
        synchronized (this.b) {
            try {
                n22 n22Var = this.k;
                if (n22Var == null) {
                    return s12.a;
                }
                return n22Var.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        n22 n22VarC = c();
        z5j.e(n22VarC, "No camera attached to use case: " + this);
        return n22VarC.n().d();
    }

    public abstract xwg f(boolean z, axg axgVar);

    public final String g() {
        String str = (String) this.f.d(a2g.e0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int h(n22 n22Var, boolean z) {
        int iL = n22Var.n().l(k());
        return (n22Var.l() || !z) ? iL : bhg.h(-iL);
    }

    public final n22 i() {
        n22 n22Var;
        synchronized (this.b) {
            n22Var = this.l;
        }
        return n22Var;
    }

    public Set j() {
        return Collections.EMPTY_SET;
    }

    public final int k() {
        return ((bf7) this.f).G(0);
    }

    public abstract wwg l(ao3 ao3Var);

    public final boolean m(int i) {
        Iterator it = j().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if ((i & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(n22 n22Var) {
        int iIntValue = ((Integer) ((bf7) this.f).d(bf7.C, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return n22Var.n().h() == 0;
        }
        throw new AssertionError(ho7.f(iIntValue, "Unknown mirrorMode: "));
    }

    public final xwg o(l22 l22Var, xwg xwgVar, xwg xwgVar2) {
        x8a x8aVarB;
        if (xwgVar2 != null) {
            x8aVarB = x8a.k(xwgVar2);
            x8aVarB.a.remove(a2g.e0);
        } else {
            x8aVarB = x8a.b();
        }
        TreeMap treeMap = x8aVarB.a;
        if (this.e.i(bf7.z) || this.e.i(bf7.D)) {
            s90 s90Var = bf7.H;
            if (treeMap.containsKey(s90Var)) {
                treeMap.remove(s90Var);
            }
        }
        xwg xwgVar3 = this.e;
        s90 s90Var2 = bf7.H;
        if (xwgVar3.i(s90Var2)) {
            s90 s90Var3 = bf7.F;
            if (treeMap.containsKey(s90Var3) && ((aod) this.e.f(s90Var2)).b != null) {
                treeMap.remove(s90Var3);
            }
        }
        Iterator it = this.e.e().iterator();
        while (it.hasNext()) {
            ao3.p(x8aVarB, x8aVarB, this.e, (s90) it.next());
        }
        if (xwgVar != null) {
            for (s90 s90Var4 : xwgVar.e()) {
                if (!s90Var4.a.equals(a2g.e0.a)) {
                    ao3.p(x8aVarB, x8aVarB, xwgVar, s90Var4);
                }
            }
        }
        if (treeMap.containsKey(bf7.D)) {
            s90 s90Var5 = bf7.z;
            if (treeMap.containsKey(s90Var5)) {
                treeMap.remove(s90Var5);
            }
        }
        s90 s90Var6 = bf7.H;
        if (treeMap.containsKey(s90Var6)) {
            ((aod) x8aVarB.f(s90Var6)).getClass();
        }
        return u(l22Var, l(x8aVarB));
    }

    public final void p() {
        this.c = 1;
        r();
    }

    public final void q() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((twg) it.next()).b(this);
        }
    }

    public final void r() {
        int iV = az1.v(this.c);
        HashSet hashSet = this.a;
        if (iV == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((twg) it.next()).d(this);
            }
        } else {
            if (iV != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((twg) it2.next()).o(this);
            }
        }
    }

    public void s() {
    }

    public void t() {
    }

    public abstract xwg u(l22 l22Var, wwg wwgVar);

    public void v() {
    }

    public void w() {
    }

    public abstract ob0 x(ao3 ao3Var);

    public abstract ob0 y(ob0 ob0Var, ob0 ob0Var2);

    public void z() {
    }
}
