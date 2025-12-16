package androidx.compose.foundation.shape;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.platform.InterfaceC22531u1;
import j.InterfaceC42167x;
import kotlin.Metadata;

/* compiled from: CornerSize.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/shape/l;", "Landroidx/compose/foundation/shape/f;", "Landroidx/compose/ui/platform/u1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class l implements f, InterfaceC22531u1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f30152b;

    public l(@InterfaceC42167x float f12) {
        this.f30152b = f12;
        if (f12 < 0.0f || f12 > 100.0f) {
            androidx.compose.foundation.internal.e.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // androidx.compose.foundation.shape.f
    public final float a(long j12, @Y61.k androidx.compose.ui.unit.d dVar) {
        return (this.f30152b / 100.0f) * l0.n.d(j12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f30152b, ((l) obj).f30152b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30152b);
    }

    @Y61.k
    public final String toString() {
        return G.d(this.f30152b, "%)", new StringBuilder("CornerSize(size = "));
    }
}
