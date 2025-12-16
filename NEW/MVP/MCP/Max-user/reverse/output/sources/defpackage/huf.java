package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class huf extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ quf Y;
    public quf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huf(quf qufVar, Continuation continuation) {
        super(2, continuation);
        this.Y = qufVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((huf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new huf(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        quf qufVar;
        Object objB;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.X;
        Continuation continuation = null;
        try {
            if (i == 0) {
                g8j.b(obj);
                qufVar = this.Y;
                n9a n9aVar = qufVar.f;
                i13 i13Var = new i13(qufVar, continuation, 2);
                this.o = qufVar;
                this.X = 1;
                if (oxi.b(n9aVar, null, i13Var, this) == g84Var) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return qqgVar;
            }
            qufVar = this.o;
            g8j.b(obj);
            suf sufVar = qufVar.b;
            this.o = null;
            this.X = 2;
            fuf fufVar = (fuf) sufVar.b.getValue();
            objB = k7j.b(fufVar.a, new bm4(16, fufVar), this);
            if (objB != g84Var) {
                objB = qqgVar;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str = quf.h;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.Y;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "clear: failed", th);
                }
            }
        }
        return objB == g84Var ? g84Var : qqgVar;
    }
}
