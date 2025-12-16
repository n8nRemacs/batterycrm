package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dpb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l48 Y;
    public final /* synthetic */ l38 Z;
    public int o;
    public final /* synthetic */ dtf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dpb(l48 l48Var, l38 l38Var, sm6 sm6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l48Var;
        this.Z = l38Var;
        this.s0 = (dtf) sm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dpb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dtf, sm6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dpb dpbVar = new dpb(this.Y, this.Z, this.s0, continuation);
        dpbVar.X = obj;
        return dpbVar;
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [dtf, sm6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        q38 q38Var;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q38Var = (q38) this.X;
            try {
                g8j.b(obj);
                q38Var.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                q38Var.a();
                throw th;
            }
        }
        g8j.b(obj);
        qt7 qt7Var = (qt7) ((f84) this.X).getCoroutineContext().get(wha.w0);
        if (qt7Var == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        cpb cpbVar = new cpb();
        q38 q38Var2 = new q38(this.Y, this.Z, cpbVar.a, qt7Var);
        try {
            ?? r7 = this.s0;
            this.X = q38Var2;
            this.o = 1;
            obj = svi.i(cpbVar, r7, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
            q38Var = q38Var2;
            q38Var.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            q38Var = q38Var2;
            q38Var.a();
            throw th;
        }
    }
}
