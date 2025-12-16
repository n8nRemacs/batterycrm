package com.avito.android.early_access.adapter.bundle;

import W2.q;
import Y41.p;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.foundation.r;
import com.akita.compose.theme.re23.style.C0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessBundleDivider.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k EarlyAccessBundleDividerItem earlyAccessBundleDividerItem, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(920768698);
        int i13 = (bE2.B(earlyAccessBundleDividerItem) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            v.a aVar2 = v.f42878y1;
            v vVarA = c20576h2.a(aVar2, 1.0f, true);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.semantic.b bVar2 = com.akita.compose.theme.re23.b.f63987e;
            bVar2.getClass();
            q qVar = com.akita.compose.theme.re23.semantic.b.f65954b;
            qVar.getBorder().getClass();
            com.akita.compose.foundation.p pVar2 = X2.c.f18150k;
            com.avito.android.lib.compose.design.shared.divider.a.a(vVarA, pVar2, 0.0f, 0.0f, bE2, 0, 12);
            float f12 = 8;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65245p;
            bVar2.getClass();
            qVar.getText().getClass();
            com.akita.compose.foundation.ui.p.b(earlyAccessBundleDividerItem.f145096c, rVar, null, false, X2.h.f18557e.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
            v vVarA2 = c20576h2.a(aVar2, 1.0f, true);
            C0.n(bVar2, qVar);
            com.avito.android.lib.compose.design.shared.divider.a.a(vVarA2, pVar2, 0.0f, 0.0f, bE2, 0, 12);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(earlyAccessBundleDividerItem, vVar, i12);
        }
    }
}
