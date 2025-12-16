package androidx.compose.material3;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Chip.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/R2;", "", "Landroidx/compose/ui/unit/h;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/interaction/j;", "lastInteraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class R2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f35366a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35367b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35368c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35369d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35370e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35371f;

    public R2(float f12, float f13, float f14, float f15, float f16, float f17, C42822w c42822w) {
        this.f35366a = f12;
        this.f35367b = f13;
        this.f35368c = f14;
        this.f35369d = f15;
        this.f35370e = f16;
        this.f35371f = f17;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof R2)) {
            return false;
        }
        R2 r22 = (R2) obj;
        return androidx.compose.ui.unit.h.b(this.f35366a, r22.f35366a) && androidx.compose.ui.unit.h.b(this.f35367b, r22.f35367b) && androidx.compose.ui.unit.h.b(this.f35368c, r22.f35368c) && androidx.compose.ui.unit.h.b(this.f35369d, r22.f35369d) && androidx.compose.ui.unit.h.b(this.f35371f, r22.f35371f);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f35371f) + androidx.appcompat.app.r.d(this.f35369d, androidx.appcompat.app.r.d(this.f35368c, androidx.appcompat.app.r.d(this.f35367b, Float.hashCode(this.f35366a) * 31, 31), 31), 31);
    }
}
