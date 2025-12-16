package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bz5 extends dtf implements sm6 {
    public final /* synthetic */ dz5 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz5(dz5 dz5Var, Continuation continuation) {
        super(2, continuation);
        this.X = dz5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bz5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bz5(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ez5 ez5Var = (ez5) this.X.a.getValue();
            this.o = 1;
            obj = ez5Var.a(this);
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
        ArrayList arrayListA = ((su5) obj).a();
        qu5 qu5Var = arrayListA != null ? (qu5) ue3.I(arrayListA) : null;
        if (qu5Var != null) {
            return new ru5(Collections.singletonList(new pu5(3, qu5Var.c, qu5Var.d, qu5Var.e, qu5Var.b)));
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
