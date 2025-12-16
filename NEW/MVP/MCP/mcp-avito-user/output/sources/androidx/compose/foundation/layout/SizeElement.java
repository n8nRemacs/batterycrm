package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BP\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/o2;", "Landroidx/compose/ui/unit/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "Lkotlin/w;", "inspectorInfo", "<init>", "(FFFFZLY41/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends AbstractC22430p0<C20604o2> {

    /* renamed from: b, reason: collision with root package name */
    public final float f28505b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28506c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28507d;

    /* renamed from: e, reason: collision with root package name */
    public final float f28508e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28509f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28510g;

    public SizeElement() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SizeElement(float f12, float f13, float f14, float f15, boolean z12, Y41.l lVar, int i12, C42822w c42822w) {
        float f16;
        float f17;
        float f18;
        float f19;
        if ((i12 & 1) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f16 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f16 = f12;
        }
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f17 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f17 = f13;
        }
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f18 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f18 = f14;
        }
        if ((i12 & 8) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f19 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f19 = f15;
        }
        this(f16, f17, f18, f19, z12, lVar, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C20604o2(this.f28505b, this.f28506c, this.f28507d, this.f28508e, this.f28509f, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20604o2 c20604o2 = (C20604o2) dVar;
        c20604o2.f28695p = this.f28505b;
        c20604o2.f28696q = this.f28506c;
        c20604o2.f28697r = this.f28507d;
        c20604o2.f28698s = this.f28508e;
        c20604o2.f28699t = this.f28509f;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return androidx.compose.ui.unit.h.b(this.f28505b, sizeElement.f28505b) && androidx.compose.ui.unit.h.b(this.f28506c, sizeElement.f28506c) && androidx.compose.ui.unit.h.b(this.f28507d, sizeElement.f28507d) && androidx.compose.ui.unit.h.b(this.f28508e, sizeElement.f28508e) && this.f28509f == sizeElement.f28509f;
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Boolean.hashCode(this.f28509f) + androidx.appcompat.app.r.d(this.f28508e, androidx.appcompat.app.r.d(this.f28507d, androidx.appcompat.app.r.d(this.f28506c, Float.hashCode(this.f28505b) * 31, 31), 31), 31);
    }

    public SizeElement(float f12, float f13, float f14, float f15, boolean z12, Y41.l lVar, C42822w c42822w) {
        this.f28505b = f12;
        this.f28506c = f13;
        this.f28507d = f14;
        this.f28508e = f15;
        this.f28509f = z12;
        this.f28510g = lVar;
    }
}
