package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yva extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ zva Y;
    public zva o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yva(zva zvaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zvaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yva) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yva(this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        zva zvaVar = this.X;
        try {
            if (zvaVar == 0) {
                g8j.b(obj);
                zva zvaVar2 = this.Y;
                zch zchVar = (zch) zvaVar2.d;
                this.o = zvaVar2;
                this.X = 1;
                Object objA = zchVar.a(this);
                g84 g84Var = g84.a;
                zvaVar = g84Var;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (zvaVar != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zva zvaVar3 = this.o;
                g8j.b(obj);
                zvaVar = zvaVar3;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.p((String) zvaVar.o, "getToken fail", th);
        }
        return qqg.a;
    }
}
