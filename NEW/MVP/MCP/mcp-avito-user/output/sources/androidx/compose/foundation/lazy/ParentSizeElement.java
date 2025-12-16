package androidx.compose.foundation.lazy;

import androidx.compose.runtime.I3;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/lazy/E0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParentSizeElement extends AbstractC22430p0<E0> {

    /* renamed from: b, reason: collision with root package name */
    public final float f28831b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final I3<Integer> f28832c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final I3<Integer> f28833d;

    public /* synthetic */ ParentSizeElement(float f12, I3 i32, I3 i33, String str, int i12, C42822w c42822w) {
        this(f12, (i12 & 2) != 0 ? null : i32, (i12 & 4) != 0 ? null : i33);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new E0(this.f28831b, this.f28832c, this.f28833d);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        E0 e02 = (E0) dVar;
        e02.f28816p = this.f28831b;
        e02.f28817q = this.f28832c;
        e02.f28818r = this.f28833d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f28831b == parentSizeElement.f28831b && kotlin.jvm.internal.L.f(this.f28832c, parentSizeElement.f28832c) && kotlin.jvm.internal.L.f(this.f28833d, parentSizeElement.f28833d);
    }

    public final int hashCode() {
        I3<Integer> i32 = this.f28832c;
        int iHashCode = (i32 != null ? i32.hashCode() : 0) * 31;
        I3<Integer> i33 = this.f28833d;
        return Float.hashCode(this.f28831b) + ((iHashCode + (i33 != null ? i33.hashCode() : 0)) * 31);
    }

    public ParentSizeElement(float f12, @Y61.l I3 i32, @Y61.l I3 i33) {
        this.f28831b = f12;
        this.f28832c = i32;
        this.f28833d = i33;
    }
}
