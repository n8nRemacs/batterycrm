package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Cj implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f34602a;

    /* compiled from: TimePicker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f34603l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34604m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f34605n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f34606o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f34607p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ float f34608q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, ArrayList arrayList, androidx.compose.ui.layout.K0 k03, long j12, float f12, float f13) {
            super(1);
            this.f34603l = k02;
            this.f34604m = arrayList;
            this.f34605n = k03;
            this.f34606o = j12;
            this.f34607p = f12;
            this.f34608q = f13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            long j12;
            K0.a aVar2 = aVar;
            int i12 = 0;
            androidx.compose.ui.layout.K0 k02 = this.f34603l;
            if (k02 != null) {
                aVar2.e(k02, 0, 0, 0.0f);
            }
            ArrayList arrayList = this.f34604m;
            int size = arrayList.size();
            while (true) {
                j12 = this.f34606o;
                if (i12 >= size) {
                    break;
                }
                androidx.compose.ui.layout.K0 k03 = (androidx.compose.ui.layout.K0) arrayList.get(i12);
                int iJ2 = (C22712b.j(j12) / 2) - (k03.f40345b / 2);
                int i13 = (C22712b.i(j12) / 2) - (k03.f40346c / 2);
                double d12 = this.f34607p;
                double d13 = (this.f34608q * i12) - 1.5707963267948966d;
                aVar2.e(k03, kotlin.math.b.a((Math.cos(d13) * d12) + iJ2), kotlin.math.b.a((Math.sin(d13) * d12) + i13), 0.0f);
                i12++;
                arrayList = arrayList;
                size = size;
            }
            androidx.compose.ui.layout.K0 k04 = this.f34605n;
            if (k04 != null) {
                aVar2.e(k04, (C22712b.l(j12) - k04.f40345b) / 2, (C22712b.k(j12) - k04.f40346c) / 2, 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    public Cj(float f12) {
        this.f34602a = f12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        U8 u82;
        U8 u83;
        InterfaceC22363h0 interfaceC22363h0;
        InterfaceC22363h0 interfaceC22363h02;
        float fM02 = interfaceC22369k0.M0(this.f34602a);
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i12 = 0;
        while (true) {
            u82 = U8.f35550c;
            u83 = U8.f35549b;
            if (i12 >= size) {
                break;
            }
            InterfaceC22363h0 interfaceC22363h03 = list.get(i12);
            InterfaceC22363h0 interfaceC22363h04 = interfaceC22363h03;
            if (androidx.compose.ui.layout.C.a(interfaceC22363h04) != u83 && androidx.compose.ui.layout.C.a(interfaceC22363h04) != u82) {
                arrayList.add(interfaceC22363h03);
            }
            i12++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int iF2 = 0;
        while (iF2 < size2) {
            iF2 = androidx.compose.foundation.H.f((InterfaceC22363h0) arrayList.get(iF2), jC2, arrayList2, iF2, 1);
            u83 = u83;
        }
        U8 u84 = u83;
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                interfaceC22363h0 = null;
                break;
            }
            interfaceC22363h0 = list.get(i13);
            if (androidx.compose.ui.layout.C.a(interfaceC22363h0) == u84) {
                break;
            }
            i13++;
        }
        InterfaceC22363h0 interfaceC22363h05 = interfaceC22363h0;
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                interfaceC22363h02 = null;
                break;
            }
            interfaceC22363h02 = list.get(i14);
            if (androidx.compose.ui.layout.C.a(interfaceC22363h02) == u82) {
                break;
            }
            i14++;
        }
        InterfaceC22363h0 interfaceC22363h06 = interfaceC22363h02;
        return interfaceC22369k0.L0(C22712b.l(j12), C22712b.k(j12), kotlin.collections.P0.c(), new a(interfaceC22363h05 != null ? interfaceC22363h05.I(jC2) : null, arrayList2, interfaceC22363h06 != null ? interfaceC22363h06.I(jC2) : null, j12, fM02, 6.2831855f / arrayList2.size()));
    }
}
