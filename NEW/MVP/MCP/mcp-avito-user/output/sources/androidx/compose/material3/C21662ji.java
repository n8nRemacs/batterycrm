package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22381q0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TabRow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "<name for destructuring parameter 0>", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21662ji implements InterfaceC22381q0 {

    /* compiled from: TabRow.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ji$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36670l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36671m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36672n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ l0.f f36673o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f36674p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, l0.f fVar, int i12) {
            super(1);
            this.f36670l = arrayList;
            this.f36671m = arrayList2;
            this.f36672n = arrayList3;
            this.f36673o = fVar;
            this.f36674p = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            int i12;
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f36670l;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                aVar2.h((androidx.compose.ui.layout.K0) arrayList.get(i13), this.f36673o.f406840b * i13, 0, 0.0f);
            }
            ArrayList arrayList2 = this.f36671m;
            int size2 = arrayList2.size();
            int i14 = 0;
            while (true) {
                i12 = this.f36674p;
                if (i14 >= size2) {
                    break;
                }
                androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) arrayList2.get(i14);
                aVar2.h(k02, 0, i12 - k02.f40346c, 0.0f);
                i14++;
            }
            ArrayList arrayList3 = this.f36672n;
            int size3 = arrayList3.size();
            for (int i15 = 0; i15 < size3; i15++) {
                androidx.compose.ui.layout.K0 k03 = (androidx.compose.ui.layout.K0) arrayList3.get(i15);
                aVar2.h(k03, 0, i12 - k03.f40346c, 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends List<? extends InterfaceC22363h0>> list, long j12) {
        List<? extends InterfaceC22363h0> list2 = list.get(0);
        list.get(1);
        list.get(2);
        int iJ2 = C22712b.j(j12);
        int size = list2.size();
        l0.f fVar = new l0.f();
        if (size > 0) {
            fVar.f406840b = iJ2 / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            numValueOf = Integer.valueOf(Math.max(list2.get(i12).R(fVar.f406840b), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(interfaceC22369k0.J(Math.min(list2.get(i13).b0(iIntValue), fVar.f406840b)) - (Ih.f34894c * 2));
            androidx.compose.ui.unit.h hVarA2 = androidx.compose.ui.unit.h.a(24);
            if (hVarA.compareTo(hVarA2) < 0) {
                hVarA = hVarA2;
            }
            arrayList.add(new Jh(interfaceC22369k0.J(fVar.f406840b) * i13, interfaceC22369k0.J(fVar.f406840b), hVarA.f42852b, null));
        }
        throw null;
    }
}
