package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zld extends dtf implements sm6 {
    public dtf X;
    public int Y;
    public final /* synthetic */ n9a Z;
    public j9a o;
    public final /* synthetic */ dtf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zld(n9a n9aVar, sm6 sm6Var, Continuation continuation) {
        super(2, continuation);
        this.Z = n9aVar;
        this.s0 = (dtf) sm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zld) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dtf, sm6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zld(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [sm6] */
    /* JADX WARN: Type inference failed for: r2v3, types: [j9a] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        n9a n9aVar;
        ?? r0;
        j9a j9aVar;
        Throwable th;
        int i = this.Y;
        g84 g84Var = g84.a;
        try {
            if (i == 0) {
                g8j.b(obj);
                n9aVar = this.Z;
                this.o = n9aVar;
                dtf dtfVar = this.s0;
                this.X = dtfVar;
                this.Y = 1;
                r0 = dtfVar;
                if (n9aVar.e(null, this) != g84Var) {
                }
                return g84Var;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9aVar = this.o;
                try {
                    g8j.b(obj);
                    ((n9a) j9aVar).g(null);
                    return qqg.a;
                } catch (Throwable th2) {
                    th = th2;
                    ((n9a) j9aVar).g(null);
                    throw th;
                }
            }
            sm6 sm6Var = (sm6) this.X;
            ?? r2 = this.o;
            g8j.b(obj);
            n9aVar = r2;
            r0 = sm6Var;
            yld yldVar = new yld(r0, null);
            this.o = n9aVar;
            this.X = null;
            this.Y = 2;
            if (d7j.d(yldVar, this) != g84Var) {
                j9aVar = n9aVar;
                ((n9a) j9aVar).g(null);
                return qqg.a;
            }
            return g84Var;
        } catch (Throwable th3) {
            j9aVar = n9aVar;
            th = th3;
            ((n9a) j9aVar).g(null);
            throw th;
        }
    }
}
