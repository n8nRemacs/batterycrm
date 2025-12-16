package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c66 implements x26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x26[] b;
    public final /* synthetic */ dtf c;

    /* JADX WARN: Multi-variable type inference failed */
    public c66(x26[] x26VarArr, ym6 ym6Var) {
        this.b = x26VarArr;
        this.c = (dtf) ym6Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [dtf, ym6] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dtf, zm6] */
    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objA = x4j.a(z26Var, k54.o, new b66((Continuation) null, (ym6) this.c), continuation, this.b);
                if (objA != g84.a) {
                    break;
                }
                break;
            default:
                Object objA2 = x4j.a(z26Var, k54.o, new b66((Continuation) null, (zm6) this.c), continuation, this.b);
                if (objA2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c66(x26[] x26VarArr, zm6 zm6Var) {
        this.b = x26VarArr;
        this.c = (dtf) zm6Var;
    }
}
