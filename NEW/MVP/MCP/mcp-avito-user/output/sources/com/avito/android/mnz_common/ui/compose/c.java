package com.avito.android.mnz_common.ui.compose;

import Y41.p;
import Y61.l;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LoadingScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l v vVar, @l A a12, int i12) {
        B bE2 = a12.E(-1834768525);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            vVar = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            vVar.getClass();
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, fillElement);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66694c(), null, bE2, 0, 2);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(vVar, i12);
        }
    }
}
