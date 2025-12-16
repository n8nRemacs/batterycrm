package defpackage;

/* loaded from: classes2.dex */
public final class bge extends u06 {
    public final boolean g;
    public final cm6 h;
    public final sxa i;

    public bge(boolean z, cm6 cm6Var, sxa sxaVar, y8g y8gVar, m81 m81Var, y6d y6dVar) {
        super(y8gVar, m81Var, y6dVar);
        this.g = z;
        this.h = cm6Var;
        this.i = sxaVar;
    }

    @Override // defpackage.s06
    public final void b() {
        if (this.g) {
            h();
            this.e = 6;
        }
    }

    @Override // defpackage.s06
    public final void c() {
        h();
        this.e = 5;
    }

    @Override // defpackage.u06, defpackage.s06
    public final void d(vdf vdfVar) {
        if (((Boolean) this.i.invoke()).booleanValue()) {
            if (((Number) this.h.invoke()).intValue() == 0) {
                this.d = true;
            } else {
                super.d(vdfVar);
            }
        }
    }

    @Override // defpackage.s06
    public final void e() {
        if (this.g) {
            return;
        }
        h();
        this.e = 4;
    }

    @Override // defpackage.u06
    public final String g() {
        return "ServerTopologyFirstDataStat";
    }
}
