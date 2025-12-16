package com.akita.compose.component.chips.internal;

import Y41.l;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiLineLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f60910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f60911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a f60912c;

    /* compiled from: MultiLineLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList<c> f60913l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ i.a f60914m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f60915n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f60916o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f60917p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f60918q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, i.a aVar, int i12, InterfaceC22369k0 interfaceC22369k0, int i13, int i14) {
            super(1);
            this.f60913l = arrayList;
            this.f60914m = aVar;
            this.f60915n = i12;
            this.f60916o = interfaceC22369k0;
            this.f60917p = i13;
            this.f60918q = i14;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList<c> arrayList = this.f60913l;
            int size = arrayList.size();
            int iIntValue = 0;
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = arrayList.get(i12);
                int iA2 = this.f60914m.a(((Number) cVar.f60908c.getValue()).intValue(), this.f60915n, this.f60916o.getF40449b());
                ArrayList arrayList2 = cVar.f60906a;
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    K0 k02 = (K0) arrayList2.get(i13);
                    aVar2.h(k02, iA2, iIntValue, 0.0f);
                    iA2 += k02.f40345b + this.f60918q;
                }
                iIntValue += ((Number) cVar.f60909d.getValue()).intValue() + this.f60917p;
            }
            return G0.f406611a;
        }
    }

    public d(float f12, float f13, i.a aVar) {
        this.f60910a = f12;
        this.f60911b = f13;
        this.f60912c = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        int iY02 = interfaceC22369k0.y0(this.f60910a);
        int iY03 = interfaceC22369k0.y0(this.f60911b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        long j13 = j12;
        for (int i12 = 0; i12 < size; i12++) {
            K0 k0I = list.get(i12).I(C22713c.b(C22712b.j(j12), 0, 13));
            int iL2 = C22712b.l(j13);
            int iJ2 = C22712b.j(j13);
            int iG02 = k0I.g0();
            if (iL2 > iG02 || iG02 > iJ2) {
                arrayList.add(new c(iY02, arrayList2));
                arrayList2 = new ArrayList();
                j13 = j12;
            }
            j13 = C22713c.j(-(k0I.g0() + iY02), 0, j13, 2);
            arrayList2.add(k0I);
        }
        arrayList.add(new c(iY02, arrayList2));
        int iJ3 = C22712b.j(j12);
        int size2 = arrayList.size();
        int iIntValue = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            iIntValue += ((Number) ((c) arrayList.get(i13)).f60909d.getValue()).intValue();
        }
        int size3 = ((arrayList.size() - 1) * iY03) + iIntValue;
        int i14 = C22712b.i(j12);
        return interfaceC22369k0.L0(iJ3, size3 > i14 ? i14 : size3, P0.c(), new a(arrayList, this.f60912c, iJ3, interfaceC22369k0, iY03, iY02));
    }
}
