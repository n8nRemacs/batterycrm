package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/a;", "Landroidx/compose/foundation/layout/x2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20540a implements InterfaceC20639x2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28579b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28580c;

    public C20540a(@Y61.k InterfaceC20639x2 interfaceC20639x2, @Y61.k InterfaceC20639x2 interfaceC20639x22) {
        this.f28579b = interfaceC20639x2;
        this.f28580c = interfaceC20639x22;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int a(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        throw null;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int b(@Y61.k androidx.compose.ui.unit.d dVar) {
        throw null;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int c(@Y61.k androidx.compose.ui.unit.d dVar) {
        throw null;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int d(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        throw null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20540a)) {
            return false;
        }
        C20540a c20540a = (C20540a) obj;
        return kotlin.jvm.internal.L.f(c20540a.f28579b, this.f28579b) && kotlin.jvm.internal.L.f(c20540a.f28580c, this.f28580c);
    }

    public final int hashCode() {
        return (this.f28580c.hashCode() * 31) + this.f28579b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "(" + this.f28579b + " + " + this.f28580c + ')';
    }
}
