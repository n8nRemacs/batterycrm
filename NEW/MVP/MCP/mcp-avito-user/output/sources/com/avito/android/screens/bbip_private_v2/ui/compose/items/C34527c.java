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
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.docking_badge.m;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: BbipPrivateV2BudgetSetting.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.items.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34527c {

    /* compiled from: BbipPrivateV2BudgetSetting.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.items.c$a */
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State.b.a.C7820a f261225l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BbipPrivateV2State.b.a.C7820a c7820a) {
            super(2);
            this.f261225l = c7820a;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            BbipPrivateV2State.b.a.C7820a c7820a;
            v.a aVar;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                InterfaceC22215f.f39074a.getClass();
                i.b bVar = InterfaceC22215f.a.f39086l;
                v.a aVar2 = androidx.compose.ui.v.f42878y1;
                C20585k.f28659a.getClass();
                C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar2);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20576h2 c20576h2 = C20576h2.f28641a;
                BbipPrivateV2State.b.a.C7820a c7820a2 = this.f261225l;
                String str = c7820a2.f261058j;
                a13.C(-686798343);
                if (str == null) {
                    c7820a = c7820a2;
                    aVar = aVar2;
                } else {
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    c7820a = c7820a2;
                    aVar = aVar2;
                    com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, C22501m2.a(aVar2, "BBIP_PRIVATE_V2_BUDGET_PRICE"), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                }
                a13.h();
                a13.C(-686788858);
                String str2 = c7820a.f261059k;
                if (str2 != null) {
                    h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                    com.akita.compose.foundation.ui.g.b(7, null, a13, 6, 2);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.component.strikethrough.b.b(str2, com.akita.compose.theme.re23.b.f63988f.f65241l, com.akita.compose.theme.re23.b.f63984b.f63880R0, C22501m2.a(aVar, "BBIP_PRIVATE_V2_BUDGET_OLD_PRICE"), 0, 0, a13, 3072, 48);
                }
                a13.h();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateV2BudgetSetting.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.items.c$b */
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State.b.a.C7820a f261226l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f261227m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BbipPrivateV2State.b.a.C7820a c7820a, int i12) {
            super(2);
            this.f261226l = c7820a;
            this.f261227m = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f261227m | 1);
            C34527c.b(this.f261226l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateV2BudgetSetting.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.items.c$c, reason: collision with other inner class name */
    public static final class C7821c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f261228l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State.b.a.C7820a f261229m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f261230n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7821c(String str, BbipPrivateV2State.b.a.C7820a c7820a, int i12) {
            super(2);
            this.f261228l = str;
            this.f261229m = c7820a;
            this.f261230n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f261230n | 1);
            C34527c.d(this.f261228l, this.f261229m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l String str, @Y61.l BbipPrivateV2State.b.a.C7820a c7820a, @Y61.l BbipPrivateV2State.a aVar, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1340234861);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(c7820a) ? 32 : 16) | (bE2.B(aVar) ? 256 : 128) | (bE2.u(lVar) ? 2048 : 1024) | (bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            if (aVar == null || c7820a == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new C34525a(str, c7820a, aVar, lVar, vVar, i12);
                    return;
                }
                return;
            }
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            d(str, c7820a, bE2, i13 & WebSocketProtocol.PAYLOAD_SHORT);
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar3);
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
            R3.b(pVar, bE2, interfaceC22365i0D);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            int i16 = i13 >> 3;
            b(c7820a, bE2, i16 & 14);
            c(c20644z, aVar, lVar, bE2, (i16 & 896) | (i16 & 112) | 6);
            bE2.X(true);
            bE2.X(true);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new C34526b(str, c7820a, aVar, lVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(BbipPrivateV2State.b.a.C7820a c7820a, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-756614364);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c7820a) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.banner.h f66889a = com.akita.compose.theme.re23.b.b(bE2).getF66889a();
            float f12 = 16;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.banner.g.c(f66889a, C20588k2.f(R1.m(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13), 52), R1.e(f12, 15, f12, 0.0f, 8), androidx.compose.foundation.shape.o.a(f12), null, 0.0f, null, androidx.compose.runtime.internal.r.c(-1535093788, new a(c7820a), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 12582960, 112);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(c7820a, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(C20644z c20644z, BbipPrivateV2State.a aVar, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1933388961);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c20644z) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            float f12 = aVar.f261040a;
            kotlin.ranges.f fVarM = kotlin.ranges.s.m(0.0f, aVar.f261041b);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.slider.s f66681a = com.akita.compose.theme.re23.b.q(bE2).getF66681a();
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarC = M1.c(0.0f, 7, 1, R1.k(4, 0.0f, 2, aVar2));
            InterfaceC22215f.f39074a.getClass();
            b12 = bE2;
            com.akita.compose.component.slider.i.a(f12, lVar, f66681a, C22501m2.a(c20644z.d(vVarC, InterfaceC22215f.a.f39083i), "BBIP_PRIVATE_V2_BUDGET_SLIDER_TEST_TAG"), false, null, null, fVarM, aVar.f261042c, bE2, (i13 >> 3) & 112, 112);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(c20644z, aVar, lVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(String str, BbipPrivateV2State.b.a.C7820a c7820a, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(533089992);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(c7820a) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65239j, C22501m2.a(aVar, "BBIP_PRIVATE_V2_BUDGET_TITLE"), false, 0L, null, 0, 0, false, null, bE2, (i13 & 14) | 384, 1016);
            b12.C(1019443148);
            String str2 = c7820a.f261055g;
            if (str2 != null && str2.length() != 0) {
                m.b bVar = m.b.f61556b;
                m.c cVar = m.c.f61559b;
                com.akita.compose.component.docking_badge.i f66150i = com.akita.compose.theme.re23.b.h(b12).getF66150i();
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.docking_badge.b.b(c7820a.f261055g, cVar, f66150i, C22501m2.a(R1.m(aVar, 4, 0.0f, 0.0f, 0.0f, 14), "BBIP_PRIVATE_V2_BUDGET_DISCOUNT_BADGE"), bVar, b12, 3072, 0);
            }
            b12.X(false);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C7821c(str, c7820a, i12);
        }
    }
}
