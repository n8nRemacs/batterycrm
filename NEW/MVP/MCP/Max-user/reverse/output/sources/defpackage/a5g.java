package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a5g extends dtf implements sm6 {
    public final /* synthetic */ b5g o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5g(b5g b5gVar, Continuation continuation) {
        super(2, continuation);
        this.o = b5gVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a5g a5gVar = (a5g) l((qqg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a5gVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new a5g(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.d.clear();
        return qqg.a;
    }
}
