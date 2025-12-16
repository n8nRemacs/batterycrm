package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_travel-onboarding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class P {

    /* compiled from: DisclaimerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.deep_linking.links.w, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f302390b;

        public a(Y41.l lVar) {
            this.f302390b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof com.avito.android.deep_linking.links.w) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f302390b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f302390b;
        }

        public final int hashCode() {
            return this.f302390b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f302390b.invoke(deepLink);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar, @Y61.k AttributedText attributedText, @Y61.k String str) {
        androidx.compose.runtime.B bE2 = a12.E(-157727565);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.b.f63987e.getClass();
        com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
        long jC2 = X2.b.f18131j.c(bE2);
        float f12 = 12;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVar, jC2, androidx.compose.foundation.shape.o.a(f12));
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, interfaceC22365i0D);
        Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarL = R1.l(aVar3, f12, f12, f12, 16);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        i.b bVar = InterfaceC22215f.a.f39085k;
        C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarL);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, c20568f2A);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        com.akita.compose.theme.re23.g.f65049a.getClass();
        String strA = com.akita.compose.theme.re23.g.a(str);
        bE2.C(1607633564);
        if (strA != null) {
            com.akita.compose.foundation.ui.o.a(strA, com.akita.compose.theme.re23.b.f63988f.f65245p, c20576h2.c(aVar3, bVar), null, bE2, 0, 8);
            C20608p2.a(bE2, C20588k2.o(aVar3, 8));
        }
        bE2.X(false);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, aVar3, R.attr.textS20, null, new L(lVar, attributedText), 0, bE2, 56, 40);
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, true, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new M(i12, lVar, vVar, attributedText, str);
        }
    }
}
