package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lz2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ sz2 Y;
    public final /* synthetic */ long Z;
    public String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz2(sz2 sz2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = sz2Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lz2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lz2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String str;
        String strH;
        sz2 sz2Var = this.Y;
        tcf tcfVar = sz2Var.w0;
        int i = this.X;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            str = ((iz2) tcfVar.getValue()).a;
            String str2 = ((iz2) tcfVar.getValue()).b;
            String string = (str2 == null || (strH = tfi.h(str2)) == null) ? null : strH.toString();
            if (str != null) {
                if (string != null) {
                    w63 w63Var = (w63) sz2Var.s0.getValue();
                    this.o = str;
                    this.X = 1;
                    Object objI = svi.i(((q2b) w63Var.a).b(), new n63(w63Var, this.Z, string, null), this);
                    g84 g84Var = g84.a;
                    if (objI != g84Var) {
                        objI = qqgVar;
                    }
                    if (objI == g84Var) {
                        return g84Var;
                    }
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = this.o;
        g8j.b(obj);
        String str3 = str;
        RectF rectF = ((iz2) tcfVar.getValue()).c;
        hwa hwaVar = (hwa) sz2Var.o.getValue();
        n10 n10Var = rectF != null ? new n10(rectF.left, rectF.top, rectF.right, rectF.bottom, 2) : null;
        long j = this.Z;
        if (hwaVar.j(j)) {
            ((c6i) hwaVar.e.getValue()).c(new l92(hwaVar.t().a.k(), str3, j, n10Var));
            return qqgVar;
        }
        return qqgVar;
    }
}
