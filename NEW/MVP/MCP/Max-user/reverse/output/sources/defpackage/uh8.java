package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uh8 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ yh8 Y;
    public yh8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh8(yh8 yh8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = yh8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uh8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uh8(this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        yh8 yh8Var = this.X;
        try {
            if (yh8Var == 0) {
                g8j.b(obj);
                yh8 yh8Var2 = this.Y;
                la3 la3Var = (la3) yh8Var2.E.getValue();
                this.o = yh8Var2;
                this.X = 1;
                Object objA = la3Var.a(this);
                g84 g84Var = g84.a;
                yh8Var = g84Var;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (yh8Var != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yh8 yh8Var3 = this.o;
                g8j.b(obj);
                yh8Var = yh8Var3;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.b("yh8", "Can't clearCache", th);
            ((y3b) ((yi5) yh8Var.y.getValue())).a(new IllegalStateException("Can't clearCache"));
        }
        return qqg.a;
    }
}
