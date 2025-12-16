package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pnh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fnh Y;
    public final /* synthetic */ aoh Z;
    public int o;
    public final /* synthetic */ jnh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnh(fnh fnhVar, jnh jnhVar, aoh aohVar, Continuation continuation) {
        super(2, continuation);
        this.Y = fnhVar;
        this.Z = aohVar;
        this.s0 = jnhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pnh) l((ro0) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        aoh aohVar = this.Z;
        pnh pnhVar = new pnh(this.Y, this.s0, aohVar, continuation);
        pnhVar.X = obj;
        return pnhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String strB;
        int i = this.o;
        jnh jnhVar = this.s0;
        aoh aohVar = this.Z;
        if (i == 0) {
            g8j.b(obj);
            ro0 ro0Var = (ro0) this.X;
            boolean z = ro0Var.a;
            fnh fnhVar = this.Y;
            if (z) {
                inh inhVar = new inh(fnhVar.b, aoh.i, ro0Var.b, ro0Var.c, ro0Var.d, (String) aohVar.e.getValue());
                ew7 ew7Var = aohVar.a;
                ew7Var.getClass();
                strB = ew7Var.b(inh.Companion.serializer(), inhVar);
            } else {
                joh johVar = new joh(fnhVar.b, (String) aohVar.e.getValue());
                ew7 ew7Var2 = aohVar.a;
                ew7Var2.getClass();
                strB = ew7Var2.b(joh.Companion.serializer(), johVar);
            }
            pv0 pv0Var = aohVar.g;
            rv7 rv7Var = new rv7(jnhVar.a, strB);
            this.o = 1;
            Object objH = pv0Var.h(rv7Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        aoh.e(aohVar, jnhVar.a);
        return qqg.a;
    }
}
