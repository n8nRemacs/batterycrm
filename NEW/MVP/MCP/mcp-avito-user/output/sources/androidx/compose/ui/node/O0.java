package androidx.compose.ui.node;

import androidx.compose.ui.layout.InterfaceC22367j0;
import kotlin.Metadata;

/* compiled from: LookaheadDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/O0;", "Landroidx/compose/ui/node/K0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class O0 implements K0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22367j0 f40669b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final X f40670c;

    public O0(@Y61.k InterfaceC22367j0 interfaceC22367j0, @Y61.k X x12) {
        this.f40669b = interfaceC22367j0;
        this.f40670c = x12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        return kotlin.jvm.internal.L.f(this.f40669b, o02.f40669b) && kotlin.jvm.internal.L.f(this.f40670c, o02.f40670c);
    }

    public final int hashCode() {
        return this.f40670c.hashCode() + (this.f40669b.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.K0
    public final boolean n1() {
        return this.f40670c.v0().m();
    }

    @Y61.k
    public final String toString() {
        return "PlaceableResult(result=" + this.f40669b + ", placeable=" + this.f40670c + ')';
    }
}
