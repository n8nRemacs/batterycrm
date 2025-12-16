package defpackage;

import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fv3 extends dtf implements sm6 {
    public final /* synthetic */ iv3 X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv3(iv3 iv3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = iv3Var;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fv3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fv3(this.X, this.Y, continuation);
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
        t73 t73Var = (t73) this.X.k.getValue();
        this.o = 1;
        Serializable serializableA = t73Var.a(this.Y, 3, this);
        g84 g84Var = g84.a;
        return serializableA == g84Var ? g84Var : serializableA;
    }
}
