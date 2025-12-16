package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zyh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ azh Y;
    public final /* synthetic */ qyh Z;
    public int o;
    public final /* synthetic */ dzh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyh(qyh qyhVar, azh azhVar, dzh dzhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = azhVar;
        this.Z = qyhVar;
        this.s0 = dzhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zyh) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zyh zyhVar = new zyh(this.Z, this.Y, this.s0, continuation);
        zyhVar.X = obj;
        return zyhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = (Throwable) this.X;
            azh azhVar = this.Y;
            azhVar.getClass();
            aw7 aw7VarF = azh.f(th);
            xh3 xh3VarG = azhVar.g();
            pv0 pv0Var = azhVar.e;
            String str = this.s0.b;
            this.o = 1;
            Object objA = xh3VarG.a(pv0Var, aw7VarF, this.Z, str, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
