package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oxh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pxh Y;
    public final /* synthetic */ ixh Z;
    public int o;
    public final /* synthetic */ uxh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxh(ixh ixhVar, pxh pxhVar, uxh uxhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = pxhVar;
        this.Z = ixhVar;
        this.s0 = uxhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oxh) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oxh oxhVar = new oxh(this.Z, this.Y, this.s0, continuation);
        oxhVar.X = obj;
        return oxhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = (Throwable) this.X;
            pxh pxhVar = this.Y;
            pxhVar.getClass();
            aw7 aw7VarE = pxh.e(th);
            xh3 xh3VarF = pxhVar.f();
            pv0 pv0Var = pxhVar.d;
            String str = this.s0.a;
            this.o = 1;
            Object objA = xh3VarF.a(pv0Var, aw7VarE, this.Z, str, this);
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
