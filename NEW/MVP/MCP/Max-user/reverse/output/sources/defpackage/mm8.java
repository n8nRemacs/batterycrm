package defpackage;

import androidx.work.WorkRequest;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mm8 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nm8 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm8(nm8 nm8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = nm8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mm8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mm8 mm8Var = new mm8(this.Y, continuation);
        mm8Var.X = obj;
        return mm8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        int i = this.o;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
            this.X = f84Var;
            this.o = 1;
            if (s8j.c(WorkRequest.MIN_BACKOFF_MILLIS, this) != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        f84Var = (f84) this.X;
        g8j.b(obj);
        if (d7j.f(f84Var)) {
            nm8 nm8Var = this.Y;
            wl8 wl8VarC = ((q2b) nm8Var.a).c();
            lm8 lm8Var = new lm8(nm8Var, null);
            this.X = null;
            this.o = 2;
            if (svi.i(wl8VarC, lm8Var, this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
