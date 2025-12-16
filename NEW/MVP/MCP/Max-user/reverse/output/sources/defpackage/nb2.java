package defpackage;

import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.Set;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class nb2 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb2 b;

    public /* synthetic */ nb2(pb2 pb2Var, int i) {
        this.a = i;
        this.b = pb2Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        pb2 pb2Var = this.b;
        switch (i) {
            case 0:
                kmb kmbVar = (kmb) obj;
                eh9 eh9Var = pb2Var.o;
                m7f m7fVarZ = null;
                if (eh9Var == null) {
                    return null;
                }
                si9 si9Var = eh9Var.a;
                if (kmbVar != null && ((Long) kmbVar.a).longValue() == si9Var.a) {
                    return kmbVar;
                }
                ij2 ij2Var = eh9Var.Z;
                ij2Var.getClass();
                SpannableString spannableStringF = eh9Var == null ? null : ij2.f(ij2Var, pb2Var, eh9Var, 1);
                if (l8g.d(spannableStringF)) {
                    int i2 = m7f.a;
                    spannableStringF = uha.z(spannableStringF);
                    for (Object obj2 : spannableStringF.getSpans(0, spannableStringF.length(), Object.class)) {
                        if ((obj2 instanceof URLSpan) || (obj2 instanceof ep8)) {
                            spannableStringF.removeSpan(obj2);
                        }
                    }
                }
                Long lValueOf = Long.valueOf(si9Var.a);
                if (!l8g.c(spannableStringF)) {
                    int i3 = m7f.a;
                    m7fVarZ = uha.z(spannableStringF);
                }
                return new kmb(lValueOf, m7fVarZ);
            default:
                Set set = (Set) obj;
                set.add(pb2Var);
                return set;
        }
    }
}
