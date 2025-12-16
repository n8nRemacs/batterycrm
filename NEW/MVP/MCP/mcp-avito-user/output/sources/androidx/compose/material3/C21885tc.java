package androidx.compose.material3;

import androidx.compose.ui.InterfaceC22215f;
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
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/tc;", "Landroidx/compose/ui/layout/i0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21885tc implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<l0.n, kotlin.G0> f37315a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37316b;

    /* renamed from: c, reason: collision with root package name */
    public final float f37317c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.layout.T1 f37318d;

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "w", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.tc$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f37319l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.R(num.intValue()));
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "h", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.tc$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f37320l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.b0(num.intValue()));
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.tc$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f37321l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f37322m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37323n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37324o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37325p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37326q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37327r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37328s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37329t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37330u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37331v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ C21885tc f37332w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f37333x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, int i13, androidx.compose.ui.layout.K0 k02, androidx.compose.ui.layout.K0 k03, androidx.compose.ui.layout.K0 k04, androidx.compose.ui.layout.K0 k05, androidx.compose.ui.layout.K0 k06, androidx.compose.ui.layout.K0 k07, androidx.compose.ui.layout.K0 k08, androidx.compose.ui.layout.K0 k09, androidx.compose.ui.layout.K0 k010, C21885tc c21885tc, InterfaceC22369k0 interfaceC22369k0) {
            super(1);
            this.f37321l = i12;
            this.f37322m = i13;
            this.f37323n = k02;
            this.f37324o = k03;
            this.f37325p = k04;
            this.f37326q = k05;
            this.f37327r = k06;
            this.f37328s = k07;
            this.f37329t = k08;
            this.f37330u = k09;
            this.f37331v = k010;
            this.f37332w = c21885tc;
            this.f37333x = interfaceC22369k0;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            int iA2;
            float f12;
            K0.a aVar2 = aVar;
            C21885tc c21885tc = this.f37332w;
            InterfaceC22369k0 interfaceC22369k0 = this.f37333x;
            float f40389c = interfaceC22369k0.getF40389c();
            LayoutDirection f40449b = interfaceC22369k0.getF40449b();
            float f13 = C21565fc.f36340a;
            androidx.compose.ui.unit.q.f42862b.getClass();
            K0.a.g(aVar2, this.f37330u, 0L);
            androidx.compose.ui.layout.K0 k02 = this.f37331v;
            int iE2 = this.f37321l - C21457aj.e(k02);
            androidx.compose.foundation.layout.T1 t12 = c21885tc.f37318d;
            int iB2 = kotlin.math.b.b(t12.getF28512b() * f40389c);
            int iB3 = kotlin.math.b.b(androidx.compose.foundation.layout.R1.g(t12, f40449b) * f40389c);
            float f14 = C21457aj.f36051c * f40389c;
            androidx.compose.ui.layout.K0 k03 = this.f37323n;
            if (k03 != null) {
                InterfaceC22215f.f39074a.getClass();
                aVar2.h(k03, 0, InterfaceC22215f.a.f39086l.a(k03.f40346c, iE2), 0.0f);
            }
            int i12 = this.f37322m;
            androidx.compose.ui.layout.K0 k04 = this.f37324o;
            if (k04 != null) {
                int i13 = i12 - k04.f40345b;
                InterfaceC22215f.f39074a.getClass();
                aVar2.h(k04, i13, InterfaceC22215f.a.f39086l.a(k04.f40346c, iE2), 0.0f);
            }
            boolean z12 = c21885tc.f37316b;
            androidx.compose.ui.layout.K0 k05 = this.f37328s;
            if (k05 != null) {
                if (z12) {
                    InterfaceC22215f.f39074a.getClass();
                    iA2 = InterfaceC22215f.a.f39086l.a(k05.f40346c, iE2);
                } else {
                    iA2 = iB2;
                }
                int i14 = -(k05.f40346c / 2);
                float f15 = c21885tc.f37317c;
                int iC2 = E0.e.c(f15, iA2, i14);
                if (k03 == null) {
                    f12 = 0.0f;
                } else {
                    f12 = (1 - f15) * (C21457aj.f(k03) - f14);
                }
                aVar2.h(k05, kotlin.math.b.b(f12) + iB3, iC2, 0.0f);
            }
            androidx.compose.ui.layout.K0 k06 = this.f37325p;
            if (k06 != null) {
                aVar2.h(k06, C21457aj.f(k03), C21565fc.f(z12, iE2, iB2, k05, k06), 0.0f);
            }
            androidx.compose.ui.layout.K0 k07 = this.f37326q;
            if (k07 != null) {
                aVar2.h(k07, (i12 - C21457aj.f(k04)) - k07.f40345b, C21565fc.f(z12, iE2, iB2, k05, k07), 0.0f);
            }
            int iF2 = C21457aj.f(k06) + C21457aj.f(k03);
            androidx.compose.ui.layout.K0 k08 = this.f37327r;
            aVar2.h(k08, iF2, C21565fc.f(z12, iE2, iB2, k05, k08), 0.0f);
            androidx.compose.ui.layout.K0 k09 = this.f37329t;
            if (k09 != null) {
                aVar2.h(k09, iF2, C21565fc.f(z12, iE2, iB2, k05, k09), 0.0f);
            }
            if (k02 != null) {
                aVar2.h(k02, 0, iE2, 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "w", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.tc$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f37334l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.X(num.intValue()));
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "h", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.tc$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f37335l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.G(num.intValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21885tc(@Y61.k Y41.l<? super l0.n, kotlin.G0> lVar, boolean z12, float f12, @Y61.k androidx.compose.foundation.layout.T1 t12) {
        this.f37315a = lVar;
        this.f37316b = z12;
        this.f37317c = f12;
        this.f37318d = t12;
    }

    public final int a(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12, Y41.p<? super InterfaceC22391w, ? super Integer, Integer> pVar) {
        InterfaceC22391w interfaceC22391w;
        int i13;
        int iIntValue;
        InterfaceC22391w interfaceC22391w2;
        int iIntValue2;
        InterfaceC22391w interfaceC22391w3;
        InterfaceC22391w interfaceC22391w4;
        int iIntValue3;
        InterfaceC22391w interfaceC22391w5;
        int i14;
        InterfaceC22391w interfaceC22391w6;
        InterfaceC22391w interfaceC22391w7;
        int size = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                interfaceC22391w = null;
                break;
            }
            interfaceC22391w = list.get(i15);
            if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w), "Leading")) {
                break;
            }
            i15++;
        }
        InterfaceC22391w interfaceC22391w8 = interfaceC22391w;
        if (interfaceC22391w8 != null) {
            int iB02 = interfaceC22391w8.b0(Integer.MAX_VALUE);
            float f12 = C21565fc.f36340a;
            i13 = i12 == Integer.MAX_VALUE ? i12 : i12 - iB02;
            iIntValue = pVar.invoke(interfaceC22391w8, Integer.valueOf(i12)).intValue();
        } else {
            i13 = i12;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                interfaceC22391w2 = null;
                break;
            }
            interfaceC22391w2 = list.get(i16);
            if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w2), "Trailing")) {
                break;
            }
            i16++;
        }
        InterfaceC22391w interfaceC22391w9 = interfaceC22391w2;
        if (interfaceC22391w9 != null) {
            int iB03 = interfaceC22391w9.b0(Integer.MAX_VALUE);
            float f13 = C21565fc.f36340a;
            if (i13 != Integer.MAX_VALUE) {
                i13 -= iB03;
            }
            iIntValue2 = pVar.invoke(interfaceC22391w9, Integer.valueOf(i12)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                interfaceC22391w3 = null;
                break;
            }
            interfaceC22391w3 = list.get(i17);
            if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w3), "Label")) {
                break;
            }
            i17++;
        }
        InterfaceC22391w interfaceC22391w10 = interfaceC22391w3;
        int iIntValue4 = interfaceC22391w10 != null ? pVar.invoke(interfaceC22391w10, Integer.valueOf(E0.e.c(this.f37317c, i13, i12))).intValue() : 0;
        int size4 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size4) {
                interfaceC22391w4 = null;
                break;
            }
            interfaceC22391w4 = list.get(i18);
            if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w4), "Prefix")) {
                break;
            }
            i18++;
        }
        InterfaceC22391w interfaceC22391w11 = interfaceC22391w4;
        if (interfaceC22391w11 != null) {
            iIntValue3 = pVar.invoke(interfaceC22391w11, Integer.valueOf(i13)).intValue();
            int iB04 = interfaceC22391w11.b0(Integer.MAX_VALUE);
            float f14 = C21565fc.f36340a;
            if (i13 != Integer.MAX_VALUE) {
                i13 -= iB04;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size5) {
                interfaceC22391w5 = null;
                break;
            }
            interfaceC22391w5 = list.get(i19);
            if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w5), "Suffix")) {
                break;
            }
            i19++;
        }
        InterfaceC22391w interfaceC22391w12 = interfaceC22391w5;
        if (interfaceC22391w12 != null) {
            int iIntValue5 = pVar.invoke(interfaceC22391w12, Integer.valueOf(i13)).intValue();
            int iB05 = interfaceC22391w12.b0(Integer.MAX_VALUE);
            float f15 = C21565fc.f36340a;
            if (i13 != Integer.MAX_VALUE) {
                i13 -= iB05;
            }
            i14 = iIntValue5;
        } else {
            i14 = 0;
        }
        int size6 = list.size();
        for (int i22 = 0; i22 < size6; i22++) {
            InterfaceC22391w interfaceC22391w13 = list.get(i22);
            if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w13), "TextField")) {
                int iIntValue6 = pVar.invoke(interfaceC22391w13, Integer.valueOf(i13)).intValue();
                int size7 = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size7) {
                        interfaceC22391w6 = null;
                        break;
                    }
                    interfaceC22391w6 = list.get(i23);
                    if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w6), "Hint")) {
                        break;
                    }
                    i23++;
                }
                InterfaceC22391w interfaceC22391w14 = interfaceC22391w6;
                int iIntValue7 = interfaceC22391w14 != null ? pVar.invoke(interfaceC22391w14, Integer.valueOf(i13)).intValue() : 0;
                int size8 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size8) {
                        interfaceC22391w7 = null;
                        break;
                    }
                    InterfaceC22391w interfaceC22391w15 = list.get(i24);
                    if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w15), "Supporting")) {
                        interfaceC22391w7 = interfaceC22391w15;
                        break;
                    }
                    i24++;
                }
                InterfaceC22391w interfaceC22391w16 = interfaceC22391w7;
                return C21565fc.d(iIntValue, iIntValue2, iIntValue3, i14, iIntValue6, iIntValue4, iIntValue7, interfaceC22391w16 != null ? pVar.invoke(interfaceC22391w16, Integer.valueOf(i12)).intValue() : 0, this.f37317c, C21457aj.f36049a, interfaceC22393x.getF40389c(), this.f37318d);
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
        androidx.compose.ui.layout.K0 k02;
        androidx.compose.ui.layout.K0 k0I;
        InterfaceC22363h0 interfaceC22363h04;
        androidx.compose.ui.layout.K0 k03;
        InterfaceC22363h0 interfaceC22363h05;
        InterfaceC22363h0 interfaceC22363h06;
        InterfaceC22363h0 interfaceC22363h07;
        androidx.compose.foundation.layout.T1 t12 = this.f37318d;
        int iY02 = interfaceC22369k0.y0(t12.getF28514d());
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                interfaceC22363h0 = null;
                break;
            }
            interfaceC22363h0 = list.get(i12);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "Leading")) {
                break;
            }
            i12++;
        }
        InterfaceC22363h0 interfaceC22363h08 = interfaceC22363h0;
        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h08 != null ? interfaceC22363h08.I(jC2) : null;
        int iF2 = C21457aj.f(k0I2);
        int iMax = Math.max(0, C21457aj.e(k0I2));
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                interfaceC22363h02 = null;
                break;
            }
            interfaceC22363h02 = list.get(i13);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "Trailing")) {
                break;
            }
            i13++;
        }
        InterfaceC22363h0 interfaceC22363h09 = interfaceC22363h02;
        androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h09 != null ? interfaceC22363h09.I(C22713c.j(-iF2, 0, jC2, 2)) : null;
        int iF3 = C21457aj.f(k0I3) + iF2;
        int iMax2 = Math.max(iMax, C21457aj.e(k0I3));
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                interfaceC22363h03 = null;
                break;
            }
            interfaceC22363h03 = list.get(i14);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h03), "Prefix")) {
                break;
            }
            i14++;
        }
        InterfaceC22363h0 interfaceC22363h010 = interfaceC22363h03;
        if (interfaceC22363h010 != null) {
            k02 = k0I2;
            k0I = interfaceC22363h010.I(C22713c.j(-iF3, 0, jC2, 2));
        } else {
            k02 = k0I2;
            k0I = null;
        }
        int iF4 = C21457aj.f(k0I) + iF3;
        int iMax3 = Math.max(iMax2, C21457aj.e(k0I));
        int size4 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                interfaceC22363h04 = null;
                break;
            }
            interfaceC22363h04 = list.get(i15);
            int i16 = size4;
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h04), "Suffix")) {
                break;
            }
            i15++;
            size4 = i16;
        }
        InterfaceC22363h0 interfaceC22363h011 = interfaceC22363h04;
        androidx.compose.ui.layout.K0 k0I4 = interfaceC22363h011 != null ? interfaceC22363h011.I(C22713c.j(-iF4, 0, jC2, 2)) : null;
        int iF5 = C21457aj.f(k0I4) + iF4;
        int iMax4 = Math.max(iMax3, C21457aj.e(k0I4));
        InterfaceC22369k0 interfaceC22369k02 = interfaceC22369k0;
        int iY03 = interfaceC22369k02.y0(t12.a(interfaceC22369k0.getF40449b())) + interfaceC22369k02.y0(t12.c(interfaceC22369k0.getF40449b()));
        int i17 = -iF5;
        C21885tc c21885tc = this;
        int iC2 = E0.e.c(c21885tc.f37317c, i17 - iY03, -iY03);
        int i18 = -iY02;
        androidx.compose.ui.layout.K0 k04 = k0I4;
        long jI2 = C22713c.i(iC2, i18, jC2);
        int size5 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size5) {
                k03 = k04;
                interfaceC22363h05 = null;
                break;
            }
            interfaceC22363h05 = list.get(i19);
            int i22 = size5;
            k03 = k04;
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h05), "Label")) {
                break;
            }
            i19++;
            k04 = k03;
            size5 = i22;
        }
        InterfaceC22363h0 interfaceC22363h012 = interfaceC22363h05;
        androidx.compose.ui.layout.K0 k0I5 = interfaceC22363h012 != null ? interfaceC22363h012.I(jI2) : null;
        if (k0I5 != null) {
            c21885tc.f37315a.invoke(l0.n.a(l0.o.a(k0I5.f40345b, k0I5.f40346c)));
        }
        int size6 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                interfaceC22363h06 = null;
                break;
            }
            interfaceC22363h06 = list.get(i23);
            int i24 = size6;
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h06), "Supporting")) {
                break;
            }
            i23++;
            size6 = i24;
        }
        InterfaceC22363h0 interfaceC22363h013 = interfaceC22363h06;
        int iX2 = interfaceC22363h013 != null ? interfaceC22363h013.X(C22712b.l(j12)) : 0;
        int iMax5 = Math.max(C21457aj.e(k0I5) / 2, interfaceC22369k02.y0(t12.getF28512b()));
        long jC3 = C22712b.c(C22713c.i(i17, (i18 - iMax5) - iX2, j12), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i25 = 0;
        while (i25 < size7) {
            int i26 = size7;
            InterfaceC22363h0 interfaceC22363h014 = list.get(i25);
            int i27 = i25;
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h014), "TextField")) {
                androidx.compose.ui.layout.K0 k0I6 = interfaceC22363h014.I(jC3);
                long jC4 = C22712b.c(jC3, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size8) {
                        interfaceC22363h07 = null;
                        break;
                    }
                    interfaceC22363h07 = list.get(i28);
                    int i29 = size8;
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h07), "Hint")) {
                        break;
                    }
                    i28++;
                    size8 = i29;
                }
                InterfaceC22363h0 interfaceC22363h015 = interfaceC22363h07;
                androidx.compose.ui.layout.K0 k0I7 = interfaceC22363h015 != null ? interfaceC22363h015.I(jC4) : null;
                int iMax6 = Math.max(iMax4, Math.max(C21457aj.e(k0I6), C21457aj.e(k0I7)) + iMax5 + iY02);
                int iE2 = C21565fc.e(C21457aj.f(k02), C21457aj.f(k0I3), C21457aj.f(k0I), C21457aj.f(k03), k0I6.f40345b, C21457aj.f(k0I5), C21457aj.f(k0I7), c21885tc.f37317c, j12, interfaceC22369k0.getF40389c(), c21885tc.f37318d);
                androidx.compose.ui.layout.K0 k0I8 = interfaceC22363h013 != null ? interfaceC22363h013.I(C22712b.c(C22713c.j(0, -iMax6, jC2, 1), 0, iE2, 0, 0, 9)) : null;
                int iE3 = C21457aj.e(k0I8);
                int iD2 = C21565fc.d(C21457aj.e(k02), C21457aj.e(k0I3), C21457aj.e(k0I), C21457aj.e(k03), k0I6.f40346c, C21457aj.e(k0I5), C21457aj.e(k0I7), C21457aj.e(k0I8), c21885tc.f37317c, j12, interfaceC22369k0.getF40389c(), c21885tc.f37318d);
                int i32 = iD2 - iE3;
                int size9 = list.size();
                for (int i33 = 0; i33 < size9; i33++) {
                    InterfaceC22363h0 interfaceC22363h016 = list.get(i33);
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h016), "Container")) {
                        return interfaceC22369k0.L0(iE2, iD2, kotlin.collections.P0.c(), new c(iD2, iE2, k02, k0I3, k0I, k03, k0I6, k0I5, k0I7, interfaceC22363h016.I(C22713c.a(iE2 != Integer.MAX_VALUE ? iE2 : 0, iE2, i32 != Integer.MAX_VALUE ? i32 : 0, i32)), k0I8, this, interfaceC22369k0));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i25 = i27 + 1;
            size7 = i26;
            c21885tc = this;
            interfaceC22369k02 = interfaceC22369k02;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int c(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return a(interfaceC22393x, list, i12, d.f37334l);
    }

    public final int d(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12, Y41.p<? super InterfaceC22391w, ? super Integer, Integer> pVar) {
        InterfaceC22391w interfaceC22391w;
        InterfaceC22391w interfaceC22391w2;
        InterfaceC22391w interfaceC22391w3;
        InterfaceC22391w interfaceC22391w4;
        InterfaceC22391w interfaceC22391w5;
        InterfaceC22391w interfaceC22391w6;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC22391w interfaceC22391w7 = list.get(i13);
            if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w7), "TextField")) {
                int iIntValue = pVar.invoke(interfaceC22391w7, Integer.valueOf(i12)).intValue();
                int size2 = list.size();
                int i14 = 0;
                while (true) {
                    interfaceC22391w = null;
                    if (i14 >= size2) {
                        interfaceC22391w2 = null;
                        break;
                    }
                    interfaceC22391w2 = list.get(i14);
                    if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w2), "Label")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC22391w interfaceC22391w8 = interfaceC22391w2;
                int iIntValue2 = interfaceC22391w8 != null ? pVar.invoke(interfaceC22391w8, Integer.valueOf(i12)).intValue() : 0;
                int size3 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size3) {
                        interfaceC22391w3 = null;
                        break;
                    }
                    interfaceC22391w3 = list.get(i15);
                    if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w3), "Trailing")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC22391w interfaceC22391w9 = interfaceC22391w3;
                int iIntValue3 = interfaceC22391w9 != null ? pVar.invoke(interfaceC22391w9, Integer.valueOf(i12)).intValue() : 0;
                int size4 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size4) {
                        interfaceC22391w4 = null;
                        break;
                    }
                    interfaceC22391w4 = list.get(i16);
                    if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w4), "Leading")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC22391w interfaceC22391w10 = interfaceC22391w4;
                int iIntValue4 = interfaceC22391w10 != null ? pVar.invoke(interfaceC22391w10, Integer.valueOf(i12)).intValue() : 0;
                int size5 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        interfaceC22391w5 = null;
                        break;
                    }
                    interfaceC22391w5 = list.get(i17);
                    if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w5), "Prefix")) {
                        break;
                    }
                    i17++;
                }
                InterfaceC22391w interfaceC22391w11 = interfaceC22391w5;
                int iIntValue5 = interfaceC22391w11 != null ? pVar.invoke(interfaceC22391w11, Integer.valueOf(i12)).intValue() : 0;
                int size6 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size6) {
                        interfaceC22391w6 = null;
                        break;
                    }
                    interfaceC22391w6 = list.get(i18);
                    if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w6), "Suffix")) {
                        break;
                    }
                    i18++;
                }
                InterfaceC22391w interfaceC22391w12 = interfaceC22391w6;
                int iIntValue6 = interfaceC22391w12 != null ? pVar.invoke(interfaceC22391w12, Integer.valueOf(i12)).intValue() : 0;
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        break;
                    }
                    InterfaceC22391w interfaceC22391w13 = list.get(i19);
                    if (kotlin.jvm.internal.L.f(C21457aj.d(interfaceC22391w13), "Hint")) {
                        interfaceC22391w = interfaceC22391w13;
                        break;
                    }
                    i19++;
                }
                InterfaceC22391w interfaceC22391w14 = interfaceC22391w;
                return C21565fc.e(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC22391w14 != null ? pVar.invoke(interfaceC22391w14, Integer.valueOf(i12)).intValue() : 0, this.f37317c, C21457aj.f36049a, interfaceC22393x.getF40389c(), this.f37318d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int e(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return d(interfaceC22393x, list, i12, e.f37335l);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int f(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return a(interfaceC22393x, list, i12, a.f37319l);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int h(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return d(interfaceC22393x, list, i12, b.f37320l);
    }
}
