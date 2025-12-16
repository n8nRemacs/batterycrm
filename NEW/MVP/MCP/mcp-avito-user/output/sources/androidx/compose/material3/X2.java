package androidx.compose.material3;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class X2 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f35804a = new X2();

    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f35805l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f35806m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f35807n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f35808o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f35809p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f35810q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f35811r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, int i12, int i13, androidx.compose.ui.layout.K0 k03, int i14, androidx.compose.ui.layout.K0 k04, int i15) {
            super(1);
            this.f35805l = k02;
            this.f35806m = i12;
            this.f35807n = i13;
            this.f35808o = k03;
            this.f35809p = i14;
            this.f35810q = k04;
            this.f35811r = i15;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            int i12 = this.f35807n;
            androidx.compose.ui.layout.K0 k02 = this.f35805l;
            if (k02 != null) {
                InterfaceC22215f.f39074a.getClass();
                aVar2.h(k02, 0, InterfaceC22215f.a.f39086l.a(this.f35806m, i12), 0.0f);
            }
            androidx.compose.ui.layout.K0 k03 = this.f35808o;
            int i13 = this.f35809p;
            aVar2.h(k03, i13, 0, 0.0f);
            androidx.compose.ui.layout.K0 k04 = this.f35810q;
            if (k04 != null) {
                int i14 = i13 + k03.f40345b;
                InterfaceC22215f.f39074a.getClass();
                aVar2.h(k04, i14, InterfaceC22215f.a.f39086l.a(this.f35811r, i12), 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        InterfaceC22363h0 interfaceC22363h0;
        InterfaceC22363h0 interfaceC22363h02;
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                interfaceC22363h0 = null;
                break;
            }
            interfaceC22363h0 = list.get(i12);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "leadingIcon")) {
                break;
            }
            i12++;
        }
        InterfaceC22363h0 interfaceC22363h03 = interfaceC22363h0;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h03 != null ? interfaceC22363h03.I(C22712b.c(j12, 0, 0, 0, 0, 10)) : null;
        int iF2 = C21457aj.f(k0I);
        int iE2 = C21457aj.e(k0I);
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                interfaceC22363h02 = null;
                break;
            }
            interfaceC22363h02 = list.get(i13);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "trailingIcon")) {
                break;
            }
            i13++;
        }
        InterfaceC22363h0 interfaceC22363h04 = interfaceC22363h02;
        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h04 != null ? interfaceC22363h04.I(C22712b.c(j12, 0, 0, 0, 0, 10)) : null;
        int iF3 = C21457aj.f(k0I2);
        int iE3 = C21457aj.e(k0I2);
        int size3 = list.size();
        for (int i14 = 0; i14 < size3; i14++) {
            InterfaceC22363h0 interfaceC22363h05 = list.get(i14);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h05), "label")) {
                androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h05.I(C22713c.j(-(iF2 + iF3), 0, j12, 2));
                int i15 = k0I3.f40345b + iF2 + iF3;
                int iMax = Math.max(iE2, Math.max(k0I3.f40346c, iE3));
                return interfaceC22369k0.L0(i15, iMax, kotlin.collections.P0.c(), new a(k0I, iE2, iMax, k0I3, iF2, k0I2, iE3));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
