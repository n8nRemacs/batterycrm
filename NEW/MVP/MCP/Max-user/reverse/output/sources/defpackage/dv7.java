package defpackage;

/* loaded from: classes2.dex */
public final class dv7 extends u06 {
    public final sxa g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public dv7(sxa sxaVar, boolean z, boolean z2, boolean z3, y8g y8gVar, m81 m81Var, y6d y6dVar) {
        super(y8gVar, m81Var, y6dVar);
        this.g = sxaVar;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    @Override // defpackage.s06
    public final void b() {
        h();
    }

    @Override // defpackage.u06, defpackage.s06
    public final void d(vdf vdfVar) {
        if (((Boolean) this.g.invoke()).booleanValue() || this.h || !this.i || !this.j) {
            return;
        }
        super.d(vdfVar);
    }

    @Override // defpackage.s06
    public final void e() {
        h();
    }

    @Override // defpackage.u06
    public final int f() {
        return 7;
    }

    @Override // defpackage.u06
    public final String g() {
        return "JoinP2PFirstDataStat";
    }
}
