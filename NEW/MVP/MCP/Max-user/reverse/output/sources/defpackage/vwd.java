package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vwd extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wwd Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwd(wwd wwdVar, Continuation continuation) {
        super(2, continuation);
        this.Y = wwdVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vwd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vwd vwdVar = new vwd(this.Y, continuation);
        vwdVar.X = obj;
        return vwdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object obj2 = this.o;
        wwd wwdVar = this.Y;
        try {
            if (obj2 == 0) {
                g8j.b(obj);
                f84 f84Var = (f84) this.X;
                otg otgVar = (otg) wwdVar.c.getValue();
                this.X = f84Var;
                this.o = 1;
                Object objA = otgVar.a(true, true, this);
                g84 g84Var = g84.a;
                obj2 = g84Var;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (obj2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f84 f84Var2 = (f84) this.X;
                g8j.b(obj);
                obj2 = f84Var2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.p(obj2.getClass().getName(), "enableSafeMode fail", th);
        }
        ci5 ci5Var = wwdVar.o;
        qqg qqgVar = qqg.a;
        xfh.r(ci5Var, qqgVar);
        return qqgVar;
    }
}
