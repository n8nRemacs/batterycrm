package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fx1 extends dtf implements sm6 {
    public final /* synthetic */ ix1 X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx1(ix1 ix1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = ix1Var;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fx1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fx1(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        this.o = 1;
        Object objA = ix1.a(this.X, this.Y, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
