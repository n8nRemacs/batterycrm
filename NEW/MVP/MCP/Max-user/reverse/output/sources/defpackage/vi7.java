package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vi7 extends dtf implements sm6 {
    public final /* synthetic */ bj7 X;
    public final /* synthetic */ int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi7(bj7 bj7Var, int i, Continuation continuation) {
        super(2, continuation);
        this.X = bj7Var;
        this.Y = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vi7 vi7Var = (vi7) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vi7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vi7 vi7Var = new vi7(this.X, this.Y, continuation);
        vi7Var.o = obj;
        return vi7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        bj7 bj7Var = this.X;
        x9f x9fVarE = svi.e(f84Var, null, null, new ti7(bj7Var, null), 3);
        int i = this.Y;
        x9fVarE.invokeOnCompletion(new os1(i, 1));
        svi.e(f84Var, null, null, new ui7(bj7Var, null), 3).invokeOnCompletion(new os1(i, 2));
        return qqg.a;
    }
}
