package androidx.compose.material3;

import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21798pg implements InterfaceC22365i0 {

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.pg$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37065l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f37066m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37067n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f37068o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f37069p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37070q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f37071r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f37072s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, int i12, androidx.compose.ui.layout.K0 k03, int i13, int i14, androidx.compose.ui.layout.K0 k04, int i15, int i16) {
            super(1);
            this.f37065l = k02;
            this.f37066m = i12;
            this.f37067n = k03;
            this.f37068o = i13;
            this.f37069p = i14;
            this.f37070q = k04;
            this.f37071r = i15;
            this.f37072s = i16;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            aVar2.h(this.f37065l, 0, this.f37066m, 0.0f);
            androidx.compose.ui.layout.K0 k02 = this.f37067n;
            if (k02 != null) {
                aVar2.h(k02, this.f37068o, this.f37069p, 0.0f);
            }
            androidx.compose.ui.layout.K0 k03 = this.f37070q;
            if (k03 != null) {
                aVar2.h(k03, this.f37071r, this.f37072s, 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        InterfaceC22363h0 interfaceC22363h0;
        InterfaceC22363h0 interfaceC22363h02;
        int iMax;
        int i12;
        int i13;
        int iD02;
        List<? extends InterfaceC22363h0> list2 = list;
        int iMin = Math.min(C22712b.j(j12), interfaceC22369k0.y0(Bg.f34564a));
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                interfaceC22363h0 = null;
                break;
            }
            interfaceC22363h0 = list2.get(i14);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "action")) {
                break;
            }
            i14++;
        }
        InterfaceC22363h0 interfaceC22363h03 = interfaceC22363h0;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h03 != null ? interfaceC22363h03.I(j12) : null;
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                interfaceC22363h02 = null;
                break;
            }
            interfaceC22363h02 = list2.get(i15);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "dismissAction")) {
                break;
            }
            i15++;
        }
        InterfaceC22363h0 interfaceC22363h04 = interfaceC22363h02;
        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h04 != null ? interfaceC22363h04.I(j12) : null;
        int i16 = k0I != null ? k0I.f40345b : 0;
        int i17 = k0I != null ? k0I.f40346c : 0;
        int i18 = k0I2 != null ? k0I2.f40345b : 0;
        int i19 = k0I2 != null ? k0I2.f40346c : 0;
        int iY02 = ((iMin - i16) - i18) - (i18 == 0 ? interfaceC22369k0.y0(Bg.f34570g) : 0);
        int iL2 = C22712b.l(j12);
        if (iY02 >= iL2) {
            iL2 = iY02;
        }
        int size3 = list.size();
        int i22 = 0;
        while (i22 < size3) {
            InterfaceC22363h0 interfaceC22363h05 = list2.get(i22);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h05), "text")) {
                androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h05.I(C22712b.c(j12, 0, iL2, 0, 0, 9));
                C22387u c22387u = C22350b.f40439a;
                int iD03 = k0I3.d0(c22387u);
                if (iD03 == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("No baselines for text");
                }
                int iD04 = k0I3.d0(C22350b.f40440b);
                if (iD04 == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("No baselines for text");
                }
                boolean z12 = iD03 == iD04;
                int i23 = iMin - i18;
                int i24 = i23 - i16;
                if (z12) {
                    d0.d0.f393369a.getClass();
                    iMax = Math.max(interfaceC22369k0.y0(d0.d0.f393378j), Math.max(i17, i19));
                    int i25 = (iMax - k0I3.f40346c) / 2;
                    i13 = (k0I == null || (iD02 = k0I.d0(c22387u)) == Integer.MIN_VALUE) ? 0 : (iD03 + i25) - iD02;
                    i12 = i25;
                } else {
                    int iY03 = interfaceC22369k0.y0(Bg.f34565b) - iD03;
                    d0.d0.f393369a.getClass();
                    iMax = Math.max(interfaceC22369k0.y0(d0.d0.f393379k), k0I3.f40346c + iY03);
                    i12 = iY03;
                    i13 = k0I != null ? (iMax - k0I.f40346c) / 2 : 0;
                }
                return interfaceC22369k0.L0(iMin, iMax, kotlin.collections.P0.c(), new a(k0I3, i12, k0I2, i23, k0I2 != null ? (iMax - k0I2.f40346c) / 2 : 0, k0I, i24, i13));
            }
            i22++;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
