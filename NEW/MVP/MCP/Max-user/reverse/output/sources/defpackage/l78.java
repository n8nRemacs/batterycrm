package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l78 extends dtf implements sm6 {
    public final /* synthetic */ s78 X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l78(s78 s78Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = s78Var;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((l78) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new l78(this.X, this.Y, continuation);
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
        k78 k78Var = new k78(((va4) this.X.p.getValue()).v0, this.Y, 0);
        this.o = 1;
        Object objQ = gw0.q(k78Var, this);
        g84 g84Var = g84.a;
        return objQ == g84Var ? g84Var : objQ;
    }
}
