package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class al extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ te8 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(te8 te8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = te8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((al) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        al alVar = new al(this.Y, continuation);
        alVar.X = obj;
        return alVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            this.X = f84Var;
            this.o = 1;
            l42 l42Var = new l42(1, hni.f(this));
            l42Var.o();
            ((wl8) this.Y.b).mo13dispatch(f84Var.getCoroutineContext(), new ue(2, l42Var));
            Object objN = l42Var.n();
            g84 g84Var = g84.a;
            if (objN == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
