package androidx.compose.material3.internal;

import androidx.compose.foundation.H;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class m implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f36586a = new m();

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f36587l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(K0.a aVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f36588l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(K0 k02) {
            super(1);
            this.f36588l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.h(this.f36588l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36589l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.f36589l = arrayList;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f36589l;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                int i12 = 0;
                while (true) {
                    aVar2.h((K0) arrayList.get(i12), 0, 0, 0.0f);
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        int iMax;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return interfaceC22369k0.L0(0, 0, P0.c(), a.f36587l);
        }
        if (size == 1) {
            K0 k0I = list.get(0).I(j12);
            return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new b(k0I));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iF2 = 0;
        while (iF2 < size2) {
            iF2 = H.f(list.get(iF2), j12, arrayList, iF2, 1);
        }
        int size3 = arrayList.size() - 1;
        if (size3 >= 0) {
            int iMax2 = 0;
            iMax = 0;
            while (true) {
                K0 k02 = (K0) arrayList.get(i12);
                iMax2 = Math.max(iMax2, k02.f40345b);
                iMax = Math.max(iMax, k02.f40346c);
                if (i12 == size3) {
                    break;
                }
                i12++;
            }
            i12 = iMax2;
        } else {
            iMax = 0;
        }
        return interfaceC22369k0.L0(i12, iMax, P0.c(), new c(arrayList));
    }
}
