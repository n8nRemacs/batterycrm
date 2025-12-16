package com.avito.android.select.new_metro.compose;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: FlowRowWithOverflow.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.new_metro.compose.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34636c implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f266089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f266090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f266091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f266092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266093e;

    /* compiled from: FlowRowWithOverflow.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.select.new_metro.compose.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f266094l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f266095m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ArrayList f266096n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f266097o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f266098p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, int i12, ArrayList arrayList2, int i13, int i14) {
            super(1);
            this.f266094l = arrayList;
            this.f266095m = i12;
            this.f266096n = arrayList2;
            this.f266097o = i13;
            this.f266098p = i14;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            int i12 = 0;
            int i13 = 0;
            int iIntValue = 0;
            int i14 = 0;
            for (Object obj : this.f266094l) {
                int i15 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                K0 k02 = (K0) obj;
                if (k02.f40345b + i13 > this.f266095m) {
                    iIntValue += ((Number) this.f266096n.get(i14)).intValue() + this.f266097o;
                    i14++;
                    i13 = 0;
                }
                aVar2.h(k02, i13, iIntValue, 0.0f);
                i13 += k02.f40345b + this.f266098p;
                i12 = i15;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34636c(float f12, float f13, Y41.l<? super Integer, G0> lVar, boolean z12, int i12) {
        this.f266089a = f12;
        this.f266090b = f13;
        this.f266091c = lVar;
        this.f266092d = z12;
        this.f266093e = i12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        K0 k0I;
        int iJ2 = C22712b.j(j12);
        int iM02 = (int) interfaceC22369k0.M0(this.f266089a);
        int iM03 = (int) interfaceC22369k0.M0(this.f266090b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        int i12 = 0;
        int iMax = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z12 = false;
        while (it.hasNext()) {
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            InterfaceC22363h0 interfaceC22363h0 = (InterfaceC22363h0) next;
            Iterator it2 = it;
            boolean z13 = this.f266092d;
            if (!z12 || z13) {
                int i16 = i14;
                boolean z14 = z12;
                k0I = interfaceC22363h0.I(j12);
                if (k0I.f40345b + i13 + (i13 > 0 ? iM02 : 0) > iJ2) {
                    i12 += iMax + iM03;
                    arrayList.add(Integer.valueOf(i13));
                    arrayList2.add(Integer.valueOf(iMax));
                    if (arrayList2.size() >= this.f266093e) {
                        z12 = true;
                        if (z13) {
                            size = i16;
                        } else {
                            k0I = null;
                            size = i16;
                            iMax = 0;
                            i13 = 0;
                        }
                    } else {
                        z12 = z14;
                    }
                    iMax = 0;
                    i13 = 0;
                } else {
                    z12 = z14;
                }
                if (i13 > 0) {
                    i13 += iM02;
                }
                i13 += k0I.f40345b;
                iMax = Math.max(iMax, k0I.f40346c);
            } else {
                k0I = null;
            }
            if (k0I != null) {
                arrayList3.add(k0I);
            }
            it = it2;
            i14 = i15;
        }
        arrayList.add(Integer.valueOf(i13));
        arrayList2.add(Integer.valueOf(iMax));
        this.f266091c.invoke(Integer.valueOf(list.size() - size));
        return interfaceC22369k0.L0(iJ2, i12 + iMax, P0.c(), new a(arrayList3, iJ2, arrayList2, iM03, iM02));
    }
}
