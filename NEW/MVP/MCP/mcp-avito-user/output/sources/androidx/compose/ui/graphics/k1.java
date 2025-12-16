package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Brush.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/k1;", "Landroidx/compose/ui/graphics/J;", "Landroidx/compose/ui/graphics/T;", "value", "<init>", "(JLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k1 extends J {

    /* renamed from: b, reason: collision with root package name */
    public final long f39547b;

    public k1(long j12, C42822w c42822w) {
        super(null);
        this.f39547b = j12;
    }

    @Override // androidx.compose.ui.graphics.J
    public final void a(float f12, long j12, @Y61.k F0 f02) {
        f02.setAlpha(1.0f);
        long jC2 = this.f39547b;
        if (f12 != 1.0f) {
            jC2 = T.c(jC2, T.e(jC2) * f12);
        }
        f02.b(jC2);
        if (f02.d() != null) {
            f02.e(null);
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            return T.d(this.f39547b, ((k1) obj).f39547b);
        }
        return false;
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f39547b);
    }

    @Y61.k
    public final String toString() {
        return "SolidColor(value=" + ((Object) T.j(this.f39547b)) + ')';
    }
}
