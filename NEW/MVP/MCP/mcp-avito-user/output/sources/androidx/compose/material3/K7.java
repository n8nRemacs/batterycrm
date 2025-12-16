package androidx.compose.material3;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FloatingActionButton.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/K7;", "", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class K7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f34990a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34991b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34992c;

    /* renamed from: d, reason: collision with root package name */
    public final float f34993d;

    public K7(float f12, float f13, float f14, float f15, C42822w c42822w) {
        this.f34990a = f12;
        this.f34991b = f13;
        this.f34992c = f14;
        this.f34993d = f15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K7)) {
            return false;
        }
        K7 k72 = (K7) obj;
        if (androidx.compose.ui.unit.h.b(this.f34990a, k72.f34990a) && androidx.compose.ui.unit.h.b(this.f34991b, k72.f34991b) && androidx.compose.ui.unit.h.b(this.f34992c, k72.f34992c)) {
            return androidx.compose.ui.unit.h.b(this.f34993d, k72.f34993d);
        }
        return false;
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f34993d) + androidx.appcompat.app.r.d(this.f34992c, androidx.appcompat.app.r.d(this.f34991b, Float.hashCode(this.f34990a) * 31, 31), 31);
    }
}
