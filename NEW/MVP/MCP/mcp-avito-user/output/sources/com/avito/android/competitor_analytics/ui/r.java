package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsCommon.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k AttributedText attributedText, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1639729000);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, vVar, R.attr.textM20, null, new C29538k(lVar, attributedText), 0, bE2, ((i12 >> 3) & 112) | 8, 40);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29540l(attributedText, lVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k AttributedText attributedText, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1325491234);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, vVar, R.attr.textM20, null, null, 0, bE2, (i12 & 112) | 8, 56);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29541m(attributedText, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(int i12, long j12, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar) {
        androidx.compose.runtime.B bE2 = a12.E(441352590);
        int i13 = (bE2.n(j12) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            float f12 = 8;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.o(R1.m(vVar, 0.0f, f12, 0.0f, 0.0f, 13), f12), j12, androidx.compose.foundation.shape.o.f30153a), bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29542n(i12, j12, vVar);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(@Y61.k String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1364359082);
        int i13 = (bE2.B(str) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65239j;
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getComponents().getClass();
            com.akita.compose.foundation.ui.o.a(str, rVar, vVar, X2.d.f18173g.f18378a, bE2, (i13 & 14) | ((i13 << 3) & 896), 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29543o(i12, vVar, str);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(@Y61.k String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-489475973);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
            long jC2 = X2.h.f18557e.c(bE2);
            androidx.compose.ui.text.style.s.f42720b.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVar, false, jC2, null, 1, androidx.compose.ui.text.style.s.f42722d, false, null, bE2, 14155776 | (i13 & 14) | ((i13 << 3) & 896), 808);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29544p(i12, vVar, str);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(@Y61.k String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1926415601);
        int i13 = i12 | (bE2.B(str) ? 4 : 2);
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65233d;
            androidx.compose.ui.text.style.s.f42720b.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVar, false, 0L, null, 1, androidx.compose.ui.text.style.s.f42722d, false, null, bE2, (i13 & 14) | 14155776 | ((i13 << 3) & 896), 824);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29545q(i12, vVar, str);
        }
    }
}
