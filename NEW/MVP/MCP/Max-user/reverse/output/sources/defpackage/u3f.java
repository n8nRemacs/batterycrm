package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u3f extends dtf implements sm6 {
    public final /* synthetic */ v3f X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3f(v3f v3fVar, Continuation continuation) {
        super(2, continuation);
        this.X = v3fVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        u3f u3fVar = (u3f) l((xz) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        u3fVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        u3f u3fVar = new u3f(this.X, continuation);
        u3fVar.o = obj;
        return u3fVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        v3f.y(this.X, (xz) this.o);
        return qqg.a;
    }
}
