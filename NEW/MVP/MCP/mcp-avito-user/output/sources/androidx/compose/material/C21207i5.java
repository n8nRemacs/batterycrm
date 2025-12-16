package androidx.compose.material;

import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21207i5 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<androidx.compose.ui.unit.h> f33648a;

    /* compiled from: ListItem.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.i5$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f33649l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int[] f33650m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, int[] iArr) {
            super(1);
            this.f33649l = arrayList;
            this.f33650m = iArr;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f33649l;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                aVar2.h((androidx.compose.ui.layout.K0) arrayList.get(i12), 0, this.f33650m[i12], 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    public C21207i5(List<androidx.compose.ui.unit.h> list) {
        this.f33648a = list;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        C21207i5 c21207i5;
        int iD02;
        long jC2 = C22712b.c(j12, 0, 0, 0, Integer.MAX_VALUE, 3);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iF2 = 0;
        while (iF2 < size) {
            iF2 = androidx.compose.foundation.H.f(list.get(iF2), jC2, arrayList, iF2, 1);
        }
        Integer numValueOf = 0;
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((androidx.compose.ui.layout.K0) arrayList.get(i12)).f40345b));
        }
        int iIntValue = numValueOf.intValue();
        int[] iArr = new int[arrayList.size()];
        int size3 = arrayList.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size3; i14++) {
            androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) arrayList.get(i14);
            if (i14 > 0) {
                int i15 = i14 - 1;
                iD02 = ((androidx.compose.ui.layout.K0) arrayList.get(i15)).f40346c - ((androidx.compose.ui.layout.K0) arrayList.get(i15)).d0(C22350b.f40440b);
                c21207i5 = this;
            } else {
                c21207i5 = this;
                iD02 = 0;
            }
            int iMax = Math.max(0, (interfaceC22369k0.y0(c21207i5.f33648a.get(i14).f42852b) - k02.d0(C22350b.f40439a)) - iD02);
            iArr[i14] = iMax + i13;
            i13 += iMax + k02.f40346c;
        }
        return interfaceC22369k0.L0(iIntValue, i13, kotlin.collections.P0.c(), new a(arrayList, iArr));
    }
}
