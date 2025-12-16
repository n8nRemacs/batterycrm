package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class stf extends dtf implements sm6 {
    public final /* synthetic */ ytf X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stf(ytf ytfVar, Continuation continuation) {
        super(2, continuation);
        this.X = ytfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        stf stfVar = (stf) l((ttg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        stfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        stf stfVar = new stf(this.X, continuation);
        stfVar.o = obj;
        return stfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ttg ttgVar = (ttg) this.o;
        String str = this.X.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "uploadFile: " + ttgVar, null);
            }
        }
        return qqg.a;
    }
}
