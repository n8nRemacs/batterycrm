package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b2e extends dtf implements sm6 {
    public final /* synthetic */ d2e X;
    public /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2e(d2e d2eVar, Continuation continuation) {
        super(2, continuation);
        this.X = d2eVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        b2e b2eVar = (b2e) l(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        b2eVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b2e b2eVar = new b2e(this.X, continuation);
        b2eVar.o = ((Number) obj).longValue();
        return b2eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.o;
        yy7[] yy7VarArr = d2e.A0;
        d2e d2eVar = this.X;
        d2eVar.w0.O(d2eVar, d2e.A0[0], svi.e((sv1) d2eVar.c.getValue(), ((q2b) ((lzf) d2eVar.Y.getValue())).b(), null, new v1e(j, d2eVar, null), 2));
        return qqg.a;
    }
}
