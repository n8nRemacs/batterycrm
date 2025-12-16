package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.I3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentedControl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m extends N implements Y41.p<Z0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I3<s> f62577l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f62578m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62579n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f62580o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f62581p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(I3 i32, z zVar, boolean z12, int i12, C22096n c22096n) {
        super(2);
        this.f62577l = i32;
        this.f62578m = zVar;
        this.f62579n = z12;
        this.f62580o = i12;
        this.f62581p = c22096n;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(Z0 z02, C22712b c22712b) {
        Z0 z03 = z02;
        long j12 = c22712b.f42843a;
        I3<s> i32 = this.f62577l;
        int size = i32.getF42167b().f62590a.size();
        l0.f fVar = new l0.f();
        l0.f fVar2 = new l0.f();
        int iJ2 = C22712b.j(j12) / size;
        long jC2 = C22712b.c(j12, iJ2, iJ2, 0, 0, 12);
        List<InterfaceC22363h0> listH0 = z03.h0(y.f62604b, new C22096n(1692048684, new l(i32, this.f62578m, this.f62579n, this.f62580o), true));
        ArrayList arrayList = new ArrayList(listH0.size());
        int size2 = listH0.size();
        for (int i12 = 0; i12 < size2; i12++) {
            K0 k0I = listH0.get(i12).I(jC2);
            fVar.f406840b += k0I.f40345b;
            fVar2.f406840b = Math.max(fVar2.f406840b, k0I.f40346c);
            arrayList.add(k0I);
        }
        return z03.L0(fVar.f406840b, fVar2.f406840b, P0.c(), new k(arrayList, fVar, iJ2, z03, this.f62580o, this.f62581p, fVar2));
    }
}
