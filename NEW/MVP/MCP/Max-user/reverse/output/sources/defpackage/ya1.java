package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ya1 extends dtf implements sm6 {
    public final /* synthetic */ za1 X;
    public final /* synthetic */ List Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(za1 za1Var, List list, Continuation continuation) {
        super(2, continuation);
        this.X = za1Var;
        this.Y = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ya1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ya1(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        zw1 zw1Var = this.X.b;
        this.o = 1;
        Object objI = svi.i(((q2b) ((lzf) zw1Var.b.getValue())).b(), new yw1(this.Y, zw1Var, null), this);
        g84 g84Var = g84.a;
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
