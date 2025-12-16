package com.avito.android.select.new_districts.compose;

import androidx.compose.animation.C20355i0;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.select.new_metro.compose.C34637d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedDistrictsChips.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showAll", "", "overflowCount", "showChips", "_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class U {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k List list, @Y61.k List list2, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        boolean z12;
        v.a aVar;
        boolean z13;
        boolean z14;
        boolean z15;
        String strJ;
        androidx.compose.runtime.B bE2 = a12.E(86546828);
        int iE02 = bE2.e0();
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        bE2.C(-1026464980);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(false);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        Object objI = com.akita.compose.component.accordion.s.i(-1026462999, bE2, false);
        if (objI == c1651a) {
            objI = U2.a(0);
            bE2.H(objI);
        }
        InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objI;
        bE2.X(false);
        bE2.C(-1026461190);
        boolean zB2 = bE2.B(list2);
        Object objT2 = bE2.t();
        if (zB2 || objT2 == c1651a) {
            List list3 = list2;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                z12 = false;
                objT2 = C22126m3.g(Boolean.valueOf(z12));
                bE2.H(objT2);
            } else {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z12 = true;
                        break;
                    }
                }
                z12 = false;
                objT2 = C22126m3.g(Boolean.valueOf(z12));
                bE2.H(objT2);
            }
        }
        InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objT2;
        bE2.X(false);
        float f12 = ((Boolean) interfaceC22204y12.getF42167b()).booleanValue() ? 16 : 0;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarJ = R1.j(aVar2, f12, ((Boolean) interfaceC22204y12.getF42167b()).booleanValue() ? 8 : 0);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarJ);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar4);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, iA2);
        Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        bE2.C(-1942979865);
        if (list.isEmpty()) {
            bE2.b0(iE02);
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new N(list, list2, lVar, aVar2, i12);
                return;
            }
            return;
        }
        androidx.compose.ui.v vVarA = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarA2 = C20355i0.a(vVarA);
        boolean zBooleanValue = ((Boolean) interfaceC22204y1.getF42167b()).booleanValue();
        float f13 = 6;
        bE2.C(2015538930);
        Object objT3 = bE2.t();
        A.a.C1651a c1651a2 = A.a.f37868b;
        if (objT3 == c1651a2) {
            objT3 = new O(interfaceC22196w1);
            bE2.H(objT3);
        }
        bE2.X(false);
        C34637d.a(zBooleanValue, 3, (Y41.l) objT3, vVarA2, f13, f13, androidx.compose.runtime.internal.r.c(688453603, new Q(list, list2, lVar), bE2), bE2, 1794432, 0);
        bE2.C(2015554819);
        if (interfaceC22196w1.e() > 0) {
            float f14 = 4;
            androidx.compose.ui.v vVarA3 = C22501m2.a(R1.m(vVarA, f14, ((Boolean) interfaceC22204y12.getF42167b()).booleanValue() ? 10 : 0, 0.0f, 0.0f, 12), "show_more");
            bE2.C(2015560809);
            Object objT4 = bE2.t();
            if (objT4 == c1651a2) {
                objT4 = new S(interfaceC22204y1);
                bE2.H(objT4);
            }
            bE2.X(false);
            androidx.compose.ui.v vVarC2 = C21086w0.c(vVarA3, false, null, null, (Y41.a) objT4, 7);
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39086l, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarC2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            C20576h2 c20576h2 = C20576h2.f28641a;
            if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
                z15 = false;
                strJ = com.avito.android.bxcontent.mvi.entity.f.j(bE2, 919950090, R.string.select_metro_selected_stations_hide_selected, bE2, false);
            } else {
                bE2.C(919697471);
                strJ = u0.i.a(R.plurals.select_metro_selected_stations_show_selected, interfaceC22196w1.e(), new Object[]{Integer.valueOf(interfaceC22196w1.e())}, bE2);
                z15 = false;
                bE2.X(false);
            }
            String str = strJ;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            aVar = aVar2;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            androidx.compose.ui.v vVarO = C20588k2.o(R1.m(vVarA, f14, 0.0f, 0.0f, 0.0f, 14), 14);
            if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
                vVarA = androidx.compose.ui.draw.u.a(vVarA, 180.0f);
            }
            androidx.compose.ui.v vVarD0 = vVarO.d0(vVarA);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            z14 = false;
            C20806p1.a(u0.e.a(com.akita.compose.theme.re23.e.f64250P, 0, bE2), null, vVarD0, null, null, 0.0f, U.a.a(androidx.compose.ui.graphics.U.f39332b, com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2)), bE2, 56, 56);
            z13 = true;
            bE2.X(true);
        } else {
            aVar = aVar2;
            z13 = true;
            z14 = false;
        }
        bE2.X(z14);
        bE2.X(z14);
        bE2.X(z13);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new T(list, list2, lVar, aVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip r20, Y41.a r21, androidx.compose.runtime.A r22, int r23) {
        /*
            r0 = r20
            r15 = r21
            r1 = 539616780(0x2029e60c, float:1.4390973E-19)
            r2 = r22
            androidx.compose.runtime.B r14 = r2.E(r1)
            r1 = r23 & 14
            if (r1 != 0) goto L1d
            boolean r1 = r14.B(r0)
            if (r1 == 0) goto L19
            r1 = 4
            goto L1a
        L19:
            r1 = 2
        L1a:
            r1 = r23 | r1
            goto L1f
        L1d:
            r1 = r23
        L1f:
            r2 = r23 & 112(0x70, float:1.57E-43)
            r3 = 16
            if (r2 != 0) goto L30
            boolean r2 = r14.u(r15)
            if (r2 == 0) goto L2e
            r2 = 32
            goto L2f
        L2e:
            r2 = r3
        L2f:
            r1 = r1 | r2
        L30:
            r2 = r1 & 91
            r4 = 18
            if (r2 != r4) goto L44
            boolean r2 = r14.c()
            if (r2 != 0) goto L3d
            goto L44
        L3d:
            r14.f()
            r19 = r14
            goto Lc5
        L44:
            com.akita.compose.theme.re23.b r2 = com.akita.compose.theme.re23.b.f63983a
            r2.getClass()
            com.akita.compose.theme.re23.style.M r2 = com.akita.compose.theme.re23.b.c(r14)
            com.akita.compose.component.button.t r4 = r2.r2()
            androidx.compose.ui.v$a r2 = androidx.compose.ui.v.f42878y1
            java.lang.String r5 = "item_selected_districts"
            androidx.compose.ui.v r5 = androidx.compose.ui.platform.C22501m2.a(r2, r5)
            float r2 = (float) r3
            androidx.compose.ui.unit.h$a r3 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.foundation.shape.n r6 = androidx.compose.foundation.shape.o.a(r2)
            float r7 = r4.f60830b
            com.akita.compose.foundation.p r2 = r4.f60845q
            com.akita.compose.foundation.m r2 = com.akita.compose.foundation.n.a(r2, r14)
            r3 = -1824622624(0xffffffff933e77e0, float:-2.4040474E-27)
            r14.C(r3)
            int r3 = r0.f265833c
            boolean r3 = r14.m(r3)
            java.lang.Object r8 = r14.t()
            if (r3 != 0) goto L83
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r8 != r3) goto L8a
        L83:
            androidx.compose.foundation.interaction.m r8 = androidx.compose.foundation.interaction.l.a()
            r14.H(r8)
        L8a:
            r9 = r8
            androidx.compose.foundation.interaction.m r9 = (androidx.compose.foundation.interaction.m) r9
            r3 = 0
            r14.X(r3)
            com.avito.android.select.new_districts.compose.J r3 = new com.avito.android.select.new_districts.compose.J
            r3.<init>(r0)
            r8 = 2081707636(0x7c145674, float:3.0808537E36)
            androidx.compose.runtime.internal.n r12 = androidx.compose.runtime.internal.r.c(r8, r3, r14)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r13 = r1 | 3584(0xe00, float:5.022E-42)
            r16 = 384(0x180, float:5.38E-43)
            r17 = 3168(0xc60, float:4.44E-42)
            r8 = 0
            float r10 = r4.f60829a
            r11 = 0
            r18 = 0
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r10
            r10 = r11
            r11 = r18
            r18 = r13
            r13 = r14
            r19 = r14
            r14 = r18
            r15 = r16
            r16 = r17
            com.akita.compose.component.button.m.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        Lc5:
            androidx.compose.runtime.c2 r1 = r19.Z()
            if (r1 == 0) goto Ld6
            com.avito.android.select.new_districts.compose.K r2 = new com.avito.android.select.new_districts.compose.K
            r3 = r21
            r4 = r23
            r2.<init>(r0, r3, r4)
            r1.f38184d = r2
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.new_districts.compose.U.b(com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip, Y41.a, androidx.compose.runtime.A, int):void");
    }
}
