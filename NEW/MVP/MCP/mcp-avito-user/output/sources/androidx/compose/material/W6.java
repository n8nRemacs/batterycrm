package androidx.compose.material;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/W6;", "Landroidx/compose/ui/layout/i0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class W6 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<l0.n, kotlin.G0> f33307a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33308b;

    /* renamed from: c, reason: collision with root package name */
    public final float f33309c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.layout.T1 f33310d;

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "w", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33311l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.R(num.intValue()));
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "h", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f33312l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.b0(num.intValue()));
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f33313l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f33314m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33315n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33316o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33317p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33318q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33319r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33320s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ W6 f33321t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f33322u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, int i13, androidx.compose.ui.layout.K0 k02, androidx.compose.ui.layout.K0 k03, androidx.compose.ui.layout.K0 k04, androidx.compose.ui.layout.K0 k05, androidx.compose.ui.layout.K0 k06, androidx.compose.ui.layout.K0 k07, W6 w62, InterfaceC22369k0 interfaceC22369k0) {
            super(1);
            this.f33313l = i12;
            this.f33314m = i13;
            this.f33315n = k02;
            this.f33316o = k03;
            this.f33317p = k04;
            this.f33318q = k05;
            this.f33319r = k06;
            this.f33320s = k07;
            this.f33321t = w62;
            this.f33322u = interfaceC22369k0;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            int iA2;
            int iA3;
            float fE2;
            K0.a aVar2 = aVar;
            W6 w62 = this.f33321t;
            InterfaceC22369k0 interfaceC22369k0 = this.f33322u;
            float f40389c = interfaceC22369k0.getF40389c();
            LayoutDirection f40449b = interfaceC22369k0.getF40449b();
            float f12 = V6.f33279a;
            androidx.compose.foundation.layout.T1 t12 = w62.f33310d;
            int iB2 = kotlin.math.b.b(t12.getF28512b() * f40389c);
            int iB3 = kotlin.math.b.b(androidx.compose.foundation.layout.R1.g(t12, f40449b) * f40389c);
            float f13 = Bb.f32410b * f40389c;
            int i12 = this.f33313l;
            androidx.compose.ui.layout.K0 k02 = this.f33315n;
            if (k02 != null) {
                InterfaceC22215f.f39074a.getClass();
                aVar2.h(k02, 0, InterfaceC22215f.a.f39086l.a(k02.f40346c, i12), 0.0f);
            }
            androidx.compose.ui.layout.K0 k03 = this.f33316o;
            if (k03 != null) {
                int i13 = this.f33314m - k03.f40345b;
                InterfaceC22215f.f39074a.getClass();
                aVar2.h(k03, i13, InterfaceC22215f.a.f39086l.a(k03.f40346c, i12), 0.0f);
            }
            boolean z12 = w62.f33308b;
            androidx.compose.ui.layout.K0 k04 = this.f33318q;
            if (k04 != null) {
                if (z12) {
                    InterfaceC22215f.f39074a.getClass();
                    iA3 = InterfaceC22215f.a.f39086l.a(k04.f40346c, i12);
                } else {
                    iA3 = iB2;
                }
                int i14 = -(k04.f40346c / 2);
                float f14 = w62.f33309c;
                int iC2 = E0.e.c(f14, iA3, i14);
                if (k02 == null) {
                    fE2 = 0.0f;
                } else {
                    fE2 = (1 - f14) * (Bb.e(k02) - f13);
                }
                aVar2.h(k04, kotlin.math.b.b(fE2) + iB3, iC2, 0.0f);
            }
            androidx.compose.ui.layout.K0 k05 = this.f33317p;
            if (z12) {
                InterfaceC22215f.f39074a.getClass();
                iA2 = InterfaceC22215f.a.f39086l.a(k05.f40346c, i12);
            } else {
                iA2 = iB2;
            }
            aVar2.h(k05, Bb.e(k02), Math.max(iA2, Bb.d(k04) / 2), 0.0f);
            androidx.compose.ui.layout.K0 k06 = this.f33319r;
            if (k06 != null) {
                if (z12) {
                    InterfaceC22215f.f39074a.getClass();
                    iB2 = InterfaceC22215f.a.f39086l.a(k06.f40346c, i12);
                }
                aVar2.h(k06, Bb.e(k02), Math.max(iB2, Bb.d(k04) / 2), 0.0f);
            }
            androidx.compose.ui.unit.q.f42862b.getClass();
            K0.a.g(aVar2, this.f33320s, 0L);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "w", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f33323l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.X(num.intValue()));
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/w;", "intrinsicMeasurable", "", "h", "invoke", "(Landroidx/compose/ui/layout/w;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<InterfaceC22391w, Integer, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f33324l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(InterfaceC22391w interfaceC22391w, Integer num) {
            return Integer.valueOf(interfaceC22391w.G(num.intValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W6(@Y61.k Y41.l<? super l0.n, kotlin.G0> lVar, boolean z12, float f12, @Y61.k androidx.compose.foundation.layout.T1 t12) {
        this.f33307a = lVar;
        this.f33308b = z12;
        this.f33309c = f12;
        this.f33310d = t12;
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
            float f12 = V6.f33279a;
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
            float f13 = V6.f33279a;
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
        int iIntValue3 = interfaceC22391w7 != null ? pVar.invoke(interfaceC22391w7, Integer.valueOf(E0.e.c(this.f33309c, i13, i12))).intValue() : 0;
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
                return V6.b(iIntValue, iIntValue2, iIntValue4, iIntValue3, interfaceC22391w10 != null ? pVar.invoke(interfaceC22391w10, Integer.valueOf(i13)).intValue() : 0, this.f33309c, C22713c.b(0, 0, 15), interfaceC22393x.getF40389c(), this.f33310d);
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
        long jA2;
        InterfaceC22363h0 interfaceC22363h04;
        androidx.compose.foundation.layout.T1 t12 = this.f33310d;
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
            interfaceC22363h02 = list.get(i13);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "Trailing")) {
                break;
            }
            i13++;
        }
        InterfaceC22363h0 interfaceC22363h06 = interfaceC22363h02;
        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h06 != null ? interfaceC22363h06.I(C22713c.j(-iE2, 0, jC2, 2)) : null;
        int iE3 = Bb.e(k0I2) + iE2;
        int iY03 = interfaceC22369k0.y0(t12.a(interfaceC22369k0.getF40449b())) + interfaceC22369k0.y0(t12.c(interfaceC22369k0.getF40449b()));
        int i14 = -iE3;
        int i15 = -iY02;
        long jI2 = C22713c.i(E0.e.c(this.f33309c, i14 - iY03, -iY03), i15, jC2);
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                interfaceC22363h03 = null;
                break;
            }
            interfaceC22363h03 = list.get(i16);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h03), "Label")) {
                break;
            }
            i16++;
        }
        InterfaceC22363h0 interfaceC22363h07 = interfaceC22363h03;
        androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h07 != null ? interfaceC22363h07.I(jI2) : null;
        if (k0I3 != null) {
            jA2 = l0.o.a(k0I3.f40345b, k0I3.f40346c);
        } else {
            l0.n.f413402b.getClass();
            jA2 = 0;
        }
        this.f33307a.invoke(l0.n.a(jA2));
        long jC3 = C22712b.c(C22713c.i(i14, i15 - Math.max(Bb.d(k0I3) / 2, interfaceC22369k0.y0(t12.getF28512b())), j12), 0, 0, 0, 0, 11);
        int size4 = list.size();
        for (int i17 = 0; i17 < size4; i17++) {
            InterfaceC22363h0 interfaceC22363h08 = list.get(i17);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h08), "TextField")) {
                androidx.compose.ui.layout.K0 k0I4 = interfaceC22363h08.I(jC3);
                long jC4 = C22712b.c(jC3, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        interfaceC22363h04 = null;
                        break;
                    }
                    interfaceC22363h04 = list.get(i18);
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h04), "Hint")) {
                        break;
                    }
                    i18++;
                }
                InterfaceC22363h0 interfaceC22363h09 = interfaceC22363h04;
                androidx.compose.ui.layout.K0 k0I5 = interfaceC22363h09 != null ? interfaceC22363h09.I(jC4) : null;
                int iC2 = V6.c(Bb.e(k0I), Bb.e(k0I2), k0I4.f40345b, Bb.e(k0I3), Bb.e(k0I5), this.f33309c, j12, interfaceC22369k0.getF40389c(), this.f33310d);
                int iB2 = V6.b(Bb.d(k0I), Bb.d(k0I2), k0I4.f40346c, Bb.d(k0I3), Bb.d(k0I5), this.f33309c, j12, interfaceC22369k0.getF40389c(), this.f33310d);
                int size6 = list.size();
                for (int i19 = 0; i19 < size6; i19++) {
                    InterfaceC22363h0 interfaceC22363h010 = list.get(i19);
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h010), "border")) {
                        return interfaceC22369k0.L0(iC2, iB2, kotlin.collections.P0.c(), new c(iB2, iC2, k0I, k0I2, k0I4, k0I3, k0I5, interfaceC22363h010.I(C22713c.a(iC2 != Integer.MAX_VALUE ? iC2 : 0, iC2, iB2 != Integer.MAX_VALUE ? iB2 : 0, iB2)), this, interfaceC22369k0));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int c(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return a(interfaceC22393x, list, i12, d.f33323l);
    }

    public final int d(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12, Y41.p<? super InterfaceC22391w, ? super Integer, Integer> pVar) {
        InterfaceC22391w interfaceC22391w;
        InterfaceC22391w interfaceC22391w2;
        InterfaceC22391w interfaceC22391w3;
        InterfaceC22391w interfaceC22391w4;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC22391w interfaceC22391w5 = list.get(i13);
            if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w5), "TextField")) {
                int iIntValue = pVar.invoke(interfaceC22391w5, Integer.valueOf(i12)).intValue();
                int size2 = list.size();
                int i14 = 0;
                while (true) {
                    interfaceC22391w = null;
                    if (i14 >= size2) {
                        interfaceC22391w2 = null;
                        break;
                    }
                    interfaceC22391w2 = list.get(i14);
                    if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w2), "Label")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC22391w interfaceC22391w6 = interfaceC22391w2;
                int iIntValue2 = interfaceC22391w6 != null ? pVar.invoke(interfaceC22391w6, Integer.valueOf(i12)).intValue() : 0;
                int size3 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size3) {
                        interfaceC22391w3 = null;
                        break;
                    }
                    interfaceC22391w3 = list.get(i15);
                    if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w3), "Trailing")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC22391w interfaceC22391w7 = interfaceC22391w3;
                int iIntValue3 = interfaceC22391w7 != null ? pVar.invoke(interfaceC22391w7, Integer.valueOf(i12)).intValue() : 0;
                int size4 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size4) {
                        interfaceC22391w4 = null;
                        break;
                    }
                    interfaceC22391w4 = list.get(i16);
                    if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w4), "Leading")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC22391w interfaceC22391w8 = interfaceC22391w4;
                int iIntValue4 = interfaceC22391w8 != null ? pVar.invoke(interfaceC22391w8, Integer.valueOf(i12)).intValue() : 0;
                int size5 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        break;
                    }
                    InterfaceC22391w interfaceC22391w9 = list.get(i17);
                    if (kotlin.jvm.internal.L.f(Bb.c(interfaceC22391w9), "Hint")) {
                        interfaceC22391w = interfaceC22391w9;
                        break;
                    }
                    i17++;
                }
                InterfaceC22391w interfaceC22391w10 = interfaceC22391w;
                return V6.c(iIntValue4, iIntValue3, iIntValue, iIntValue2, interfaceC22391w10 != null ? pVar.invoke(interfaceC22391w10, Integer.valueOf(i12)).intValue() : 0, this.f33309c, C22713c.b(0, 0, 15), interfaceC22393x.getF40389c(), this.f33310d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int e(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return d(interfaceC22393x, list, i12, e.f33324l);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int f(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return a(interfaceC22393x, list, i12, a.f33311l);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int h(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return d(interfaceC22393x, list, i12, b.f33312l);
    }
}
