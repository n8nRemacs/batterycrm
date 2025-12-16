package com.akita.compose.component.navbar.internal;

import Y41.l;
import Y61.k;
import androidx.compose.ui.layout.C;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.q;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NavBarLayout.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/navbar/internal/g;", "Landroidx/compose/ui/layout/i0;", "<init>", "()V", "navbar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g implements InterfaceC22365i0 {

    /* compiled from: NavBarLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f62241l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f62242m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ K0 f62243n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f62244o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f62245p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ K0 f62246q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02, g gVar, long j12, K0 k03, int i12, int i13, K0 k04) {
            super(1);
            this.f62241l = k02;
            this.f62242m = j12;
            this.f62243n = k03;
            this.f62244o = i12;
            this.f62245p = i13;
            this.f62246q = k04;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            long j12;
            K0.a aVar2 = aVar;
            long j13 = this.f62242m;
            K0 k02 = this.f62241l;
            if (k02 != null) {
                aVar2.e(k02, 0, g.a(k02, j13), 0.0f);
            }
            K0 k03 = this.f62243n;
            if (k03 != null) {
                int iA2 = g.a(k03, j13);
                int iJ2 = C22712b.j(j13);
                int i12 = this.f62244o;
                int i13 = this.f62245p;
                if (iJ2 - (i12 + i13) <= k03.f40345b) {
                    j12 = (i12 << 32) | (iA2 & 4294967295L);
                    q.a aVar3 = q.f42862b;
                } else {
                    int iJ3 = (C22712b.j(j13) / 2) - (k03.f40345b / 2);
                    int i14 = iJ3 >= 0 ? iJ3 : 0;
                    if ((C22712b.j(j13) - i13) - (k03.f40345b + i14) < 0) {
                        j12 = ((i14 + r5) << 32) | (iA2 & 4294967295L);
                        q.a aVar4 = q.f42862b;
                    } else {
                        j12 = (i14 << 32) | (iA2 & 4294967295L);
                        q.a aVar5 = q.f42862b;
                    }
                }
                K0.a.g(aVar2, k03, j12);
            }
            K0 k04 = this.f62246q;
            if (k04 != null) {
                aVar2.e(k04, C22712b.j(j13) - k04.f40345b, g.a(k04, j13), 0.0f);
            }
            return G0.f406611a;
        }
    }

    public static int a(K0 k02, long j12) {
        int i12 = (C22712b.i(j12) / 2) - (k02.f40346c / 2);
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @k
    public final InterfaceC22367j0 b(@k InterfaceC22369k0 interfaceC22369k0, @k List<? extends InterfaceC22363h0> list, long j12) {
        InterfaceC22363h0 interfaceC22363h0;
        InterfaceC22363h0 interfaceC22363h02;
        InterfaceC22363h0 interfaceC22363h03;
        int i12 = 0;
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        List<? extends InterfaceC22363h0> list2 = list;
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                interfaceC22363h0 = null;
                break;
            }
            interfaceC22363h0 = list.get(i13);
            if (L.f(C.a(interfaceC22363h0), "navigationUp")) {
                break;
            }
            i13++;
        }
        InterfaceC22363h0 interfaceC22363h04 = interfaceC22363h0;
        K0 k0I = interfaceC22363h04 != null ? interfaceC22363h04.I(jC2) : null;
        int size2 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                interfaceC22363h02 = null;
                break;
            }
            interfaceC22363h02 = list.get(i14);
            if (L.f(C.a(interfaceC22363h02), "actions")) {
                break;
            }
            i14++;
        }
        InterfaceC22363h0 interfaceC22363h05 = interfaceC22363h02;
        K0 k0I2 = interfaceC22363h05 != null ? interfaceC22363h05.I(jC2) : null;
        int i15 = k0I != null ? k0I.f40345b : 0;
        int i16 = k0I2 != null ? k0I2.f40345b : 0;
        long jC3 = C22712b.c(jC2, 0, C22712b.j(j12) - (i15 + i16), 0, 0, 13);
        int size3 = list2.size();
        while (true) {
            if (i12 >= size3) {
                interfaceC22363h03 = null;
                break;
            }
            interfaceC22363h03 = list.get(i12);
            if (L.f(C.a(interfaceC22363h03), "content")) {
                break;
            }
            i12++;
        }
        InterfaceC22363h0 interfaceC22363h06 = interfaceC22363h03;
        return interfaceC22369k0.L0(C22712b.j(j12), C22712b.i(j12), P0.c(), new a(k0I, this, j12, interfaceC22363h06 != null ? interfaceC22363h06.I(jC3) : null, i15, i16, k0I2));
    }
}
