package defpackage;

import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pd2 extends dtf implements sm6 {
    public final /* synthetic */ sd2 X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd2(sd2 sd2Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = sd2Var;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pd2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pd2(this.X, this.Y, continuation);
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
        sd2 sd2Var = this.X;
        pb2 pb2VarP = sd2Var.p();
        int i2 = (pb2VarP == null || !pb2VarP.M()) ? 1 : 2;
        t73 t73Var = (t73) sd2Var.o.getValue();
        this.o = 1;
        Serializable serializableA = t73Var.a(this.Y, i2, this);
        g84 g84Var = g84.a;
        return serializableA == g84Var ? g84Var : serializableA;
    }
}
