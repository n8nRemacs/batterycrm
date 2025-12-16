package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yv1 extends dtf implements sm6 {
    public final /* synthetic */ hw1 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv1(hw1 hw1Var, Continuation continuation) {
        super(2, continuation);
        this.X = hw1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yv1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yv1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqg.a;
        }
        g8j.b(obj);
        hw1 hw1Var = this.X;
        jve jveVar = ((nw1) hw1Var.B0.getValue()).b;
        tw twVar = new tw(4, hw1Var);
        this.o = 1;
        jveVar.d(new to1(twVar, 5), this);
        return g84.a;
    }
}
