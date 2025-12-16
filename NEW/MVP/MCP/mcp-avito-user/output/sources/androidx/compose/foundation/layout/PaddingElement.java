package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Padding.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BP\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/S1;", "Landroidx/compose/ui/unit/h;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "Lkotlin/w;", "inspectorInfo", "<init>", "(FFFFZLY41/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingElement extends AbstractC22430p0<S1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f28467b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28468c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28469d;

    /* renamed from: e, reason: collision with root package name */
    public final float f28470e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28471f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28472g;

    public PaddingElement() {
        throw null;
    }

    public PaddingElement(float f12, float f13, float f14, float f15, boolean z12, Y41.l lVar, C42822w c42822w) {
        this.f28467b = f12;
        this.f28468c = f13;
        this.f28469d = f14;
        this.f28470e = f15;
        this.f28471f = z12;
        this.f28472g = lVar;
        boolean z13 = true;
        boolean z14 = (f12 >= 0.0f || Float.isNaN(f12)) & (f13 >= 0.0f || Float.isNaN(f13)) & (f14 >= 0.0f || Float.isNaN(f14));
        if (f15 < 0.0f && !Float.isNaN(f15)) {
            z13 = false;
        }
        if (!z14 || !z13) {
            N.a.a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new S1(this.f28467b, this.f28468c, this.f28469d, this.f28470e, this.f28471f, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        S1 s12 = (S1) dVar;
        s12.f28497p = this.f28467b;
        s12.f28498q = this.f28468c;
        s12.f28499r = this.f28469d;
        s12.f28500s = this.f28470e;
        s12.f28501t = this.f28471f;
    }

    public final boolean equals(@Y61.l Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && androidx.compose.ui.unit.h.b(this.f28467b, paddingElement.f28467b) && androidx.compose.ui.unit.h.b(this.f28468c, paddingElement.f28468c) && androidx.compose.ui.unit.h.b(this.f28469d, paddingElement.f28469d) && androidx.compose.ui.unit.h.b(this.f28470e, paddingElement.f28470e) && this.f28471f == paddingElement.f28471f;
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Boolean.hashCode(this.f28471f) + androidx.appcompat.app.r.d(this.f28470e, androidx.appcompat.app.r.d(this.f28469d, androidx.appcompat.app.r.d(this.f28468c, Float.hashCode(this.f28467b) * 31, 31), 31), 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaddingElement(float f12, float f13, float f14, float f15, boolean z12, Y41.l lVar, int i12, C42822w c42822w) {
        float f16;
        float f17;
        float f18;
        float f19;
        if ((i12 & 1) != 0) {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            f16 = 0;
        } else {
            f16 = f12;
        }
        if ((i12 & 2) != 0) {
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            f17 = 0;
        } else {
            f17 = f13;
        }
        if ((i12 & 4) != 0) {
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            f18 = 0;
        } else {
            f18 = f14;
        }
        if ((i12 & 8) != 0) {
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            f19 = 0;
        } else {
            f19 = f15;
        }
        this(f16, f17, f18, f19, z12, lVar, null);
    }
}
