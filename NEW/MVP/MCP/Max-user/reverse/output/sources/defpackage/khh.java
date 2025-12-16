package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class khh extends dtf implements sm6 {
    public final /* synthetic */ dtf X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ View Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public khh(um6 um6Var, View view, View view2, Continuation continuation) {
        super(2, continuation);
        this.X = (dtf) um6Var;
        this.Y = view;
        this.Z = view2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((khh) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new khh(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yeb yebVarK = a93.s0.x(this.Z.getContext()).k();
            this.o = 1;
            Object objInvoke = this.X.invoke(this.Y, yebVarK, this);
            g84 g84Var = g84.a;
            if (objInvoke == g84Var) {
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
