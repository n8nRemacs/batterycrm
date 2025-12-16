package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lhh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dtf Y;
    public final /* synthetic */ View Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lhh(um6 um6Var, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = (dtf) um6Var;
        this.Z = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lhh) l((yeb) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lhh lhhVar = new lhh(this.Y, this.Z, continuation);
        lhhVar.X = obj;
        return lhhVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yeb yebVar = (yeb) this.X;
            this.o = 1;
            Object objInvoke = this.Y.invoke(this.Z, yebVar, this);
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
