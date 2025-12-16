package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ik implements InterfaceC22365i0 {

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34899l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f34900m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, ArrayList arrayList) {
            super(1);
            this.f34899l = arrayList;
            this.f34900m = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f34899l;
            aVar2.e((androidx.compose.ui.layout.K0) arrayList.get(0), 0, 0, 0.0f);
            aVar2.e((androidx.compose.ui.layout.K0) arrayList.get(1), 0, ((androidx.compose.ui.layout.K0) arrayList.get(0)).f40346c, 0.0f);
            int i12 = ((androidx.compose.ui.layout.K0) arrayList.get(0)).f40346c;
            androidx.compose.ui.layout.K0 k02 = this.f34900m;
            aVar2.e(k02, 0, i12 - (k02.f40346c / 2), 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    static {
        new Ik();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC22363h0 interfaceC22363h0 = list.get(i12);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "Spacer")) {
                d0.j0.f393447a.getClass();
                androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22712b.c(j12, 0, 0, 0, interfaceC22369k0.y0(d0.j0.f393450d), 3));
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    InterfaceC22363h0 interfaceC22363h02 = list.get(i13);
                    if (!kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "Spacer")) {
                        arrayList.add(interfaceC22363h02);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                int iF2 = 0;
                while (iF2 < size3) {
                    iF2 = androidx.compose.foundation.H.f((InterfaceC22363h0) arrayList.get(iF2), C22712b.c(j12, 0, 0, 0, C22712b.i(j12) / 2, 3), arrayList2, iF2, 1);
                }
                return interfaceC22369k0.L0(C22712b.j(j12), C22712b.i(j12), kotlin.collections.P0.c(), new a(k0I, arrayList2));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
