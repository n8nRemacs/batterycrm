package com.akita.compose.component.toast_bar;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBar.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class D implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f63165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f63166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f63167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f63168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f63169e;

    /* compiled from: ToastBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f63170l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f63171m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ K0 f63172n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f63173o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f63174p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f63175q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f63176r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ K0 f63177s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f63178t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ float f63179u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ float f63180v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f63181w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ float f63182x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ float f63183y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, long j12, K0 k02, InterfaceC22369k0 interfaceC22369k0, float f12, int i13, int i14, K0 k03, int i15, float f13, float f14, int i16, float f15, float f16) {
            super(1);
            this.f63170l = i12;
            this.f63171m = j12;
            this.f63172n = k02;
            this.f63173o = interfaceC22369k0;
            this.f63174p = f12;
            this.f63175q = i13;
            this.f63176r = i14;
            this.f63177s = k03;
            this.f63178t = i15;
            this.f63179u = f13;
            this.f63180v = f14;
            this.f63181w = i16;
            this.f63182x = f15;
            this.f63183y = f16;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            long j12 = this.f63171m;
            int iJ2 = C22712b.j(j12);
            K0 k02 = this.f63177s;
            K0 k03 = this.f63172n;
            int i12 = this.f63170l;
            int i13 = this.f63176r;
            float f12 = this.f63174p;
            InterfaceC22369k0 interfaceC22369k0 = this.f63173o;
            if (i12 <= iJ2) {
                int iY02 = interfaceC22369k0.y0(f12);
                int i14 = this.f63175q / 2;
                aVar2.e(k03, iY02, i14 - (i13 / 2), 0.0f);
                aVar2.e(k02, interfaceC22369k0.y0(this.f63180v) + interfaceC22369k0.y0(this.f63179u) + (C22712b.j(j12) - this.f63178t), i14 - (this.f63181w / 2), 0.0f);
            } else {
                aVar2.e(k03, interfaceC22369k0.y0(f12), interfaceC22369k0.y0(this.f63182x), 0.0f);
                aVar2.e(k02, interfaceC22369k0.y0(f12), interfaceC22369k0.y0(this.f63183y) + i13, 0.0f);
            }
            return G0.f406611a;
        }
    }

    public D(float f12, float f13, float f14, float f15, float f16) {
        this.f63165a = f12;
        this.f63166b = f13;
        this.f63167c = f14;
        this.f63168d = f15;
        this.f63169e = f16;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        InterfaceC22363h0 interfaceC22363h0;
        InterfaceC22363h0 interfaceC22363h02;
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        List<? extends InterfaceC22363h0> list2 = list;
        int size = list2.size();
        int i12 = 0;
        while (true) {
            interfaceC22363h0 = null;
            if (i12 >= size) {
                interfaceC22363h02 = null;
                break;
            }
            interfaceC22363h02 = list.get(i12);
            if (L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "leftContent")) {
                break;
            }
            i12++;
        }
        K0 k0I = interfaceC22363h02.I(jC2);
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                break;
            }
            InterfaceC22363h0 interfaceC22363h03 = list.get(i13);
            if (L.f(androidx.compose.ui.layout.C.a(interfaceC22363h03), "rightContent")) {
                interfaceC22363h0 = interfaceC22363h03;
                break;
            }
            i13++;
        }
        K0 k0I2 = interfaceC22363h0.I(jC2);
        int iG02 = k0I.g0();
        int iY02 = k0I2.g0() > 0 ? interfaceC22369k0.y0(this.f63165a) + k0I2.g0() : 0;
        int iY03 = interfaceC22369k0.y0(this.f63166b) + iG02 + iY02;
        int iF02 = k0I.f0();
        int iF03 = k0I2.f0();
        int iY04 = iY03 <= C22712b.j(j12) ? iF02 < iF03 ? iF03 : iF02 : iF02 + iF03 + interfaceC22369k0.y0(this.f63167c);
        return interfaceC22369k0.L0(C22712b.j(j12), iY04, P0.c(), new a(iY03, j12, k0I, interfaceC22369k0, this.f63166b, iY04, iF02, k0I2, iY02, this.f63168d, this.f63165a, iF03, this.f63169e, this.f63167c));
    }
}
