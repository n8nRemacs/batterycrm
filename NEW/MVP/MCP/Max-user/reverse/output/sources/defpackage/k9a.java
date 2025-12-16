package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k9a extends dtf implements sm6 {
    public Object X;
    public dtf Y;
    public int Z;
    public j9a o;
    public final /* synthetic */ j9a s0;
    public final /* synthetic */ Object t0;
    public final /* synthetic */ dtf u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k9a(j9a j9aVar, Object obj, em6 em6Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = j9aVar;
        this.t0 = obj;
        this.u0 = (dtf) em6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k9a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dtf, em6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k9a(this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [em6] */
    /* JADX WARN: Type inference failed for: r4v2, types: [j9a] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        n9a n9aVar;
        Object obj2;
        ?? r0;
        j9a j9aVar;
        Throwable th;
        Object obj3;
        int i = this.Z;
        g84 g84Var = g84.a;
        try {
            if (i == 0) {
                g8j.b(obj);
                j9a j9aVar2 = this.s0;
                this.o = j9aVar2;
                Object obj4 = this.t0;
                this.X = obj4;
                dtf dtfVar = this.u0;
                this.Y = dtfVar;
                this.Z = 1;
                n9aVar = (n9a) j9aVar2;
                if (n9aVar.e(obj4, this) != g84Var) {
                    obj2 = obj4;
                    r0 = dtfVar;
                }
                return g84Var;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj3 = this.X;
                j9aVar = this.o;
                try {
                    g8j.b(obj);
                    ((n9a) j9aVar).g(obj3);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    ((n9a) j9aVar).g(obj3);
                    throw th;
                }
            }
            em6 em6Var = (em6) this.Y;
            obj2 = this.X;
            ?? r4 = this.o;
            g8j.b(obj);
            n9aVar = r4;
            r0 = em6Var;
            this.o = n9aVar;
            this.X = obj2;
            this.Y = null;
            this.Z = 2;
            Object objInvoke = r0.invoke(this);
            if (objInvoke != g84Var) {
                j9aVar = n9aVar;
                obj = objInvoke;
                obj3 = obj2;
                ((n9a) j9aVar).g(obj3);
                return obj;
            }
            return g84Var;
        } catch (Throwable th3) {
            j9aVar = n9aVar;
            th = th3;
            obj3 = obj2;
            ((n9a) j9aVar).g(obj3);
            throw th;
        }
    }
}
