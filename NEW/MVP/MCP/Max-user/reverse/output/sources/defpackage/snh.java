package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class snh extends dtf implements sm6 {
    public final /* synthetic */ aoh X;
    public final /* synthetic */ doh Y;
    public final /* synthetic */ jnh Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snh(jnh jnhVar, aoh aohVar, doh dohVar, Continuation continuation) {
        super(2, continuation);
        this.X = aohVar;
        this.Y = dohVar;
        this.Z = jnhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((snh) l((qqg) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new snh(this.Z, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        jnh jnhVar = this.Z;
        aoh aohVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            ew7 ew7Var = aohVar.a;
            fpf fpfVar = new fpf(epf.o, this.Y.b);
            ew7Var.getClass();
            String strB = ew7Var.b(fpf.Companion.serializer(), fpfVar);
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
