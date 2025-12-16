package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gh3 extends dtf implements sm6 {
    public final /* synthetic */ wg3 X;
    public final /* synthetic */ kh3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh3(kh3 kh3Var, wg3 wg3Var, Continuation continuation) {
        super(2, continuation);
        this.o = kh3Var;
        this.X = wg3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gh3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gh3(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = kh3.m;
        return ((w63) this.o.f.getValue()).j(((vg3) this.X).a).a.getValue();
    }
}
