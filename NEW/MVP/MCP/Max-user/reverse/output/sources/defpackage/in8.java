package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class in8 extends dtf implements sm6 {
    public final /* synthetic */ fs4 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in8(fs4 fs4Var, Continuation continuation) {
        super(2, continuation);
        this.o = fs4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        in8 in8Var = (in8) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        in8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new in8(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        bac.s0.X.a(new nhd(6, this.o));
        return qqg.a;
    }
}
