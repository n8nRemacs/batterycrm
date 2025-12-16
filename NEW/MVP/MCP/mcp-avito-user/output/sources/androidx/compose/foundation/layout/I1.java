package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.q3;
import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WindowInsets.kt */
@F3
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/I1;", "Landroidx/compose/foundation/layout/x2;", "insets", "Landroidx/compose/foundation/layout/q3;", "sides", "<init>", "(Landroidx/compose/foundation/layout/x2;ILkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class I1 implements InterfaceC20639x2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28316b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28317c;

    public I1(InterfaceC20639x2 interfaceC20639x2, int i12, C42822w c42822w) {
        this.f28316b = interfaceC20639x2;
        this.f28317c = i12;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int a(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        int i12;
        if (layoutDirection == LayoutDirection.f42838b) {
            q3.f28716b.getClass();
            i12 = q3.f28718d;
        } else {
            q3.f28716b.getClass();
            i12 = q3.f28720f;
        }
        if ((i12 & this.f28317c) != 0) {
            return this.f28316b.a(dVar, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int b(@Y61.k androidx.compose.ui.unit.d dVar) {
        q3.f28716b.getClass();
        if ((q3.f28723i & this.f28317c) != 0) {
            return this.f28316b.b(dVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int c(@Y61.k androidx.compose.ui.unit.d dVar) {
        q3.f28716b.getClass();
        if ((q3.f28724j & this.f28317c) != 0) {
            return this.f28316b.c(dVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int d(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        int i12;
        if (layoutDirection == LayoutDirection.f42838b) {
            q3.f28716b.getClass();
            i12 = q3.f28717c;
        } else {
            q3.f28716b.getClass();
            i12 = q3.f28719e;
        }
        if ((i12 & this.f28317c) != 0) {
            return this.f28316b.d(dVar, layoutDirection);
        }
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1)) {
            return false;
        }
        I1 i12 = (I1) obj;
        return kotlin.jvm.internal.L.f(this.f28316b, i12.f28316b) && q3.a(this.f28317c, i12.f28317c);
    }

    public final int hashCode() {
        int iHashCode = this.f28316b.hashCode() * 31;
        q3.a aVar = q3.f28716b;
        return Integer.hashCode(this.f28317c) + iHashCode;
    }

    @Y61.k
    public final String toString() {
        return "(" + this.f28316b + " only " + ((Object) q3.b(this.f28317c)) + ')';
    }
}
