package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Zh extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.layout.Z0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f35999l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36000m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36001n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ad f36002o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f36003p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.q<List<Jh>, androidx.compose.runtime.A, Integer, kotlin.G0> f36004q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Zh(float f12, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar2, Ad ad2, int i12, Y41.q<? super List<Jh>, ? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> qVar) {
        super(2);
        this.f35999l = f12;
        this.f36000m = pVar;
        this.f36001n = pVar2;
        this.f36002o = ad2;
        this.f36003p = i12;
        this.f36004q = qVar;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(androidx.compose.ui.layout.Z0 z02, C22712b c22712b) {
        androidx.compose.ui.layout.Z0 z03 = z02;
        long j12 = c22712b.f42843a;
        int iY02 = z03.y0(C21891ti.f37349a);
        int iY03 = z03.y0(this.f35999l);
        List<InterfaceC22363h0> listH0 = z03.h0(EnumC21913ui.f37437b, this.f36000m);
        Integer numValueOf = 0;
        int size = listH0.size();
        for (int i12 = 0; i12 < size; i12++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listH0.get(i12).R(Integer.MAX_VALUE)));
        }
        int iIntValue = numValueOf.intValue();
        long jC2 = C22712b.c(j12, iY02, 0, iIntValue, iIntValue, 2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = listH0.size();
        int i13 = 0;
        while (i13 < size2) {
            InterfaceC22363h0 interfaceC22363h0 = listH0.get(i13);
            androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(jC2);
            float fJ2 = z03.J(Math.min(interfaceC22363h0.b0(k0I.f40346c), k0I.f40345b));
            List<InterfaceC22363h0> list = listH0;
            float f12 = Ih.f34894c * 2;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            arrayList.add(k0I);
            arrayList2.add(androidx.compose.ui.unit.h.a(fJ2 - f12));
            i13++;
            listH0 = list;
            jC2 = jC2;
        }
        Integer numValueOf2 = Integer.valueOf(2 * iY03);
        int size3 = arrayList.size();
        for (int i14 = 0; i14 < size3; i14++) {
            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((androidx.compose.ui.layout.K0) arrayList.get(i14)).f40345b);
        }
        int iIntValue2 = numValueOf2.intValue();
        return z03.L0(iIntValue2, iIntValue, kotlin.collections.P0.c(), new Yh(iY03, arrayList, z03, this.f36001n, this.f36002o, this.f36003p, arrayList2, j12, iIntValue2, iIntValue, this.f36004q));
    }
}
