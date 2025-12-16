package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p63 extends dtf implements sm6 {
    public final /* synthetic */ w63 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p63(w63 w63Var, Continuation continuation) {
        super(2, continuation);
        this.o = w63Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p63) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p63(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return this.o.i().E();
    }
}
