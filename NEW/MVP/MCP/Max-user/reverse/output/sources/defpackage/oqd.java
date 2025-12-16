package defpackage;

/* loaded from: classes.dex */
public final class oqd {
    public final k18 a;
    public final k18 b;
    public final bwf c;
    public int d;

    public oqd(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.a = k18Var3;
        this.b = k18Var4;
        this.c = new bwf(new o5b(k18Var, k18Var2, k18Var5, k18Var6, k18Var4, k18Var7, 1));
    }

    public final el1 a() {
        return (el1) this.c.getValue();
    }

    public final void b() {
        this.d = 4;
        el1 el1VarA = a();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            el1VarA.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "RingtoneManagerTag", "startBusy ringtone", null);
            }
        }
        if (el1VarA.a()) {
            el1VarA.c(el1VarA.k.f, false);
        }
    }

    public final void c() {
        this.d = 5;
        el1 el1VarA = a();
        if (((Boolean) el1VarA.i.getValue()).booleanValue()) {
            el1VarA.c(el1VarA.k.d, true);
        }
    }

    public final void d() {
        this.d = 1;
        el1 el1VarA = a();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            el1VarA.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "RingtoneManagerTag", "startEnd ringtone", null);
            }
        }
        if (el1VarA.a()) {
            el1VarA.c(el1VarA.k.a, false);
        }
    }

    public final void e() {
        int i = this.d;
        if (i == 1 || i == 4) {
            this.d = 0;
        } else {
            this.d = 0;
            a().e();
        }
    }
}
