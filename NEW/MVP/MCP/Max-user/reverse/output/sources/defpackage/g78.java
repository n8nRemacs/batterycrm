package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g78 extends dtf implements sm6 {
    public final /* synthetic */ s78 X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g78(s78 s78Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = s78Var;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((g78) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new g78(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        fs6 fs6Var = (fs6) this.X.r.getValue();
        this.o = 1;
        Object objA = fs6Var.a(this.Y, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
