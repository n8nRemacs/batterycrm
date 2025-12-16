package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e6g extends dtf implements sm6 {
    public final /* synthetic */ g6g X;
    public /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6g(g6g g6gVar, Continuation continuation) {
        super(2, continuation);
        this.X = g6gVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        e6g e6gVar = (e6g) l(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        e6gVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e6g e6gVar = new e6g(this.X, continuation);
        e6gVar.o = ((Number) obj).floatValue();
        return e6gVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        float f = this.o;
        g6g g6gVar = this.X;
        g6gVar.b.setTextSize(0, g6gVar.d + f);
        return qqg.a;
    }
}
