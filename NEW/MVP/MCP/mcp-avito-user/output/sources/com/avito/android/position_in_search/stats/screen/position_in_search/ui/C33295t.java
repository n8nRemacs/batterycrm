package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

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
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchError.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33295t {

    /* compiled from: PositionInSearchError.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.t$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f221724l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f221725m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f221726n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, Y41.a aVar, androidx.compose.ui.v vVar) {
            super(2);
            this.f221724l = aVar;
            this.f221725m = vVar;
            this.f221726n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            androidx.compose.ui.v vVar = this.f221725m;
            C33295t.a(iA2, this.f221726n, this.f221724l, a12, vVar);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @Y61.k Y41.a aVar, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar) {
        androidx.compose.ui.v vVar2;
        int i14;
        androidx.compose.ui.v vVar3;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1879580561);
        int i15 = (bE2.u(aVar) ? 4 : 2) | i12;
        int i16 = 2 & i13;
        if (i16 != 0) {
            i14 = i15 | 48;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i14 = i15 | (bE2.B(vVar2) ? 32 : 16);
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar3 = vVar2;
            b12 = bE2;
        } else {
            androidx.compose.ui.v vVar4 = i16 != 0 ? androidx.compose.ui.v.f42878y1 : vVar2;
            FillElement fillElement = C20588k2.f28682c;
            androidx.compose.ui.v vVarA = C22501m2.a(vVar4.d0(fillElement), "error_container");
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i17 = bE2.f37888Q;
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
            R3.b(pVar, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            i.a aVar3 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            androidx.compose.ui.v vVar5 = vVar4;
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            aVar4.getClass();
            float f12 = 24;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarL = R1.l(fillElement, f12, f12, f12, 102);
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(cVar, aVar3, bE2, 54);
            int i18 = bE2.f37888Q;
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
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            C20806p1.a(u0.e.a(R.drawable.placeholders_img_unknown_error, 0, bE2), null, C20588k2.q(C22501m2.a(aVar4, "error_image"), 130, 180), null, null, 0.0f, null, bE2, 440, 120);
            String strC = u0.i.c(bE2, R.string.error_layout_unknown_error);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            float f13 = 16;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65232c, C22501m2.a(R1.m(aVar4, 0.0f, f13, 0.0f, 0.0f, 13), "error_title"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            String strC2 = u0.i.c(bE2, R.string.position_in_search_stats_unknown_error_description);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(strC2, iVar.f65240k, C22501m2.a(R1.m(aVar4, 0.0f, 6, 0.0f, 0.0f, 13), "error_message"), false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 384, 984);
            bE2.X(true);
            float f14 = 10;
            vVar3 = vVar5;
            b12 = bE2;
            com.akita.compose.component.button.m.a(R.string.error_layout_refresh, aVar, com.akita.compose.theme.re23.b.c(bE2).f2(), C22501m2.a(c20644z.d(R1.m(C20588k2.d(aVar4, 1.0f), f14, 0.0f, f14, f13, 2), InterfaceC22215f.a.f39083i), "error_button"), null, false, false, bE2, ((i14 << 3) & 112) | 512, 1008);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, i13, aVar, vVar3);
        }
    }
}
