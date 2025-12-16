package defpackage;

import java.text.CollationKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ku3 implements Comparable {
    public final boolean X;
    public final f7b Y;
    public kmb Z = null;
    public final aw3 a;
    public CharSequence b;
    public CharSequence c;
    public String d;
    public CollationKey o;

    public ku3(aw3 aw3Var, boolean z, f7b f7bVar) {
        this.a = aw3Var;
        this.X = z;
        this.Y = f7bVar;
    }

    public static ku3 a(long j, long j2, f7b f7bVar) {
        rv3 rv3Var = new rv3();
        rv3Var.a = j;
        rv3Var.f = Collections.singletonList(tv3.e);
        rv3Var.s = j2;
        rv3Var.k = yv3.b;
        rv3Var.j = 2;
        return new ku3(new aw3(0L, rv3Var.a()), false, f7bVar);
    }

    public static ku3 c(long j, long j2, f7b f7bVar) {
        rv3 rv3Var = new rv3();
        rv3Var.a = j;
        rv3Var.f = Collections.singletonList(tv3.e);
        rv3Var.s = j2;
        rv3Var.k = yv3.b;
        return new ku3(new aw3(0L, rv3Var.a()), false, f7bVar);
    }

    public final boolean A() {
        return this.a.b.n.contains(vv3.c);
    }

    public final boolean B() {
        return m() == 0 && this.a.b.a();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return e().toLowerCase().compareTo(((ku3) obj).e().toLowerCase());
    }

    public final boolean d() {
        aw3 aw3Var = this.a;
        return aw3Var.a != 0 && aw3Var.b.k == yv3.a;
    }

    public final String e() {
        zv3 zv3Var = this.a.b;
        String strA = null;
        if (this.X) {
            tv3 tv3VarJ = j();
            String strA2 = tv3VarJ != null ? tv3VarJ.a() : null;
            if (l8g.d(strA2)) {
                return strA2;
            }
        }
        int i = zv3Var.j;
        f7b f7bVar = this.Y;
        if (i == 2) {
            return f7bVar.a.getString(c5d.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return f7bVar.a.getString(c5d.tt_blocked_user);
        }
        if (B()) {
            p();
            return f7bVar.a.getString(fvd.B);
        }
        for (tv3 tv3Var : zv3Var.f) {
            if (!tv3Var.equals(tv3.e)) {
                strA = tv3Var.a();
                if (l8g.d(strA)) {
                    return strA;
                }
            }
        }
        if (!l8g.c(strA)) {
            return strA;
        }
        p();
        return f7bVar.a.getString(fvd.B);
    }

    public final String g() {
        tv3 tv3VarJ;
        if (this.X && (tv3VarJ = j()) != null) {
            String str = tv3VarJ.a;
            if (l8g.d(str)) {
                return str;
            }
        }
        zv3 zv3Var = this.a.b;
        int i = zv3Var.j;
        f7b f7bVar = this.Y;
        if (i == 2) {
            return f7bVar.a.getString(c5d.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return f7bVar.a.getString(c5d.tt_blocked_user);
        }
        List list = zv3Var.f;
        if (!list.isEmpty()) {
            return ((tv3) list.get(0)).a;
        }
        p();
        return f7bVar.a.getString(fvd.B);
    }

    public final String h() {
        tv3 tv3VarJ;
        if (this.X && (tv3VarJ = j()) != null) {
            String str = tv3VarJ.b;
            if (l8g.d(str)) {
                return str;
            }
        }
        zv3 zv3Var = this.a.b;
        int i = zv3Var.j;
        if (i == 2 || i == 1) {
            return null;
        }
        List list = zv3Var.f;
        if (list.isEmpty()) {
            return null;
        }
        return ((tv3) list.get(0)).b;
    }

    public final String i() {
        return this.a.b.p;
    }

    public final tv3 j() {
        Object next;
        List list = this.a.b.f;
        if (list == null) {
            next = null;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                try {
                    if (((tv3) next).c == sv3.c) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            next = null;
        }
        tv3 tv3Var = (tv3) next;
        if (tv3Var == null || l8g.c(tv3Var.a().trim())) {
            return null;
        }
        return tv3Var;
    }

    public final List k() {
        return this.a.b.f;
    }

    public final String l() {
        String strB = m6g.b(this.a.b.p);
        return !l8g.c(strB) ? strB : "";
    }

    public final int m() {
        return this.a.b.j;
    }

    public final CharSequence n(f7b f7bVar) {
        if (this.c == null) {
            this.c = f7bVar.j.b(0, this.a.b.o);
        }
        return this.c;
    }

    public final CharSequence o() {
        if (this.d == null) {
            Pattern pattern = r5b.a;
            this.d = r5b.b(g(), h());
        }
        return this.d;
    }

    public final long p() {
        return this.a.b.a;
    }

    public final long q() {
        return this.a.b.h;
    }

    public final String r(il0 il0Var) {
        if (B()) {
            return null;
        }
        String strA = xui.a(this.a.b.c, il0Var, hl0.a);
        if (l8g.c(strA)) {
            return null;
        }
        return strA;
    }

    public final String s(String str, il0 il0Var) {
        zv3 zv3Var = this.a.b;
        if (!B()) {
            boolean z = this.X;
            String str2 = z ? str : null;
            if (!l8g.c(str2)) {
                return str2;
            }
            String strA = xui.a(zv3Var.c, il0Var, hl0.a);
            if (!l8g.c(strA)) {
                return strA;
            }
            if (!B()) {
                if (z) {
                    return str;
                }
                if (!l8g.c(zv3Var.b)) {
                    return zv3Var.b;
                }
            }
        }
        return null;
    }

    public final List t() {
        String strR;
        zv3 zv3Var = this.a.b;
        kmb kmbVar = this.Z;
        if (kmbVar == null || !wyi.b(kmbVar.a, zv3Var.c)) {
            o98 o98VarD = ve3.d();
            Iterator it = new wp8(1, ll0.a).iterator();
            while (true) {
                ListIterator listIterator = ((eqd) it).b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                il0 il0Var = (il0) listIterator.previous();
                if (il0Var.compareTo(il0.b) >= 0 && il0Var.compareTo(il0.d) <= 0 && (strR = r(il0Var)) != null) {
                    o98VarD.add(strR);
                }
            }
            o98 o98VarA = ve3.a(o98VarD);
            String str = zv3Var.c;
            if (o98VarA.isEmpty()) {
                o98VarA = null;
            }
            this.Z = new kmb(str, o98VarA);
        }
        return (List) this.Z.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact{id=");
        aw3 aw3Var = this.a;
        sb.append(aw3Var.a);
        sb.append(", data=");
        sb.append(aw3Var.b);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        return this.a.b.i == xv3.a;
    }

    public final boolean v() {
        return this.a.b.n.contains(vv3.b);
    }

    public final boolean w() {
        return this.a.b.n.contains(vv3.X);
    }

    public final boolean x() {
        return this.a.b.n.contains(vv3.a);
    }

    public final boolean y(rt5 rt5Var) {
        gu5 gu5Var = (gu5) rt5Var;
        gu5Var.getClass();
        return gu5Var.j(PmsKey.f116officialbotnamingenabled, false) && v() && x() && !A();
    }

    public final boolean z() {
        return this.a.b.n.contains(vv3.o);
    }
}
