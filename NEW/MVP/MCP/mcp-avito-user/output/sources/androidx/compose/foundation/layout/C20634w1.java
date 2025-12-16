package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/w1;", "Landroidx/compose/foundation/layout/T1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20634w1 implements T1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28774a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f28775b;

    public C20634w1(@Y61.k InterfaceC20639x2 interfaceC20639x2, @Y61.k androidx.compose.ui.unit.d dVar) {
        this.f28774a = interfaceC20639x2;
        this.f28775b = dVar;
    }

    @Override // androidx.compose.foundation.layout.T1
    public final float a(@Y61.k LayoutDirection layoutDirection) {
        InterfaceC20639x2 interfaceC20639x2 = this.f28774a;
        androidx.compose.ui.unit.d dVar = this.f28775b;
        return dVar.J(interfaceC20639x2.a(dVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.T1
    /* renamed from: b */
    public final float getF28514d() {
        InterfaceC20639x2 interfaceC20639x2 = this.f28774a;
        androidx.compose.ui.unit.d dVar = this.f28775b;
        return dVar.J(interfaceC20639x2.c(dVar));
    }

    @Override // androidx.compose.foundation.layout.T1
    public final float c(@Y61.k LayoutDirection layoutDirection) {
        InterfaceC20639x2 interfaceC20639x2 = this.f28774a;
        androidx.compose.ui.unit.d dVar = this.f28775b;
        return dVar.J(interfaceC20639x2.d(dVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.T1
    /* renamed from: d */
    public final float getF28512b() {
        InterfaceC20639x2 interfaceC20639x2 = this.f28774a;
        androidx.compose.ui.unit.d dVar = this.f28775b;
        return dVar.J(interfaceC20639x2.b(dVar));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20634w1)) {
            return false;
        }
        C20634w1 c20634w1 = (C20634w1) obj;
        return kotlin.jvm.internal.L.f(this.f28774a, c20634w1.f28774a) && kotlin.jvm.internal.L.f(this.f28775b, c20634w1.f28775b);
    }

    public final int hashCode() {
        return this.f28775b.hashCode() + (this.f28774a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f28774a + ", density=" + this.f28775b + ')';
    }
}
