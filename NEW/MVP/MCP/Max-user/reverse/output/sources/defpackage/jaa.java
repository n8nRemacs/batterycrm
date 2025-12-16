package defpackage;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class jaa implements tm6, gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ laa b;

    public /* synthetic */ jaa(laa laaVar, int i) {
        this.a = i;
        this.b = laaVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                kp8 kp8Var = (kp8) obj;
                laa laaVar = this.b;
                ConcurrentHashMap concurrentHashMap = laaVar.c;
                long j = kp8Var.c;
                if (j != 0) {
                    kp8 kp8Var2 = (kp8) concurrentHashMap.get(Long.valueOf(j));
                    if (kp8Var2 != null) {
                        jp8 jp8VarA = kp8Var2.a();
                        jp8VarA.f = kp8Var.f;
                        jp8VarA.g = kp8Var.g;
                        jp8VarA.i = kp8Var.i;
                        concurrentHashMap.put(Long.valueOf(kp8Var2.c), new kp8(jp8VarA));
                        laaVar.P0();
                        break;
                    }
                } else {
                    laaVar.w0 = kp8Var;
                    laaVar.Q0();
                    break;
                }
                break;
            default:
                laa laaVar2 = this.b;
                laaVar2.X.a(laaVar2);
                laaVar2.M0(new l32(laaVar2, 3, (Boolean) obj));
                laaVar2.S0();
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        final double d;
        final double d2;
        List<kp8> list;
        final kp8 kp8Var = (kp8) obj;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is main!");
        }
        long j = kp8Var.c;
        final laa laaVar = this.b;
        kf8 kf8Var = laaVar.u0;
        if (j != kf8Var.e || kf8Var.l == -1 || (list = (List) laaVar.d.get(Long.valueOf(j))) == null) {
            d = 1.401298464324817E-45d;
            d2 = 1.401298464324817E-45d;
        } else {
            for (kp8 kp8Var2 : list) {
                if (kp8Var2.j == laaVar.u0.l) {
                    cf8 cf8Var = kp8Var2.a;
                    d = cf8Var.a;
                    d2 = cf8Var.b;
                    break;
                }
            }
            d = 1.401298464324817E-45d;
            d2 = 1.401298464324817E-45d;
        }
        if (d == 1.401298464324817E-45d || d2 == 1.401298464324817E-45d) {
            cf8 cf8Var2 = kp8Var.a;
            d = cf8Var2.a;
            d2 = cf8Var2.b;
        }
        xzf xzfVar = laaVar.Y;
        cf8 cf8Var3 = laaVar.v0;
        double d3 = cf8Var3.a;
        double d4 = cf8Var3.b;
        xzfVar.getClass();
        return new xr8(new sr8(new z9a(bd5.a, 17, new wzf(xzfVar, d, d2, d3, d4, null))), new tm6() { // from class: kaa
            /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
            @Override // defpackage.tm6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.String r13 = (java.lang.String) r13
                    kp8 r0 = r2
                    long r1 = r0.c
                    r3 = 0
                    int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r1 == 0) goto L27
                    laa r1 = r1
                    cf8 r2 = r1.v0
                    boolean r2 = r2.a()
                    if (r2 == 0) goto L27
                    xzf r3 = r1.Y
                    cf8 r1 = r1.v0
                    double r8 = r1.a
                    double r10 = r1.b
                    double r4 = r3
                    double r6 = r5
                    float r1 = r3.a(r4, r6, r8, r10)
                    goto L29
                L27:
                    r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                L29:
                    jp8 r0 = r0.a()
                    r0.f = r13
                    r0.g = r1
                    r13 = 0
                    r0.i = r13
                    kp8 r13 = new kp8
                    r13.<init>(r0)
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kaa.apply(java.lang.Object):java.lang.Object");
            }
        }, 1);
    }
}
