package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public final class u38 extends dtf implements sm6 {
    public final /* synthetic */ v38 X;
    public final /* synthetic */ s38 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u38(v38 v38Var, s38 s38Var, Continuation continuation) {
        super(2, continuation);
        this.X = v38Var;
        this.Y = s38Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u38) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u38(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            l48 l48Var = ((x38) this.X).a;
            this.o = 1;
            ep4 ep4Var = gy4.a;
            Object objI = svi.i(MainDispatcherLoader.dispatcher.getImmediate(), new dpb(l48Var, l38.d, this.Y, null), this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
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
