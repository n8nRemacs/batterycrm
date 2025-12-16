package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class tl1 extends dtf implements sm6 {
    public final /* synthetic */ CallScreen X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Bundle Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl1(CallScreen callScreen, int i, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.X = callScreen;
        this.Y = i;
        this.Z = bundle;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tl1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tl1(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            rha rhaVar = CallScreen.N0;
            wo1 wo1VarH0 = this.X.H0();
            this.o = 1;
            obj = svi.i(((q2b) wo1VarH0.x()).b(), new io1(wo1VarH0, this.Y, this.Z, null), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        ((Boolean) obj).booleanValue();
        return qqg.a;
    }
}
