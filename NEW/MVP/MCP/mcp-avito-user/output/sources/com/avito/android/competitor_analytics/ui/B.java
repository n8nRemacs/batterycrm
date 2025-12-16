package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
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
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsError.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B {

    /* compiled from: CompetitorAnalyticsError.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f124584l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, Y41.a aVar) {
            super(2);
            this.f124584l = aVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            B.a(this.f124584l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Y41.a<kotlin.G0> aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1032702158);
        int i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar2.getClass();
            androidx.compose.ui.v vVarA = C22501m2.a(fillElement, "error_container");
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            i.a aVar4 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            float f12 = 24;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarL = R1.l(fillElement, f12, f12, f12, 102);
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(cVar, aVar4, bE2, 54);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarL);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            C20806p1.a(u0.e.a(R.drawable.placeholders_img_unknown_error, 0, bE2), null, C20588k2.q(C22501m2.a(aVar2, "error_image"), 130, 180), null, null, 0.0f, null, bE2, 440, 120);
            String strC = u0.i.c(bE2, R.string.error_layout_unknown_error);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            float f13 = 16;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65232c, C22501m2.a(R1.m(aVar2, 0.0f, f13, 0.0f, 0.0f, 13), "error_title"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            String strC2 = u0.i.c(bE2, R.string.competitor_analytics_error_message);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(strC2, iVar.f65240k, C22501m2.a(R1.m(aVar2, 0.0f, 6, 0.0f, 0.0f, 13), "error_message"), false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 384, 984);
            bE2.X(true);
            com.akita.compose.component.button.t tVarF2 = com.akita.compose.theme.re23.b.c(bE2).f2();
            androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
            float f14 = 10;
            b12 = bE2;
            com.akita.compose.component.button.m.a(R.string.error_layout_refresh, aVar, tVarF2, C22501m2.a(c20644z.d(R1.m(vVarD, f14, 0.0f, f14, f13, 2), InterfaceC22215f.a.f39083i), "error_button"), null, false, false, bE2, ((i13 << 3) & 112) | 512, 1008);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, aVar);
        }
    }
}
