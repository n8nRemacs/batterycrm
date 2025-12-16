package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class is2 extends dtf implements sm6 {
    public final /* synthetic */ ks2 X;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is2(Object obj, Continuation continuation, ks2 ks2Var) {
        super(2, continuation);
        this.o = obj;
        this.X = ks2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((is2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new is2(this.o, continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ks2 ks2Var = this.X;
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        try {
            return ks2Var.a(pb2Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.e(ks2Var.b, "ChatModelConverter.convertChatToModel() failed for " + pb2Var.a, th);
            return null;
        }
    }
}
