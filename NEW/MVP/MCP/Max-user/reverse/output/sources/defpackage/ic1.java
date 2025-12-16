package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class ic1 extends dtf implements sm6 {
    public final /* synthetic */ CallIndicatorWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(Continuation continuation, CallIndicatorWidget callIndicatorWidget) {
        super(2, continuation);
        this.X = callIndicatorWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ic1 ic1Var = (ic1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ic1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ic1 ic1Var = new ic1(continuation, this.X);
        ic1Var.o = obj;
        return ic1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ub1 ub1Var = this.X.c;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof vb1) {
            ub1Var.getClass();
            if (!bx1.a(((RootController) ub1.f()).G0())) {
                ul8.c.p0().b(":call-active", null);
            }
        } else if (cdaVar instanceof wb1) {
            wb1 wb1Var = (wb1) cdaVar;
            n41 n41Var = wb1Var.b;
            boolean z = wb1Var.c;
            ub1Var.getClass();
            if (!bx1.b(((RootController) ub1.f()).G0())) {
                ul8 ul8Var = ul8.c;
                Long l = n41Var.a;
                long jLongValue = l != null ? l.longValue() : 0L;
                CharSequence charSequence = n41Var.c;
                String string = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    string = "";
                }
                String str = string;
                String str2 = n41Var.d;
                ul8Var.O0(jLongValue, str, str2 != null ? Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 0) : null, z);
            }
        }
        return qqg.a;
    }
}
