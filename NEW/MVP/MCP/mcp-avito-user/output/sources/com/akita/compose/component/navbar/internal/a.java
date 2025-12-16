package com.akita.compose.component.navbar.internal;

import Y41.l;
import Y61.k;
import androidx.compose.foundation.H;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: NavBarActionsLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f62226a = new a();

    /* compiled from: NavBarActionsLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.navbar.internal.a$a, reason: collision with other inner class name */
    public static final class C2093a extends N implements l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f62227l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.f f62228m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f62229n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2093a(ArrayList arrayList, l0.f fVar, int i12) {
            super(1);
            this.f62227l = arrayList;
            this.f62228m = fVar;
            this.f62229n = i12;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f62227l;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                K0 k02 = (K0) arrayList.get(i12);
                l0.f fVar = this.f62228m;
                if (i12 > 0) {
                    int i13 = fVar.f406840b + this.f62229n;
                    fVar.f406840b = i13;
                    aVar2.e(k02, i13, 0, 0.0f);
                } else {
                    aVar2.e(k02, 0, 0, 0.0f);
                }
                fVar.f406840b += k02.f40345b;
            }
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @k
    public final InterfaceC22367j0 b(@k InterfaceC22369k0 interfaceC22369k0, @k List<? extends InterfaceC22363h0> list, long j12) {
        int iY02;
        Object obj;
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        List listF0 = C42745f0.F0(3, list);
        ArrayList arrayList = new ArrayList(listF0.size());
        int size = listF0.size();
        for (int iF2 = 0; iF2 < size; iF2 = H.f((InterfaceC22363h0) listF0.get(iF2), jC2, arrayList, iF2, 1)) {
        }
        if (arrayList.size() > 1) {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            iY02 = interfaceC22369k0.y0(16);
        } else {
            iY02 = 0;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            K0 k02 = (K0) arrayList.get(i13);
            if (i13 > 0) {
                i12 += iY02;
            }
            i12 += k02.f40345b;
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = arrayList.get(0);
            int i14 = ((K0) obj2).f40346c;
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                int i15 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i15);
                    int i16 = ((K0) obj3).f40346c;
                    if (i14 < i16) {
                        obj2 = obj3;
                        i14 = i16;
                    }
                    if (i15 == size3) {
                        break;
                    }
                    i15++;
                }
            }
            obj = obj2;
        }
        K0 k03 = (K0) obj;
        return interfaceC22369k0.L0(i12, k03 != null ? k03.f40346c : 0, P0.c(), new C2093a(arrayList, new l0.f(), iY02));
    }
}
