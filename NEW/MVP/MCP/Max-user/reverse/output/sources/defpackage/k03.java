package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class k03 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k03(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                m03 m03Var = (m03) this.c;
                lrd lrdVar = m03Var.a;
                lrdVar.b();
                bi biVar = m03Var.d;
                vk6 vk6VarA = biVar.a();
                long j = this.b;
                vk6VarA.k(1, j);
                try {
                    lrdVar.c();
                    try {
                        vk6VarA.w();
                        lrdVar.q();
                        biVar.r(vk6VarA);
                        lrdVar.b();
                        bi biVar2 = m03Var.g;
                        vk6 vk6VarA2 = biVar2.a();
                        vk6VarA2.k(1, j);
                        try {
                            lrdVar.c();
                            try {
                                vk6VarA2.w();
                                lrdVar.q();
                                biVar2.r(vk6VarA2);
                                return qqg.a;
                            } finally {
                            }
                        } catch (Throwable th) {
                            biVar2.r(vk6VarA2);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    biVar.r(vk6VarA);
                    throw th2;
                }
            case 1:
                return ucf.a((ku3) ((l24) this.c).a.a.get(Long.valueOf(this.b)));
            case 2:
                return ucf.a(((klc) this.c).e.get(Long.valueOf(this.b)));
            default:
                ikf ikfVar = (ikf) this.c;
                ((Long) obj).getClass();
                int i = 0;
                for (Object obj2 : ((rjf) ikfVar.Z.getValue()).b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ve3.p();
                        throw null;
                    }
                    t98 t98Var = (t98) obj2;
                    boolean z = t98Var instanceof dgf;
                    long j2 = this.b;
                    if ((z && ((dgf) t98Var).a == j2) || ((t98Var instanceof f62) && ((f62) t98Var).b.a == j2)) {
                        ikfVar.u0.m(null, new qjf(j2, i, 0, 4));
                    }
                    i = i2;
                }
                return qqg.a;
        }
    }
}
