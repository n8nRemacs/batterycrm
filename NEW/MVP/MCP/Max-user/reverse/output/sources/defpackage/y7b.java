package defpackage;

/* loaded from: classes.dex */
public final class y7b {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public y7b(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
    }

    public final void a(long j) {
        mg4 mg4VarB = b();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            mg4VarB.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "mg4", vb9.e(j, "cancelServerChatId "), null);
            }
        }
        mg4VarB.c.m(null, new jg4(null, dk8.b(j), 11));
    }

    public final mg4 b() {
        return (mg4) this.d.getValue();
    }

    public final void c() {
        mg4 mg4VarB = b();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            mg4VarB.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "mg4", "notifyAllChats", null);
            }
        }
        mg4VarB.c.setValue(jg4.g);
        g();
    }

    public final void d(long j) {
        mg4 mg4VarB = b();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            mg4VarB.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "mg4", vb9.e(j, "notify #"), null);
            }
        }
        mg4VarB.c.setValue(jg4.f);
        g();
    }

    public final void e(long j) {
        mg4 mg4VarB = b();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            mg4VarB.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "mg4", vb9.e(j, "notifyServerChatIds #"), null);
            }
        }
        mg4VarB.c.m(null, new jg4(dk8.b(j), null, 13));
        g();
    }

    public final void f(n8a n8aVar) {
        mg4 mg4VarB = b();
        mg4VarB.getClass();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "mg4", "notifyServerChatIds ".concat(n8a.k(n8aVar, 31)), null);
            }
        }
        if (n8aVar.j()) {
            tcf tcfVar = mg4VarB.c;
            n8a n8aVar2 = new n8a(n8aVar.d);
            n8aVar2.b(n8aVar);
            tcfVar.m(null, new jg4(n8aVar2, null, 13));
        }
        g();
    }

    public final void g() {
        ((fxe) this.c.getValue()).d();
    }
}
