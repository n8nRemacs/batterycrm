package defpackage;

import java.util.function.UnaryOperator;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class v0g implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0g b;

    public /* synthetic */ v0g(w0g w0gVar, int i) {
        this.a = i;
        this.b = w0gVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zhe zheVar;
        switch (this.a) {
            case 0:
                w0g w0gVar = this.b;
                zhe zheVar2 = (zhe) obj;
                lg8 lg8Var = lg8.d;
                lg8 lg8Var2 = lg8.X;
                gu5 gu5Var = ((z7c) w0gVar.b.getValue()).e;
                gu5Var.getClass();
                if (!gu5Var.j(PmsKey.f110newsessionlogic, false)) {
                    return zheVar2;
                }
                l5c l5cVar = ((z7c) w0gVar.b.getValue()).b;
                l5cVar.getClass();
                if (l5cVar.j(PmsKey.f107netnewclientenabled, false) || zheVar2 == null || zheVar2.m.get() == Long.MIN_VALUE) {
                    return zheVar2;
                }
                String str = w0gVar.Z;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var2)) {
                    l6bVar.c(lg8Var2, str, "old_session=" + zheVar2 + " in connect process", null);
                }
                String str2 = zheVar2.a;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, str2, "fork, " + zheVar2, null);
                }
                if (zheVar2.g.get() || !zheVar2.n.compareAndSet(false, true)) {
                    wqi.e(zheVar2.a, "failed to fork " + zheVar2 + " because is ALREADY in an INACTIVE state", null);
                    zheVar = null;
                } else {
                    cb3 cb3Var = zheVar2.o;
                    rje rjeVar = zheVar2.H;
                    k4e k4eVar = zheVar2.p;
                    qja qjaVar = zheVar2.v;
                    oje ojeVar = zheVar2.u;
                    hya hyaVar = zheVar2.q;
                    tya tyaVar = zheVar2.E;
                    vda vdaVar = zheVar2.F;
                    vya vyaVar = zheVar2.G;
                    int i = zheVar2.C;
                    q28 q28Var = new q28(cb3Var, rjeVar, k4eVar, qjaVar, ojeVar, hyaVar, tyaVar, vdaVar, vyaVar);
                    q28Var.j = i;
                    q28Var.k = zheVar2;
                    zheVar = new zhe(q28Var, null);
                    zheVar2.z.a();
                    zheVar2.A.a();
                    if (!zheVar2.k.get()) {
                        zheVar2.B();
                    }
                }
                if (zheVar == null) {
                    String str3 = w0gVar.Z;
                    l6b l6bVar3 = wqi.a;
                    if (l6bVar3 == null || !l6bVar3.b(lg8Var2)) {
                        return zheVar2;
                    }
                    l6bVar3.c(lg8Var2, str3, "seems new session creation was already scheduled", null);
                    return zheVar2;
                }
                String str4 = w0gVar.Z;
                l6b l6bVar4 = wqi.a;
                if (l6bVar4 != null && l6bVar4.b(lg8Var)) {
                    l6bVar4.c(lg8Var, str4, "new_session=" + zheVar + " was created, old_session=" + zheVar2, null);
                }
                return zheVar;
            default:
                w0g w0gVar2 = this.b;
                zhe zheVar3 = (zhe) obj;
                if (zheVar3 != null) {
                    zheVar3.f(false);
                }
                q28 q28VarH = w0gVar2.a.h();
                l5c l5cVar2 = ((z7c) w0gVar2.b.getValue()).b;
                l5cVar2.getClass();
                q28VarH.j = (int) l5cVar2.m(PmsKey.f135sendqueuesize, 30);
                return q28VarH.a();
        }
    }
}
