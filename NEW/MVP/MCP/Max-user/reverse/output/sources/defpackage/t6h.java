package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t6h extends dtf implements sm6 {
    public final /* synthetic */ v6h X;
    public final /* synthetic */ b5h Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6h(v6h v6hVar, b5h b5hVar, Continuation continuation) {
        super(2, continuation);
        this.X = v6hVar;
        this.Y = b5hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        t6h t6hVar = (t6h) l((w8h) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        t6hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        t6h t6hVar = new t6h(this.X, this.Y, continuation);
        t6hVar.o = obj;
        return t6hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        v6h.q(this.X, this.Y, (w8h) this.o);
        return qqg.a;
    }
}
