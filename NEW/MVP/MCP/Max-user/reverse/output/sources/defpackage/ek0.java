package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class ek0 implements ju3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp8 b;

    public /* synthetic */ ek0(kp8 kp8Var, int i) {
        this.a = i;
        this.b = kp8Var;
    }

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        kp8 kp8Var;
        switch (this.a) {
            case 0:
                laa laaVar = (laa) obj;
                kp8 kp8Var2 = this.b;
                long j = kp8Var2.j;
                if (laaVar != null) {
                    oaa oaaVar = (oaa) laaVar.b;
                    cf8 cf8Var = kp8Var2.a;
                    if (j != laaVar.u0.l) {
                        if (((List) laaVar.d.get(Long.valueOf(kp8Var2.c))) != null) {
                            laaVar.M0(new ek0(kp8Var2, 2));
                            laaVar.S0();
                            fba fbaVar = (fba) oaaVar;
                            fbaVar.z(j, kp8Var2.k);
                            kp8 kp8Var3 = (kp8) laaVar.c.get(Long.valueOf(laaVar.u0.e));
                            if (kp8Var3 != null) {
                                laaVar.y0.f(kp8Var3);
                            }
                            fbaVar.A(cf8Var.a, cf8Var.b, false);
                            break;
                        }
                    } else {
                        ((fba) oaaVar).A(cf8Var.a, cf8Var.b, false);
                        break;
                    }
                }
                break;
            case 1:
                laa laaVar2 = (laa) obj;
                if (laaVar2 != null) {
                    oaa oaaVar2 = (oaa) laaVar2.b;
                    ConcurrentHashMap concurrentHashMap = laaVar2.c;
                    kp8 kp8Var4 = this.b;
                    long j2 = kp8Var4.c;
                    cf8 cf8Var2 = kp8Var4.a;
                    long j3 = laaVar2.u0.e;
                    if (j2 == j3) {
                        laaVar2.M0(new dk0(20));
                        kp8 kp8Var5 = (kp8) concurrentHashMap.get(Long.valueOf(laaVar2.u0.e));
                        if (kp8Var5 != null) {
                            laaVar2.y0.f(kp8Var5);
                        }
                        ((fba) oaaVar2).A(cf8Var2.a, cf8Var2.b, false);
                    } else {
                        if (j3 != -1 && (kp8Var = (kp8) concurrentHashMap.get(Long.valueOf(j3))) != null) {
                            jp8 jp8VarA = kp8Var.a();
                            jp8VarA.d = np8.b;
                            concurrentHashMap.put(Long.valueOf(kp8Var.c), new kp8(jp8VarA));
                        }
                        if (j2 != laaVar2.u0.e) {
                            laaVar2.M0(new ek0(kp8Var4, 3));
                            kp8 kp8Var6 = (kp8) concurrentHashMap.get(Long.valueOf(laaVar2.u0.e));
                            if (kp8Var6 != null) {
                                jp8 jp8VarA2 = kp8Var6.a();
                                jp8VarA2.d = np8.c;
                                concurrentHashMap.put(Long.valueOf(kp8Var6.c), new kp8(jp8VarA2));
                                laaVar2.y0.f(kp8Var6);
                            }
                            laaVar2.R0(j2);
                            ((fba) oaaVar2).A(cf8Var2.a, cf8Var2.b, false);
                        }
                    }
                    ((fba) oaaVar2).z(-1L, kp8Var4.k);
                    laaVar2.x0 = true;
                    laaVar2.S0();
                    laaVar2.P0();
                    break;
                }
                break;
            case 2:
                ((jf8) obj).l = this.b.j;
                break;
            default:
                jf8 jf8Var = (jf8) obj;
                jf8Var.e = this.b.c;
                jf8Var.l = -1L;
                break;
        }
    }
}
