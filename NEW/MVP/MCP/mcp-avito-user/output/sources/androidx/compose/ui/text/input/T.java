package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/T;", "Landroidx/compose/ui/text/input/k;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T implements InterfaceC22645k {

    /* renamed from: a, reason: collision with root package name */
    public final int f42375a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42376b;

    public T(int i12, int i13) {
        this.f42375a = i12;
        this.f42376b = i13;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        if (c22649o.e()) {
            c22649o.f42461d = -1;
            c22649o.f42462e = -1;
        }
        M m12 = c22649o.f42458a;
        int iG2 = kotlin.ranges.s.g(this.f42375a, 0, m12.a());
        int iG3 = kotlin.ranges.s.g(this.f42376b, 0, m12.a());
        if (iG2 != iG3) {
            if (iG2 < iG3) {
                c22649o.g(iG2, iG3);
            } else {
                c22649o.g(iG3, iG2);
            }
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t12 = (T) obj;
        return this.f42375a == t12.f42375a && this.f42376b == t12.f42376b;
    }

    public final int hashCode() {
        return (this.f42375a * 31) + this.f42376b;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f42375a);
        sb2.append(", end=");
        return androidx.appcompat.app.r.t(sb2, this.f42376b, ')');
    }
}
