package com.avito.android.cart_sheet_after_adding.ui;

import android.view.View;
import androidx.compose.animation.C20340d0;
import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.C22662l;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.stepper.StepperState;
import com.akita.compose.theme.re23.style.B3;
import com.akita.compose.theme.re23.style.C3;
import com.avito.android.R;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cart-sheet-after-adding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final float f115510a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f115511b;

    static {
        float f12 = 165;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f115510a = f12;
        f115511b = f12 + 82;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k gn.f fVar, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k Q q12, @Y61.k Stepper stepper, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-608769822);
        J3 j32 = C20839s1.f30098a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        androidx.compose.runtime.S.a(j32.b(com.akita.compose.foundation.n.d(0.0f, 3, com.akita.compose.theme.re23.b.f63984b.f63936k0.c(bE2), false)), androidx.compose.runtime.internal.r.c(379964834, new C29348n(vVar, aVar, fVar, str, str2, str3, q12, stepper, aVar2, lVar), bE2), bE2, 56);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29349o(fVar, str, str2, str3, q12, stepper, aVar, aVar2, lVar, vVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k gn.e r24, @Y61.k Y41.l r25, @Y61.l androidx.compose.runtime.A r26, int r27) {
        /*
            r7 = r24
            r8 = r25
            r0 = -2097097312(0xffffffff8300d5a0, float:-3.786105E-37)
            r1 = r26
            androidx.compose.runtime.B r15 = r1.E(r0)
            androidx.compose.ui.v$a r14 = androidx.compose.ui.v.f42878y1
            r0 = 3
            r9 = 0
            androidx.compose.foundation.lazy.grid.I0 r11 = androidx.compose.foundation.lazy.grid.M0.a(r9, r0, r15)
            androidx.compose.runtime.J3 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41069b
            java.lang.Object r0 = r15.o(r0)
            r10 = r0
            android.content.Context r10 = (android.content.Context) r10
            gn.h r12 = r7.f396821d
            if (r12 == 0) goto L25
            com.avito.android.printable_text.PrintableText r0 = r12.f396835a
            goto L26
        L25:
            r0 = 0
        L26:
            com.avito.android.printable_text.PrintableText r1 = r7.f396819b
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r1, r8, r10}
            com.avito.android.cart_sheet_after_adding.ui.p r5 = new com.avito.android.cart_sheet_after_adding.ui.p
            r16 = 0
            r0 = r5
            r1 = r11
            r2 = r24
            r3 = r12
            r4 = r10
            r13 = r5
            r5 = r25
            r9 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.runtime.C22187u0.g(r9, r13, r15)
            r0 = -1063057156(0xffffffffc0a308fc, float:-5.0948467)
            r15.C(r0)
            boolean r0 = r15.B(r10)
            java.lang.Object r1 = r15.t()
            if (r0 != 0) goto L5b
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L69
        L5b:
            r0 = 2130972582(0x7f040fa6, float:1.7553935E38)
            int r0 = com.avito.android.util.C35835l0.j(r0, r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r15.H(r1)
        L69:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            r1 = 0
            r15.X(r1)
            androidx.compose.ui.graphics.painter.e r0 = u0.e.a(r0, r1, r15)
            HU.b r9 = new HU.b
            float r1 = com.avito.android.cart_sheet_after_adding.ui.M.f115510a
            r2 = 2
            r3 = 0
            r9.<init>(r1, r2, r3)
            androidx.compose.foundation.layout.k r1 = androidx.compose.foundation.layout.C20585k.f28659a
            r3 = 12
            float r3 = (float) r3
            androidx.compose.ui.unit.h$a r4 = androidx.compose.ui.unit.h.f42849c
            r1.getClass()
            androidx.compose.foundation.layout.k$j r1 = androidx.compose.foundation.layout.C20585k.g(r3)
            r3 = 16
            float r3 = (float) r3
            r4 = 0
            androidx.compose.foundation.layout.V1 r2 = androidx.compose.foundation.layout.R1.c(r3, r4, r2)
            androidx.compose.ui.platform.I1 r3 = androidx.compose.ui.platform.J1.e(r15)
            r4 = 0
            androidx.compose.ui.v r10 = androidx.compose.ui.input.nestedscroll.e.a(r14, r3, r4)
            com.avito.android.cart_sheet_after_adding.ui.D r3 = new com.avito.android.cart_sheet_after_adding.ui.D
            r3.<init>(r12, r7, r0, r8)
            r18 = 0
            r21 = 1575936(0x180c00, float:2.208357E-39)
            r13 = 0
            r0 = 0
            r16 = 0
            r17 = 0
            r22 = 0
            r23 = 944(0x3b0, float:1.323E-42)
            r12 = r2
            r2 = r14
            r14 = r0
            r0 = r15
            r15 = r1
            r19 = r3
            r20 = r0
            androidx.compose.foundation.lazy.grid.C20672g.c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.runtime.c2 r0 = r0.Z()
            if (r0 == 0) goto Lce
            com.avito.android.cart_sheet_after_adding.ui.E r1 = new com.avito.android.cart_sheet_after_adding.ui.E
            r3 = r27
            r1.<init>(r7, r8, r2, r3)
            r0.f38184d = r1
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_sheet_after_adding.ui.M.b(gn.e, Y41.l, androidx.compose.runtime.A, int):void");
    }

    public static final void c(Stepper stepper, Y41.a aVar, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(869746987);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        int i13 = stepper.f116271b;
        if (i13 < 0) {
            throw new IllegalArgumentException(AK.c.g(i13, "Quantity cannot be < 0. But was ").toString());
        }
        View view = (View) bE2.o(AndroidCompositionLocals_androidKt.f41073f);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar3);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar4);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        if (i13 == 0) {
            bE2.C(87068442);
            String strC = u0.i.c(bE2, R.string.add_to_cart_button_title);
            F f12 = new F(aVar, view);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.button.m.c(strC, f12, com.akita.compose.theme.re23.b.c(bE2).P1(), C22501m2.a(C20588k2.d(aVar3, 1.0f), "snippet-addToCart"), null, null, null, false, false, null, bE2, 3584, 1008);
            bE2.X(false);
            aVar2 = aVar3;
        } else {
            bE2.C(87578392);
            PrintableText printableText = stepper.f116274e;
            boolean z12 = printableText != null;
            StepperState stepperState = z12 ? StepperState.f62830d : StepperState.f62828b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            aVar2 = aVar3;
            com.akita.compose.component.stepper.l.a(i13, new G(view, lVar), ((B3) bE2.o(C3.f65989b)).getF66700b(), C22501m2.a(C20588k2.d(aVar3, 1.0f), "snippet-stepper"), stepperState, false, 0, 0, stepper.f116272c, bE2, 3072, 224);
            C20340d0.b(k12, z12, null, null, null, null, androidx.compose.runtime.internal.r.c(474230521, new H(printableText), bE2), bE2, 1572870, 30);
            bE2.X(false);
        }
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new I(stepper, aVar, lVar, aVar2, i12);
        }
    }

    public static final void d(String str, String str2, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.ui.v vVarM;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1899696865);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65239j;
            androidx.compose.ui.text.style.s.f42720b.getClass();
            int i15 = androidx.compose.ui.text.style.s.f42722d;
            androidx.compose.ui.v vVarA = C22501m2.a(aVar, "snippet-price");
            if (str2 != null) {
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                vVarM = R1.m(aVar, 0.0f, 0.0f, 6, 0.0f, 11);
            } else {
                vVarM = aVar;
            }
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarA.d0(vVarM), false, 0L, null, 1, i15, false, null, bE2, (i13 & 14) | 14155776, 824);
            b12.C(122717246);
            if (str2 != null) {
                com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
                com.akita.compose.component.strikethrough.b.a(C22662l.a(str2, new e0(aVar4.f63918e0.c(b12), 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65534, (C42822w) null)), iVar.f65241l, aVar4.f63880R0, C22501m2.a(c20576h2.c(aVar, InterfaceC22215f.a.f39087m), "snippet-oldPrice"), 1, i15, b12, 221184, 0);
            }
            b12.X(false);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new J(str, str2, i12);
        }
    }

    public static final void e(String str, O o12, v.a aVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1016772232);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(o12) ? 32 : 16;
        }
        if (((i13 | 384) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39087m;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            C22143q0 c22143q0 = com.akita.compose.foundation.d.f63579a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            androidx.compose.runtime.S.a(c22143q0.b(com.akita.compose.theme.re23.b.f63984b.f63918e0), androidx.compose.runtime.internal.r.c(-1225561940, new K(c20576h2, str, o12), bE2), bE2, 56);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new L(str, o12, aVar, i12);
        }
    }
}
