package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ung extends dtf implements sm6 {
    public final /* synthetic */ pog X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ung(Continuation continuation, pog pogVar) {
        super(2, continuation);
        this.X = pogVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ung ungVar = (ung) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ungVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ung ungVar = new ung(continuation, this.X);
        ungVar.o = obj;
        return ungVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.f((log) this.o);
        return qqg.a;
    }
}
