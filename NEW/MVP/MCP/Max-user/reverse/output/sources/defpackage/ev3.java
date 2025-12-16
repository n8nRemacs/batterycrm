package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ev3 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ iv3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev3(iv3 iv3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.o = iv3Var;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ev3 ev3Var = (ev3) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ev3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ev3(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        iv3 iv3Var = this.o;
        iv3Var.p.set(((hwa) iv3Var.l.getValue()).C(null, null, null, null, null, this.X, 0L, 2));
        return qqg.a;
    }
}
