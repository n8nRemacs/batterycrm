package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/V;", "Landroidx/compose/ui/text/input/k;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V implements InterfaceC22645k {

    /* renamed from: a, reason: collision with root package name */
    public final int f42379a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42380b;

    public V(int i12, int i13) {
        this.f42379a = i12;
        this.f42380b = i13;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        int iG2 = kotlin.ranges.s.g(this.f42379a, 0, c22649o.f42458a.a());
        int iG3 = kotlin.ranges.s.g(this.f42380b, 0, c22649o.f42458a.a());
        if (iG2 < iG3) {
            c22649o.h(iG2, iG3);
        } else {
            c22649o.h(iG3, iG2);
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v12 = (V) obj;
        return this.f42379a == v12.f42379a && this.f42380b == v12.f42380b;
    }

    public final int hashCode() {
        return (this.f42379a * 31) + this.f42380b;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f42379a);
        sb2.append(", end=");
        return androidx.appcompat.app.r.t(sb2, this.f42380b, ')');
    }
}
