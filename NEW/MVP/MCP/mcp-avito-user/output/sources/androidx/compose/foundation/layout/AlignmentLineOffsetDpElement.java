package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AlignmentLine.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/f;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/ui/unit/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "Lkotlin/w;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/layout/a;FFLY41/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends AbstractC22430p0<C20565f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC22348a f28197b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28198c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28199d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28200e;

    public AlignmentLineOffsetDpElement() {
        throw null;
    }

    public AlignmentLineOffsetDpElement(AbstractC22348a abstractC22348a, float f12, float f13, Y41.l lVar, C42822w c42822w) {
        this.f28197b = abstractC22348a;
        this.f28198c = f12;
        this.f28199d = f13;
        this.f28200e = lVar;
        boolean z12 = true;
        boolean z13 = f12 >= 0.0f || Float.isNaN(f12);
        if (f13 < 0.0f && !Float.isNaN(f13)) {
            z12 = false;
        }
        if (!z13 || !z12) {
            N.a.a("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C20565f(this.f28197b, this.f28198c, this.f28199d, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20565f c20565f = (C20565f) dVar;
        c20565f.f28602p = this.f28197b;
        c20565f.f28603q = this.f28198c;
        c20565f.f28604r = this.f28199d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f28197b, alignmentLineOffsetDpElement.f28197b) && androidx.compose.ui.unit.h.b(this.f28198c, alignmentLineOffsetDpElement.f28198c) && androidx.compose.ui.unit.h.b(this.f28199d, alignmentLineOffsetDpElement.f28199d);
    }

    public final int hashCode() {
        int iHashCode = this.f28197b.hashCode() * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f28199d) + androidx.appcompat.app.r.d(this.f28198c, iHashCode, 31);
    }
}
