package com.avito.android.services_portfolio.project.components;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.platform.InterfaceC22520r2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.style.j;
import androidx.compose.ui.text.style.n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TextWithLink.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_services-portfolio_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @l A a12, @l v vVar, @k String str, @k String str2) {
        B bE2 = a12.E(-722866776);
        if ((((bE2.B(str) ? 4 : 2) | i12 | (bE2.B(str2) ? 32 : 16)) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22520r2 interfaceC22520r2 = (InterfaceC22520r2) bE2.o(Q0.f41209r);
            C22602e.b bVar = new C22602e.b(0, 1, null);
            bVar.j("URL", str2);
            j.f42684b.getClass();
            int iL2 = bVar.l(new e0(0L, 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (n) null, (z0.f) null, 0L, j.f42686d, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 61439, (C42822w) null));
            try {
                bVar.f(str);
                G0 g02 = G0.f406611a;
                bVar.h(iL2);
                bVar.g();
                C22602e c22602eM = bVar.m();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.a.a(c22602eM, new g(c22602eM, interfaceC22520r2), vVar, com.akita.compose.theme.re23.b.f63988f.f65240k.d(new Object[0], bE2), false, 0, 0, null, null, bE2, 384, 496);
            } catch (Throwable th2) {
                bVar.h(iL2);
                throw th2;
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(str, str2, vVar, i12);
        }
    }
}
