package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qad extends dtf implements sm6 {
    public final /* synthetic */ vad X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qad(vad vadVar, Continuation continuation) {
        super(2, continuation);
        this.X = vadVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qad) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qad(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        py2 py2Var = (py2) this.X.B0.getValue();
        this.o = 1;
        if (!py2Var.j) {
            py2Var.j = true;
            try {
                x9f x9fVar = py2Var.f;
                if (x9fVar != null) {
                    x9fVar.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                wqi.e("py2", "cancel fail!", th);
            }
            py2Var.d(this);
        }
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}
