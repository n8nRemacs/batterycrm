package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class by1 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ cy1 Y;
    public cy1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by1(cy1 cy1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cy1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((by1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new by1(this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object obj2 = this.X;
        try {
            if (obj2 == 0) {
                g8j.b(obj);
                cy1 cy1Var = this.Y;
                this.o = cy1Var;
                this.X = 1;
                Object objA = cy1Var.a(this);
                g84 g84Var = g84.a;
                obj2 = g84Var;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (obj2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cy1 cy1Var2 = this.o;
                g8j.b(obj);
                obj2 = cy1Var2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.e(obj2.getClass().getName(), "fetchTokenAsync fail!", th);
        }
        return qqg.a;
    }
}
