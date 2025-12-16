package androidx.compose.foundation.shape;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.platform.InterfaceC22531u1;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CornerSize.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/shape/j;", "Landroidx/compose/foundation/shape/f;", "Landroidx/compose/ui/platform/u1;", "Landroidx/compose/ui/unit/h;", "size", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class j implements f, InterfaceC22531u1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f30151b;

    public j(float f12, C42822w c42822w) {
        this.f30151b = f12;
    }

    @Override // androidx.compose.foundation.shape.f
    public final float a(long j12, @Y61.k androidx.compose.ui.unit.d dVar) {
        return dVar.M0(this.f30151b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && androidx.compose.ui.unit.h.b(this.f30151b, ((j) obj).f30151b);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f30151b);
    }

    @Y61.k
    public final String toString() {
        return G.d(this.f30151b, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}
