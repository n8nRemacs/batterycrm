package androidx.compose.material;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/Ta;", "", "Landroidx/compose/ui/unit/h;", "left", "width", "<init>", "(FFLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ta {

    /* renamed from: a, reason: collision with root package name */
    public final float f33225a;

    /* renamed from: b, reason: collision with root package name */
    public final float f33226b;

    public Ta(float f12, float f13, C42822w c42822w) {
        this.f33225a = f12;
        this.f33226b = f13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ta)) {
            return false;
        }
        Ta ta2 = (Ta) obj;
        return androidx.compose.ui.unit.h.b(this.f33225a, ta2.f33225a) && androidx.compose.ui.unit.h.b(this.f33226b, ta2.f33226b);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f33226b) + (Float.hashCode(this.f33225a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f12 = this.f33225a;
        androidx.compose.foundation.H.u(f12, ", right=", sb2);
        float f13 = this.f33226b;
        sb2.append((Object) androidx.compose.ui.unit.h.c(f12 + f13));
        sb2.append(", width=");
        sb2.append((Object) androidx.compose.ui.unit.h.c(f13));
        sb2.append(')');
        return sb2.toString();
    }
}
