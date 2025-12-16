package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class sl8 extends dtf implements sm6 {
    public final /* synthetic */ MainActivity X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sl8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sl8(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            qi8 qi8Var = (qi8) t1b.a.getAccessor().c(384);
            this.o = 1;
            Object objA = qi8Var.a(this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        gu5 gu5Var = (gu5) ((rt5) t1b.a.getAccessor().c(48));
        boolean zBooleanValue = ((Boolean) gu5Var.M.D(gu5Var, gu5.S[27])).booleanValue();
        MainActivity mainActivity = this.X;
        if (zBooleanValue) {
            ul8.c.p0().b(":login", null);
        } else {
            ProcessPhoenix.b(mainActivity);
        }
        int i2 = MainActivity.a1;
        svi.e(zpi.a(mainActivity.p()), null, null, new tl8(mainActivity, null), 3);
        return qqg.a;
    }
}
