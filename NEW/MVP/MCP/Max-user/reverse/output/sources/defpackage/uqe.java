package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uqe extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ ere Y;
    public ere o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqe(ere ereVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ereVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uqe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uqe(this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ere ereVar = this.X;
        try {
            if (ereVar == 0) {
                g8j.b(obj);
                ere ereVar2 = this.Y;
                otg otgVar = (otg) ereVar2.t0.getValue();
                this.o = ereVar2;
                this.X = 1;
                Object objA = otgVar.a(false, false, this);
                g84 g84Var = g84.a;
                ereVar = g84Var;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (ereVar != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ere ereVar3 = this.o;
                g8j.b(obj);
                ereVar = ereVar3;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.p(ereVar.M0, "disableSafeMode fail", th);
            ere.u(ereVar, th);
        }
        return qqg.a;
    }
}
