package androidx.compose.foundation.pager;

import androidx.compose.foundation.C21080u0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.layout.C20733n;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;

/* compiled from: PagerMeasurePolicy.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/Q;", "Landroidx/compose/ui/unit/b;", "containerConstraints", "Landroidx/compose/foundation/pager/Z;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/Q;J)Landroidx/compose/foundation/pager/Z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class X extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.foundation.lazy.layout.Q, C22712b, Z> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f29853l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Orientation f29854m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1 f29855n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f29856o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f29857p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20823q f29858q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.o f29859r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Integer> f29860s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.c f29861t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.b f29862u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29863v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.snapping.v f29864w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f29865x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(m0 m0Var, Orientation orientation, T1 t12, boolean z12, float f12, InterfaceC20823q interfaceC20823q, kotlin.reflect.o oVar, Y41.a aVar, InterfaceC22215f.c cVar, InterfaceC22215f.b bVar, int i12, androidx.compose.foundation.gestures.snapping.v vVar, kotlinx.coroutines.T t13) {
        super(2);
        this.f29853l = m0Var;
        this.f29854m = orientation;
        this.f29855n = t12;
        this.f29856o = z12;
        this.f29857p = f12;
        this.f29858q = interfaceC20823q;
        this.f29859r = oVar;
        this.f29860s = aVar;
        this.f29861t = cVar;
        this.f29862u = bVar;
        this.f29863v = i12;
        this.f29864w = vVar;
        this.f29865x = t13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v70, types: [kotlin.ranges.j] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v51, types: [kotlin.collections.z0] */
    @Override // Y41.p
    public final Z invoke(androidx.compose.foundation.lazy.layout.Q q12, C22712b c22712b) {
        long j12;
        int i12;
        int i13;
        long j13;
        int i14;
        Orientation orientation;
        int i15;
        Y41.l<Object, G0> f38713f;
        Orientation orientation2;
        kotlinx.coroutines.T t12;
        int i16;
        int i17;
        int i18;
        InterfaceC22215f.c cVar;
        int i19;
        InterfaceC22215f.b bVar;
        int i22;
        boolean z12;
        int i23;
        int i24;
        C42754k c42754k;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i32;
        int i33;
        C20820n c20820n;
        int i34;
        List<Integer> list;
        List arrayList;
        List arrayList2;
        C20820n c20820n2;
        int i35;
        int i36;
        ArrayList arrayList3;
        List list2;
        ArrayList arrayList4;
        ?? arrayList5;
        List list3;
        int i37;
        int i38;
        androidx.compose.foundation.gestures.snapping.v vVar;
        int i39;
        int i42;
        List list4;
        List list5;
        boolean z13;
        Orientation orientation3;
        Object obj;
        m0 m0Var;
        Z z14;
        int[] iArr;
        int i43;
        int i44;
        C42754k c42754k2;
        int i45;
        X x12 = this;
        androidx.compose.foundation.lazy.layout.Q q13 = q12;
        long j14 = c22712b.f42843a;
        m0 m0Var2 = x12.f29853l;
        m0Var2.f29959E.getF42167b();
        Orientation orientation4 = Orientation.f27425b;
        Orientation orientation5 = x12.f29854m;
        boolean z15 = orientation5 == orientation4;
        C21080u0.a(j14, z15 ? orientation4 : Orientation.f27426c);
        T1 t13 = x12.f29855n;
        int iY02 = z15 ? q13.y0(t13.c(q13.getF40449b())) : q13.y0(R1.g(t13, q13.getF40449b()));
        int iY03 = z15 ? q13.y0(t13.a(q13.getF40449b())) : q13.y0(R1.f(t13, q13.getF40449b()));
        int iY04 = q13.y0(t13.getF28512b());
        int iY05 = q13.y0(t13.getF28514d());
        int i46 = iY04 + iY05;
        int i47 = iY02 + iY03;
        int i48 = z15 ? i46 : i47;
        boolean z16 = x12.f29856o;
        if (z15 && !z16) {
            iY03 = iY04;
        } else if (z15 && z16) {
            iY03 = iY05;
        } else if (!z15 && !z16) {
            iY03 = iY02;
        }
        int i49 = i48 - iY03;
        int i52 = iY03;
        long jI2 = C22713c.i(-i47, -i46, j14);
        m0Var2.f29980q = q13;
        int iY06 = q13.y0(x12.f29857p);
        int i53 = z15 ? C22712b.i(j14) - i46 : C22712b.j(j14) - i47;
        if (!z16 || i53 > 0) {
            j12 = j14;
            i12 = i46;
            i13 = i47;
            j13 = (iY02 << 32) | (iY04 & 4294967295L);
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
        } else {
            if (!z15) {
                iY02 += i53;
            }
            if (z15) {
                iY04 += i53;
            }
            i12 = i46;
            i13 = i47;
            j12 = j14;
            j13 = (iY04 & 4294967295L) | (iY02 << 32);
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
        }
        long j15 = j13;
        int iA2 = x12.f29858q.a(q13, i53);
        if (iA2 < 0) {
            orientation = orientation4;
            i14 = 0;
        } else {
            i14 = iA2;
            orientation = orientation4;
        }
        m0Var2.f29956B = C22713c.b(orientation5 == orientation ? C22712b.j(jI2) : i14, orientation5 != orientation ? C22712b.i(jI2) : i14, 5);
        O o12 = (O) x12.f29859r.invoke();
        int i54 = i53 + i52 + i49;
        AbstractC22167l.a aVar3 = AbstractC22167l.f38720e;
        androidx.compose.foundation.gestures.snapping.v vVar2 = x12.f29864w;
        aVar3.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        if (abstractC22167lA != null) {
            i15 = i53;
            f38713f = abstractC22167lA.getF38713f();
        } else {
            i15 = i53;
            f38713f = null;
        }
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        try {
            int iJ2 = m0Var2.j();
            c0 c0Var = m0Var2.f29967d;
            Orientation orientation6 = orientation;
            int iA3 = androidx.compose.foundation.lazy.layout.G.a(iJ2, o12, c0Var.f29899e);
            if (iJ2 != iA3) {
                orientation2 = orientation5;
                ((C22061e3) c0Var.f29896b).L3(iA3);
                c0Var.f29900f.a(iJ2);
            } else {
                orientation2 = orientation5;
            }
            m0Var2.j();
            float fK2 = m0Var2.k();
            m0Var2.m();
            int i55 = i52;
            int i56 = i14 + iY06;
            int iB2 = kotlin.math.b.b(vVar2.c(i54, i14, i55, i49) - (fK2 * i56));
            G0 g02 = G0.f406611a;
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38713f);
            List<Integer> listA = C20733n.a(o12, m0Var2.f29957C, m0Var2.f29987x);
            int iIntValue = x12.f29860s.invoke().intValue();
            int i57 = i15;
            List<Integer> list6 = listA;
            int i58 = i49;
            W w12 = w;
            androidx.compose.foundation.lazy.layout.Q q14 = q13;
            W w13 = new W(q13, j12, i13, i12);
            if (i55 < 0) {
                androidx.compose.foundation.internal.e.a("negative beforeContentPadding");
            }
            if (i58 < 0) {
                androidx.compose.foundation.internal.e.a("negative afterContentPadding");
            }
            int i59 = i56 < 0 ? 0 : i56;
            int i62 = x12.f29863v;
            androidx.compose.foundation.gestures.snapping.v vVar3 = x12.f29864w;
            kotlinx.coroutines.T t14 = x12.f29865x;
            if (iIntValue <= 0) {
                z14 = new Z(C42784z0.f406748b, i14, iY06, i58, orientation2, -i55, i57 + i58, false, i62, null, null, 0.0f, 0, false, vVar3, (InterfaceC22367j0) w12.invoke(Integer.valueOf(C22712b.l(jI2)), Integer.valueOf(C22712b.k(jI2)), S.f29830l), false, null, null, t14, 393216, null);
                m0Var = m0Var2;
            } else {
                Orientation orientation7 = orientation2;
                int iJ3 = orientation7 == orientation6 ? C22712b.j(jI2) : i14;
                if (orientation7 != orientation6) {
                    i16 = C22712b.i(jI2);
                    t12 = t14;
                } else {
                    t12 = t14;
                    i16 = i14;
                }
                long jB2 = C22713c.b(iJ3, i16, 5);
                int i63 = iA3;
                while (i63 > 0 && iB2 > 0) {
                    i63--;
                    iB2 -= i59;
                }
                int i64 = iB2 * (-1);
                if (i63 >= iIntValue) {
                    i63 = iIntValue - 1;
                    i64 = 0;
                }
                C42754k c42754k3 = new C42754k();
                int i65 = -i55;
                if (iY06 < 0) {
                    i18 = iY06;
                    i17 = i18;
                } else {
                    i17 = iY06;
                    i18 = 0;
                }
                int i66 = i65 + i18;
                int i67 = i57;
                int i68 = i64 + i66;
                int iMax = 0;
                while (true) {
                    cVar = x12.f29861t;
                    i19 = i56;
                    bVar = x12.f29862u;
                    i22 = iMax;
                    z12 = x12.f29856o;
                    if (i68 >= 0 || i63 <= 0) {
                        break;
                    }
                    int i69 = i63 - 1;
                    C42754k c42754k4 = c42754k3;
                    kotlinx.coroutines.T t15 = t12;
                    Orientation orientation8 = orientation7;
                    int i72 = i14;
                    C20820n c20820nA = V.a(q14, i69, jB2, o12, j15, orientation8, bVar, cVar, q14.getF40449b(), z12, i72);
                    c42754k4.add(0, c20820nA);
                    i59 = i59;
                    i68 += i59;
                    orientation7 = orientation8;
                    c42754k3 = c42754k4;
                    iMax = Math.max(i22, c20820nA.f30011k);
                    i56 = i19;
                    i14 = i72;
                    i63 = i69;
                    i65 = i65;
                    t12 = t15;
                    i62 = i62;
                    vVar3 = vVar3;
                    i55 = i55;
                    w12 = w12;
                    i58 = i58;
                    list6 = list6;
                    i67 = i67;
                    x12 = this;
                }
                int i73 = i65;
                C42754k c42754k5 = c42754k3;
                Orientation orientation9 = orientation7;
                androidx.compose.foundation.gestures.snapping.v vVar4 = vVar3;
                int i74 = i62;
                int i75 = i55;
                W w14 = w12;
                int i76 = i58;
                int i77 = i14;
                kotlinx.coroutines.T t16 = t12;
                List<Integer> list7 = list6;
                int i78 = i67;
                m0 m0Var3 = m0Var2;
                int i79 = i66;
                if (i68 < i79) {
                    i68 = i79;
                }
                int i82 = i68 - i79;
                int i83 = i76;
                int i84 = i78;
                int i85 = i84 + i83;
                int i86 = i85 < 0 ? 0 : i85;
                int i87 = -i82;
                int i88 = 0;
                boolean z17 = false;
                int i89 = i63;
                while (i88 < c42754k5.f406741d) {
                    if (i87 >= i86) {
                        c42754k5.a(i88);
                        z17 = true;
                    } else {
                        i89++;
                        i87 += i59;
                        i88++;
                    }
                }
                int iMax2 = i22;
                boolean z18 = z17;
                int i92 = iIntValue;
                int i93 = i87;
                int i94 = i82;
                int i95 = i89;
                int i96 = i63;
                while (i95 < i92 && (i93 < i86 || i93 <= 0 || c42754k5.isEmpty())) {
                    C42754k c42754k6 = c42754k5;
                    int i97 = i95;
                    int i98 = i96;
                    int i99 = i92;
                    int i100 = iMax2;
                    int i101 = i93;
                    int i102 = i84;
                    int i103 = i86;
                    int i104 = i83;
                    int i105 = i79;
                    m0 m0Var4 = m0Var3;
                    int i106 = i59;
                    InterfaceC22215f.b bVar2 = bVar;
                    InterfaceC22215f.c cVar2 = cVar;
                    C20820n c20820nA2 = V.a(q14, i95, jB2, o12, j15, orientation9, bVar, cVar, q14.getF40449b(), z12, i77);
                    int i107 = i99 - 1;
                    i93 = i101 + (i97 == i107 ? i77 : i106);
                    if (i93 > i105 || i97 == i107) {
                        i44 = i106;
                        iMax2 = Math.max(i100, c20820nA2.f30011k);
                        c42754k2 = c42754k6;
                        c42754k2.addLast(c20820nA2);
                        i45 = i98;
                    } else {
                        i45 = i97 + 1;
                        i44 = i106;
                        i94 -= i44;
                        z18 = true;
                        c42754k2 = c42754k6;
                        iMax2 = i100;
                    }
                    i79 = i105;
                    i59 = i44;
                    i92 = i99;
                    i86 = i103;
                    cVar = cVar2;
                    i84 = i102;
                    i83 = i104;
                    m0Var3 = m0Var4;
                    i96 = i45;
                    i95 = i97 + 1;
                    c42754k5 = c42754k2;
                    bVar = bVar2;
                }
                int i108 = i83;
                m0 m0Var5 = m0Var3;
                InterfaceC22215f.b bVar3 = bVar;
                InterfaceC22215f.c cVar3 = cVar;
                int i109 = i96;
                C42754k c42754k7 = c42754k5;
                int i110 = i95;
                int i111 = i92;
                int i112 = i59;
                int i113 = iMax2;
                int i114 = i93;
                int i115 = i84;
                if (i114 < i115) {
                    int i116 = i115 - i114;
                    int i117 = i114 + i116;
                    int i118 = i109;
                    int iMax3 = i113;
                    int i119 = i94 - i116;
                    int i120 = i75;
                    while (i119 < i120 && i118 > 0) {
                        int i121 = i118 - 1;
                        int i122 = i110;
                        C42754k c42754k8 = c42754k7;
                        int i123 = i117;
                        int i124 = i112;
                        C20820n c20820nA3 = V.a(q14, i121, jB2, o12, j15, orientation9, bVar3, cVar3, q14.getF40449b(), z12, i77);
                        c42754k8.add(0, c20820nA3);
                        iMax3 = Math.max(iMax3, c20820nA3.f30011k);
                        i119 += i124;
                        i112 = i124;
                        c42754k7 = c42754k8;
                        i118 = i121;
                        i120 = i120;
                        i110 = i122;
                        i111 = i111;
                        i117 = i123;
                        i115 = i115;
                    }
                    int i125 = i117;
                    i23 = i110;
                    i26 = i120;
                    int i126 = i119;
                    i24 = i115;
                    c42754k = c42754k7;
                    i25 = i112;
                    i27 = i111;
                    i28 = iMax3;
                    if (i126 < 0) {
                        i33 = i118;
                        i29 = i125 + i126;
                        i32 = 0;
                    } else {
                        i33 = i118;
                        i32 = i126;
                        i29 = i125;
                    }
                } else {
                    i23 = i110;
                    i24 = i115;
                    c42754k = c42754k7;
                    i25 = i112;
                    i26 = i75;
                    i27 = i111;
                    i28 = i113;
                    i29 = i114;
                    i32 = i94;
                    i33 = i109;
                }
                if (i32 < 0) {
                    androidx.compose.foundation.internal.e.a("invalid currentFirstPageScrollOffset");
                }
                int i127 = -i32;
                C20820n c20820n3 = (C20820n) c42754k.first();
                if (i26 > 0 || i17 < 0) {
                    int f38308i = c42754k.getF38308i();
                    int i128 = i32;
                    int i129 = 0;
                    while (i129 < f38308i && i128 != 0 && i25 <= i128 && i129 != c42754k.getF38308i() - 1) {
                        i128 -= i25;
                        i129++;
                        c20820n3 = (C20820n) c42754k.get(i129);
                    }
                    c20820n = c20820n3;
                    i34 = i128;
                } else {
                    i34 = i32;
                    c20820n = c20820n3;
                }
                int i130 = i28;
                int i131 = i25;
                C20820n c20820n4 = c20820n;
                U u12 = new U(q14, jB2, o12, j15, orientation9, bVar3, cVar3, z12, i77);
                int iMax4 = Math.max(0, i33 - i74);
                int i132 = i33 - 1;
                if (iMax4 <= i132) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(u12.invoke(Integer.valueOf(i132)));
                        if (i132 == iMax4) {
                            break;
                        }
                        i132--;
                    }
                    list = list7;
                } else {
                    list = list7;
                    arrayList = null;
                }
                List<Integer> list8 = list;
                int size = list8.size();
                for (int i133 = 0; i133 < size; i133++) {
                    int iIntValue2 = list.get(i133).intValue();
                    if (iIntValue2 < iMax4) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(u12.invoke(Integer.valueOf(iIntValue2)));
                    }
                }
                if (arrayList == null) {
                    arrayList = C42784z0.f406748b;
                }
                List list9 = arrayList;
                int size2 = list9.size();
                int iMax5 = i130;
                for (int i134 = 0; i134 < size2; i134++) {
                    iMax5 = Math.max(iMax5, ((C20820n) list9.get(i134)).f30011k);
                }
                int i135 = ((C20820n) c42754k.last()).f30001a;
                int i136 = i29;
                int i137 = iMax5;
                List<Integer> list10 = list;
                T t17 = new T(q14, jB2, o12, j15, orientation9, bVar3, cVar3, z12, i77);
                int iMin = Math.min(i135 + i74, i27 - 1);
                int i138 = i135 + 1;
                if (i138 <= iMin) {
                    arrayList2 = null;
                    while (true) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(t17.invoke(Integer.valueOf(i138)));
                        if (i138 == iMin) {
                            break;
                        }
                        i138++;
                    }
                } else {
                    arrayList2 = null;
                }
                int size3 = list8.size();
                int i139 = 0;
                while (i139 < size3) {
                    int iIntValue3 = list10.get(i139).intValue();
                    int i140 = i27;
                    if (iMin + 1 <= iIntValue3 && iIntValue3 < i140) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(t17.invoke(Integer.valueOf(iIntValue3)));
                    }
                    i139++;
                    i27 = i140;
                }
                int i141 = i27;
                if (arrayList2 == null) {
                    arrayList2 = C42784z0.f406748b;
                }
                int size4 = arrayList2.size();
                int iMax6 = i137;
                for (int i142 = 0; i142 < size4; i142++) {
                    iMax6 = Math.max(iMax6, ((C20820n) arrayList2.get(i142)).f30011k);
                }
                boolean z19 = kotlin.jvm.internal.L.f(c20820n4, c42754k.first()) && list9.isEmpty() && arrayList2.isEmpty();
                Orientation orientation10 = Orientation.f27425b;
                Orientation orientation11 = orientation9;
                int iG2 = C22713c.g(orientation11 == orientation10 ? iMax6 : i136, jI2);
                if (orientation11 == orientation10) {
                    iMax6 = i136;
                }
                int iF2 = C22713c.f(iMax6, jI2);
                int i143 = orientation11 == orientation10 ? iF2 : iG2;
                int i144 = i24;
                boolean z22 = i136 < Math.min(i143, i144);
                if (z22 && i127 != 0) {
                    androidx.compose.foundation.internal.e.c("non-zero pagesScrollOffset=" + i127);
                }
                ArrayList arrayList6 = new ArrayList(arrayList2.size() + list9.size() + c42754k.getF38308i());
                if (z22) {
                    if (!list9.isEmpty() || !arrayList2.isEmpty()) {
                        androidx.compose.foundation.internal.e.a("No extra pages");
                    }
                    int f38308i2 = c42754k.getF38308i();
                    int[] iArr2 = new int[f38308i2];
                    for (int i145 = 0; i145 < f38308i2; i145++) {
                        iArr2[i145] = i77;
                    }
                    int[] iArr3 = new int[f38308i2];
                    C20585k.a aVar4 = C20585k.a.f28668a;
                    c20820n2 = c20820n4;
                    i36 = i144;
                    int i146 = i17;
                    float fJ2 = q14.J(i146);
                    aVar4.getClass();
                    i17 = i146;
                    C20585k.j jVar = new C20585k.j(fJ2, false, null, null);
                    if (orientation11 == Orientation.f27425b) {
                        jVar.c(q14, i143, iArr2, iArr3);
                        i43 = f38308i2;
                        q14 = q14;
                        iArr = iArr3;
                        i35 = i136;
                        arrayList3 = arrayList6;
                    } else {
                        iArr = iArr3;
                        i43 = f38308i2;
                        arrayList3 = arrayList6;
                        q14 = q14;
                        i35 = i136;
                        jVar.b(q14, i143, iArr2, LayoutDirection.f42838b, iArr);
                    }
                    kotlin.ranges.l lVarD = C42756l.D(iArr);
                    kotlin.ranges.l lVarO = lVarD;
                    if (z12) {
                        lVarO = kotlin.ranges.s.o(lVarD);
                    }
                    int i147 = lVarO.f406905b;
                    int i148 = lVarO.f406906c;
                    int i149 = lVarO.f406907d;
                    if ((i149 > 0 && i147 <= i148) || (i149 < 0 && i148 <= i147)) {
                        while (true) {
                            int i150 = iArr[i147];
                            C20820n c20820n5 = (C20820n) c42754k.get(!z12 ? i147 : (i43 - i147) - 1);
                            if (z12) {
                                i150 = (i143 - i150) - c20820n5.f30002b;
                            }
                            c20820n5.b(i150, iG2, iF2);
                            arrayList3.add(c20820n5);
                            if (i147 == i148) {
                                break;
                            }
                            i147 += i149;
                        }
                    }
                    list2 = list9;
                } else {
                    c20820n2 = c20820n4;
                    i35 = i136;
                    i36 = i144;
                    arrayList3 = arrayList6;
                    int size5 = list9.size();
                    int i151 = i127;
                    for (int i152 = 0; i152 < size5; i152++) {
                        C20820n c20820n6 = (C20820n) list9.get(i152);
                        i151 -= i19;
                        c20820n6.b(i151, iG2, iF2);
                        arrayList3.add(c20820n6);
                    }
                    list2 = list9;
                    int f38308i3 = c42754k.getF38308i();
                    int i153 = i127;
                    for (int i154 = 0; i154 < f38308i3; i154++) {
                        C20820n c20820n7 = (C20820n) c42754k.get(i154);
                        c20820n7.b(i153, iG2, iF2);
                        arrayList3.add(c20820n7);
                        i153 += i19;
                    }
                    int size6 = arrayList2.size();
                    for (int i155 = 0; i155 < size6; i155++) {
                        C20820n c20820n8 = (C20820n) arrayList2.get(i155);
                        c20820n8.b(i153, iG2, iF2);
                        arrayList3.add(c20820n8);
                        i153 += i19;
                    }
                }
                if (z19) {
                    arrayList4 = arrayList3;
                } else {
                    arrayList4 = new ArrayList(arrayList3.size());
                    int size7 = arrayList3.size();
                    for (int i156 = 0; i156 < size7; i156++) {
                        Object obj2 = arrayList3.get(i156);
                        C20820n c20820n9 = (C20820n) obj2;
                        if (c20820n9.f30001a >= ((C20820n) c42754k.first()).f30001a) {
                            if (c20820n9.f30001a <= ((C20820n) c42754k.last()).f30001a) {
                                arrayList4.add(obj2);
                            }
                        }
                    }
                }
                if (list2.isEmpty()) {
                    arrayList5 = C42784z0.f406748b;
                } else {
                    arrayList5 = new ArrayList(arrayList3.size());
                    int size8 = arrayList3.size();
                    for (int i157 = 0; i157 < size8; i157++) {
                        Object obj3 = arrayList3.get(i157);
                        if (((C20820n) obj3).f30001a < ((C20820n) c42754k.first()).f30001a) {
                            arrayList5.add(obj3);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    list3 = C42784z0.f406748b;
                } else {
                    ArrayList arrayList7 = new ArrayList(arrayList3.size());
                    int size9 = arrayList3.size();
                    for (int i158 = 0; i158 < size9; i158++) {
                        Object obj4 = arrayList3.get(i158);
                        if (((C20820n) obj4).f30001a > ((C20820n) c42754k.last()).f30001a) {
                            arrayList7.add(obj4);
                        }
                    }
                    list3 = arrayList7;
                }
                if (arrayList4.isEmpty()) {
                    list4 = list3;
                    orientation3 = orientation11;
                    i37 = i26;
                    i38 = i54;
                    vVar = vVar4;
                    i39 = i131;
                    i42 = i108;
                    obj = null;
                    list5 = arrayList5;
                    z13 = true;
                } else {
                    Object obj5 = arrayList4.get(0);
                    i37 = i26;
                    i38 = i54;
                    vVar = vVar4;
                    i39 = i131;
                    i42 = i108;
                    float f12 = -Math.abs(((C20820n) obj5).f30013m - vVar.c(i38, i39, i37, i42));
                    int size10 = arrayList4.size() - 1;
                    list4 = list3;
                    if (1 <= size10) {
                        float f13 = f12;
                        int i159 = 1;
                        obj = obj5;
                        List list11 = arrayList5;
                        while (true) {
                            Object obj6 = arrayList4.get(i159);
                            list5 = list11;
                            orientation3 = orientation11;
                            float f14 = -Math.abs(((C20820n) obj6).f30013m - vVar.c(i38, i39, i37, i42));
                            if (Float.compare(f13, f14) < 0) {
                                f13 = f14;
                                obj = obj6;
                            }
                            z13 = true;
                            if (i159 == size10) {
                                break;
                            }
                            i159++;
                            orientation11 = orientation3;
                            list11 = list5;
                        }
                    } else {
                        list5 = arrayList5;
                        z13 = true;
                        orientation3 = orientation11;
                        obj = obj5;
                    }
                }
                C20820n c20820n10 = (C20820n) obj;
                float f15 = i39 == 0 ? 0.0f : kotlin.ranges.s.f((vVar.c(i38, i77, i37, i42) - (c20820n10 != null ? c20820n10.f30013m : 0)) / i39, -0.5f, 0.5f);
                m0Var = m0Var5;
                z14 = new Z(arrayList4, i77, i17, i42, orientation3, i73, i85, z12, i74, c20820n2, c20820n10, f15, i34, (i23 < i141 || i35 > i36) ? z13 : false, vVar, (InterfaceC22367j0) w14.invoke(Integer.valueOf(iG2), Integer.valueOf(iF2), new Q(m0Var.f29958D, arrayList3)), z18, list5, list4, t16);
            }
            m0Var.h(z14, q14.I1(), false);
            return z14;
        } catch (Throwable th2) {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38713f);
            throw th2;
        }
    }
}
