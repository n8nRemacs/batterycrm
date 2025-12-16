package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lng extends dtf implements sm6 {
    public final /* synthetic */ sng X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lng(sng sngVar, Continuation continuation) {
        super(2, continuation);
        this.X = sngVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lng) l((xac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lng(this.X, continuation);
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        sng sngVar = this.X;
        k18 k18Var = sngVar.c;
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objI = svi.i(((q2b) ((lzf) k18Var.getValue())).a(), new rng(sngVar, null), this);
            g84 g84Var = g84.a;
            if (objI != g84Var) {
                objI = qqgVar;
            }
            if (objI == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        yy7[] yy7VarArr = sng.x0;
        klc klcVar = (klc) sngVar.X.getValue();
        long jS = ((w4e) ((pb3) sngVar.o.getValue())).s();
        xac xacVar = (xac) ((f9a) klcVar.f.computeIfAbsent(Long.valueOf(jS), new ni(26, new k03(klcVar, jS, 2)))).getValue();
        if (xacVar != null && xacVar.c.contains(flc.d)) {
            sngVar.w0.O(sngVar, sng.x0[1], svi.d(sngVar.a, ((q2b) ((lzf) k18Var.getValue())).b(), i84.b, new qng(sngVar, null)));
        }
        return qqgVar;
    }
}
