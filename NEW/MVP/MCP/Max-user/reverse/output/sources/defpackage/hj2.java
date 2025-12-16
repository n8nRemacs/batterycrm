package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;

/* loaded from: classes2.dex */
public final class hj2 extends yk8 {
    public final /* synthetic */ k18 g;
    public final /* synthetic */ k18 h;
    public final /* synthetic */ ij2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj2(k18 k18Var, k18 k18Var2, ij2 ij2Var) {
        super(100);
        this.g = k18Var;
        this.h = k18Var2;
        this.i = ij2Var;
    }

    @Override // defpackage.yk8
    public final Object a(Object obj) {
        Object ipdVar;
        ej2 ej2Var = (ej2) obj;
        k18 k18Var = this.g;
        k18 k18Var2 = this.h;
        ij2 ij2Var = this.i;
        try {
            String strF = ((ij7) k18Var.getValue()).f(ej2Var.a);
            if (strF != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                gbj.a(spannableStringBuilder, (char) 8203, new h7f(kti.d(16 * vw4.d().getDisplayMetrics().density) + kti.d(4 * vw4.d().getDisplayMetrics().density)), 33);
                spannableStringBuilder.append(((f7b) k18Var2.getValue()).j.e(dnf.j(strF)), new l7g(a93.s0.x(ij2Var.a).k(), new gf1(15)), 33);
                ipdVar = new SpannedString(spannableStringBuilder);
            } else {
                ipdVar = null;
            }
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(ij2Var.B, "Fail process typing", thA);
        }
        return (CharSequence) (ipdVar instanceof ipd ? null : ipdVar);
    }
}
