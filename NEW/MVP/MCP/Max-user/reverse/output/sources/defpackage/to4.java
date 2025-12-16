package defpackage;

/* loaded from: classes.dex */
public final class to4 {
    public final String a;
    public int b;
    public long c;
    public final d99 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ uo4 g;

    public to4(uo4 uo4Var, String str, int i, d99 d99Var) {
        this.g = uo4Var;
        this.a = str;
        this.b = i;
        this.c = d99Var == null ? -1L : d99Var.d;
        if (d99Var == null || !d99Var.b()) {
            return;
        }
        this.d = d99Var;
    }

    public final boolean a(id idVar) {
        d99 d99Var = idVar.d;
        s9g s9gVar = idVar.b;
        if (d99Var == null) {
            return this.b != idVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (d99Var.d > j) {
            return true;
        }
        d99 d99Var2 = this.d;
        if (d99Var2 == null) {
            return false;
        }
        int i = d99Var2.b;
        int iB = s9gVar.b(d99Var.a);
        int iB2 = s9gVar.b(d99Var2.a);
        if (d99Var.d < d99Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!d99Var.b()) {
            int i2 = d99Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = d99Var.b;
        int i4 = d99Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > d99Var2.c;
        }
        return true;
    }

    public final boolean b(s9g s9gVar, s9g s9gVar2) {
        d99 d99Var;
        int i = this.b;
        if (i < s9gVar.o()) {
            uo4 uo4Var = this.g;
            q9g q9gVar = uo4Var.a;
            s9gVar.n(i, q9gVar);
            for (int i2 = q9gVar.n; i2 <= q9gVar.o; i2++) {
                int iB = s9gVar2.b(s9gVar.l(i2));
                if (iB != -1) {
                    i = s9gVar2.f(iB, uo4Var.b, false).c;
                    break;
                }
            }
            i = -1;
        } else if (i >= s9gVar2.o()) {
            i = -1;
        }
        this.b = i;
        return i != -1 && ((d99Var = this.d) == null || s9gVar2.b(d99Var.a) != -1);
    }
}
