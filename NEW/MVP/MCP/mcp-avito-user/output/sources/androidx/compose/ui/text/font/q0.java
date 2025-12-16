package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.d0;
import kotlin.Metadata;

/* compiled from: PlatformTypefaces.android.kt */
@j.k0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/q0;", "Landroidx/compose/ui/text/font/o0;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class q0 implements o0 {
    public static Typeface d(String str, e0 e0Var, int i12) {
        Z.f42217b.getClass();
        if (Z.b(i12, 0)) {
            e0.f42240c.getClass();
            if (kotlin.jvm.internal.L.f(e0Var, e0.f42247j) && (str == null || str.length() == 0)) {
                return Typeface.DEFAULT;
            }
        }
        int iA2 = C22617k.a(e0Var, i12);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iA2) : Typeface.create(str, iA2);
    }

    public static Typeface e(String str, e0 e0Var, int i12) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(str, e0Var, i12);
        if (kotlin.jvm.internal.L.f(typefaceD, Typeface.create(Typeface.DEFAULT, C22617k.a(e0Var, i12))) || kotlin.jvm.internal.L.f(typefaceD, d(null, e0Var, i12))) {
            return null;
        }
        return typefaceD;
    }

    @Override // androidx.compose.ui.text.font.o0
    @Y61.k
    public final Typeface a(@Y61.k i0 i0Var, @Y61.k e0 e0Var, int i12) {
        String strQ = i0Var.f42265h;
        int i13 = e0Var.f42253b / 100;
        if (i13 >= 0 && i13 < 2) {
            strQ = androidx.appcompat.app.r.q(strQ, "-thin");
        } else if (2 <= i13 && i13 < 4) {
            strQ = androidx.appcompat.app.r.q(strQ, "-light");
        } else if (i13 != 4) {
            if (i13 == 5) {
                strQ = androidx.appcompat.app.r.q(strQ, "-medium");
            } else if ((6 > i13 || i13 >= 8) && 8 <= i13 && i13 < 11) {
                strQ = androidx.appcompat.app.r.q(strQ, "-black");
            }
        }
        Typeface typefaceE = e(strQ, e0Var, i12);
        return typefaceE == null ? d(i0Var.f42265h, e0Var, i12) : typefaceE;
    }

    @Override // androidx.compose.ui.text.font.o0
    @Y61.k
    public final Typeface b(@Y61.k e0 e0Var, int i12) {
        return d(null, e0Var, i12);
    }

    @Override // androidx.compose.ui.text.font.o0
    @Y61.l
    public final Typeface c(@Y61.k String str, @Y61.k e0 e0Var, int i12, @Y61.k d0.e eVar, @Y61.k Context context) {
        Typeface typefaceA;
        E.f42170b.getClass();
        i0 i0Var = E.f42172d;
        if (kotlin.jvm.internal.L.f(str, i0Var.f42265h)) {
            typefaceA = a(i0Var, e0Var, i12);
        } else {
            i0 i0Var2 = E.f42173e;
            if (kotlin.jvm.internal.L.f(str, i0Var2.f42265h)) {
                typefaceA = a(i0Var2, e0Var, i12);
            } else {
                i0 i0Var3 = E.f42174f;
                if (kotlin.jvm.internal.L.f(str, i0Var3.f42265h)) {
                    typefaceA = a(i0Var3, e0Var, i12);
                } else {
                    i0 i0Var4 = E.f42175g;
                    typefaceA = kotlin.jvm.internal.L.f(str, i0Var4.f42265h) ? a(i0Var4, e0Var, i12) : e(str, e0Var, i12);
                }
            }
        }
        return r0.a(typefaceA, eVar, context);
    }
}
