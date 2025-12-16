package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ni2 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(long j, Continuation continuation) {
        super(2, continuation);
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ni2 ni2Var = (ni2) l((af2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ni2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ni2 ni2Var = new ni2(this.X, continuation);
        ni2Var.o = obj;
        return ni2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        af2 af2Var = (af2) this.o;
        long j = af2Var.Y;
        long j2 = this.X;
        if (j < j2 || j2 == 0) {
            af2Var.Y = j2;
        }
        return qqg.a;
    }
}
