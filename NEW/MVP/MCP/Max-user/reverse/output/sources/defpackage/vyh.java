package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vyh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ myh Y;
    public final /* synthetic */ azh Z;
    public int o;
    public final /* synthetic */ qyh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyh(myh myhVar, qyh qyhVar, azh azhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = myhVar;
        this.Z = azhVar;
        this.s0 = qyhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vyh) l((String) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        azh azhVar = this.Z;
        vyh vyhVar = new vyh(this.Y, this.s0, azhVar, continuation);
        vyhVar.X = obj;
        return vyhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qyh qyhVar = this.s0;
        azh azhVar = this.Z;
        if (i == 0) {
            g8j.b(obj);
            String str = (String) this.X;
            myh myhVar = this.Y;
            pyh pyhVar = new pyh(myhVar.b, myhVar.c, str);
            pv0 pv0Var = azhVar.e;
            String str2 = qyhVar.a;
            ew7 ew7Var = azhVar.a;
            ew7Var.getClass();
            rv7 rv7Var = new rv7(str2, ew7Var.b(pyh.Companion.serializer(), pyhVar));
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
