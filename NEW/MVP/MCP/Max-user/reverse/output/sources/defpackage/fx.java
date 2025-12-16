package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fx extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ hx Y;
    public final /* synthetic */ pb2 Z;
    public hx o;
    public final /* synthetic */ uid s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(hx hxVar, pb2 pb2Var, uid uidVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hxVar;
        this.Z = pb2Var;
        this.s0 = uidVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fx) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fx(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hx, int] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ?? r0 = this.X;
        qqg qqgVar = qqg.a;
        try {
            if (r0 != 0) {
                if (r0 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hx hxVar = this.o;
                g8j.b(obj);
                return qqgVar;
            }
            g8j.b(obj);
            hx hxVar2 = this.Y;
            pb2 pb2Var = this.Z;
            uid uidVar = this.s0;
            jt6 jt6Var = (jt6) hxVar2.k.getValue();
            List list = (List) uidVar.a;
            this.o = hxVar2;
            this.X = 1;
            jt6Var.getClass();
            Object objD = d7j.d(new ht6(list, pb2Var, jt6Var, null), this);
            g84 g84Var = g84.a;
            if (objD != g84Var) {
                objD = qqgVar;
            }
            return objD == g84Var ? g84Var : qqgVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.p(r0.f, "fail to fetch reactions", th);
            return qqgVar;
        }
    }
}
