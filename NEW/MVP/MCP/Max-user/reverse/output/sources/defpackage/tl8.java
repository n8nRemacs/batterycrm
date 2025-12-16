package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class tl8 extends dtf implements sm6 {
    public final /* synthetic */ MainActivity X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tl8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tl8(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            MainActivity mainActivity = this.X;
            l48 l48Var = mainActivity.a;
            sl8 sl8Var = new sl8(mainActivity, null);
            this.o = 1;
            Object objB = b8j.b(l48Var, l38.o, sl8Var, this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
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
