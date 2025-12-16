package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rs6 extends dtf implements sm6 {
    public final /* synthetic */ f84 X;
    public final /* synthetic */ zs6 Y;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs6(Object obj, Continuation continuation, f84 f84Var, zs6 zs6Var) {
        super(2, continuation);
        this.o = obj;
        this.X = f84Var;
        this.Y = zs6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rs6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rs6(this.o, continuation, this.X, this.Y);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        try {
            ipdVar = ((od8) this.Y.c.getValue()).a(((Number) this.o).longValue(), false);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            try {
                wqi.e(this.X.getClass().getName(), "failed to get forwardMessage ", thA);
                if (!(thA instanceof IllegalStateException)) {
                    throw thA;
                }
                ipdVar = null;
            } catch (Throwable th2) {
                ipdVar = new ipd(th2);
            }
        }
        if (ipdVar instanceof ipd) {
            return null;
        }
        return ipdVar;
    }
}
