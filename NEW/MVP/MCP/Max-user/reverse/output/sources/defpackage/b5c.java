package defpackage;

import android.app.Application;

/* loaded from: classes2.dex */
public final class b5c implements k4c {
    public final Application a;
    public final yi5 b;
    public final bl5 c;
    public final k18 d;
    public final r4c e;
    public final qpc f;
    public final k18 h;
    public final k18 i;
    public final String g = b5c.class.getName();
    public final xs j = new xs(0);

    public b5c(Application application, yi5 yi5Var, bl5 bl5Var, k18 k18Var, r4c r4cVar, k18 k18Var2, k18 k18Var3, qpc qpcVar) {
        this.a = application;
        this.b = yi5Var;
        this.c = bl5Var;
        this.d = k18Var;
        this.e = r4cVar;
        this.f = qpcVar;
        this.h = k18Var2;
        this.i = k18Var3;
    }

    @Override // defpackage.k4c
    public final void a(cbh cbhVar) {
        String str = this.g;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Players pool. Free player, " + cbhVar, null);
            }
        }
        cbhVar.stop();
        cbhVar.a0(null);
        this.j.add(cbhVar);
    }

    @Override // defpackage.k4c
    public final cbh get() {
        if (this.j.isEmpty()) {
            wqi.c(this.g, "Players pool. Pool is empty create new player", new Object[0]);
            if (((gu5) ((rt5) this.h.getValue())).r()) {
                return new hhb(this.a, this.b, this.e, (tih) this.i.getValue(), (q0h) this.f.get());
            }
            return new dbh(this.a, this.b, this.c, this.d, this.e, (tih) this.i.getValue(), (q0h) this.f.get());
        }
        cbh cbhVar = (cbh) this.j.d(r0.c - 1);
        String str = this.g;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Players pool. Pool has player, " + cbhVar, null);
            }
        }
        return cbhVar;
    }
}
