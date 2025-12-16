package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public final class cmd extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l48 Y;
    public final /* synthetic */ l38 Z;
    public int o;
    public final /* synthetic */ dtf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cmd(l48 l48Var, l38 l38Var, sm6 sm6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l48Var;
        this.Z = l38Var;
        this.s0 = (dtf) sm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cmd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dtf, sm6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cmd cmdVar = new cmd(this.Y, this.Z, this.s0, continuation);
        cmdVar.X = obj;
        return cmdVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [dtf, sm6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            ep4 ep4Var = gy4.a;
            wl8 immediate = MainDispatcherLoader.dispatcher.getImmediate();
            bmd bmdVar = new bmd(this.Y, this.Z, f84Var, this.s0, null);
            this.o = 1;
            Object objI = svi.i(immediate, bmdVar, this);
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
