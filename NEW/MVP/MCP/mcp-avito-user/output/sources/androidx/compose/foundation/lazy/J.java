package androidx.compose.foundation.lazy;

import androidx.compose.foundation.W0;
import androidx.compose.foundation.lazy.layout.AbstractC20735o;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyListIntervalContent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/J;", "Landroidx/compose/foundation/lazy/layout/o;", "Landroidx/compose/foundation/lazy/E;", "Landroidx/compose/foundation/lazy/m0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@W0
/* loaded from: classes.dex */
public final class J extends AbstractC20735o<E> implements m0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.C0<E> f28823a = new androidx.compose.foundation.lazy.layout.C0<>();

    public J(@Y61.k Y41.l<? super m0, G0> lVar) {
        lVar.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.m0
    public final void a(int i12, @Y61.l Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k C22096n c22096n) {
        this.f28823a.a(i12, new E(lVar, lVar2, c22096n));
    }

    @Override // androidx.compose.foundation.lazy.m0
    public final void c(@Y61.l String str, @Y61.l String str2, @Y61.k Y41.q qVar) {
        this.f28823a.a(1, new E(str != null ? new F(str) : null, new G(str2), new C22096n(-1010194746, new H(qVar), true)));
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC20735o
    /* renamed from: h, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.C0 getF28823a() {
        return this.f28823a;
    }
}
