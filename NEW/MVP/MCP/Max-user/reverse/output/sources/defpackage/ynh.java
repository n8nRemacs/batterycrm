package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ynh extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ moh Y;
    public final /* synthetic */ aoh Z;
    public int o;
    public final /* synthetic */ jnh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynh(String str, moh mohVar, aoh aohVar, jnh jnhVar, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = mohVar;
        this.Z = aohVar;
        this.s0 = jnhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ynh) l((qqg) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ynh(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        jnh jnhVar = this.s0;
        aoh aohVar = this.Z;
        if (i == 0) {
            g8j.b(obj);
            String str = this.X;
            fpf fpfVar = new fpf((str == null || str.length() == 0) ? epf.c : epf.b, this.Y.b);
            pv0 pv0Var = aohVar.g;
            String str2 = jnhVar.a;
            ew7 ew7Var = aohVar.a;
            ew7Var.getClass();
            rv7 rv7Var = new rv7(str2, ew7Var.b(fpf.Companion.serializer(), fpfVar));
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
