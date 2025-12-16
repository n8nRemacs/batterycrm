package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.d0;
import kotlin.Metadata;

/* compiled from: PlatformTypefaces.android.kt */
@j.k0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/p0;", "Landroidx/compose/ui/text/font/o0;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class p0 implements o0 {
    public static Typeface d(String str, e0 e0Var, int i12) {
        Z.f42217b.getClass();
        if (Z.b(i12, 0)) {
            e0.f42240c.getClass();
            if (kotlin.jvm.internal.L.f(e0Var, e0.f42247j) && (str == null || str.length() == 0)) {
                return Typeface.DEFAULT;
            }
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), e0Var.f42253b, Z.b(i12, Z.f42218c));
    }

    @Override // androidx.compose.ui.text.font.o0
    @Y61.k
    public final Typeface a(@Y61.k i0 i0Var, @Y61.k e0 e0Var, int i12) {
        return d(i0Var.f42265h, e0Var, i12);
    }

    @Override // androidx.compose.ui.text.font.o0
    @Y61.k
    public final Typeface b(@Y61.k e0 e0Var, int i12) {
        return d(null, e0Var, i12);
    }

    @Override // androidx.compose.ui.text.font.o0
    @Y61.l
    public final Typeface c(@Y61.k String str, @Y61.k e0 e0Var, int i12, @Y61.k d0.e eVar, @Y61.k Context context) {
        Typeface typefaceD;
        E.f42170b.getClass();
        i0 i0Var = E.f42172d;
        if (kotlin.jvm.internal.L.f(str, i0Var.f42265h)) {
            typefaceD = d(i0Var.f42265h, e0Var, i12);
        } else {
            i0 i0Var2 = E.f42173e;
            if (kotlin.jvm.internal.L.f(str, i0Var2.f42265h)) {
                typefaceD = d(i0Var2.f42265h, e0Var, i12);
            } else {
                i0 i0Var3 = E.f42174f;
                if (kotlin.jvm.internal.L.f(str, i0Var3.f42265h)) {
                    typefaceD = d(i0Var3.f42265h, e0Var, i12);
                } else {
                    i0 i0Var4 = E.f42175g;
                    if (kotlin.jvm.internal.L.f(str, i0Var4.f42265h)) {
                        typefaceD = d(i0Var4.f42265h, e0Var, i12);
                    } else {
                        Typeface typeface = null;
                        if (str.length() != 0) {
                            Typeface typefaceD2 = d(str, e0Var, i12);
                            Z.f42217b.getClass();
                            boolean zB2 = Z.b(i12, Z.f42218c);
                            y0 y0Var = y0.f42326a;
                            Typeface typeface2 = Typeface.DEFAULT;
                            int i13 = e0Var.f42253b;
                            y0Var.getClass();
                            if (!kotlin.jvm.internal.L.f(typefaceD2, Typeface.create(typeface2, i13, zB2)) && !kotlin.jvm.internal.L.f(typefaceD2, d(null, e0Var, i12))) {
                                typeface = typefaceD2;
                            }
                        }
                        typefaceD = typeface;
                    }
                }
            }
        }
        return r0.a(typefaceD, eVar, context);
    }
}
