package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.L;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.F;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;

/* compiled from: BringIntoViewResponder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/relocation/l;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/relocation/a;", "Landroidx/compose/ui/node/F;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l extends v.d implements androidx.compose.ui.relocation.a, F {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public L f30096p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30097q;

    public l(@Y61.k L l12) {
        this.f30096p = l12;
    }

    public static final l0.j k2(l lVar, AbstractC22443w0 abstractC22443w0, Y41.a aVar) {
        l0.j jVar;
        if (!lVar.f42893o || !lVar.f30097q) {
            return null;
        }
        AbstractC22443w0 abstractC22443w0F = C22421l.f(lVar);
        if (!abstractC22443w0.j1().f42893o) {
            abstractC22443w0 = null;
        }
        if (abstractC22443w0 == null || (jVar = (l0.j) aVar.invoke()) == null) {
            return null;
        }
        return jVar.n(abstractC22443w0F.P(abstractC22443w0, false).i());
    }

    @Override // androidx.compose.ui.node.F
    public final void D(@Y61.k A a12) {
        this.f30097q = true;
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.relocation.a
    @Y61.l
    public final Object i0(@Y61.k AbstractC22443w0 abstractC22443w0, @Y61.k Y41.a aVar, @Y61.k ContinuationImpl continuationImpl) {
        Object objC = U.c(new j(this, abstractC22443w0, aVar, new k(this, abstractC22443w0, aVar), null), continuationImpl);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }
}
