package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.R0;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LazyItemScopeImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/z;", "Landroidx/compose/foundation/lazy/y;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20794z implements InterfaceC20793y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29757a = U2.a(Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29758b = U2.a(Integer.MAX_VALUE);

    @Override // androidx.compose.foundation.lazy.InterfaceC20793y
    @Y61.k
    public final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar) {
        return vVar.d0(new ParentSizeElement(1.0f, null, this.f29758b, "fillParentMaxHeight", 2, null));
    }

    @Override // androidx.compose.foundation.lazy.InterfaceC20793y
    @Y61.k
    public final androidx.compose.ui.v c(@Y61.k androidx.compose.ui.v vVar) {
        return vVar.d0(new ParentSizeElement(1.0f, this.f29757a, null, "fillParentMaxWidth", 4, null));
    }

    @Override // androidx.compose.foundation.lazy.InterfaceC20793y
    @Y61.k
    public final androidx.compose.ui.v d(@Y61.k androidx.compose.ui.v vVar, @Y61.l R0 r02, @Y61.l R0 r03, @Y61.l R0 r04) {
        return vVar.d0(new LazyLayoutAnimateItemElement(r02, r03, r04));
    }

    @Override // androidx.compose.foundation.lazy.InterfaceC20793y
    @Y61.k
    public final androidx.compose.ui.v e(@Y61.k v.a aVar) {
        ParentSizeElement parentSizeElement = new ParentSizeElement(1.0f, this.f29757a, this.f29758b);
        aVar.getClass();
        return parentSizeElement;
    }
}
