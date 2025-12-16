package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BackdropScaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class C0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.layout.Z0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f32458l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C22712b, C22712b> f32459m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f32460n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(C22096n c22096n, Y41.l lVar, C22096n c22096n2) {
        super(2);
        this.f32458l = c22096n;
        this.f32459m = lVar;
        this.f32460n = c22096n2;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(androidx.compose.ui.layout.Z0 z02, C22712b c22712b) {
        androidx.compose.ui.layout.Z0 z03 = z02;
        long j12 = c22712b.f42843a;
        androidx.compose.ui.layout.K0 k0I = ((InterfaceC22363h0) C42745f0.E(z03.h0(EnumC21098a0.f33395b, this.f32458l))).I(this.f32459m.invoke(C22712b.a(j12)).f42843a);
        List<InterfaceC22363h0> listH0 = z03.h0(EnumC21098a0.f33396c, new C22096n(-1222642649, new B0(this.f32460n, j12, k0I.f40346c), true));
        ArrayList arrayList = new ArrayList(listH0.size());
        int size = listH0.size();
        for (int iF2 = 0; iF2 < size; iF2 = androidx.compose.foundation.H.f(listH0.get(iF2), j12, arrayList, iF2, 1)) {
        }
        int iMax = Math.max(C22712b.l(j12), k0I.f40345b);
        int iMax2 = Math.max(C22712b.k(j12), k0I.f40346c);
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) arrayList.get(i12);
            iMax = Math.max(iMax, k02.f40345b);
            iMax2 = Math.max(iMax2, k02.f40346c);
        }
        return z03.L0(iMax, iMax2, kotlin.collections.P0.c(), new A0(k0I, arrayList));
    }
}
