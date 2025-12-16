package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oz2 extends dtf implements sm6 {
    public String X;
    public int Y;
    public final /* synthetic */ sz2 Z;
    public tcf o;
    public final /* synthetic */ String s0;
    public final /* synthetic */ Rect t0;
    public final /* synthetic */ RectF u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz2(sz2 sz2Var, String str, Rect rect, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.Z = sz2Var;
        this.s0 = str;
        this.t0 = rect;
        this.u0 = rectF;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oz2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new oz2(this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        tcf tcfVar;
        String str;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            sz2 sz2Var = this.Z;
            tcf tcfVar2 = sz2Var.w0;
            this.o = tcfVar2;
            String str2 = this.s0;
            this.X = str2;
            this.Y = 1;
            obj = sz2.t(sz2Var, str2, this.t0, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
            tcfVar = tcfVar2;
            str = str2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.X;
            tcfVar = this.o;
            g8j.b(obj);
        }
        tcfVar.setValue(new iz2(str, (String) obj, this.u0));
        return qqg.a;
    }
}
