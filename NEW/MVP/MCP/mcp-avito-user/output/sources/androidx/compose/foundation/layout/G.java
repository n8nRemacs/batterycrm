package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BoxWithConstraints.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/G;", "Landroidx/compose/foundation/layout/F;", "Landroidx/compose/foundation/layout/y;", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(Landroidx/compose/ui/unit/d;JLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class G implements F, InterfaceC20640y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f28269a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C20644z f28271c = C20644z.f28804a;

    public G(androidx.compose.ui.unit.d dVar, long j12, C42822w c42822w) {
        this.f28269a = dVar;
        this.f28270b = j12;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20640y
    @F3
    @Y61.k
    public final androidx.compose.ui.v b(@Y61.k v.a aVar) {
        return this.f28271c.b(aVar);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20640y
    @F3
    @Y61.k
    public final androidx.compose.ui.v d(@Y61.k androidx.compose.ui.v vVar, @Y61.k InterfaceC22215f interfaceC22215f) {
        return this.f28271c.d(vVar, interfaceC22215f);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g12 = (G) obj;
        return kotlin.jvm.internal.L.f(this.f28269a, g12.f28269a) && C22712b.d(this.f28270b, g12.f28270b);
    }

    @Override // androidx.compose.foundation.layout.F
    /* renamed from: f, reason: from getter */
    public final long getF28270b() {
        return this.f28270b;
    }

    @Override // androidx.compose.foundation.layout.F
    public final float g() {
        long j12 = this.f28270b;
        if (C22712b.e(j12)) {
            return this.f28269a.J(C22712b.i(j12));
        }
        androidx.compose.ui.unit.h.f42849c.getClass();
        return androidx.compose.ui.unit.h.f42850d;
    }

    @Override // androidx.compose.foundation.layout.F
    public final float h() {
        long j12 = this.f28270b;
        if (C22712b.f(j12)) {
            return this.f28269a.J(C22712b.j(j12));
        }
        androidx.compose.ui.unit.h.f42849c.getClass();
        return androidx.compose.ui.unit.h.f42850d;
    }

    public final int hashCode() {
        int iHashCode = this.f28269a.hashCode() * 31;
        C22712b.a aVar = C22712b.f42842b;
        return Long.hashCode(this.f28270b) + iHashCode;
    }

    @Y61.k
    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f28269a + ", constraints=" + ((Object) C22712b.n(this.f28270b)) + ')';
    }
}
