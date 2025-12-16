package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Tab.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Oa implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C22096n f33025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f33026b;

    /* compiled from: Tab.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33027l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33028m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f33029n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f33030o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f33031p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Integer f33032q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Integer f33033r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, androidx.compose.ui.layout.K0 k03, InterfaceC22369k0 interfaceC22369k0, int i12, int i13, Integer num, Integer num2) {
            super(1);
            this.f33027l = k02;
            this.f33028m = k03;
            this.f33029n = interfaceC22369k0;
            this.f33030o = i12;
            this.f33031p = i13;
            this.f33032q = num;
            this.f33033r = num2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            androidx.compose.ui.layout.K0 k02 = this.f33028m;
            int i12 = this.f33031p;
            androidx.compose.ui.layout.K0 k03 = this.f33027l;
            if (k03 != null && k02 != null) {
                int iIntValue = this.f33032q.intValue();
                int iIntValue2 = this.f33033r.intValue();
                float f12 = iIntValue == iIntValue2 ? Sa.f33183d : Sa.f33184e;
                InterfaceC22369k0 interfaceC22369k0 = this.f33029n;
                int iY02 = interfaceC22369k0.y0(f12);
                Za.f33391a.getClass();
                int iY03 = interfaceC22369k0.y0(Za.f33393c) + iY02;
                int iO02 = (interfaceC22369k0.O0(Sa.f33185f) + k02.f40346c) - iIntValue;
                int i13 = k03.f40345b;
                int i14 = this.f33030o;
                int i15 = (i12 - iIntValue2) - iY03;
                aVar2.h(k03, (i14 - i13) / 2, i15, 0.0f);
                aVar2.h(k02, (i14 - k02.f40345b) / 2, i15 - iO02, 0.0f);
            } else if (k03 != null) {
                float f13 = Sa.f33180a;
                aVar2.h(k03, 0, (i12 - k03.f40346c) / 2, 0.0f);
            } else if (k02 != null) {
                float f14 = Sa.f33180a;
                aVar2.h(k02, 0, (i12 - k02.f40346c) / 2, 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    public Oa(C22096n c22096n, Y41.p pVar) {
        this.f33025a = c22096n;
        this.f33026b = pVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        androidx.compose.ui.layout.K0 k0I;
        androidx.compose.ui.layout.K0 k0I2;
        if (this.f33025a != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC22363h0 interfaceC22363h0 = list.get(i12);
                if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "text")) {
                    k0I = interfaceC22363h0.I(C22712b.c(j12, 0, 0, 0, 0, 11));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        k0I = null;
        if (this.f33026b != null) {
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                InterfaceC22363h0 interfaceC22363h02 = list.get(i13);
                if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "icon")) {
                    k0I2 = interfaceC22363h02.I(j12);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        k0I2 = null;
        int iMax = Math.max(k0I != null ? k0I.f40345b : 0, k0I2 != null ? k0I2.f40345b : 0);
        int iY02 = interfaceC22369k0.y0((k0I == null || k0I2 == null) ? Sa.f33180a : Sa.f33181b);
        return interfaceC22369k0.L0(iMax, iY02, kotlin.collections.P0.c(), new a(k0I, k0I2, interfaceC22369k0, iMax, iY02, k0I != null ? Integer.valueOf(k0I.d0(C22350b.f40439a)) : null, k0I != null ? Integer.valueOf(k0I.d0(C22350b.f40440b)) : null));
    }
}
