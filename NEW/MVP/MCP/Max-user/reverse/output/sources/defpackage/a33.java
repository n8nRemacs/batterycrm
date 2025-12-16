package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a33 extends dtf implements sm6 {
    public final /* synthetic */ b43 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a33(b43 b43Var, Continuation continuation) {
        super(2, continuation);
        this.o = b43Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a33 a33Var = (a33) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a33Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new a33(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        b43 b43Var = this.o;
        vcd vcdVar = b43Var.b;
        new ik3(new esa(vqa.i(vcdVar.a.O(ve2.I)).g(new iqa(22, vcdVar)), new ucd(vcdVar, 2)), 0, new esa(vqa.i(vcdVar.b.j(qv3.o, qv3.q)).g(new iqa(27, vcdVar)).g(new ucd(vcdVar, 3)), new ucd(vcdVar, 1))).h(vcdVar.c).f(new qu1(new iqa(26), 0, new yl4(5)));
        tcf tcfVar = b43Var.H0;
        y23 y23Var = (y23) tcfVar.getValue();
        tc7 tc7Var = y23Var.c;
        tcfVar.m(null, y23.a(y23Var, null, new tc7(tc7Var.a, hd5.a, tc7Var.c), null, false, false, 59));
        return qqg.a;
    }
}
