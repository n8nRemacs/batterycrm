package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/s2;", "Landroidx/compose/foundation/layout/x2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20619s2 implements InterfaceC20639x2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28736b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28737c;

    public C20619s2(@Y61.k InterfaceC20639x2 interfaceC20639x2, @Y61.k InterfaceC20639x2 interfaceC20639x22) {
        this.f28736b = interfaceC20639x2;
        this.f28737c = interfaceC20639x22;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int a(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return Math.max(this.f28736b.a(dVar, layoutDirection), this.f28737c.a(dVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int b(@Y61.k androidx.compose.ui.unit.d dVar) {
        return Math.max(this.f28736b.b(dVar), this.f28737c.b(dVar));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int c(@Y61.k androidx.compose.ui.unit.d dVar) {
        return Math.max(this.f28736b.c(dVar), this.f28737c.c(dVar));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int d(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return Math.max(this.f28736b.d(dVar, layoutDirection), this.f28737c.d(dVar, layoutDirection));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20619s2)) {
            return false;
        }
        C20619s2 c20619s2 = (C20619s2) obj;
        return kotlin.jvm.internal.L.f(c20619s2.f28736b, this.f28736b) && kotlin.jvm.internal.L.f(c20619s2.f28737c, this.f28737c);
    }

    public final int hashCode() {
        return (this.f28737c.hashCode() * 31) + this.f28736b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "(" + this.f28736b + " ∪ " + this.f28737c + ')';
    }
}
