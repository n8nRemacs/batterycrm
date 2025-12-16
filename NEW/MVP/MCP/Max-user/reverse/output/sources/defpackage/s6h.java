package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s6h extends dtf implements sm6 {
    public final /* synthetic */ v6h X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6h(v6h v6hVar, Continuation continuation) {
        super(2, continuation);
        this.X = v6hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s6h s6hVar = (s6h) l((xz) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s6hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        s6h s6hVar = new s6h(this.X, continuation);
        s6hVar.o = obj;
        return s6hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xz xzVar = (xz) this.o;
        yy7[] yy7VarArr = v6h.M0;
        this.X.C(xzVar);
        return qqg.a;
    }
}
