package androidx.compose.material3;

import androidx.compose.foundation.layout.C20585k;
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

/* compiled from: AppBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21759o0 implements InterfaceC22365i0 {

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.o0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f36924l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f36925m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f36926n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C20585k.e f36927o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f36928p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f36929q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f36930r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C20585k.m f36931s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f36932t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f36933u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, int i12, androidx.compose.ui.layout.K0 k03, C20585k.e eVar, long j12, androidx.compose.ui.layout.K0 k04, InterfaceC22369k0 interfaceC22369k0, C20585k.m mVar, int i13, int i14) {
            super(1);
            this.f36924l = k02;
            this.f36925m = i12;
            this.f36926n = k03;
            this.f36927o = eVar;
            this.f36928p = j12;
            this.f36929q = k04;
            this.f36930r = interfaceC22369k0;
            this.f36931s = mVar;
            this.f36932t = i13;
            this.f36933u = i14;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            int iMax;
            int iJ2;
            K0.a aVar2 = aVar;
            androidx.compose.ui.layout.K0 k02 = this.f36924l;
            int i12 = k02.f40346c;
            int i13 = this.f36925m;
            int iMax2 = 0;
            aVar2.h(k02, 0, (i13 - i12) / 2, 0.0f);
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            C20585k.e eVar = this.f36927o;
            boolean zF2 = kotlin.jvm.internal.L.f(eVar, cVar);
            androidx.compose.ui.layout.K0 k03 = this.f36926n;
            androidx.compose.ui.layout.K0 k04 = this.f36929q;
            long j12 = this.f36928p;
            if (zF2) {
                int iJ3 = C22712b.j(j12);
                int i14 = k03.f40345b;
                iMax = (iJ3 - i14) / 2;
                int i15 = k02.f40345b;
                if (iMax < i15) {
                    iJ2 = i15 - iMax;
                } else if (i14 + iMax > C22712b.j(j12) - k04.f40345b) {
                    iJ2 = (C22712b.j(j12) - k04.f40345b) - (k03.f40345b + iMax);
                }
                iMax += iJ2;
            } else if (kotlin.jvm.internal.L.f(eVar, C20585k.f28661c)) {
                iMax = (C22712b.j(j12) - k03.f40345b) - k04.f40345b;
            } else {
                iMax = Math.max(this.f36930r.y0(E0.f34649c), k02.f40345b);
            }
            C20585k.m mVar = this.f36931s;
            if (kotlin.jvm.internal.L.f(mVar, cVar)) {
                iMax2 = (i13 - k03.f40346c) / 2;
            } else if (kotlin.jvm.internal.L.f(mVar, C20585k.f28663e)) {
                int i16 = this.f36932t;
                if (i16 == 0) {
                    iMax2 = i13 - k03.f40346c;
                } else {
                    int i17 = k03.f40346c;
                    iMax2 = (i13 - i17) - Math.max(0, (i16 - i17) + this.f36933u);
                }
            }
            aVar2.h(k03, iMax, iMax2, 0.0f);
            aVar2.h(k04, C22712b.j(j12) - k04.f40345b, (i13 - k04.f40346c) / 2, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        int iJ2;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC22363h0 interfaceC22363h0 = list.get(i12);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "navigationIcon")) {
                androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22712b.c(j12, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    InterfaceC22363h0 interfaceC22363h02 = list.get(i13);
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "actionIcons")) {
                        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h02.I(C22712b.c(j12, 0, 0, 0, 0, 14));
                        if (C22712b.j(j12) == Integer.MAX_VALUE) {
                            iJ2 = C22712b.j(j12);
                        } else {
                            iJ2 = (C22712b.j(j12) - k0I.f40345b) - k0I2.f40345b;
                            if (iJ2 < 0) {
                                iJ2 = 0;
                            }
                        }
                        int i14 = iJ2;
                        int size3 = list.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            InterfaceC22363h0 interfaceC22363h03 = list.get(i15);
                            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h03), "title")) {
                                androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h03.I(C22712b.c(j12, 0, i14, 0, 0, 12));
                                C22387u c22387u = C22350b.f40440b;
                                int iD02 = k0I3.d0(c22387u) != Integer.MIN_VALUE ? k0I3.d0(c22387u) : 0;
                                int iB2 = Float.isNaN(0.0f) ? 0 : kotlin.math.b.b(0.0f);
                                return interfaceC22369k0.L0(C22712b.j(j12), iB2, kotlin.collections.P0.c(), new a(k0I, iB2, k0I3, null, j12, k0I2, interfaceC22369k0, null, 0, iD02));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
