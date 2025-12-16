package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xs2 extends dtf implements sm6 {
    public final /* synthetic */ dt2 X;
    public final /* synthetic */ xs Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs2(xs xsVar, dt2 dt2Var, Continuation continuation) {
        super(2, continuation);
        this.X = dt2Var;
        this.Y = xsVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xs2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xs2(this.Y, this.X, continuation);
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
            dt2 dt2Var = this.X;
            xs xsVar = this.Y;
            mt5 mt5Var = (mt5) dt2Var.c.getValue();
            List listD0 = ue3.d0(xsVar);
            this.o = 1;
            Object objA = mt5Var.a(listD0, this);
            g84 g84Var = g84.a;
            return objA == g84Var ? g84Var : objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return hd5.a;
        }
    }
}
