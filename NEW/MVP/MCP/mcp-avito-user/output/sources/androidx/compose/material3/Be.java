package androidx.compose.material3;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Chip.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/Be;", "", "Landroidx/compose/ui/unit/h;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/interaction/j;", "lastInteraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Be {

    /* renamed from: a, reason: collision with root package name */
    public final float f34558a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34559b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34560c;

    /* renamed from: d, reason: collision with root package name */
    public final float f34561d;

    /* renamed from: e, reason: collision with root package name */
    public final float f34562e;

    /* renamed from: f, reason: collision with root package name */
    public final float f34563f;

    public Be(float f12, float f13, float f14, float f15, float f16, float f17, C42822w c42822w) {
        this.f34558a = f12;
        this.f34559b = f13;
        this.f34560c = f14;
        this.f34561d = f15;
        this.f34562e = f16;
        this.f34563f = f17;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Be)) {
            return false;
        }
        Be be2 = (Be) obj;
        return androidx.compose.ui.unit.h.b(this.f34558a, be2.f34558a) && androidx.compose.ui.unit.h.b(this.f34559b, be2.f34559b) && androidx.compose.ui.unit.h.b(this.f34560c, be2.f34560c) && androidx.compose.ui.unit.h.b(this.f34561d, be2.f34561d) && androidx.compose.ui.unit.h.b(this.f34563f, be2.f34563f);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f34563f) + androidx.appcompat.app.r.d(this.f34561d, androidx.appcompat.app.r.d(this.f34560c, androidx.appcompat.app.r.d(this.f34559b, Float.hashCode(this.f34558a) * 31, 31), 31), 31);
    }
}
