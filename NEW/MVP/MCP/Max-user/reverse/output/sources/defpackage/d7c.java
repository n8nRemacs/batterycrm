package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class d7c {
    public final f7b a;
    public final qv3 b;
    public final z7c c;
    public final si9 d;
    public final gk e;
    public pb2 f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public String k;
    public String l;
    public mf4 m;
    public boolean n;
    public boolean o;
    public boolean p;

    public d7c(f7b f7bVar, qv3 qv3Var, z7c z7cVar, si9 si9Var, pb2 pb2Var, gk gkVar) {
        this.a = f7bVar;
        this.b = qv3Var;
        this.c = z7cVar;
        this.d = si9Var;
        this.e = gkVar;
        if (pb2Var != null) {
            i(pb2Var);
            return;
        }
        e();
        g();
        f();
        d(f7bVar.h());
    }

    public final CharSequence a(pb2 pb2Var, si9 si9Var) {
        boolean z = this.c.c.g.getBoolean("audio.transcription.enabled", true);
        boolean zT = si9Var.t();
        String str = si9Var.Y;
        if (!zT || (!si9Var.J() && !l8g.c(str))) {
            return str;
        }
        f7b f7bVar = this.a;
        if (pb2Var == null || pb2Var.M() || pb2Var.Q() || pb2Var.U()) {
            return f7bVar.e.f(f7bVar.a, f7bVar, si9Var, false, false, false, z, f7bVar.c.s(), true);
        }
        CharSequence charSequenceF = f7bVar.e.f(f7bVar.a, f7bVar, si9Var, false, false, false, z, f7bVar.c.s(), true);
        f7bVar.e.f(f7bVar.a, f7bVar, si9Var, false, false, false, z, f7bVar.c.s(), true);
        return charSequenceF;
    }

    public final CharSequence b(pb2 pb2Var) {
        this.f = pb2Var;
        f7b f7bVar = this.a;
        j(pb2Var, f7bVar.g(), f7bVar.f());
        return this.i;
    }

    public final boolean c(pb2 pb2Var, si9 si9Var) {
        return ((si9Var.o > this.c.a.s() ? 1 : (si9Var.o == this.c.a.s() ? 0 : -1)) != 0) || (pb2Var != null && pb2Var.M());
    }

    public final void d(int i) {
        ku3 ku3VarI = this.b.i(this.d.o, true);
        if (this.h == null) {
            this.h = this.a.j.b(i, ku3VarI.e());
        }
    }

    public final void e() {
        if (this.m == null) {
            si9 si9Var = this.d;
            this.m = mf4.i(si9Var.u() ? si9Var.Q0.a : si9Var.p(), TimeZone.getDefault());
        }
    }

    public final void f() {
        String strF;
        if (this.l == null) {
            e();
            mf4 mf4Var = this.m;
            f7b f7bVar = this.a;
            Context context = f7bVar.a;
            Locale localeU = f7bVar.c.u();
            mf4 mf4VarN = mf4.n(TimeZone.getDefault());
            if (ml6.j(mf4VarN, mf4Var)) {
                strF = context.getString(c5d.tt_dates_today);
            } else if (mf4Var.m().p(1).equals(mf4VarN.m())) {
                strF = context.getString(c5d.tt_dates_yesterday);
            } else {
                long j = mf4Var.j(TimeZone.getDefault());
                strF = mf4VarN.a.equals(mf4Var.a) ? ml6.f(localeU, j, false) : ml6.f(localeU, j, true);
            }
            this.l = strF;
        }
    }

    public final void g() {
        if (this.k == null) {
            si9 si9Var = this.d;
            long jP = si9Var.u() ? si9Var.Q0.a : si9Var.p();
            f7b f7bVar = this.a;
            this.k = ml6.b(f7bVar.a, jP, f7bVar.c.u());
        }
    }

    public final void h(pb2 pb2Var) {
        boolean z;
        if (this.o) {
            return;
        }
        si9 si9Var = this.d;
        boolean zD = si9Var.D();
        if (!zD) {
            z = true;
        } else if (zD) {
            this.c.a.getClass();
            z = true;
        } else {
            z = false;
        }
        if (!l8g.c(this.g) && z) {
            this.g = ssi.p(this.a.b(this.g, pb2Var != null && (pb2Var.N() || pb2Var.U()), true, pb2Var != null && pb2Var.s0(), !zD, si9Var.N0, c(pb2Var, si9Var)));
        }
        this.o = true;
    }

    public final void i(pb2 pb2Var) {
        this.f = pb2Var;
        f7b f7bVar = this.a;
        j(pb2Var, f7bVar.g(), f7bVar.f());
        h(pb2Var);
        e();
        g();
        f();
        d(f7bVar.h());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x007f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129 A[ADDED_TO_REGION, REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.pb2 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7c.j(pb2, int, int):void");
    }
}
