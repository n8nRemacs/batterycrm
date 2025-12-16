package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class us5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ us5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                vs5 vs5Var = (vs5) this.c;
                bi biVar = vs5Var.e;
                lrd lrdVar = vs5Var.a;
                vk6 vk6VarA = biVar.a();
                vk6VarA.k(1, this.b);
                try {
                    lrdVar.c();
                    try {
                        Integer numValueOf = Integer.valueOf(vk6VarA.w());
                        lrdVar.q();
                        return numValueOf;
                    } finally {
                        lrdVar.k();
                    }
                } finally {
                    biVar.r(vk6VarA);
                }
            case 1:
                lq9 lq9Var = (lq9) this.c;
                hq9 hq9Var = lq9Var.s;
                lrd lrdVar2 = lq9Var.a;
                vk6 vk6VarA2 = hq9Var.a();
                vk6VarA2.k(1, this.b);
                try {
                    lrdVar2.c();
                    try {
                        vk6VarA2.w();
                        lrdVar2.q();
                        hq9Var.r(vk6VarA2);
                        return qqg.a;
                    } finally {
                        lrdVar2.k();
                    }
                } catch (Throwable th) {
                    hq9Var.r(vk6VarA2);
                    throw th;
                }
            case 2:
                wna wnaVar = (wna) this.c;
                hq9 hq9Var2 = wnaVar.f;
                lrd lrdVar3 = wnaVar.a;
                vk6 vk6VarA3 = hq9Var2.a();
                vk6VarA3.k(1, this.b);
                try {
                    lrdVar3.c();
                    try {
                        vk6VarA3.w();
                        lrdVar3.q();
                        hq9Var2.r(vk6VarA3);
                        return qqg.a;
                    } finally {
                        lrdVar3.k();
                    }
                } catch (Throwable th2) {
                    hq9Var2.r(vk6VarA3);
                    throw th2;
                }
            case 3:
                wpa wpaVar = (wpa) this.c;
                hq9 hq9Var3 = wpaVar.c;
                lrd lrdVar4 = wpaVar.a;
                vk6 vk6VarA4 = hq9Var3.a();
                vk6VarA4.k(1, this.b);
                try {
                    lrdVar4.c();
                    try {
                        Integer numValueOf2 = Integer.valueOf(vk6VarA4.w());
                        lrdVar4.q();
                        return numValueOf2;
                    } finally {
                        lrdVar4.k();
                    }
                } finally {
                    hq9Var3.r(vk6VarA4);
                }
            case 4:
                zxd zxdVar = (zxd) this.c;
                crd crdVar = zxdVar.c;
                lrd lrdVar5 = zxdVar.a;
                vk6 vk6VarA5 = crdVar.a();
                vk6VarA5.k(1, this.b);
                try {
                    lrdVar5.c();
                    try {
                        vk6VarA5.w();
                        lrdVar5.q();
                        crdVar.r(vk6VarA5);
                        return qqg.a;
                    } finally {
                        lrdVar5.k();
                    }
                } catch (Throwable th3) {
                    crdVar.r(vk6VarA5);
                    throw th3;
                }
            case 5:
                xdf xdfVar = (xdf) this.c;
                crd crdVar2 = xdfVar.d;
                lrd lrdVar6 = xdfVar.a;
                vk6 vk6VarA6 = crdVar2.a();
                vk6VarA6.k(1, this.b);
                try {
                    lrdVar6.c();
                    try {
                        Integer numValueOf3 = Integer.valueOf(vk6VarA6.w());
                        lrdVar6.q();
                        return numValueOf3;
                    } finally {
                        lrdVar6.k();
                    }
                } finally {
                    crdVar2.r(vk6VarA6);
                }
            default:
                ewg ewgVar = (ewg) this.c;
                crd crdVar3 = ewgVar.d;
                lrd lrdVar7 = ewgVar.a;
                vk6 vk6VarA7 = crdVar3.a();
                vk6VarA7.k(1, this.b);
                try {
                    lrdVar7.c();
                    try {
                        vk6VarA7.w();
                        lrdVar7.q();
                        crdVar3.r(vk6VarA7);
                        return null;
                    } finally {
                        lrdVar7.k();
                    }
                } catch (Throwable th4) {
                    crdVar3.r(vk6VarA7);
                    throw th4;
                }
        }
    }
}
