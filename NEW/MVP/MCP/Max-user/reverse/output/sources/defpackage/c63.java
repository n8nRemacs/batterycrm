package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class c63 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a93 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c63(a93 a93Var, long j, int i) {
        this.a = i;
        this.b = a93Var;
        this.c = j;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                a93 a93Var = this.b;
                ConcurrentHashMap concurrentHashMap = a93Var.i().h;
                long j = this.c;
                tcf tcfVarA = ucf.a((pb2) concurrentHashMap.get(Long.valueOf(j)));
                pb2 pb2Var = (pb2) tcfVarA.getValue();
                if (pb2Var == null) {
                    svi.e((f84) ((bwf) a93Var.d).getValue(), null, null, new f63(tcfVarA, null, a93Var, j), 3);
                } else {
                    long j2 = pb2Var.b.a;
                    if (j2 != 0) {
                        ((f9a) ((ConcurrentHashMap) a93Var.X).computeIfAbsent(Long.valueOf(j2), new i63(new e63(pb2Var, 0)))).setValue(pb2Var);
                    }
                }
                return tcfVarA;
            default:
                a93 a93Var2 = this.b;
                ConcurrentHashMap concurrentHashMap2 = a93Var2.i().i;
                long j3 = this.c;
                tcf tcfVarA2 = ucf.a((pb2) concurrentHashMap2.get(Long.valueOf(j3)));
                pb2 pb2Var2 = (pb2) tcfVarA2.getValue();
                if (pb2Var2 == null) {
                    svi.e((f84) ((bwf) a93Var2.d).getValue(), null, null, new h63(tcfVarA2, null, a93Var2, j3), 3);
                } else {
                    ((f9a) ((ConcurrentHashMap) a93Var2.o).computeIfAbsent(Long.valueOf(pb2Var2.a), new i63(new e63(pb2Var2, 1)))).setValue(pb2Var2);
                }
                return tcfVarA2;
        }
    }
}
