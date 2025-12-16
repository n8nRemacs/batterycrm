package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.M1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.E;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.component.docking_badge.m;
import com.akita.compose.component.selector_card.SelectorCardType;
import com.akita.compose.theme.re23.style.C27535i3;
import com.akita.compose.theme.re23.style.InterfaceC27530h3;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: BbipPrivateV2PresetCard.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/h;", "cardHeight", "Landroidx/compose/foundation/layout/T1;", "paddingValues", "_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u {

    /* compiled from: BbipPrivateV2PresetCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State.g f261294l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f261295m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f261296n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BbipPrivateV2State.g gVar, int i12, int i13) {
            super(2);
            this.f261294l = gVar;
            this.f261295m = i12;
            this.f261296n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f261296n | 1);
            u.b(this.f261294l, this.f261295m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateV2PresetCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State.g f261297l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f261298m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f261299n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BbipPrivateV2State.g gVar, int i12, int i13) {
            super(2);
            this.f261297l = gVar;
            this.f261298m = i12;
            this.f261299n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f261299n | 1);
            u.c(this.f261297l, this.f261298m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k BbipPrivateV2State.g gVar, int i12, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(1194332916);
        int i14 = i13 | (bE2.B(gVar) ? 4 : 2) | (bE2.m(i12) ? 32 : 16) | (bE2.u(lVar) ? 256 : 128) | (bE2.B(vVar) ? 2048 : 1024);
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(308444244);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(androidx.compose.ui.unit.h.a(0));
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            bE2.C(308447391);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = C22126m3.g(R1.c(0.0f, 0.0f, 3));
                bE2.H(objT2);
            }
            InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objT2;
            bE2.X(false);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            int i16 = i14 & 112;
            b(gVar, i12, bE2, i14 & WebSocketProtocol.PAYLOAD_SHORT);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.selector_card.h f66671b = ((InterfaceC27530h3) bE2.o(C27535i3.f66637b)).getF66671b();
            SelectorCardType selectorCardType = SelectorCardType.f62627c;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            bE2.C(629312508);
            boolean zB2 = bE2.B(dVar);
            Object objT3 = bE2.t();
            if (zB2 || objT3 == c1651a) {
                objT3 = new p(dVar, interfaceC22204y1);
                bE2.H(objT3);
            }
            bE2.X(false);
            androidx.compose.ui.v vVarA = C22501m2.a(C22392w0.a(aVar2, (Y41.l) objT3), "BBIP_PRIVATE_V2_PRESET_CARD_SELECTOR_TEST_TAG" + i12);
            bE2.C(629309354);
            boolean z12 = ((i14 & 896) == 256) | (i16 == 32);
            Object objT4 = bE2.t();
            if (z12 || objT4 == c1651a) {
                objT4 = new q(i12, lVar);
                bE2.H(objT4);
            }
            bE2.X(false);
            com.akita.compose.component.selector_card.g.a(gVar.f261084e, (Y41.a) objT4, f66671b, vVarA, true, selectorCardType, null, null, androidx.compose.runtime.internal.r.c(643654122, new r(interfaceC22204y12, gVar, i12, interfaceC22204y1), bE2), bE2, 100884480, 192);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new s(gVar, i12, lVar, vVar, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(BbipPrivateV2State.g gVar, int i12, androidx.compose.runtime.A a12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(-1020908699);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(gVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.m(i12) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            String str = gVar.f261086g;
            if (str != null) {
                m.b bVar = m.b.f61556b;
                m.c cVar = m.c.f61559b;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.docking_badge.i f66151j = com.akita.compose.theme.re23.b.h(bE2).getF66151j();
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.docking_badge.b.b(str, cVar, f66151j, com.avito.android.bxcontent.mvi.entity.f.d(i12, M1.c(0.0f, -14, 1, R1.m(E.a(androidx.compose.ui.v.f42878y1, 1.0f), 14, 0.0f, 0.0f, 0.0f, 14)), "BBIP_PRIVATE_V2_PRESET_CARD_BADGE_TEST_TAG"), bVar, bE2, 0, 0);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(gVar, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(BbipPrivateV2State.g gVar, int i12, androidx.compose.runtime.A a12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(1168868706);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(gVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.m(i12) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarB = C20588k2.b(0.0f, 44, 1, R1.m(aVar, 0.0f, 24, 0.0f, 0.0f, 13));
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(cVar, InterfaceC22215f.a.f39088n, bE2, 6);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar);
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
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(-482714539);
            String str = gVar.f261087h;
            if (str != null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.strikethrough.b.b(str, com.akita.compose.theme.re23.b.f63988f.f65240k, com.akita.compose.theme.re23.b.f63984b.f63880R0, R1.m(C22501m2.a(aVar, "BBIP_PRIVATE_V2_PRESET_OLD_PRICE_TEST_TAG" + i12), 0.0f, 0.0f, 4, 0.0f, 11), 0, 0, bE2, 0, 48);
            }
            bE2.X(false);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65240k;
            e0.f42240c.getClass();
            com.akita.compose.foundation.ui.p.b(gVar.f261082c, com.akita.compose.foundation.r.a(rVar, null, 0L, 0L, e0.f42251n, 0L, 0L, ErrorCodes.IO_EXCEPTION), C22501m2.a(aVar, "BBIP_PRIVATE_V2_PRESET_PRICE_TEST_TAG" + i12), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
            bE2.X(true);
            bE2.C(-1625685734);
            String str2 = gVar.f261085f;
            if (str2 != null) {
                com.akita.compose.foundation.ui.p.b(str2, iVar.f65240k, C22501m2.a(aVar, "BBIP_PRIVATE_V2_PRESET_FORECAST_TEST_TAG" + i12), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(gVar, i12, i13);
        }
    }

    public static final void d(BbipPrivateV2State.g gVar, int i12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(1366603369);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(gVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.m(i12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= bE2.B(vVar) ? 256 : 128;
        }
        int i15 = i14;
        if ((i15 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65234e;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            com.akita.compose.foundation.ui.p.b(gVar.f261081b, rVar, C22501m2.a(aVar2, "BBIP_PRIVATE_V2_PRESET_TITLE_TEST_TAG" + i12), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
            c(gVar, i12, bE2, i15 & WebSocketProtocol.PAYLOAD_SHORT);
            bE2.C(-877164770);
            String str = gVar.f261089j;
            if (str != null) {
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.p.b(str, iVar.f65244o, com.avito.android.bxcontent.mvi.entity.f.d(i12, R1.m(aVar2, 0.0f, 24, 0.0f, 0.0f, 13), "BBIP_PRIVATE_V2_PRESET_ADDITIONAL_INFO_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new t(gVar, i12, vVar, i13);
        }
    }

    public static final void e(BbipPrivateV2State.g gVar, int i12, float f12, T1 t12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(-256573905);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(gVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.m(i12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= bE2.k(f12) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= bE2.B(t12) ? 2048 : 1024;
        }
        if ((i13 & 57344) == 0) {
            i14 |= bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i14) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            wZ.l lVar = gVar.f261083d;
            if (lVar != null) {
                float f28512b = f12 - t12.getF28512b();
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(f28512b - t12.getF28514d());
                androidx.compose.ui.unit.h hVarA2 = androidx.compose.ui.unit.h.a(120);
                if (hVarA.compareTo(hVarA2) < 0) {
                    hVarA = hVarA2;
                }
                androidx.compose.ui.graphics.painter.e eVarC = com.avito.android.mnz_common.compose.i.c(bE2);
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.i iVar = InterfaceC22215f.a.f39079e;
                String strG = AK.c.g(i12, "BBIP_PRIVATE_V2_PRESET_CARD_IMAGE_TEST_TAG");
                InterfaceC22374n.f40491a.getClass();
                com.avito.android.mnz_common.compose.i.b(lVar, 128, hVarA.f42852b, strG, vVar, eVarC, iVar, InterfaceC22374n.a.f40493b, bE2, (i14 & 57344) | 113508408, 64);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new v(gVar, i12, f12, t12, vVar, i13);
        }
    }
}
