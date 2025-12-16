package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e00 extends dtf implements sm6 {
    public final /* synthetic */ f00 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(f00 f00Var, Continuation continuation) {
        super(2, continuation);
        this.X = f00Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        e00 e00Var = (e00) l((u8d) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        e00Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e00 e00Var = new e00(this.X, continuation);
        e00Var.o = obj;
        return e00Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        u8d u8dVar = (u8d) this.o;
        yy7[] yy7VarArr = f00.f;
        f00 f00Var = this.X;
        f00Var.e.m(null, f00Var.b(u8dVar));
        return qqg.a;
    }
}
