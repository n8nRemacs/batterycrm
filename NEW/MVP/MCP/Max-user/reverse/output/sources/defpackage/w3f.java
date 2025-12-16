package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w3f extends dtf implements sm6 {
    public final /* synthetic */ x3f X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3f(x3f x3fVar, Continuation continuation) {
        super(2, continuation);
        this.X = x3fVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        w3f w3fVar = (w3f) l((xz) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        w3fVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        w3f w3fVar = new w3f(this.X, continuation);
        w3fVar.o = obj;
        return w3fVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        x3f.B(this.X, (xz) this.o);
        return qqg.a;
    }
}
