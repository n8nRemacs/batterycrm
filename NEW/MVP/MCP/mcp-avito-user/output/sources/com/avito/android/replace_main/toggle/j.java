package com.avito.android.replace_main.toggle;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.replace_main.toggle.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.n2;

/* compiled from: ReplaceMainToggleContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_replace-main_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {

    /* compiled from: ReplaceMainToggleContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k n2 n2Var, @Y61.k v.a.C7618a c7618a, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        boolean z12;
        B bE2 = a12.E(993618311);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        d dVar = (d) C22126m3.b(n2Var, bE2).getF42167b();
        if (dVar == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new i(interfaceC28373a, n2Var, c7618a, lVar, aVar, i12);
                return;
            }
            return;
        }
        C22187u0.d(new e(interfaceC28373a, null), bE2, G0.f406611a);
        int iOrdinal = dVar.f254616a.ordinal();
        if (iOrdinal == 0) {
            z12 = false;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = true;
        }
        h hVar = new h(dVar, lVar);
        androidx.compose.ui.v vVarA = C22501m2.a(R1.j(C21086w0.c(aVar, false, null, null, new f(interfaceC28373a, z12, hVar), 7), u0.f.a(bE2, c7618a.f254660a), u0.f.a(bE2, c7618a.f254661b)), "ReplaceMainToggle_container");
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
        R3.b(pVar, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        androidx.compose.ui.v vVarA2 = c20576h2.a(aVar, 1.0f, true);
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA2);
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
        R3.b(pVar, bE2, iA2);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.r rVar = iVar.f65240k;
        com.akita.compose.theme.re23.semantic.b bVar = com.akita.compose.theme.re23.b.f63987e;
        bVar.getClass();
        W2.q qVar = com.akita.compose.theme.re23.semantic.b.f65954b;
        qVar.getText().getClass();
        com.akita.compose.foundation.ui.p.b(dVar.f254617b, rVar, C22501m2.a(aVar, "ReplaceMainToggle_title"), false, X2.h.f18556d.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
        bVar.getClass();
        qVar.getText().getClass();
        com.akita.compose.foundation.ui.p.b(dVar.f254618c, iVar.f65244o, C22501m2.a(aVar, "ReplaceMainToggle_subtitle"), false, X2.h.f18557e.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
        bE2.X(true);
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.g.b(12, null, bE2, 6, 2);
        com.akita.compose.component.toggle.r.a(z12, hVar, com.akita.compose.theme.re23.b.s(bE2).getF66730b(), C22501m2.a(c20576h2.c(aVar, InterfaceC22215f.a.f39086l), "ReplaceMainToggle_toggle"), null, null, bE2, 0, 112);
        bE2.X(true);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new g(interfaceC28373a, n2Var, c7618a, lVar, aVar, i12);
        }
    }
}
