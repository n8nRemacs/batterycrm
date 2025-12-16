package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class eq4 implements tq4, uu1, y89, fu3, qpc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eq4(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        k20 k20Var = (k20) this.c;
        em5 em5Var = ((a5c) obj).a;
        ua8 ua8Var = em5Var.x0;
        em5Var.A1();
        if (em5Var.o1) {
            return;
        }
        if (!Objects.equals(em5Var.f1, k20Var)) {
            em5Var.f1 = k20Var;
            em5Var.m1(1, 3, k20Var);
            ua8Var.c(20, new tl5(k20Var, 0));
        }
        sm5 sm5Var = em5Var.w0;
        sm5Var.Z.b(em5Var.f1, 31, this.b ? 1 : 0, 0).b();
        ua8Var.b();
    }

    @Override // defpackage.tq4
    public zjd e(int i, kfg kfgVar, int[] iArr) {
        mq4 mq4Var = (mq4) this.c;
        tg7 tg7VarI = wg7.i();
        for (int i2 = 0; i2 < kfgVar.a; i2++) {
            tg7VarI.a(new gq4(i, kfgVar, i2, mq4Var, iArr[i2], this.b));
        }
        return tg7VarI.i();
    }

    @Override // defpackage.qpc
    public Object get() {
        return ((a1e) this.c).c(129, this.b);
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 1:
                c86 c86Var = (c86) this.c;
                c86Var.b.execute(new dj(c86Var, this.b, tu1Var, 2));
                return "enableExternalFlashAeMode";
            default:
                vdg vdgVar = (vdg) this.c;
                qee qeeVar = vdgVar.d;
                boolean z = this.b;
                qeeVar.execute(new dj(vdgVar, tu1Var, z, 5));
                return "enableTorch: " + z;
        }
    }

    @Override // defpackage.y89
    public Object n(o79 o79Var, u69 u69Var, int i) {
        switch (this.a) {
            case 2:
                zjd zjdVarM = wg7.m((k09) this.c);
                boolean z = this.b;
                return o79Var.r(u69Var, zjdVarM, z ? -1 : o79Var.t.t(), z ? -9223372036854775807L : o79Var.t.e());
            default:
                List list = (List) this.c;
                boolean z2 = this.b;
                return o79Var.r(u69Var, list, z2 ? -1 : o79Var.t.t(), z2 ? -9223372036854775807L : o79Var.t.e());
        }
    }
}
