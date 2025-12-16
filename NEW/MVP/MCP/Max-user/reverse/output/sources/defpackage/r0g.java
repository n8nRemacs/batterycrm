package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class r0g implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ te8 b;
    public final /* synthetic */ sm c;
    public final /* synthetic */ pzf d;
    public final /* synthetic */ j1g o;

    public /* synthetic */ r0g(te8 te8Var, sm smVar, pzf pzfVar, j1g j1gVar) {
        this.b = te8Var;
        this.c = smVar;
        this.d = pzfVar;
        this.o = j1gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j1g j1gVar = this.o;
                j1gVar.b().a(new r0g(this.b, this.c, this.d, j1gVar));
                break;
            default:
                u0g u0gVar = (u0g) this.b.c;
                sm smVar = this.c;
                n2 n2VarQ = smVar.q();
                pzf pzfVar = this.d;
                if (n2VarQ != null) {
                    ConcurrentHashMap concurrentHashMap = u0gVar.a;
                    if (j0g.c0.contains(pzfVar.b)) {
                        String name = n2VarQ.getClass().getName();
                        t0g t0gVar = (t0g) concurrentHashMap.get(name);
                        if (t0gVar == null) {
                            t0gVar = new t0g();
                            t0gVar.a = 0;
                        }
                        t0gVar.a++;
                        t0gVar.b = System.currentTimeMillis();
                        concurrentHashMap.put(name, t0gVar);
                        short sP = n2VarQ.P();
                        String str = u0g.z0;
                        xhb.c.getClass();
                        wqi.f(str, "saveTaskFail, %s(%s), error=%s, totalErrors=%d, lastErrorTime=%d", qha.f(sP), "0x".concat(Integer.toHexString(sP & 65535)), pzfVar.b, Integer.valueOf(t0gVar.a), Long.valueOf(t0gVar.b));
                    }
                }
                this.o.e(pzfVar);
                u0gVar.f(smVar, pzfVar);
                break;
        }
    }

    public /* synthetic */ r0g(te8 te8Var, j1g j1gVar, sm smVar, pzf pzfVar) {
        this.b = te8Var;
        this.o = j1gVar;
        this.c = smVar;
        this.d = pzfVar;
    }
}
