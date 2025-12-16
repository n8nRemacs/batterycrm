package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class vb5 extends ra5 implements qb5 {
    public final k18 a;
    public final k18 b;
    public ya5 c;
    public ec5 d;
    public boolean e;

    public vb5(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    @Override // defpackage.qb5
    public final boolean a(int i, CharSequence charSequence) {
        return j().a(i, charSequence);
    }

    @Override // defpackage.qb5
    public final List c(CharSequence charSequence) {
        return j().c(charSequence);
    }

    @Override // defpackage.qb5
    public final CharSequence e(CharSequence charSequence) {
        return j().e(charSequence);
    }

    @Override // defpackage.qb5
    public final List f(CharSequence charSequence) {
        return j().f(charSequence);
    }

    @Override // defpackage.qb5
    public final boolean g(CharSequence charSequence) {
        return j().g(charSequence);
    }

    @Override // defpackage.ra5
    public final void h(Throwable th) {
        sb5 sb5Var;
        Log.e("vb5", "Can't init emoji", th);
        k18 k18Var = this.b;
        if (k18Var == null || (sb5Var = (sb5) k18Var.getValue()) == null) {
            return;
        }
        ((y3b) ((yi5) sb5Var.e.getValue())).a(new IOException("Can't load emoji", th));
    }

    @Override // defpackage.ra5
    public final void i() {
        sb5 sb5Var;
        Log.d("vb5", "Initialized");
        this.c = new ya5(ta5.a());
        this.e = true;
        k18 k18Var = this.b;
        if (k18Var == null || (sb5Var = (sb5) k18Var.getValue()) == null) {
            return;
        }
        ((n0g) ((m0g) sb5Var.d.getValue())).a().b(new qj4(20, sb5Var));
        pb5 pb5Var = (pb5) sb5Var.f.getValue();
        if (pb5Var.c == null) {
            wqi.c("pb5", "invalidate: palette is null. Ignore", new Object[0]);
        } else {
            wqi.c("pb5", "invalidate", new Object[0]);
            new ora(vqa.i(pb5Var.c), new dm4(16, pb5Var), 3).s().m(((n0g) pb5Var.b).a()).k(new qu1(new wo4(7, pb5Var), 2, new dm4(17)));
        }
    }

    public final qb5 j() {
        ya5 ya5Var = this.c;
        if (ya5Var != null) {
            return ya5Var;
        }
        if (this.d == null) {
            this.d = new ec5();
        }
        return this.d;
    }
}
