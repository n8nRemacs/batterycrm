package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d77 extends dtf implements sm6 {
    public final /* synthetic */ h77 X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d77(h77 h77Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = h77Var;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d77) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d77(this.X, this.Y, continuation);
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
        this.o = 1;
        Object objA = h77.a(this.X, this.Y, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
