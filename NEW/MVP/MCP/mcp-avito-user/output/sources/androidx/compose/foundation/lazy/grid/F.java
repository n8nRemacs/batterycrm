package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LazyGridDsl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/grid/E0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/d;J)Landroidx/compose/foundation/lazy/grid/E0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class F extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.unit.d, C22712b, E0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20662b f28989l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20585k.m f28990m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(InterfaceC20662b interfaceC20662b, C20585k.m mVar) {
        super(2);
        this.f28989l = interfaceC20662b;
        this.f28990m = mVar;
    }

    @Override // Y41.p
    public final E0 invoke(androidx.compose.ui.unit.d dVar, C22712b c22712b) {
        androidx.compose.ui.unit.d dVar2 = dVar;
        long j12 = c22712b.f42843a;
        if (C22712b.i(j12) == Integer.MAX_VALUE) {
            androidx.compose.foundation.internal.e.a("LazyHorizontalGrid's height should be bound by parent.");
        }
        int i12 = C22712b.i(j12);
        C20585k.m mVar = this.f28990m;
        int[] iArrL0 = C42745f0.L0(this.f28989l.a(dVar2, i12, dVar2.y0(mVar.a())));
        int[] iArr = new int[iArrL0.length];
        mVar.c(dVar2, i12, iArrL0, iArr);
        return new E0(iArrL0, iArr);
    }
}
