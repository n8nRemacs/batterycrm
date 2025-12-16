package androidx.compose.material3;

import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.C43259k;

/* compiled from: TabRow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Yh extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f35918l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35919m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.Z0 f35920n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35921o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ad f35922p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f35923q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35924r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f35925s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f35926t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f35927u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.q<List<Jh>, androidx.compose.runtime.A, Integer, kotlin.G0> f35928v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yh(int i12, ArrayList arrayList, androidx.compose.ui.layout.Z0 z02, Y41.p pVar, Ad ad2, int i13, ArrayList arrayList2, long j12, int i14, int i15, Y41.q qVar) {
        super(1);
        this.f35918l = i12;
        this.f35919m = arrayList;
        this.f35920n = z02;
        this.f35921o = pVar;
        this.f35922p = ad2;
        this.f35923q = i13;
        this.f35924r = arrayList2;
        this.f35925s = j12;
        this.f35926t = i14;
        this.f35927u = i15;
        this.f35928v = qVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        androidx.compose.ui.layout.Z0 z02;
        int i12;
        K0.a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f35919m;
        int size = arrayList2.size();
        int i13 = this.f35918l;
        int i14 = 0;
        int i15 = i13;
        while (true) {
            z02 = this.f35920n;
            if (i14 >= size) {
                break;
            }
            androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) arrayList2.get(i14);
            aVar2.h(k02, i15, 0, 0.0f);
            arrayList.add(new Jh(z02.J(i15), z02.J(k02.f40345b), ((androidx.compose.ui.unit.h) this.f35924r.get(i14)).f42852b, null));
            i15 += k02.f40345b;
            i14++;
        }
        List<InterfaceC22363h0> listH0 = z02.h0(EnumC21913ui.f37438c, this.f35921o);
        int size2 = listH0.size();
        int i16 = 0;
        while (true) {
            i12 = this.f35927u;
            if (i16 >= size2) {
                break;
            }
            InterfaceC22363h0 interfaceC22363h0 = listH0.get(i16);
            int i17 = this.f35926t;
            androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22712b.c(this.f35925s, i17, i17, 0, 0, 8));
            aVar2.h(k0I, 0, i12 - k0I.f40346c, 0.0f);
            i16++;
        }
        List<InterfaceC22363h0> listH02 = z02.h0(EnumC21913ui.f37439d, new C22096n(358596038, new Xh(this.f35928v, arrayList), true));
        int size3 = listH02.size();
        for (int i18 = 0; i18 < size3; i18++) {
            InterfaceC22363h0 interfaceC22363h02 = listH02.get(i18);
            C22712b.f42842b.getClass();
            aVar2.h(interfaceC22363h02.I(C22712b.a.c(this.f35926t, i12)), 0, 0, 0.0f);
        }
        Ad ad2 = this.f35922p;
        Integer num = ad2.f34510c;
        int i19 = this.f35923q;
        if (num == null || num.intValue() != i19) {
            ad2.f34510c = Integer.valueOf(i19);
            Jh jh2 = (Jh) C42745f0.K(i19, arrayList);
            if (jh2 != null) {
                Jh jh3 = (Jh) C42745f0.Q(arrayList);
                float f12 = jh3.f34964a + jh3.f34965b;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                int iY02 = z02.y0(f12) + i13;
                androidx.compose.foundation.d2 d2Var = ad2.f34508a;
                int iG2 = iY02 - d2Var.g();
                int iY03 = z02.y0(jh2.f34964a) - ((iG2 / 2) - (z02.y0(jh2.f34965b) / 2));
                int i22 = iY02 - iG2;
                if (i22 < 0) {
                    i22 = 0;
                }
                int iG3 = kotlin.ranges.s.g(iY03, 0, i22);
                if (((C22061e3) d2Var.f27081a).e() != iG3) {
                    C43259k.d(ad2.f34509b, null, null, new C22018zd(ad2, iG3, null), 3);
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
