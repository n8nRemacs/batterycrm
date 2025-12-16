package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jbf extends dtf implements sm6 {
    public final /* synthetic */ nbf X;
    public final /* synthetic */ gx3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbf(nbf nbfVar, gx3 gx3Var, Continuation continuation) {
        super(2, continuation);
        this.X = nbfVar;
        this.Y = gx3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jbf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jbf(this.X, this.Y, continuation);
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
        l24 l24Var = (l24) this.X.Y.getValue();
        List listSingletonList = Collections.singletonList(this.Y);
        this.o = 1;
        Object objF = l24Var.f(listSingletonList, yv3.b, this);
        g84 g84Var = g84.a;
        return objF == g84Var ? g84Var : objF;
    }
}
