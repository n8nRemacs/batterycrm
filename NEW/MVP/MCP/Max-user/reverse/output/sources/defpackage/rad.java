package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rad extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k18 Y;
    public final /* synthetic */ vad Z;
    public int o;
    public final /* synthetic */ long[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rad(k18 k18Var, vad vadVar, long[] jArr, Continuation continuation) {
        super(2, continuation);
        this.Y = k18Var;
        this.Z = vadVar;
        this.s0 = jArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rad) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rad radVar = new rad(this.Y, this.Z, this.s0, continuation);
        radVar.X = obj;
        return radVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.Object] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ?? r0 = this.o;
        try {
            if (r0 == 0) {
                g8j.b(obj);
                f84 f84Var = (f84) this.X;
                k18 k18Var = this.Y;
                vad vadVar = this.Z;
                long[] jArr = this.s0;
                jt6 jt6Var = (jt6) k18Var.getValue();
                pb2 pb2VarW = vadVar.w();
                if (pb2VarW == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.X = f84Var;
                this.o = 1;
                Object objA = jt6Var.a(pb2VarW, jArr, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (r0 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.p(r0.getClass().getName(), "getMessageReactionsUseCase fail", th);
        }
        return qqg.a;
    }
}
