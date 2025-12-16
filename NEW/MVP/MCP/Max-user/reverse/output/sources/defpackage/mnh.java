package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mnh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aoh Y;
    public final /* synthetic */ jlh Z;
    public int o;
    public final /* synthetic */ jnh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnh(jlh jlhVar, jnh jnhVar, aoh aohVar, Continuation continuation) {
        super(2, continuation);
        this.Y = aohVar;
        this.Z = jlhVar;
        this.s0 = jnhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mnh) l((String) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mnh mnhVar = new mnh(this.Z, this.s0, this.Y, continuation);
        mnhVar.X = obj;
        return mnhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        jnh jnhVar = this.s0;
        aoh aohVar = this.Y;
        if (i == 0) {
            g8j.b(obj);
            String str = (String) this.X;
            ew7 ew7Var = aohVar.a;
            String str2 = this.Z.b;
            dpf dpfVar = epf.Companion;
            mlh mlhVar = new mlh(str2, str);
            ew7Var.getClass();
            String strB = ew7Var.b(mlh.Companion.serializer(), mlhVar);
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
