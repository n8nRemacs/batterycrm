package androidx.compose.foundation.layout;

import androidx.collection.C20247y0;
import androidx.compose.foundation.layout.AbstractC20606p0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.K0;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FlowLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final AbstractC20606p0 f28494a;

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/K0;", "placeable", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.K0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<androidx.compose.ui.layout.K0> f28495l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.h<androidx.compose.ui.layout.K0> hVar) {
            super(1);
            this.f28495l = hVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.layout.K0] */
        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.layout.K0 k02) {
            this.f28495l.f406842b = k02;
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/K0;", "placeable", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.K0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<androidx.compose.ui.layout.K0> f28496l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<androidx.compose.ui.layout.K0> hVar) {
            super(1);
            this.f28496l = hVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.layout.K0] */
        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.layout.K0 k02) {
            this.f28496l.f406842b = k02;
            return kotlin.G0.f406611a;
        }
    }

    static {
        AbstractC20606p0.c cVar = AbstractC20606p0.f28701a;
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39085k;
        cVar.getClass();
        f28494a = new AbstractC20606p0.g(bVar);
        new AbstractC20606p0.e(InterfaceC22215f.a.f39088n);
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.l C20585k.m mVar, @Y61.l C20585k.e eVar, @Y61.l i.a aVar, int i12, int i13, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i14, int i15) {
        androidx.compose.ui.v vVar2;
        int i16;
        C20585k.m mVar2;
        int i17;
        C20585k.e eVar2;
        int i18;
        i.a aVar2;
        int i19;
        int i22;
        androidx.compose.ui.v vVar3;
        C20585k.m mVar3;
        C20585k.e eVar3;
        C20585k.m mVar4;
        C20585k.e eVar4;
        androidx.compose.runtime.B bE2 = a12.E(-208106226);
        int i23 = i15 & 1;
        if (i23 != 0) {
            i16 = i14 | 6;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i16 = i14 | (bE2.B(vVar2) ? 4 : 2);
        }
        int i24 = i15 & 2;
        if (i24 != 0) {
            i17 = i16 | 48;
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            i17 = i16 | (bE2.B(mVar2) ? 32 : 16);
        }
        int i25 = i15 & 4;
        if (i25 != 0) {
            i18 = i17 | 384;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            i18 = i17 | (bE2.B(eVar2) ? 256 : 128);
        }
        int i26 = i18 | 224256;
        if (bE2.p(i26 & 1, (599187 & i26) != 599186)) {
            androidx.compose.ui.v vVar4 = i23 != 0 ? androidx.compose.ui.v.f42878y1 : vVar2;
            if (i24 != 0) {
                C20585k.f28659a.getClass();
                mVar4 = C20585k.f28662d;
            } else {
                mVar4 = mVar2;
            }
            if (i25 != 0) {
                C20585k.f28659a.getClass();
                eVar4 = C20585k.f28660b;
            } else {
                eVar4 = eVar2;
            }
            InterfaceC22215f.f39074a.getClass();
            i.a aVar3 = InterfaceC22215f.a.f39088n;
            F0.f28250f.getClass();
            b(vVar4, mVar4, eVar4, aVar3, F0.f28251g, c22096n, bE2, (i26 & 14) | 1572864 | (i26 & 112) | (i26 & 896) | 12807168);
            i19 = Integer.MAX_VALUE;
            i22 = Integer.MAX_VALUE;
            vVar3 = vVar4;
            mVar3 = mVar4;
            eVar3 = eVar4;
            aVar2 = aVar3;
        } else {
            bE2.f();
            aVar2 = aVar;
            i19 = i12;
            i22 = i13;
            vVar3 = vVar2;
            mVar3 = mVar2;
            eVar3 = eVar2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new N0(vVar3, mVar3, eVar3, aVar2, i19, i22, c22096n, i14, i15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    @androidx.compose.foundation.layout.InterfaceC20625u0
    @kotlin.InterfaceC42830m
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.l androidx.compose.ui.v r25, @Y61.l androidx.compose.foundation.layout.C20585k.m r26, @Y61.l androidx.compose.foundation.layout.C20585k.e r27, @Y61.l androidx.compose.ui.i.a r28, @Y61.l androidx.compose.foundation.layout.F0 r29, @Y61.k androidx.compose.runtime.internal.C22096n r30, @Y61.l androidx.compose.runtime.A r31, int r32) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.S0.b(androidx.compose.ui.v, androidx.compose.foundation.layout.k$m, androidx.compose.foundation.layout.k$e, androidx.compose.ui.i$a, androidx.compose.foundation.layout.F0, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    @androidx.compose.foundation.layout.InterfaceC20625u0
    @kotlin.InterfaceC42830m
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.l androidx.compose.ui.v r25, @Y61.l androidx.compose.foundation.layout.C20585k.e r26, @Y61.l androidx.compose.foundation.layout.C20585k.m r27, @Y61.l androidx.compose.ui.InterfaceC22215f.c r28, int r29, @Y61.l androidx.compose.foundation.layout.C20599n1 r30, @Y61.k androidx.compose.runtime.internal.C22096n r31, @Y61.l androidx.compose.runtime.A r32, int r33) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.S0.c(androidx.compose.ui.v, androidx.compose.foundation.layout.k$e, androidx.compose.foundation.layout.k$m, androidx.compose.ui.f$c, int, androidx.compose.foundation.layout.n1, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.l androidx.compose.ui.v r19, @Y61.l androidx.compose.foundation.layout.C20585k.e r20, @Y61.l androidx.compose.foundation.layout.C20585k.m r21, @Y61.l androidx.compose.ui.i.b r22, int r23, int r24, @Y61.k androidx.compose.runtime.internal.C22096n r25, @Y61.l androidx.compose.runtime.A r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.S0.d(androidx.compose.ui.v, androidx.compose.foundation.layout.k$e, androidx.compose.foundation.layout.k$m, androidx.compose.ui.i$b, int, int, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final InterfaceC22367j0 e(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k Z0 z02, @Y61.k Iterator<? extends InterfaceC22363h0> it, float f12, float f13, long j12, int i12, int i13, @Y61.k X0 x02) {
        ArrayList arrayList;
        InterfaceC22363h0 interfaceC22363h0H;
        long j13;
        C20247y0 c20247y0;
        Y0 y02;
        K0.b bVar;
        ArrayList arrayList2;
        long j14;
        InterfaceC22363h0 interfaceC22363h0;
        int i14;
        int i15;
        int i16;
        K0.a aVarA;
        androidx.collection.A0 a02;
        ArrayList arrayList3;
        int i17;
        int i18;
        int i19;
        int f40716b;
        int f40715a;
        int i22;
        Y0 y03;
        int i23;
        ArrayList arrayList4;
        androidx.collection.A0 a03;
        T t12;
        int i24;
        long j15;
        androidx.collection.E eA2;
        C20247y0 c20247y02;
        int i25;
        C20247y0 c20247y03;
        int i26;
        K0.a aVar;
        int i27;
        int i28;
        int i29;
        Iterator<? extends InterfaceC22363h0> it2 = it;
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new InterfaceC22367j0[16], 0);
        int iJ2 = C22712b.j(j12);
        int iL2 = C22712b.l(j12);
        int i32 = C22712b.i(j12);
        androidx.collection.A0 a0A = androidx.collection.K.a();
        ArrayList arrayList5 = new ArrayList();
        int iCeil = (int) Math.ceil(interfaceC22369k0.M0(f12));
        int iCeil2 = (int) Math.ceil(interfaceC22369k0.M0(f13));
        long jA2 = C22713c.a(0, iJ2, 0, i32);
        long jC2 = P1.c(P1.b(14, jA2), z02.getF28628a() ? LayoutOrientation.f28394b : LayoutOrientation.f28395c);
        l0.h hVar = new l0.h();
        int i33 = 0;
        Y0 y04 = it2 instanceof Y ? new Y0(0, 0, interfaceC22369k0.J(iJ2), interfaceC22369k0.J(i32), null) : null;
        if (it.hasNext()) {
            arrayList = arrayList5;
            interfaceC22363h0H = h(it2, y04);
        } else {
            arrayList = arrayList5;
            interfaceC22363h0H = null;
        }
        androidx.collection.E eA3 = interfaceC22363h0H != null ? androidx.collection.E.a(f(interfaceC22363h0H, z02, jC2, new b(hVar))) : null;
        Integer numValueOf = eA3 != null ? Integer.valueOf((int) (eA3.f25542a >> 32)) : null;
        Integer numValueOf2 = eA3 != null ? Integer.valueOf((int) (eA3.f25542a & 4294967295L)) : null;
        InterfaceC22363h0 interfaceC22363h02 = interfaceC22363h0H;
        C20247y0 c20247y04 = new C20247y0(0, 1, null);
        C20247y0 c20247y05 = new C20247y0(0, 1, null);
        K0 k02 = new K0(i12, x02, j12, i13, iCeil, iCeil2, null);
        K0.b bVarB = k02.b(it.hasNext(), 0, androidx.collection.E.b(iJ2, i32), eA3, 0, 0, 0, false, false);
        if (bVarB.f28356b) {
            j14 = jC2;
            c20247y0 = c20247y04;
            j13 = jA2;
            y02 = y04;
            i14 = iCeil2;
            i15 = iCeil;
            bVar = bVarB;
            arrayList2 = arrayList;
            interfaceC22363h0 = interfaceC22363h02;
            i16 = 0;
            aVarA = k02.a(bVarB, eA3 != null, -1, 0, iJ2, 0);
        } else {
            j13 = jA2;
            c20247y0 = c20247y04;
            y02 = y04;
            bVar = bVarB;
            arrayList2 = arrayList;
            j14 = jC2;
            interfaceC22363h0 = interfaceC22363h02;
            i14 = iCeil2;
            i15 = iCeil;
            i16 = 0;
            aVarA = null;
        }
        int i34 = iJ2;
        int i35 = i32;
        InterfaceC22363h0 interfaceC22363h0H2 = interfaceC22363h0;
        int i36 = i16;
        int iMax = i36;
        int i37 = iMax;
        int i38 = i37;
        int i39 = i38;
        int i42 = iL2;
        K0.a aVar2 = aVarA;
        K0.b bVar2 = bVar;
        K0.a aVar3 = aVar2;
        while (!bVar2.f28356b && interfaceC22363h0H2 != null) {
            int iIntValue = numValueOf.intValue();
            C20247y0 c20247y06 = c20247y05;
            i36 += iIntValue;
            iMax = Math.max(iMax, numValueOf2.intValue());
            int i43 = i34 - iIntValue;
            int i44 = i37 + 1;
            int i45 = iJ2;
            x02.f28535d = i44;
            arrayList2.add(interfaceC22363h0H2);
            a0A.h(i37, hVar.f406842b);
            int i46 = i44 - i38;
            if (i46 < i12) {
                y03 = y02;
                i22 = 1;
            } else {
                i22 = i16;
                y03 = y02;
            }
            if (y03 != null) {
                if (i22 != 0) {
                    i23 = i38;
                    i27 = i33;
                } else {
                    i23 = i38;
                    i27 = i33 + 1;
                }
                int i47 = i22 != 0 ? i46 : i16;
                if (i22 != 0) {
                    int i48 = i43 - i15;
                    a03 = a0A;
                    i28 = i48 < 0 ? i16 : i48;
                } else {
                    a03 = a0A;
                    i28 = i45;
                }
                float fJ2 = interfaceC22369k0.J(i28);
                if (i22 != 0) {
                    arrayList4 = arrayList2;
                    i29 = i35;
                } else {
                    int i49 = (i35 - iMax) - i14;
                    arrayList4 = arrayList2;
                    i29 = i49 < 0 ? i16 : i49;
                }
                float fJ3 = interfaceC22369k0.J(i29);
                y03.f28557a = i27;
                y03.f28558b = i47;
                y03.f28559c = fJ2;
                y03.f28560d = fJ3;
            } else {
                i23 = i38;
                arrayList4 = arrayList2;
                a03 = a0A;
            }
            if (it.hasNext()) {
                interfaceC22363h0H2 = h(it2, y03);
                t12 = 0;
            } else {
                t12 = 0;
                interfaceC22363h0H2 = null;
            }
            hVar.f406842b = t12;
            if (interfaceC22363h0H2 != null) {
                i24 = i35;
                j15 = j14;
                eA2 = androidx.collection.E.a(f(interfaceC22363h0H2, z02, j15, new a(hVar)));
            } else {
                i24 = i35;
                j15 = j14;
                eA2 = null;
            }
            y02 = y03;
            Integer numValueOf3 = eA2 != null ? Integer.valueOf(((int) (eA2.f25542a >> 32)) + i15) : null;
            j14 = j15;
            Integer numValueOf4 = eA2 != null ? Integer.valueOf((int) (eA2.f25542a & 4294967295L)) : null;
            int i52 = i24;
            K0.b bVarB2 = k02.b(it.hasNext(), i46, androidx.collection.E.b(i43, i52), eA2 == null ? null : androidx.collection.E.a(androidx.collection.E.b(numValueOf3.intValue(), numValueOf4.intValue())), i33, i39, iMax, false, false);
            if (bVarB2.f28355a) {
                i25 = i45;
                int iMin = Math.min(Math.max(i42, i36), i25);
                int i53 = i39 + iMax;
                K0.a aVarA2 = k02.a(bVarB2, eA2 != null ? 1 : i16, i33, i53, i43, i46);
                c20247y02 = c20247y06;
                c20247y02.d(iMax);
                int i54 = (i35 - i53) - i14;
                C20247y0 c20247y07 = c20247y0;
                c20247y07.d(i44);
                i33++;
                numValueOf = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i15) : null;
                i42 = iMin;
                aVar = aVarA2;
                c20247y03 = c20247y07;
                i39 = i53 + i14;
                i34 = i25;
                i38 = i44;
                i36 = i16;
                i26 = i54;
                iMax = i36;
            } else {
                c20247y02 = c20247y06;
                i25 = i45;
                c20247y03 = c20247y0;
                numValueOf = numValueOf3;
                i34 = i43;
                i26 = i52;
                aVar = aVar3;
                i38 = i23;
            }
            aVar3 = aVar;
            c20247y0 = c20247y03;
            i37 = i44;
            it2 = it;
            c20247y05 = c20247y02;
            arrayList2 = arrayList4;
            androidx.collection.A0 a04 = a03;
            numValueOf2 = numValueOf4;
            iJ2 = i25;
            a0A = a04;
            i35 = i26;
            bVar2 = bVarB2;
        }
        ArrayList arrayList6 = arrayList2;
        androidx.collection.A0 a05 = a0A;
        C20247y0 c20247y08 = c20247y05;
        C20247y0 c20247y09 = c20247y0;
        if (aVar3 != null) {
            K0.a aVar4 = aVar3;
            arrayList3 = arrayList6;
            arrayList3.add(aVar4.f28351a);
            a02 = a05;
            a02.h(arrayList3.size() - 1, aVar4.f28352b);
            int i55 = c20247y09.f25545b - 1;
            boolean z12 = aVar4.f28354d;
            long j16 = aVar4.f28353c;
            if (z12) {
                c20247y08.g(i55, Math.max(c20247y08.a(i55), (int) (j16 & 4294967295L)));
                c20247y09.g(i55, c20247y09.b() + 1);
            } else {
                c20247y08.d((int) (j16 & 4294967295L));
                c20247y09.d(c20247y09.b() + 1);
            }
        } else {
            a02 = a05;
            arrayList3 = arrayList6;
        }
        int size = arrayList3.size();
        androidx.compose.ui.layout.K0[] k0Arr = new androidx.compose.ui.layout.K0[size];
        for (int i56 = i16; i56 < size; i56++) {
            k0Arr[i56] = a02.b(i56);
        }
        int i57 = c20247y09.f25545b;
        int[] iArr = new int[i57];
        int[] iArr2 = new int[i57];
        int[] iArr3 = c20247y09.f25544a;
        int iMax2 = i42;
        int i58 = i16;
        int i59 = i58;
        int i62 = i59;
        androidx.compose.ui.layout.K0[] k0Arr2 = k0Arr;
        while (i58 < i57) {
            int i63 = iArr3[i58];
            int iA2 = c20247y08.a(i58);
            int i64 = iMax2;
            int[] iArr4 = iArr3;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr;
            int i65 = i57;
            C20247y0 c20247y010 = c20247y08;
            ArrayList arrayList7 = arrayList3;
            int i66 = i62;
            int i67 = i58;
            androidx.compose.ui.layout.K0[] k0Arr3 = k0Arr2;
            int i68 = i16;
            InterfaceC22367j0 interfaceC22367j0A = C20553c2.a(z02, iMax2, C22712b.k(j13), C22712b.j(j13), iA2, i15, interfaceC22369k0, arrayList3, k0Arr2, i66, i63, iArr6, i67);
            if (z02.getF28628a()) {
                f40716b = interfaceC22367j0A.getF40584b();
                f40715a = interfaceC22367j0A.getF40585c();
            } else {
                f40716b = interfaceC22367j0A.getF40585c();
                f40715a = interfaceC22367j0A.getF40584b();
            }
            iArr5[i67] = f40715a;
            i59 += f40715a;
            iMax2 = Math.max(i64, f40716b);
            eVar.b(interfaceC22367j0A);
            i58 = i67 + 1;
            iArr = iArr6;
            iArr2 = iArr5;
            i62 = i63;
            iArr3 = iArr4;
            i57 = i65;
            arrayList3 = arrayList7;
            c20247y08 = c20247y010;
            i16 = i68;
            k0Arr2 = k0Arr3;
        }
        int i69 = iMax2;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        int i72 = i16;
        if (eVar.f38262d == 0) {
            i18 = i72;
            i17 = i18;
        } else {
            i17 = i69;
            i18 = i59;
        }
        boolean f28605a = z02.getF28628a();
        C20585k.m f28607c = z02.getF28630c();
        C20585k.e f28606b = z02.getF28629b();
        if (f28605a) {
            int iB2 = androidx.compose.foundation.H.b(eVar.f38262d, 1, interfaceC22369k0.y0(f28607c.a()), i18);
            int iK2 = C22712b.k(j12);
            i19 = C22712b.i(j12);
            if (iB2 < iK2) {
                iB2 = iK2;
            }
            if (iB2 <= i19) {
                i19 = iB2;
            }
            f28607c.c(interfaceC22369k0, i19, iArr7, iArr8);
        } else {
            int iB3 = androidx.compose.foundation.H.b(eVar.f38262d, 1, interfaceC22369k0.y0(f28606b.getF28679d()), i18);
            int iK3 = C22712b.k(j12);
            int i73 = C22712b.i(j12);
            if (iB3 < iK3) {
                iB3 = iK3;
            }
            int i74 = iB3 > i73 ? i73 : iB3;
            f28606b.b(interfaceC22369k0, i74, iArr7, interfaceC22369k0.getF40449b(), iArr8);
            i19 = i74;
        }
        int iL3 = C22712b.l(j12);
        int iJ3 = C22712b.j(j12);
        if (i17 < iL3) {
            i17 = iL3;
        }
        if (i17 <= iJ3) {
            iJ3 = i17;
        }
        if (f28605a) {
            int i75 = i19;
            i19 = iJ3;
            iJ3 = i75;
        }
        return interfaceC22369k0.L0(i19, iJ3, kotlin.collections.P0.c(), new U0(eVar));
    }

    public static final long f(@Y61.k InterfaceC22363h0 interfaceC22363h0, @Y61.k Z0 z02, long j12, @Y61.k Y41.l<? super androidx.compose.ui.layout.K0, kotlin.G0> lVar) {
        L0 l02;
        if (C20543a2.c(C20543a2.a(interfaceC22363h0)) == 0.0f) {
            C20558d2 c20558d2A = C20543a2.a(interfaceC22363h0);
            if (((c20558d2A == null || (l02 = c20558d2A.f28597d) == null) ? null : Float.valueOf(l02.f28366a)) == null) {
                androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
                lVar.invoke(k0I);
                return androidx.collection.E.b(z02.j(k0I), z02.g(k0I));
            }
        }
        int iG2 = z02.getF28628a() ? interfaceC22363h0.G(Integer.MAX_VALUE) : interfaceC22363h0.X(Integer.MAX_VALUE);
        return androidx.collection.E.b(iG2, z02.getF28628a() ? interfaceC22363h0.X(iG2) : interfaceC22363h0.G(iG2));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @androidx.compose.runtime.InterfaceC22132o
    @kotlin.X
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.InterfaceC22365i0 g(@Y61.k androidx.compose.foundation.layout.C20585k.C1589k r13, @Y61.k androidx.compose.foundation.layout.C20585k.f r14, @Y61.l androidx.compose.runtime.A r15) {
        /*
            boolean r0 = r15.B(r13)
            r1 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            boolean r2 = r15.m(r9)
            r0 = r0 | r2
            java.lang.Object r2 = r15.t()
            if (r0 != 0) goto L1c
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r0) goto L48
        L1c:
            r13.getClass()
            float r6 = (float) r1
            androidx.compose.ui.unit.h$a r0 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.foundation.layout.p0 r7 = androidx.compose.foundation.layout.S0.f28494a
            float r8 = r14.a()
            androidx.compose.foundation.layout.n1$a r0 = androidx.compose.foundation.layout.C20599n1.f28691f
            r0.getClass()
            androidx.compose.foundation.layout.n1 r0 = androidx.compose.foundation.layout.C20599n1.f28692g
            androidx.compose.foundation.layout.X0 r11 = r0.b()
            androidx.compose.foundation.layout.g1 r0 = new androidx.compose.foundation.layout.g1
            r12 = 0
            r3 = 1
            r10 = 2147483647(0x7fffffff, float:NaN)
            r2 = r0
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.foundation.layout.V0 r2 = new androidx.compose.foundation.layout.V0
            r2.<init>(r0)
            r15.H(r2)
        L48:
            androidx.compose.ui.layout.i0 r2 = (androidx.compose.ui.layout.InterfaceC22365i0) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.S0.g(androidx.compose.foundation.layout.k$k, androidx.compose.foundation.layout.k$f, androidx.compose.runtime.A):androidx.compose.ui.layout.i0");
    }

    public static final InterfaceC22363h0 h(Iterator<? extends InterfaceC22363h0> it, Y0 y02) {
        try {
            return it instanceof Y ? ((Y) it).a(y02) : it.next();
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
