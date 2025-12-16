package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WindowInsets.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/x0;", "Landroidx/compose/foundation/layout/x2;", "Landroidx/compose/ui/unit/h;", "leftDp", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20637x0 implements InterfaceC20639x2 {

    /* renamed from: b, reason: collision with root package name */
    public final float f28792b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28793c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28794d;

    /* renamed from: e, reason: collision with root package name */
    public final float f28795e;

    public C20637x0(float f12, float f13, float f14, float f15, C42822w c42822w) {
        this.f28792b = f12;
        this.f28793c = f13;
        this.f28794d = f14;
        this.f28795e = f15;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int a(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return dVar.y0(this.f28794d);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int b(@Y61.k androidx.compose.ui.unit.d dVar) {
        return dVar.y0(this.f28793c);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int c(@Y61.k androidx.compose.ui.unit.d dVar) {
        return dVar.y0(this.f28795e);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int d(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return dVar.y0(this.f28792b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20637x0)) {
            return false;
        }
        C20637x0 c20637x0 = (C20637x0) obj;
        return androidx.compose.ui.unit.h.b(this.f28792b, c20637x0.f28792b) && androidx.compose.ui.unit.h.b(this.f28793c, c20637x0.f28793c) && androidx.compose.ui.unit.h.b(this.f28794d, c20637x0.f28794d) && androidx.compose.ui.unit.h.b(this.f28795e, c20637x0.f28795e);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f28795e) + androidx.appcompat.app.r.d(this.f28794d, androidx.appcompat.app.r.d(this.f28793c, Float.hashCode(this.f28792b) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        androidx.compose.foundation.H.u(this.f28792b, ", top=", sb2);
        androidx.compose.foundation.H.u(this.f28793c, ", right=", sb2);
        androidx.compose.foundation.H.u(this.f28794d, ", bottom=", sb2);
        return androidx.compose.foundation.H.h(')', this.f28795e, sb2);
    }
}
