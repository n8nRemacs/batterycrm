package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pp3 extends dtf implements sm6 {
    public /* synthetic */ boolean o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((pp3) l(bool, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pp3 pp3Var = new pp3(2, continuation);
        pp3Var.o = ((Boolean) obj).booleanValue();
        return pp3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return Boolean.valueOf(this.o);
    }
}
