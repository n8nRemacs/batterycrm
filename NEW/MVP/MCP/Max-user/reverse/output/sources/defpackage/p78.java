package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p78 extends dtf implements sm6 {
    public final /* synthetic */ s78 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p78(s78 s78Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = s78Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p78) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p78(this.X, this.Y, continuation);
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
        d00 d00Var = new d00(((o58) this.X.i.getValue()).a, this.Y, 3);
        this.o = 1;
        Object objP = gw0.p(d00Var, this);
        g84 g84Var = g84.a;
        return objP == g84Var ? g84Var : objP;
    }
}
