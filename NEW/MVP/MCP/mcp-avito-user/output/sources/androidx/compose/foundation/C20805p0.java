package androidx.compose.foundation;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BorderStroke.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/p0;", "", "Landroidx/compose/ui/unit/h;", "width", "Landroidx/compose/ui/graphics/J;", "brush", "<init>", "(FLandroidx/compose/ui/graphics/J;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20805p0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f29789a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.J f29790b;

    public C20805p0(float f12, androidx.compose.ui.graphics.J j12, C42822w c42822w) {
        this.f29789a = f12;
        this.f29790b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20805p0)) {
            return false;
        }
        C20805p0 c20805p0 = (C20805p0) obj;
        return androidx.compose.ui.unit.h.b(this.f29789a, c20805p0.f29789a) && kotlin.jvm.internal.L.f(this.f29790b, c20805p0.f29790b);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f29790b.hashCode() + (Float.hashCode(this.f29789a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderStroke(width=");
        H.u(this.f29789a, ", brush=", sb2);
        sb2.append(this.f29790b);
        sb2.append(')');
        return sb2.toString();
    }
}
