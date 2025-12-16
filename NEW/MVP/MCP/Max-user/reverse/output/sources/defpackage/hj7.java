package defpackage;

/* loaded from: classes2.dex */
public final class hj7 extends u06 {
    public final /* synthetic */ int g;
    public final boolean h;
    public final boolean i;
    public final hn6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj7(hn6 hn6Var, boolean z, boolean z2, y8g y8gVar, m81 m81Var, y6d y6dVar, int i) {
        super(y8gVar, m81Var, y6dVar);
        this.g = i;
        this.j = hn6Var;
        this.h = z;
        this.i = z2;
    }

    @Override // defpackage.s06
    public void b() {
        switch (this.g) {
            case 1:
                h();
                break;
        }
    }

    @Override // defpackage.u06, defpackage.s06
    public final void d(vdf vdfVar) {
        switch (this.g) {
            case 0:
                if (!((Boolean) ((sxa) this.j).invoke()).booleanValue() && !this.h && !this.i) {
                    super.d(vdfVar);
                    break;
                }
                break;
            default:
                if (!((Boolean) ((sxa) this.j).invoke()).booleanValue() && this.h && !this.i) {
                    super.d(vdfVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s06
    public void e() {
        switch (this.g) {
            case 0:
                h();
                break;
        }
    }

    @Override // defpackage.u06
    public final int f() {
        switch (this.g) {
            case 0:
                return 3;
            default:
                return 2;
        }
    }

    @Override // defpackage.u06
    public final String g() {
        switch (this.g) {
            case 0:
                return "incomingP2PFirstDataStat";
            default:
                return "OutgoingP2PFirstDataStat";
        }
    }
}
