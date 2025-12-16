package androidx.compose.foundation.text;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BasicText.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/b3;", "Landroidx/compose/ui/layout/i0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b3 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f30652a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<List<l0.j>> f30653b;

    /* compiled from: BasicText.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f30654l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f30655m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, ArrayList arrayList2) {
            super(1);
            this.f30654l = arrayList;
            this.f30655m = arrayList2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            long j12;
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f30654l;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    kotlin.Q q12 = (kotlin.Q) arrayList.get(i12);
                    K0.a.g(aVar2, (androidx.compose.ui.layout.K0) q12.f406619b, ((androidx.compose.ui.unit.q) q12.f406620c).f42864a);
                }
            }
            ArrayList arrayList2 = this.f30655m;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    kotlin.Q q13 = (kotlin.Q) arrayList2.get(i13);
                    androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) q13.f406619b;
                    Y41.a aVar3 = (Y41.a) q13.f406620c;
                    if (aVar3 != null) {
                        j12 = ((androidx.compose.ui.unit.q) aVar3.invoke()).f42864a;
                    } else {
                        androidx.compose.ui.unit.q.f42862b.getClass();
                        j12 = 0;
                    }
                    K0.a.g(aVar2, k02, j12);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b3(@Y61.k Y41.a<Boolean> aVar, @Y61.k Y41.a<? extends List<l0.j>> aVar2) {
        this.f30652a = aVar;
        this.f30653b = aVar2;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        ArrayList arrayList;
        kotlin.Q q12;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends InterfaceC22363h0> list2 = list;
        int size = list2.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC22363h0 interfaceC22363h0 = list.get(i12);
            if (!(interfaceC22363h0.getF40763y() instanceof f3)) {
                arrayList2.add(interfaceC22363h0);
            }
        }
        List<l0.j> listInvoke = this.f30653b.invoke();
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i13 = 0; i13 < size2; i13++) {
                l0.j jVar = listInvoke.get(i13);
                if (jVar != null) {
                    InterfaceC22363h0 interfaceC22363h02 = (InterfaceC22363h0) arrayList2.get(i13);
                    float f12 = jVar.f413392c;
                    float f13 = jVar.f413390a;
                    float f14 = jVar.f413393d;
                    float f15 = jVar.f413391b;
                    q12 = new kotlin.Q(interfaceC22363h02.I(C22713c.b((int) Math.floor(f12 - f13), (int) Math.floor(f14 - f15), 5)), androidx.compose.ui.unit.q.a((Math.round(f15) & 4294967295L) | (Math.round(f13) << 32)));
                } else {
                    q12 = null;
                }
                if (q12 != null) {
                    arrayList3.add(q12);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i14 = 0; i14 < size3; i14++) {
            InterfaceC22363h0 interfaceC22363h03 = list.get(i14);
            if (interfaceC22363h03.getF40763y() instanceof f3) {
                arrayList4.add(interfaceC22363h03);
            }
        }
        return interfaceC22369k0.L0(C22712b.j(j12), C22712b.i(j12), kotlin.collections.P0.c(), new a(arrayList, L.f(this.f30652a, arrayList4)));
    }
}
