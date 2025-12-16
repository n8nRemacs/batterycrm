package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import d0.C39453b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Badge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class K0 implements InterfaceC22365i0 {

    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f34976l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f34977m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f34978n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f34979o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f34980p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f34981q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f34982r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, InterfaceC22369k0 interfaceC22369k0, androidx.compose.ui.layout.K0 k03, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, InterfaceC22192v1 interfaceC22192v13, InterfaceC22192v1 interfaceC22192v14) {
            super(1);
            this.f34976l = k02;
            this.f34977m = interfaceC22369k0;
            this.f34978n = k03;
            this.f34979o = interfaceC22192v1;
            this.f34980p = interfaceC22192v12;
            this.f34981q = interfaceC22192v13;
            this.f34982r = interfaceC22192v14;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            androidx.compose.ui.layout.K0 k02 = this.f34976l;
            int i12 = k02.f40345b;
            C39453b.f393339a.getClass();
            float f12 = C39453b.f393340b;
            InterfaceC22369k0 interfaceC22369k0 = this.f34977m;
            boolean z12 = i12 > interfaceC22369k0.y0(f12);
            float f13 = z12 ? M0.f35092a : M0.f35094c;
            float f14 = z12 ? M0.f35093b : M0.f35094c;
            androidx.compose.ui.layout.K0 k03 = this.f34978n;
            aVar2.h(k03, 0, 0, 0.0f);
            int iY02 = interfaceC22369k0.y0(f13) + k03.f40345b;
            int iY03 = interfaceC22369k0.y0(f14) + ((-k02.f40346c) / 2);
            float f15 = this.f34979o.f() + iY03;
            float f16 = this.f34981q.f() - ((this.f34980p.f() + iY02) + k02.f40345b);
            float f17 = f15 - this.f34982r.f();
            if (f16 < 0.0f) {
                iY02 += kotlin.math.b.b(f16);
            }
            if (f17 < 0.0f) {
                iY03 -= kotlin.math.b.b(f17);
            }
            aVar2.h(k02, iY02, iY03, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC22363h0 interfaceC22363h0 = list.get(i12);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "badge")) {
                androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22712b.c(j12, 0, 0, 0, 0, 11));
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    InterfaceC22363h0 interfaceC22363h02 = list.get(i13);
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "anchor")) {
                        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h02.I(j12);
                        C22387u c22387u = C22350b.f40439a;
                        int iD02 = k0I2.d0(c22387u);
                        C22387u c22387u2 = C22350b.f40440b;
                        return interfaceC22369k0.L0(k0I2.f40345b, k0I2.f40346c, kotlin.collections.P0.g(new kotlin.Q(c22387u, Integer.valueOf(iD02)), new kotlin.Q(c22387u2, Integer.valueOf(k0I2.d0(c22387u2)))), new a(k0I, interfaceC22369k0, k0I2, null, null, null, null));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
