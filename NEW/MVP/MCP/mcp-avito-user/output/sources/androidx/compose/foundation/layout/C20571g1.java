package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.K0;
import androidx.compose.foundation.layout.X0.b;
import androidx.compose.foundation.layout.X0.c;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22381q0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FlowLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/g1;", "Landroidx/compose/ui/layout/q0;", "Landroidx/compose/foundation/layout/Z0;", "", "isHorizontal", "Landroidx/compose/foundation/layout/k$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/k$m;", "verticalArrangement", "Landroidx/compose/ui/unit/h;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/p0;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Landroidx/compose/foundation/layout/X0;", "overflow", "<init>", "(ZLandroidx/compose/foundation/layout/k$e;Landroidx/compose/foundation/layout/k$m;FLandroidx/compose/foundation/layout/p0;FIILandroidx/compose/foundation/layout/X0;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* data */ class C20571g1 implements InterfaceC22381q0, Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28628a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20585k.e f28629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20585k.m f28630c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AbstractC20606p0 f28632e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28633f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28634g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28635h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final X0 f28636i;

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.g1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f28637l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.g1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f28638l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
            return kotlin.G0.f406611a;
        }
    }

    public C20571g1(boolean z12, C20585k.e eVar, C20585k.m mVar, float f12, AbstractC20606p0 abstractC20606p0, float f13, int i12, int i13, X0 x02, C42822w c42822w) {
        this.f28628a = z12;
        this.f28629b = eVar;
        this.f28630c = mVar;
        this.f28631d = f12;
        this.f28632e = abstractC20606p0;
        this.f28633f = f13;
        this.f28634g = i12;
        this.f28635h = i13;
        this.f28636i = x02;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends List<? extends InterfaceC22363h0>> list, long j12) {
        if (this.f28635h != 0 && this.f28634g != 0 && !list.isEmpty()) {
            int i12 = C22712b.i(j12);
            X0 x02 = this.f28636i;
            if (i12 != 0 || x02.f28532a == FlowLayoutOverflow.OverflowType.f28263b) {
                List list2 = (List) C42745f0.E(list);
                if (list2.isEmpty()) {
                    return interfaceC22369k0.L0(0, 0, kotlin.collections.P0.c(), b.f28638l);
                }
                List list3 = (List) C42745f0.K(1, list);
                InterfaceC22363h0 interfaceC22363h0 = list3 != null ? (InterfaceC22363h0) C42745f0.G(list3) : null;
                List list4 = (List) C42745f0.K(2, list);
                InterfaceC22363h0 interfaceC22363h02 = list4 != null ? (InterfaceC22363h0) C42745f0.G(list4) : null;
                x02.f28536e = list2.size();
                X0 x03 = this.f28636i;
                x03.getClass();
                LayoutOrientation layoutOrientation = getF28628a() ? LayoutOrientation.f28394b : LayoutOrientation.f28395c;
                long jC2 = P1.c(P1.b(10, P1.a(j12, layoutOrientation)), layoutOrientation);
                if (interfaceC22363h0 != null) {
                    S0.f(interfaceC22363h0, this, jC2, x03.new b(this));
                    x03.f28537f = interfaceC22363h0;
                }
                if (interfaceC22363h02 != null) {
                    S0.f(interfaceC22363h02, this, jC2, x03.new c(this));
                    x03.f28539h = interfaceC22363h02;
                }
                return S0.e(interfaceC22369k0, this, list2.iterator(), this.f28631d, this.f28633f, P1.a(j12, this.f28628a ? LayoutOrientation.f28394b : LayoutOrientation.f28395c), this.f28634g, this.f28635h, this.f28636i);
            }
        }
        return interfaceC22369k0.L0(0, 0, kotlin.collections.P0.c(), a.f28637l);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    public final int c(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends List<? extends InterfaceC22391w>> list, int i12) {
        List list2 = (List) C42745f0.K(1, list);
        InterfaceC22391w interfaceC22391w = list2 != null ? (InterfaceC22391w) C42745f0.G(list2) : null;
        List list3 = (List) C42745f0.K(2, list);
        InterfaceC22391w interfaceC22391w2 = list3 != null ? (InterfaceC22391w) C42745f0.G(list3) : null;
        this.f28636i.b(interfaceC22391w, interfaceC22391w2, this.f28628a, C22713c.b(i12, 0, 13));
        boolean z12 = this.f28628a;
        float f12 = this.f28633f;
        float f13 = this.f28631d;
        if (z12) {
            List<? extends InterfaceC22391w> list4 = (List) C42745f0.G(list);
            if (list4 == null) {
                list4 = C42784z0.f406748b;
            }
            return p(list4, i12, interfaceC22393x.y0(f13), interfaceC22393x.y0(f12), this.f28634g, this.f28635h, this.f28636i);
        }
        List<? extends InterfaceC22391w> list5 = (List) C42745f0.G(list);
        if (list5 == null) {
            list5 = C42784z0.f406748b;
        }
        return r(list5, i12, interfaceC22393x.y0(f13), interfaceC22393x.y0(f12), this.f28634g, this.f28635h, this.f28636i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    public final int e(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends List<? extends InterfaceC22391w>> list, int i12) {
        List list2 = (List) C42745f0.K(1, list);
        InterfaceC22391w interfaceC22391w = list2 != null ? (InterfaceC22391w) C42745f0.G(list2) : null;
        List list3 = (List) C42745f0.K(2, list);
        InterfaceC22391w interfaceC22391w2 = list3 != null ? (InterfaceC22391w) C42745f0.G(list3) : null;
        this.f28636i.b(interfaceC22391w, interfaceC22391w2, this.f28628a, C22713c.b(0, i12, 7));
        boolean z12 = this.f28628a;
        float f12 = this.f28633f;
        float f13 = this.f28631d;
        if (z12) {
            List<? extends InterfaceC22391w> list4 = (List) C42745f0.G(list);
            if (list4 == null) {
                list4 = C42784z0.f406748b;
            }
            return r(list4, i12, interfaceC22393x.y0(f13), interfaceC22393x.y0(f12), this.f28634g, this.f28635h, this.f28636i);
        }
        List<? extends InterfaceC22391w> list5 = (List) C42745f0.G(list);
        if (list5 == null) {
            list5 = C42784z0.f406748b;
        }
        return p(list5, i12, interfaceC22393x.y0(f13), interfaceC22393x.y0(f12), this.f28634g, this.f28635h, this.f28636i);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20571g1)) {
            return false;
        }
        C20571g1 c20571g1 = (C20571g1) obj;
        return this.f28628a == c20571g1.f28628a && kotlin.jvm.internal.L.f(this.f28629b, c20571g1.f28629b) && kotlin.jvm.internal.L.f(this.f28630c, c20571g1.f28630c) && androidx.compose.ui.unit.h.b(this.f28631d, c20571g1.f28631d) && kotlin.jvm.internal.L.f(this.f28632e, c20571g1.f28632e) && androidx.compose.ui.unit.h.b(this.f28633f, c20571g1.f28633f) && this.f28634g == c20571g1.f28634g && this.f28635h == c20571g1.f28635h && kotlin.jvm.internal.L.f(this.f28636i, c20571g1.f28636i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    public final int f(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends List<? extends InterfaceC22391w>> list, int i12) {
        List list2 = (List) C42745f0.K(1, list);
        InterfaceC22391w interfaceC22391w = list2 != null ? (InterfaceC22391w) C42745f0.G(list2) : null;
        List list3 = (List) C42745f0.K(2, list);
        InterfaceC22391w interfaceC22391w2 = list3 != null ? (InterfaceC22391w) C42745f0.G(list3) : null;
        this.f28636i.b(interfaceC22391w, interfaceC22391w2, this.f28628a, C22713c.b(i12, 0, 13));
        boolean z12 = this.f28628a;
        float f12 = this.f28631d;
        if (!z12) {
            List list4 = (List) C42745f0.G(list);
            if (list4 == null) {
                list4 = C42784z0.f406748b;
            }
            return q(i12, interfaceC22393x.y0(f12), list4);
        }
        List<? extends InterfaceC22391w> list5 = (List) C42745f0.G(list);
        if (list5 == null) {
            list5 = C42784z0.f406748b;
        }
        return p(list5, i12, interfaceC22393x.y0(f12), interfaceC22393x.y0(this.f28633f), this.f28634g, this.f28635h, this.f28636i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    public final int h(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends List<? extends InterfaceC22391w>> list, int i12) {
        List list2 = (List) C42745f0.K(1, list);
        InterfaceC22391w interfaceC22391w = list2 != null ? (InterfaceC22391w) C42745f0.G(list2) : null;
        List list3 = (List) C42745f0.K(2, list);
        InterfaceC22391w interfaceC22391w2 = list3 != null ? (InterfaceC22391w) C42745f0.G(list3) : null;
        this.f28636i.b(interfaceC22391w, interfaceC22391w2, this.f28628a, C22713c.b(0, i12, 7));
        boolean z12 = this.f28628a;
        float f12 = this.f28631d;
        if (z12) {
            List list4 = (List) C42745f0.G(list);
            if (list4 == null) {
                list4 = C42784z0.f406748b;
            }
            return q(i12, interfaceC22393x.y0(f12), list4);
        }
        List<? extends InterfaceC22391w> list5 = (List) C42745f0.G(list);
        if (list5 == null) {
            list5 = C42784z0.f406748b;
        }
        return p(list5, i12, interfaceC22393x.y0(f12), interfaceC22393x.y0(this.f28633f), this.f28634g, this.f28635h, this.f28636i);
    }

    public final int hashCode() {
        int iHashCode = (this.f28630c.hashCode() + ((this.f28629b.hashCode() + (Boolean.hashCode(this.f28628a) * 31)) * 31)) * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f28636i.hashCode() + androidx.appcompat.app.r.e(this.f28635h, androidx.appcompat.app.r.e(this.f28634g, androidx.appcompat.app.r.d(this.f28633f, (this.f28632e.hashCode() + androidx.appcompat.app.r.d(this.f28631d, iHashCode, 31)) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.foundation.layout.Z0
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final C20585k.m getF28630c() {
        return this.f28630c;
    }

    @Override // androidx.compose.foundation.layout.Z0
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final C20585k.e getF28629b() {
        return this.f28629b;
    }

    @Override // androidx.compose.foundation.layout.Z0
    @Y61.k
    /* renamed from: n, reason: from getter */
    public final AbstractC20606p0 getF28632e() {
        return this.f28632e;
    }

    @Override // androidx.compose.foundation.layout.Z0
    /* renamed from: o, reason: from getter */
    public final boolean getF28628a() {
        return this.f28628a;
    }

    public final int p(@Y61.k List<? extends InterfaceC22391w> list, int i12, int i13, int i14, int i15, int i16, @Y61.k X0 x02) {
        long jB2;
        int iX2;
        int iG2;
        if (list.isEmpty()) {
            jB2 = androidx.collection.E.b(0, 0);
        } else {
            K0 k02 = new K0(i15, x02, C22713c.a(0, i12, 0, Integer.MAX_VALUE), i16, i13, i14, null);
            InterfaceC22391w interfaceC22391w = (InterfaceC22391w) C42745f0.K(0, list);
            boolean z12 = this.f28628a;
            int iX3 = interfaceC22391w != null ? z12 ? interfaceC22391w.X(i12) : interfaceC22391w.G(i12) : 0;
            int iG3 = interfaceC22391w != null ? z12 ? interfaceC22391w.G(iX3) : interfaceC22391w.X(iX3) : 0;
            int i17 = 0;
            int i18 = 0;
            if (k02.b(list.size() > 1, 0, androidx.collection.E.b(i12, Integer.MAX_VALUE), interfaceC22391w == null ? null : androidx.collection.E.a(androidx.collection.E.b(iG3, iX3)), 0, 0, 0, false, false).f28356b) {
                androidx.collection.E eA2 = x02.a(0, 0, interfaceC22391w != null);
                jB2 = androidx.collection.E.b(eA2 != null ? (int) (eA2.f25542a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i19 = i12;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    if (i22 >= size) {
                        break;
                    }
                    int i26 = i19 - iG3;
                    int i27 = i22 + 1;
                    int iMax = Math.max(i24, iX3);
                    InterfaceC22391w interfaceC22391w2 = (InterfaceC22391w) C42745f0.K(i27, list);
                    if (interfaceC22391w2 != null) {
                        iX2 = z12 ? interfaceC22391w2.X(i12) : interfaceC22391w2.G(i12);
                    } else {
                        iX2 = 0;
                    }
                    if (interfaceC22391w2 != null) {
                        iG2 = (z12 ? interfaceC22391w2.G(iX2) : interfaceC22391w2.X(iX2)) + i13;
                    } else {
                        iG2 = 0;
                    }
                    int i28 = i27 - i25;
                    int i29 = iX2;
                    int i32 = iG2;
                    K0.b bVarB = k02.b(i22 + 2 < list.size(), i28, androidx.collection.E.b(i26, Integer.MAX_VALUE), interfaceC22391w2 == null ? null : androidx.collection.E.a(androidx.collection.E.b(iG2, iX2)), i17, i18, iMax, false, false);
                    if (bVarB.f28355a) {
                        int i33 = iMax + i14 + i18;
                        K0.a aVarA = k02.a(bVarB, interfaceC22391w2 != null, i17, i33, i26, i28);
                        int i34 = i32 - i13;
                        i17++;
                        if (bVarB.f28356b) {
                            if (aVarA != null && !aVarA.f28354d) {
                                i33 += ((int) (aVarA.f28353c & 4294967295L)) + i14;
                            }
                            i18 = i33;
                            i23 = i27;
                        } else {
                            i19 = i12;
                            i24 = 0;
                            i18 = i33;
                            iG3 = i34;
                            i25 = i27;
                        }
                    } else {
                        i24 = iMax;
                        i19 = i26;
                        iG3 = i32;
                    }
                    iX3 = i29;
                    i22 = i27;
                    i23 = i22;
                }
                jB2 = androidx.collection.E.b(i18 - i14, i23);
            }
        }
        return (int) (jB2 >> 32);
    }

    public final int q(int i12, int i13, @Y61.k List list) {
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < size) {
            InterfaceC22391w interfaceC22391w = (InterfaceC22391w) list.get(i14);
            int iB02 = (this.f28628a ? interfaceC22391w.b0(i12) : interfaceC22391w.R(i12)) + i13;
            int i17 = i14 + 1;
            if (i17 - i15 == this.f28634g || i17 == list.size()) {
                iMax = Math.max(iMax, (i16 + iB02) - i13);
                i16 = 0;
                i15 = i14;
            } else {
                i16 += iB02;
            }
            i14 = i17;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(@Y61.k java.util.List<? extends androidx.compose.ui.layout.InterfaceC22391w> r40, int r41, int r42, int r43, int r44, int r45, @Y61.k androidx.compose.foundation.layout.X0 r46) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C20571g1.r(java.util.List, int, int, int, int, int, androidx.compose.foundation.layout.X0):int");
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowMeasurePolicy(isHorizontal=");
        sb2.append(this.f28628a);
        sb2.append(", horizontalArrangement=");
        sb2.append(this.f28629b);
        sb2.append(", verticalArrangement=");
        sb2.append(this.f28630c);
        sb2.append(", mainAxisSpacing=");
        androidx.compose.foundation.H.u(this.f28631d, ", crossAxisAlignment=", sb2);
        sb2.append(this.f28632e);
        sb2.append(", crossAxisArrangementSpacing=");
        androidx.compose.foundation.H.u(this.f28633f, ", maxItemsInMainAxis=", sb2);
        sb2.append(this.f28634g);
        sb2.append(", maxLines=");
        sb2.append(this.f28635h);
        sb2.append(", overflow=");
        sb2.append(this.f28636i);
        sb2.append(')');
        return sb2.toString();
    }
}
