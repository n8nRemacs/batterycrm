package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Row.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/f2;", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/foundation/layout/b2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C20568f2 implements InterfaceC22365i0, InterfaceC20548b2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20585k.e f28617a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i.b f28618b;

    /* compiled from: Row.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.f2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0[] f28619l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C20568f2 f28620m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f28621n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f28622o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int[] f28623p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0[] k0Arr, C20568f2 c20568f2, int i12, int i13, int[] iArr) {
            super(1);
            this.f28619l = k0Arr;
            this.f28620m = c20568f2;
            this.f28621n = i12;
            this.f28622o = i13;
            this.f28623p = iArr;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            androidx.compose.ui.layout.K0[] k0Arr = this.f28619l;
            int length = k0Arr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                androidx.compose.ui.layout.K0 k02 = k0Arr[i12];
                int i14 = i13 + 1;
                C20558d2 c20558d2B = C20543a2.b(k02);
                C20568f2 c20568f2 = this.f28620m;
                c20568f2.getClass();
                AbstractC20606p0 abstractC20606p0 = c20558d2B != null ? c20558d2B.f28596c : null;
                int i15 = this.f28621n;
                aVar2.e(k02, this.f28623p[i13], abstractC20606p0 != null ? abstractC20606p0.a(i15 - k02.f40346c, this.f28622o, k02, LayoutDirection.f42838b) : c20568f2.f28618b.a(0, i15 - k02.f40346c), 0.0f);
                i12++;
                i13 = i14;
            }
            return kotlin.G0.f406611a;
        }
    }

    public C20568f2(@Y61.k C20585k.e eVar, @Y61.k i.b bVar) {
        this.f28617a = eVar;
        this.f28618b = bVar;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    public final void a(int i12, @Y61.k int[] iArr, @Y61.k int[] iArr2, @Y61.k InterfaceC22369k0 interfaceC22369k0) {
        this.f28617a.b(interfaceC22369k0, i12, iArr, interfaceC22369k0.getF40524b(), iArr2);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        return C20553c2.a(this, C22712b.l(j12), C22712b.k(j12), C22712b.j(j12), C22712b.i(j12), interfaceC22369k0.y0(this.f28617a.getF28679d()), interfaceC22369k0, list, new androidx.compose.ui.layout.K0[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int c(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        C1 c12 = C1.f28218a;
        int iY02 = interfaceC22393x.y0(this.f28617a.getF28679d());
        c12.getClass();
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iY02, i12);
        List<? extends InterfaceC22391w> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f12 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC22391w interfaceC22391w = list.get(i13);
            float fC2 = C20543a2.c(C20543a2.a(interfaceC22391w));
            if (fC2 == 0.0f) {
                int iMin2 = Math.min(interfaceC22391w.b0(Integer.MAX_VALUE), i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i12 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC22391w.X(iMin2));
            } else if (fC2 > 0.0f) {
                f12 += fC2;
            }
        }
        int iRound = f12 == 0.0f ? 0 : i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i12 - iMin, 0) / f12);
        int size2 = list2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            InterfaceC22391w interfaceC22391w2 = list.get(i14);
            float fC3 = C20543a2.c(C20543a2.a(interfaceC22391w2));
            if (fC3 > 0.0f) {
                iMax = Math.max(iMax, interfaceC22391w2.X(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    public final long d(int i12, int i13, int i14, int i15, boolean z12) {
        C20568f2 c20568f2 = C20563e2.f28601a;
        if (!z12) {
            return C22713c.a(i12, i14, i13, i15);
        }
        C22712b.f42842b.getClass();
        return C22712b.a.b(i12, i14, i13, i15);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int e(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        C1 c12 = C1.f28218a;
        int iY02 = interfaceC22393x.y0(this.f28617a.getF28679d());
        c12.getClass();
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i13 = 0;
        float f12 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            InterfaceC22391w interfaceC22391w = list.get(i14);
            float fC2 = C20543a2.c(C20543a2.a(interfaceC22391w));
            int iG2 = interfaceC22391w.G(i12);
            if (fC2 == 0.0f) {
                i13 += iG2;
            } else if (fC2 > 0.0f) {
                f12 += fC2;
                iMax = Math.max(iMax, Math.round(iG2 / fC2));
            }
        }
        return ((list.size() - 1) * iY02) + Math.round(iMax * f12) + i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20568f2)) {
            return false;
        }
        C20568f2 c20568f2 = (C20568f2) obj;
        return kotlin.jvm.internal.L.f(this.f28617a, c20568f2.f28617a) && kotlin.jvm.internal.L.f(this.f28618b, c20568f2.f28618b);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int f(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        C1 c12 = C1.f28218a;
        int iY02 = interfaceC22393x.y0(this.f28617a.getF28679d());
        c12.getClass();
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iY02, i12);
        List<? extends InterfaceC22391w> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f12 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC22391w interfaceC22391w = list.get(i13);
            float fC2 = C20543a2.c(C20543a2.a(interfaceC22391w));
            if (fC2 == 0.0f) {
                int iMin2 = Math.min(interfaceC22391w.b0(Integer.MAX_VALUE), i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i12 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC22391w.R(iMin2));
            } else if (fC2 > 0.0f) {
                f12 += fC2;
            }
        }
        int iRound = f12 == 0.0f ? 0 : i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i12 - iMin, 0) / f12);
        int size2 = list2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            InterfaceC22391w interfaceC22391w2 = list.get(i14);
            float fC3 = C20543a2.c(C20543a2.a(interfaceC22391w2));
            if (fC3 > 0.0f) {
                iMax = Math.max(iMax, interfaceC22391w2.R(iRound != Integer.MAX_VALUE ? Math.round(iRound * fC3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    public final int g(@Y61.k androidx.compose.ui.layout.K0 k02) {
        return k02.f40346c;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int h(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        C1 c12 = C1.f28218a;
        int iY02 = interfaceC22393x.y0(this.f28617a.getF28679d());
        c12.getClass();
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i13 = 0;
        float f12 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            InterfaceC22391w interfaceC22391w = list.get(i14);
            float fC2 = C20543a2.c(C20543a2.a(interfaceC22391w));
            int iB02 = interfaceC22391w.b0(i12);
            if (fC2 == 0.0f) {
                i13 += iB02;
            } else if (fC2 > 0.0f) {
                f12 += fC2;
                iMax = Math.max(iMax, Math.round(iB02 / fC2));
            }
        }
        return ((list.size() - 1) * iY02) + Math.round(iMax * f12) + i13;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28618b.f40047a) + (this.f28617a.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    @Y61.k
    public final InterfaceC22367j0 i(@Y61.k androidx.compose.ui.layout.K0[] k0Arr, @Y61.k InterfaceC22369k0 interfaceC22369k0, int i12, @Y61.k int[] iArr, int i13, int i14, @Y61.l int[] iArr2, int i15, int i16, int i17) {
        return interfaceC22369k0.L0(i13, i14, kotlin.collections.P0.c(), new a(k0Arr, this, i14, i12, iArr));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    public final int j(@Y61.k androidx.compose.ui.layout.K0 k02) {
        return k02.f40345b;
    }

    @Y61.k
    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f28617a + ", verticalAlignment=" + this.f28618b + ')';
    }
}
