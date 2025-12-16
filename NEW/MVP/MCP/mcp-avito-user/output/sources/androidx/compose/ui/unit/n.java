package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FontScaling.android.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/n;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface n {

    /* compiled from: FontScaling.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @F3
    default float E(long j12) {
        long jC2 = y.c(j12);
        A.f42832b.getClass();
        if (!A.b(jC2, A.f42833c)) {
            p.b("Only Sp can convert to Px");
        }
        C0.b bVar = C0.b.f1851a;
        float fK02 = getF40390d();
        bVar.getClass();
        if (fK02 < 1.03f) {
            float fK03 = getF40390d() * y.d(j12);
            h.a aVar = h.f42849c;
            return fK03;
        }
        C0.a aVarA = C0.b.a(getF40390d());
        float fD2 = y.d(j12);
        float fK04 = aVarA == null ? getF40390d() * fD2 : aVarA.a(fD2);
        h.a aVar2 = h.f42849c;
        return fK04;
    }

    /* renamed from: K0 */
    float getF40390d();

    @F3
    default long s(float f12) {
        C0.b bVar = C0.b.f1851a;
        float fK02 = getF40390d();
        bVar.getClass();
        if (!(fK02 >= 1.03f)) {
            return z.f(4294967296L, f12 / getF40390d());
        }
        C0.a aVarA = C0.b.a(getF40390d());
        return z.f(4294967296L, aVarA != null ? aVarA.b(f12) : f12 / getF40390d());
    }
}
