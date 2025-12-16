package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yyh extends dtf implements sm6 {
    public final /* synthetic */ dzh X;
    public final /* synthetic */ azh Y;
    public final /* synthetic */ qyh Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyh(qyh qyhVar, azh azhVar, dzh dzhVar, Continuation continuation) {
        super(2, continuation);
        this.X = dzhVar;
        this.Y = azhVar;
        this.Z = qyhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yyh) l((qqg) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yyh(this.Z, this.Y, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qyh qyhVar = this.Z;
        azh azhVar = this.Y;
        if (i == 0) {
            g8j.b(obj);
            dzh dzhVar = this.X;
            fpf fpfVar = new fpf(dzhVar.d == null ? epf.c : epf.b, dzhVar.b);
            pv0 pv0Var = azhVar.e;
            String str = qyhVar.a;
            ew7 ew7Var = azhVar.a;
            ew7Var.getClass();
            rv7 rv7Var = new rv7(str, ew7Var.b(fpf.Companion.serializer(), fpfVar));
            this.o = 1;
            Object objH = pv0Var.h(rv7Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        azh.e(azhVar, qyhVar.a);
        return qqg.a;
    }
}
