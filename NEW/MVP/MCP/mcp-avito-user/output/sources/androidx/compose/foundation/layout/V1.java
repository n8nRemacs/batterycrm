package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Padding.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/V1;", "Landroidx/compose/foundation/layout/T1;", "Landroidx/compose/ui/unit/h;", "start", "top", "end", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V1 implements T1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f28520a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28521b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28522c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28523d;

    public V1(float f12, float f13, float f14, float f15, C42822w c42822w) {
        this.f28520a = f12;
        this.f28521b = f13;
        this.f28522c = f14;
        this.f28523d = f15;
        if (!((f12 >= 0.0f) & (f13 >= 0.0f) & (f14 >= 0.0f)) || !(f15 >= 0.0f)) {
            N.a.a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.foundation.layout.T1
    public final float a(@Y61.k LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f42838b ? this.f28522c : this.f28520a;
    }

    @Override // androidx.compose.foundation.layout.T1
    /* renamed from: b, reason: from getter */
    public final float getF28523d() {
        return this.f28523d;
    }

    @Override // androidx.compose.foundation.layout.T1
    public final float c(@Y61.k LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f42838b ? this.f28520a : this.f28522c;
    }

    @Override // androidx.compose.foundation.layout.T1
    /* renamed from: d, reason: from getter */
    public final float getF28521b() {
        return this.f28521b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof V1)) {
            return false;
        }
        V1 v12 = (V1) obj;
        return androidx.compose.ui.unit.h.b(this.f28520a, v12.f28520a) && androidx.compose.ui.unit.h.b(this.f28521b, v12.f28521b) && androidx.compose.ui.unit.h.b(this.f28522c, v12.f28522c) && androidx.compose.ui.unit.h.b(this.f28523d, v12.f28523d);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f28523d) + androidx.appcompat.app.r.d(this.f28522c, androidx.appcompat.app.r.d(this.f28521b, Float.hashCode(this.f28520a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingValues(start=");
        androidx.compose.foundation.H.u(this.f28520a, ", top=", sb2);
        androidx.compose.foundation.H.u(this.f28521b, ", end=", sb2);
        androidx.compose.foundation.H.u(this.f28522c, ", bottom=", sb2);
        return androidx.compose.foundation.H.h(')', this.f28523d, sb2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public V1(float f12, float f13, float f14, float f15, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            f12 = 0;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
        }
        float f16 = f12;
        if ((i12 & 2) != 0) {
            f13 = 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        }
        float f17 = f13;
        if ((i12 & 4) != 0) {
            f14 = 0;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        }
        float f18 = f14;
        if ((i12 & 8) != 0) {
            f15 = 0;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        }
        this(f16, f17, f18, f15, null);
    }
}
