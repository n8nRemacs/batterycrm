package androidx.compose.material;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: TextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/Wb;", "Landroidx/compose/ui/layout/i0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Wb implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33328a;

    /* renamed from: b, reason: collision with root package name */
    public final float f33329b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.layout.T1 f33330c;

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "w", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33331l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.R(num.intValue()));
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "h", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f33332l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.b0(num.intValue()));
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33333l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f33334m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f33335n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f33336o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f33337p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33338q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33339r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33340s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33341t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Wb f33342u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f33343v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f33344w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f33345x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.layout.K0 k02, int i12, int i13, int i14, int i15, androidx.compose.ui.layout.K0 k03, androidx.compose.ui.layout.K0 k04, androidx.compose.ui.layout.K0 k05, androidx.compose.ui.layout.K0 k06, Wb wb2, int i16, int i17, InterfaceC22369k0 interfaceC22369k0) {
            super(1);
            this.f33333l = k02;
            this.f33334m = i12;
            this.f33335n = i13;
            this.f33336o = i14;
            this.f33337p = i15;
            this.f33338q = k03;
            this.f33339r = k04;
            this.f33340s = k05;
            this.f33341t = k06;
            this.f33342u = wb2;
            this.f33343v = i16;
            this.f33344w = i17;
            this.f33345x = interfaceC22369k0;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            int iA2;
            int iB2;
            K0.a aVar2 = aVar;
            Wb wb2 = this.f33342u;
            androidx.compose.ui.layout.K0 k02 = this.f33338q;
            InterfaceC22369k0 interfaceC22369k0 = this.f33345x;
            androidx.compose.ui.layout.K0 k03 = this.f33341t;
            androidx.compose.ui.layout.K0 k04 = this.f33340s;
            androidx.compose.ui.layout.K0 k05 = this.f33339r;
            int i12 = this.f33337p;
            int i13 = this.f33336o;
            boolean z12 = wb2.f33328a;
            androidx.compose.ui.layout.K0 k06 = this.f33333l;
            if (k06 != null) {
                int i14 = this.f33334m - this.f33335n;
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = this.f33343v + this.f33344w;
                float f40389c = interfaceC22369k0.getF40389c();
                float f12 = Vb.f33288a;
                if (k04 != null) {
                    InterfaceC22215f.f39074a.getClass();
                    aVar2.h(k04, 0, InterfaceC22215f.a.f39086l.a(k04.f40346c, i12), 0.0f);
                }
                if (k03 != null) {
                    int i16 = i13 - k03.f40345b;
                    InterfaceC22215f.f39074a.getClass();
                    aVar2.h(k03, i16, InterfaceC22215f.a.f39086l.a(k03.f40346c, i12), 0.0f);
                }
                if (z12) {
                    InterfaceC22215f.f39074a.getClass();
                    iB2 = InterfaceC22215f.a.f39086l.a(k06.f40346c, i12);
                } else {
                    iB2 = kotlin.math.b.b(Bb.f32409a * f40389c);
                }
                aVar2.h(k06, Bb.e(k04), iB2 - kotlin.math.b.b((iB2 - i14) * wb2.f33329b), 0.0f);
                aVar2.h(k02, Bb.e(k04), i15, 0.0f);
                if (k05 != null) {
                    aVar2.h(k05, Bb.e(k04), i15, 0.0f);
                }
            } else {
                float f40389c2 = interfaceC22369k0.getF40389c();
                float f13 = Vb.f33288a;
                int iB3 = kotlin.math.b.b(wb2.f33330c.getF28512b() * f40389c2);
                if (k04 != null) {
                    InterfaceC22215f.f39074a.getClass();
                    aVar2.h(k04, 0, InterfaceC22215f.a.f39086l.a(k04.f40346c, i12), 0.0f);
                }
                if (k03 != null) {
                    int i17 = i13 - k03.f40345b;
                    InterfaceC22215f.f39074a.getClass();
                    aVar2.h(k03, i17, InterfaceC22215f.a.f39086l.a(k03.f40346c, i12), 0.0f);
                }
                if (z12) {
                    InterfaceC22215f.f39074a.getClass();
                    iA2 = InterfaceC22215f.a.f39086l.a(k02.f40346c, i12);
                } else {
                    iA2 = iB3;
                }
                aVar2.h(k02, Bb.e(k04), iA2, 0.0f);
                if (k05 != null) {
                    if (z12) {
                        InterfaceC22215f.f39074a.getClass();
                        iB3 = InterfaceC22215f.a.f39086l.a(k05.f40346c, i12);
                    }
                    aVar2.h(k05, Bb.e(k04), iB3, 0.0f);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "w", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f33346l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.X(num.intValue()));
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "h", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f33347l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.G(num.intValue()));
        }
    }

    public Wb(boolean z12, float f12, @Y61.k androidx.compose.foundation.layout.T1 t12) {
        this.f33328a = z12;
        this.f33329b = f12;
        this.f33330c = t12;
    }

    public static int d(List list, int i12, Y41.p pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj5 = list.get(i13);
            if (kotlin.jvm.internal.L.f(Bb.c((InterfaceC22391w) obj5), "TextField")) {
                int iIntValue = ((Number) pVar.invoke(obj5, Integer.valueOf(i12))).intValue();
                int size2 = list.size();
                int i14 = 0;
                while (true) {
                    obj = null;
                    if (i14 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i14);
                    if (kotlin.jvm.internal.L.f(Bb.c((InterfaceC22391w) obj2), "Label")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC22391w interfaceC22391w = (InterfaceC22391w) obj2;
                int iIntValue2 = interfaceC22391w != null ? ((Number) pVar.invoke(interfaceC22391w, Integer.valueOf(i12))).intValue() : 0;
                int size3 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i15);
                    if (kotlin.jvm.internal.L.f(Bb.c((InterfaceC22391w) obj3), "Trailing")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC22391w interfaceC22391w2 = (InterfaceC22391w) obj3;
                int iIntValue3 = interfaceC22391w2 != null ? ((Number) pVar.invoke(interfaceC22391w2, Integer.valueOf(i12))).intValue() : 0;
                int size4 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i16);
                    if (kotlin.jvm.internal.L.f(Bb.c((InterfaceC22391w) obj4), "Leading")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC22391w interfaceC22391w3 = (InterfaceC22391w) obj4;
                int iIntValue4 = interfaceC22391w3 != null ? ((Number) pVar.invoke(interfaceC22391w3, Integer.valueOf(i12))).intValue() : 0;
                int size5 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i17);
                    if (kotlin.jvm.internal.L.f(Bb.c((InterfaceC22391w) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i17++;
                }
                InterfaceC22391w interfaceC22391w4 = (InterfaceC22391w) obj;
                int iIntValue5 = interfaceC22391w4 != null ? ((Number) pVar.invoke(interfaceC22391w4, Integer.valueOf(i12))).intValue() : 0;
                long jB2 = C22713c.b(0, 0, 15);
                float f12 = Vb.f33288a;
                return C22713c.g(Math.max(iIntValue, Math.max(iIntValue2, iIntValue5)) + iIntValue4 + iIntValue3, jB2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int a(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12, Y41.p<? super InterfaceC22391w, ? super Integer, Integer> pVar) {
        InterfaceC22391w interfaceC22391w;
        InterfaceC22391w interfaceC22391w2;
        int i13;
        int iIntValue;
        InterfaceC22391w interfaceC22391w3;
        int iIntValue2;
        InterfaceC22391w interfaceC22391w4;
        int size = list.size();
        int i14 = 0;
        while (true) {
            interfaceC22391w = null;
            if (i14 >= size) {
                interfaceC22391w2 = null;
                break;
            }
            interfaceC22391w2 = list.get(i14);
            if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w2), "Leading")) {
                break;
            }
            i14++;
        }
        InterfaceC22391w interfaceC22391w5 = interfaceC22391w2;
        if (interfaceC22391w5 != null) {
            int iB02 = interfaceC22391w5.b0(Integer.MAX_VALUE);
            float f12 = Vb.f33288a;
            i13 = i12 == Integer.MAX_VALUE ? i12 : i12 - iB02;
            iIntValue = pVar.invoke(interfaceC22391w5, Integer.valueOf(i12)).intValue();
        } else {
            i13 = i12;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                interfaceC22391w3 = null;
                break;
            }
            interfaceC22391w3 = list.get(i15);
            if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w3), "Trailing")) {
                break;
            }
            i15++;
        }
        InterfaceC22391w interfaceC22391w6 = interfaceC22391w3;
        if (interfaceC22391w6 != null) {
            int iB03 = interfaceC22391w6.b0(Integer.MAX_VALUE);
            float f13 = Vb.f33288a;
            if (i13 != Integer.MAX_VALUE) {
                i13 -= iB03;
            }
            iIntValue2 = pVar.invoke(interfaceC22391w6, Integer.valueOf(i12)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                interfaceC22391w4 = null;
                break;
            }
            interfaceC22391w4 = list.get(i16);
            if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w4), "Label")) {
                break;
            }
            i16++;
        }
        InterfaceC22391w interfaceC22391w7 = interfaceC22391w4;
        int iIntValue3 = interfaceC22391w7 != null ? pVar.invoke(interfaceC22391w7, Integer.valueOf(i13)).intValue() : 0;
        int size4 = list.size();
        for (int i17 = 0; i17 < size4; i17++) {
            InterfaceC22391w interfaceC22391w8 = list.get(i17);
            if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w8), "TextField")) {
                int iIntValue4 = pVar.invoke(interfaceC22391w8, Integer.valueOf(i13)).intValue();
                int size5 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        break;
                    }
                    InterfaceC22391w interfaceC22391w9 = list.get(i18);
                    if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w9), "Hint")) {
                        interfaceC22391w = interfaceC22391w9;
                        break;
                    }
                    i18++;
                }
                InterfaceC22391w interfaceC22391w10 = interfaceC22391w;
                return Vb.b(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, interfaceC22391w10 != null ? pVar.invoke(interfaceC22391w10, Integer.valueOf(i13)).intValue() : 0, C22713c.b(0, 0, 15), interfaceC22393x.getF40389c(), this.f33330c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        InterfaceC22363h0 interfaceC22363h0;
        InterfaceC22363h0 interfaceC22363h02;
        InterfaceC22363h0 interfaceC22363h03;
        int iD02;
        InterfaceC22363h0 interfaceC22363h04;
        Wb wb2 = this;
        List<? extends InterfaceC22363h0> list2 = list;
        androidx.compose.foundation.layout.T1 t12 = wb2.f33330c;
        int iY02 = interfaceC22369k0.y0(t12.getF28512b());
        int iY03 = interfaceC22369k0.y0(t12.getF28514d());
        int iY04 = interfaceC22369k0.y0(Vb.f33290c);
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                interfaceC22363h0 = null;
                break;
            }
            interfaceC22363h0 = list2.get(i12);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "Leading")) {
                break;
            }
            i12++;
        }
        InterfaceC22363h0 interfaceC22363h05 = interfaceC22363h0;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h05 != null ? interfaceC22363h05.I(jC2) : null;
        int iE2 = Bb.e(k0I);
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                interfaceC22363h02 = null;
                break;
            }
            interfaceC22363h02 = list2.get(i13);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "Trailing")) {
                break;
            }
            i13++;
        }
        InterfaceC22363h0 interfaceC22363h06 = interfaceC22363h02;
        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h06 != null ? interfaceC22363h06.I(C22713c.j(-iE2, 0, jC2, 2)) : null;
        int iE3 = Bb.e(k0I2) + iE2;
        int i14 = -iY03;
        int i15 = -iE3;
        long jI2 = C22713c.i(i15, i14, jC2);
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                interfaceC22363h03 = null;
                break;
            }
            interfaceC22363h03 = list2.get(i16);
            int i17 = size3;
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h03), "Label")) {
                break;
            }
            i16++;
            size3 = i17;
        }
        InterfaceC22363h0 interfaceC22363h07 = interfaceC22363h03;
        androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h07 != null ? interfaceC22363h07.I(jI2) : null;
        if (k0I3 != null) {
            iD02 = k0I3.d0(C22350b.f40440b);
            if (iD02 == Integer.MIN_VALUE) {
                iD02 = k0I3.f40346c;
            }
        } else {
            iD02 = 0;
        }
        int iMax = Math.max(iD02, iY02);
        long jI3 = C22713c.i(i15, k0I3 != null ? (i14 - iY04) - iMax : (-iY02) - iY03, C22712b.c(j12, 0, 0, 0, 0, 11));
        int size4 = list.size();
        int i18 = 0;
        while (i18 < size4) {
            InterfaceC22363h0 interfaceC22363h08 = list2.get(i18);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h08), "TextField")) {
                androidx.compose.ui.layout.K0 k0I4 = interfaceC22363h08.I(jI3);
                long jC3 = C22712b.c(jI3, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        interfaceC22363h04 = null;
                        break;
                    }
                    interfaceC22363h04 = list2.get(i19);
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h04), "Hint")) {
                        break;
                    }
                    i19++;
                    list2 = list;
                }
                InterfaceC22363h0 interfaceC22363h09 = interfaceC22363h04;
                androidx.compose.ui.layout.K0 k0I5 = interfaceC22363h09 != null ? interfaceC22363h09.I(jC3) : null;
                int iG2 = C22713c.g(Math.max(k0I4.f40345b, Math.max(Bb.e(k0I3), Bb.e(k0I5))) + Bb.e(k0I) + Bb.e(k0I2), j12);
                int iB2 = Vb.b(k0I4.f40346c, k0I3 != null, iMax, Bb.d(k0I), Bb.d(k0I2), Bb.d(k0I5), j12, interfaceC22369k0.getF40389c(), wb2.f33330c);
                return interfaceC22369k0.L0(iG2, iB2, kotlin.collections.P0.c(), new c(k0I3, iY02, iD02, iG2, iB2, k0I4, k0I5, k0I, k0I2, this, iMax, iY04, interfaceC22369k0));
            }
            i18++;
            wb2 = this;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int c(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return a(interfaceC22393x, list, i12, d.f33346l);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int e(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return d(list, i12, e.f33347l);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int f(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return a(interfaceC22393x, list, i12, a.f33331l);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int h(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return d(list, i12, b.f33332l);
    }
}
