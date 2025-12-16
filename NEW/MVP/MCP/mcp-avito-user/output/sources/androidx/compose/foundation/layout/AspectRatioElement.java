package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AspectRatio.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/u;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AspectRatioElement extends AbstractC22430p0<C20624u> {

    /* renamed from: b, reason: collision with root package name */
    public final float f28205b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28206c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28207d;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f12, boolean z12, @Y61.k Y41.l<? super C22547y1, kotlin.G0> lVar) {
        this.f28205b = f12;
        this.f28206c = z12;
        this.f28207d = lVar;
        if (f12 > 0.0f) {
            return;
        }
        N.a.a("aspectRatio " + f12 + " must be > 0");
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20624u c20624u = new C20624u();
        c20624u.f28742p = this.f28205b;
        c20624u.f28743q = this.f28206c;
        return c20624u;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20624u c20624u = (C20624u) dVar;
        c20624u.f28742p = this.f28205b;
        c20624u.f28743q = this.f28206c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.f28205b == aspectRatioElement.f28205b) {
            if (this.f28206c == ((AspectRatioElement) obj).f28206c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28206c) + (Float.hashCode(this.f28205b) * 31);
    }
}
