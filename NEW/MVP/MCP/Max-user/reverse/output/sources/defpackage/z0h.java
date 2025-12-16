package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z0h extends dtf implements sm6 {
    public final /* synthetic */ f1h X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0h(f1h f1hVar, Continuation continuation) {
        super(2, continuation);
        this.X = f1hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        z0h z0hVar = (z0h) l((c5c) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        z0hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        z0h z0hVar = new z0h(this.X, continuation);
        z0hVar.o = obj;
        return z0hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        c5c c5cVar = (c5c) this.o;
        String str = c5cVar.b;
        qqg qqgVar = qqg.a;
        if (str != null) {
            f1h f1hVar = this.X;
            d1h d1hVar = (d1h) f1hVar.u.c(str);
            if (d1hVar != null && !d1hVar.Z && d1hVar.b == c5cVar.a) {
                f1hVar.c(d1hVar.c, d1hVar.a);
            }
        }
        return qqgVar;
    }
}
