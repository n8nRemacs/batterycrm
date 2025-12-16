package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ged extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hed Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ged(hed hedVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hedVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ((ged) l((f84) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ged gedVar = new ged(this.Y, continuation);
        gedVar.X = obj;
        return gedVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        int i = this.o;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
            this.X = f84Var;
            this.o = 1;
            if (s8j.c(50L, this) != g84Var) {
            }
            return g84Var;
        }
        if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f84Var = (f84) this.X;
        g8j.b(obj);
        do {
            eoi.d(f84Var.getCoroutineContext());
            hed hedVar = this.Y;
            hedVar.d.m(null, new Long((System.currentTimeMillis() - hedVar.c) + hedVar.b));
            this.X = f84Var;
            this.o = 2;
        } while (s8j.c(50L, this) != g84Var);
        return g84Var;
    }
}
