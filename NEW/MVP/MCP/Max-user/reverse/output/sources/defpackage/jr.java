package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jr extends dtf implements sm6 {
    public final /* synthetic */ rt2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(rt2 rt2Var, Continuation continuation) {
        super(2, continuation);
        this.X = rt2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jr jrVar = (jr) l((qt2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jrVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jr jrVar = new jr(this.X, continuation);
        jrVar.o = obj;
        return jrVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.a((qt2) this.o);
        return qqg.a;
    }
}
