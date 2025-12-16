package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* loaded from: classes.dex */
public final class gi1 extends dtf implements sm6 {
    public final /* synthetic */ CallOpponentsListWidget X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Bundle Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi1(CallOpponentsListWidget callOpponentsListWidget, int i, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.X = callOpponentsListWidget;
        this.Y = i;
        this.Z = bundle;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gi1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gi1(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = CallOpponentsListWidget.H0;
            ci1 ci1VarE0 = this.X.E0();
            this.o = 1;
            Object objI = svi.i(((q2b) ci1VarE0.o).b(), new yh1(ci1VarE0, this.Y, this.Z, null), this);
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
