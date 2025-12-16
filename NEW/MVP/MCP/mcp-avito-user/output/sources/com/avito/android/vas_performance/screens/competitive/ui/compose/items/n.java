package com.avito.android.vas_performance.screens.competitive.ui.compose.items;

import androidx.compose.foundation.C21086w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CompetitiveVasV2InfoAction.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_vas-performance_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.l DeepLink deepLink, @Y61.k Y41.l lVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1762282669);
        C22602e.b bVar = new C22602e.b(0, 1, null);
        androidx.compose.ui.text.style.j.f42684b.getClass();
        int iL2 = bVar.l(new x0(0L, 0L, (e0) null, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, androidx.compose.ui.text.style.j.f42686d, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, 0, 0, 0L, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16773119, (C42822w) null).f42739a);
        try {
            bVar.f(str);
            G0 g02 = G0.f406611a;
            bVar.h(iL2);
            C22602e c22602eM = bVar.m();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
            bE2.C(-498421762);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            bE2.X(false);
            com.akita.compose.foundation.ui.p.a(c22602eM, rVar, C22501m2.a(C21086w0.b(vVar, (androidx.compose.foundation.interaction.m) objT, null, false, null, new l(lVar, deepLink), 28), "COMPETITIVE_VAS_INFO_ACTION_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new m(str, deepLink, lVar, vVar, i12);
            }
        } catch (Throwable th2) {
            bVar.h(iL2);
            throw th2;
        }
    }
}
