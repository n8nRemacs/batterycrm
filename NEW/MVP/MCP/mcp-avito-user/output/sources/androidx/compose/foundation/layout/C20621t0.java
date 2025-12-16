package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/t0;", "Landroidx/compose/foundation/layout/x2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20621t0 implements InterfaceC20639x2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28738b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28739c;

    public C20621t0(@Y61.k InterfaceC20639x2 interfaceC20639x2, @Y61.k InterfaceC20639x2 interfaceC20639x22) {
        this.f28738b = interfaceC20639x2;
        this.f28739c = interfaceC20639x22;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int a(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        int iA2 = this.f28738b.a(dVar, layoutDirection) - this.f28739c.a(dVar, layoutDirection);
        if (iA2 < 0) {
            return 0;
        }
        return iA2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int b(@Y61.k androidx.compose.ui.unit.d dVar) {
        int iB2 = this.f28738b.b(dVar) - this.f28739c.b(dVar);
        if (iB2 < 0) {
            return 0;
        }
        return iB2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int c(@Y61.k androidx.compose.ui.unit.d dVar) {
        int iC2 = this.f28738b.c(dVar) - this.f28739c.c(dVar);
        if (iC2 < 0) {
            return 0;
        }
        return iC2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int d(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        int iD2 = this.f28738b.d(dVar, layoutDirection) - this.f28739c.d(dVar, layoutDirection);
        if (iD2 < 0) {
            return 0;
        }
        return iD2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20621t0)) {
            return false;
        }
        C20621t0 c20621t0 = (C20621t0) obj;
        return kotlin.jvm.internal.L.f(c20621t0.f28738b, this.f28738b) && kotlin.jvm.internal.L.f(c20621t0.f28739c, this.f28739c);
    }

    public final int hashCode() {
        return this.f28739c.hashCode() + (this.f28738b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "(" + this.f28738b + " - " + this.f28739c + ')';
    }
}
