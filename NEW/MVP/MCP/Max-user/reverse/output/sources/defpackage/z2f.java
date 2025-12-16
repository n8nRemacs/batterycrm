package defpackage;

import android.app.Application;

/* loaded from: classes2.dex */
public final class z2f implements k4c {
    public final Application a;
    public final yi5 b;
    public final bl5 c;
    public final k18 d;
    public final r4c e;
    public final k18 f;
    public final String g = z2f.class.getName();
    public final k18 h;
    public final und i;

    public z2f(Application application, yi5 yi5Var, bl5 bl5Var, k18 k18Var, r4c r4cVar, k18 k18Var2, k18 k18Var3, qpc qpcVar) {
        this.a = application;
        this.b = yi5Var;
        this.c = bl5Var;
        this.d = k18Var;
        this.e = r4cVar;
        this.f = k18Var2;
        this.h = k18Var3;
        this.i = new und(new sue(this, 2, qpcVar));
    }

    @Override // defpackage.k4c
    public final void a(cbh cbhVar) {
        wqi.c(this.g, "Single player handler. Free player", new Object[0]);
        cbhVar.stop();
        cbhVar.a0(null);
    }

    @Override // defpackage.k4c
    public final cbh get() {
        String str = this.g;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("Single player handler. Player exist: ", this.i.e()), null);
            }
        }
        return (cbh) this.i.getValue();
    }
}
