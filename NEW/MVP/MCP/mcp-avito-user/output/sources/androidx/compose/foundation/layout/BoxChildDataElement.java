package androidx.compose.foundation.layout;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/v;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class BoxChildDataElement extends AbstractC22430p0<C20628v> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22215f f28213b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28214c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28215d;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(@Y61.k InterfaceC22215f interfaceC22215f, boolean z12, @Y61.k Y41.l<? super C22547y1, kotlin.G0> lVar) {
        this.f28213b = interfaceC22215f;
        this.f28214c = z12;
        this.f28215d = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20628v c20628v = new C20628v();
        c20628v.f28752p = this.f28213b;
        c20628v.f28753q = this.f28214c;
        return c20628v;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20628v c20628v = (C20628v) dVar;
        c20628v.f28752p = this.f28213b;
        c20628v.f28753q = this.f28214c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f28213b, boxChildDataElement.f28213b) && this.f28214c == boxChildDataElement.f28214c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28214c) + (this.f28213b.hashCode() * 31);
    }
}
