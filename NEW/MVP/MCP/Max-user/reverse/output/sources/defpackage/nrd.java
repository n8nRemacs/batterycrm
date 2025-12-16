package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class nrd extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lrd Y;
    public final /* synthetic */ em6 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrd(lrd lrdVar, em6 em6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = lrdVar;
        this.Z = em6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nrd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nrd nrdVar = new nrd(this.Y, this.Z, continuation);
        nrdVar.X = obj;
        return nrdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v7, types: [rgg] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        rgg rggVar = this.o;
        lrd lrdVar = this.Y;
        try {
            try {
                if (rggVar == 0) {
                    g8j.b(obj);
                    rgg rggVar2 = (rgg) ((f84) this.X).getCoroutineContext().get(rgg.c);
                    rggVar2.b.incrementAndGet();
                    lrdVar.c();
                    em6 em6Var = this.Z;
                    this.X = rggVar2;
                    this.o = 1;
                    obj = em6Var.invoke(this);
                    g84 g84Var = g84.a;
                    rggVar = rggVar2;
                    if (obj == g84Var) {
                        return g84Var;
                    }
                } else {
                    if (rggVar != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rgg rggVar3 = (rgg) this.X;
                    g8j.b(obj);
                    rggVar = rggVar3;
                }
                lrdVar.q();
                if (rggVar.b.decrementAndGet() >= 0) {
                    return obj;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            } finally {
                lrdVar.k();
            }
        } catch (Throwable th) {
            if (rggVar.b.decrementAndGet() >= 0) {
                throw th;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
