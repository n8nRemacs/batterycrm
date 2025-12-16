package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class a9e {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final Object f = ipi.b(3, new efd(11));

    public a9e(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    public final f7b a() {
        return (f7b) this.a.getValue();
    }

    public final void b(o98 o98Var, ku3 ku3Var, pb2 pb2Var) {
        ejc ejcVar;
        l5c l5cVar = (l5c) ((age) this.d.getValue());
        l5cVar.getClass();
        if (!l5cVar.j(PmsKey.f38debugprofileinfo, false)) {
            pe8 pe8Var = (pe8) ((pb3) this.c.getValue());
            if (!((Boolean) pe8Var.E0.D(pe8Var, pe8.U0[18])).booleanValue()) {
                return;
            }
        }
        if (ku3Var == null) {
            ku3Var = pb2Var != null ? pb2Var.n() : null;
        }
        if (ku3Var != null) {
            ejcVar = new ejc(ku3Var.p());
        } else if (pb2Var == null) {
            return;
        } else {
            ejcVar = new ejc(pb2Var.b.a);
        }
        o98Var.add(ejcVar);
    }
}
