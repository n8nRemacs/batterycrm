package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.unit.y;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/g;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/ui/unit/y;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "Lkotlin/w;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/layout/a;JJLY41/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitElement extends AbstractC22430p0<C20569g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC22348a f28201b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28202c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28203d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28204e;

    public AlignmentLineOffsetTextUnitElement() {
        throw null;
    }

    public AlignmentLineOffsetTextUnitElement(AbstractC22348a abstractC22348a, long j12, long j13, Y41.l lVar, C42822w c42822w) {
        this.f28201b = abstractC22348a;
        this.f28202c = j12;
        this.f28203d = j13;
        this.f28204e = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C20569g(this.f28201b, this.f28202c, this.f28203d, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20569g c20569g = (C20569g) dVar;
        c20569g.f28624p = this.f28201b;
        c20569g.f28625q = this.f28202c;
        c20569g.f28626r = this.f28203d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null;
        if (alignmentLineOffsetTextUnitElement == null) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f28201b, alignmentLineOffsetTextUnitElement.f28201b) && androidx.compose.ui.unit.y.b(this.f28202c, alignmentLineOffsetTextUnitElement.f28202c) && androidx.compose.ui.unit.y.b(this.f28203d, alignmentLineOffsetTextUnitElement.f28203d);
    }

    public final int hashCode() {
        int iHashCode = this.f28201b.hashCode() * 31;
        y.a aVar = androidx.compose.ui.unit.y.f42874b;
        return Long.hashCode(this.f28203d) + androidx.appcompat.app.r.g(iHashCode, 31, this.f28202c);
    }
}
