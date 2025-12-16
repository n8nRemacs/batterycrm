package com.avito.android.cart_sheet_after_adding.ui.components;

import android.view.View;
import androidx.compose.animation.C20340d0;
import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.S0;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.S;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.stepper.StepperState;
import com.akita.compose.theme.re23.style.B3;
import com.akita.compose.theme.re23.style.C3;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingMainSnippet.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cart-sheet-after-adding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final float f115575a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f115576b;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f115575a = 100;
        f115576b = 75;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k gn.f fVar, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l Integer num, @Y61.k String str4, @Y61.l String str5, @Y61.k String str6, @Y61.k Stepper stepper, @Y61.k Y41.l lVar, @Y61.k androidx.compose.ui.graphics.painter.e eVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12, int i13, int i14) {
        androidx.compose.runtime.B bE2 = a12.E(-989081461);
        androidx.compose.ui.v vVar2 = (i14 & 4096) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        J3 j32 = C20839s1.f30098a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        S.a(j32.b(com.akita.compose.foundation.n.d(0.0f, 3, com.akita.compose.theme.re23.b.f63984b.f63936k0.c(bE2), false)), androidx.compose.runtime.internal.r.c(1588265931, new i(vVar2, fVar, eVar, str, str2, num, str4, str5, str6, stepper, str3, lVar), bE2), bE2, 56);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(fVar, str, str2, str3, num, str4, str5, str6, stepper, lVar, eVar, vVar2, i12, i13, i14);
        }
    }

    public static final void b(Stepper stepper, String str, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(252056954);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        int i13 = stepper.f116271b;
        if (i13 < 0) {
            throw new IllegalArgumentException(AK.c.g(i13, "Quantity cannot be < 0. But was ").toString());
        }
        View view = (View) bE2.o(AndroidCompositionLocals_androidKt.f41073f);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        PrintableText printableText = stepper.f116274e;
        boolean z12 = printableText != null;
        StepperState stepperState = z12 ? StepperState.f62830d : StepperState.f62828b;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.stepper.l.a(i13, new e(view, lVar), ((B3) bE2.o(C3.f65989b)).a(), C22501m2.a(aVar, "mainItem-stepper"), stepperState, false, 0, 1, stepper.f116272c, bE2, 12585984, 96);
        C20340d0.b(k12, i13 > 1 && !z12, null, null, null, null, androidx.compose.runtime.internal.r.c(32416200, new f(str), bE2), bE2, 1572870, 30);
        C20340d0.b(k12, z12, null, null, null, null, androidx.compose.runtime.internal.r.c(1683283967, new g(printableText), bE2), bE2, 1572870, 30);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(stepper, str, lVar, aVar, i12);
        }
    }

    public static final void c(String str, String str2, Integer num, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1190286040);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(num) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            S0.a(null, null, null, null, 0, 0, androidx.compose.runtime.internal.r.c(572534671, new n(str, str2, num), bE2), bE2, 1572864, 63);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(i12, num, str, str2);
        }
    }
}
