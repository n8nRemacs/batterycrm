package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lw9 extends dtf implements sm6 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ ku3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw9(k18 k18Var, ku3 ku3Var, Continuation continuation) {
        super(2, continuation);
        this.X = k18Var;
        this.Y = ku3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lw9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lw9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return obj;
            }
            g8j.b(obj);
            k18 k18Var = this.X;
            ku3 ku3Var = this.Y;
            q7b q7bVar = (q7b) k18Var.getValue();
            this.o = 1;
            Object objC = q7bVar.c(ku3Var, this);
            g84 g84Var = g84.a;
            return objC == g84Var ? g84Var : objC;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
