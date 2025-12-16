package com.akita.compose.component.chips.internal;

import Y41.l;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.F;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SingleLineStretchedLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T1 f60924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f60925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f60926c;

    /* compiled from: SingleLineStretchedLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f60927l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(K0.a aVar) {
            return G0.f406611a;
        }
    }

    public g(T1 t12, F f12, float f13) {
        this.f60924a = t12;
        this.f60925b = f12;
        this.f60926c = f13;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        int iF2 = 0;
        if (list.isEmpty()) {
            return interfaceC22369k0.L0(0, 0, P0.c(), a.f60927l);
        }
        LayoutDirection f40449b = interfaceC22369k0.getF40449b();
        T1 t12 = this.f60924a;
        int iY02 = interfaceC22369k0.y0(R1.g(t12, f40449b));
        int iY03 = interfaceC22369k0.y0(R1.f(t12, interfaceC22369k0.getF40449b()));
        int iY04 = (interfaceC22369k0.y0(this.f60925b.h()) - iY02) - iY03;
        int iY05 = interfaceC22369k0.y0(this.f60926c);
        int size = iY04 - ((list.size() - 1) * iY05);
        int size2 = list.size();
        int[] iArr = new int[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            iArr[i12] = list.get(i12).G(C22712b.i(j12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            i13 += iArr[i14];
        }
        if (i13 <= size) {
            float f12 = size / i13;
            ArrayList arrayList = new ArrayList(list.size());
            for (int size3 = list.size(); iF2 < size3; size3 = size3) {
                InterfaceC22363h0 interfaceC22363h0 = list.get(iF2);
                int iB2 = kotlin.math.b.b(iArr[iF2] * f12);
                iF2 = H.f(interfaceC22363h0, C22712b.c(j12, iB2, iB2, 0, 0, 12), arrayList, iF2, 1);
            }
            return k.b(interfaceC22369k0, arrayList, iY04 + iY02 + iY03, iY02, iY05);
        }
        List<? extends InterfaceC22363h0> list2 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC22363h0) it.next()).I(j12));
        }
        int size4 = arrayList2.size();
        int i15 = 0;
        while (iF2 < size4) {
            i15 += ((K0) arrayList2.get(iF2)).f40345b;
            iF2++;
        }
        return k.b(interfaceC22369k0, arrayList2, ((arrayList2.size() - 1) * iY05) + i15 + iY02 + iY03, iY02, iY05);
    }
}
