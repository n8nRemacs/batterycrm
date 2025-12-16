package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h53 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k53 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h53(k53 k53Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k53Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h53) l((v03) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h53 h53Var = new h53(this.Y, continuation);
        h53Var.X = obj;
        return h53Var;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        ?? r9 = ((v03) this.X).a;
        n8a n8aVarA = dk8.a();
        for (hs2 hs2Var : r9) {
            Long l = (hs2Var.D0 & 1) != 0 ? new Long(hs2Var.a) : null;
            if (l != null) {
                n8aVarA.a(l.longValue());
            }
        }
        if (!n8aVarA.i()) {
            psg psgVar = (psg) this.Y.H0.getValue();
            this.o = 1;
            Object objE = psgVar.e(n8aVarA, this);
            g84 g84Var = g84.a;
            if (objE == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
