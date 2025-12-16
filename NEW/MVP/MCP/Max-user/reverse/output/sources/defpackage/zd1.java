package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zd1 extends dtf implements sm6 {
    public final /* synthetic */ he1 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd1(he1 he1Var, Continuation continuation) {
        super(2, continuation);
        this.X = he1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zd1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zd1(this.X, continuation);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        ae1 ae1Var;
        bsb bsbVar;
        mc0 mc0VarA;
        he1 he1Var = this.X;
        enb enbVar = he1Var.c;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            obj = enbVar.h(this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        ku3 ku3Var = (ku3) obj;
        tcf tcfVar = he1Var.w0;
        do {
            value = tcfVar.getValue();
            ae1Var = (ae1) value;
            ?? r6 = he1Var.v0;
            bsbVar = he1Var.o;
            mc0VarA = fui.a(ku3Var.o(), new Long(((Number) r6.getValue()).longValue()));
            enbVar.getClass();
        } while (!tcfVar.c(value, ae1.a(ae1Var, new wd0(mc0VarA, ku3Var.r(il0.c)), !bsbVar.b().c(qsb.h) ? ms8.o : ms8.a, bsbVar.a(he1Var.X), false, null, null, null, 120)));
        return qqg.a;
    }
}
