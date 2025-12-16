package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l15 extends dtf implements sm6 {
    public final /* synthetic */ n15 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l15(n15 n15Var, Continuation continuation) {
        super(2, continuation);
        this.o = n15Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((l15) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new l15(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return this.o.j();
    }
}
