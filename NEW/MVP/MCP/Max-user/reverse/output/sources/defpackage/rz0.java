package defpackage;

import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class rz0 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;

    public /* synthetic */ rz0(k01 k01Var, int i) {
        this.a = i;
        this.b = k01Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                k01 k01Var = this.b;
                return new zk1(k01Var.O0.i, k01Var.R0);
            case 1:
                k01 k01Var2 = this.b;
                return new p21(k01Var2.O0.j, k01Var2.R0);
            case 2:
                return this.b.o0.v();
            case 3:
                return Boolean.valueOf(this.b.k0.a.c.e);
            case 4:
                return this.b.o0.v();
            case 5:
                return this.b.o0.v();
            case 6:
                return this.b.k;
            case 7:
                return this.b.k;
            case 8:
                return this.b.k;
            case 9:
                return this.b.k;
            case 10:
                k01 k01Var3 = this.b;
                li liVar = k01Var3.z0;
                rve rveVar = k01Var3.f0;
                if (rveVar != null) {
                    k01Var3.c.execute(new cj(k01Var3, liVar, rveVar, 9));
                }
                return qqg.a;
            case 11:
                return this.b.o0.v();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return this.b.N0.j;
            case 13:
                return this.b.G0;
            default:
                return this.b.o0.v();
        }
    }
}
