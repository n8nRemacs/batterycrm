package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: CompetitorAnalyticsHeader.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class P {

    /* compiled from: CompetitorAnalyticsHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f124683l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f124684m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f124685n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f124686o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, String str, String str2, boolean z12, boolean z13) {
            super(2);
            this.f124683l = str;
            this.f124684m = str2;
            this.f124685n = z12;
            this.f124686o = z13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            P.a(this.f124683l, this.f124684m, this.f124685n, this.f124686o, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l String str, @Y61.l String str2, boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12, int i12) {
        v.a aVar;
        androidx.compose.runtime.B bE2 = a12.E(-625425698);
        if (((i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.j(z12) ? 256 : 128) | (bE2.j(z13) ? 2048 : 1024)) & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39089o;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(cVar, aVar2, bE2, 54);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            if (z12) {
                bE2.C(1671489339);
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(7, null, bE2, 6);
                C20632w.a(C22501m2.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(aVar3, 155, 10), androidx.compose.foundation.shape.o.a(6), null, false, bE2, 6, 6), "header_title_skeleton"), bE2, 0);
                com.akita.compose.foundation.ui.g.a(5, null, bE2, 6);
                bE2.X(false);
                aVar = aVar3;
            } else {
                bE2.C(1671822062);
                String str3 = str == null ? "" : str;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65239j;
                androidx.compose.ui.v vVarA = C22501m2.a(aVar3, "header_title");
                androidx.compose.ui.text.style.s.f42720b.getClass();
                aVar = aVar3;
                com.akita.compose.foundation.ui.p.b(str3, rVar, vVarA, false, 0L, null, 1, androidx.compose.ui.text.style.s.f42722d, false, null, bE2, 14156160, 824);
                bE2.X(false);
            }
            if (z12 || z13) {
                v.a aVar6 = aVar;
                bE2.C(1672148120);
                h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(5, null, bE2, 6);
                C20632w.a(C22501m2.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(aVar6, WebSocketProtocol.PAYLOAD_SHORT, 9), androidx.compose.foundation.shape.o.a(6), null, false, bE2, 6, 6), "header_sub_title_skeleton"), bE2, 0);
                com.akita.compose.foundation.ui.g.a(4, null, bE2, 6);
                bE2.X(false);
            } else {
                bE2.C(1672483943);
                String str4 = str2 == null ? "" : str2;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar2 = com.akita.compose.theme.re23.b.f63988f.f65245p;
                androidx.compose.ui.v vVarA2 = C22501m2.a(aVar, "header_sub_title");
                androidx.compose.ui.text.style.s.f42720b.getClass();
                com.akita.compose.foundation.ui.p.b(str4, rVar2, vVarA2, false, 0L, null, 1, androidx.compose.ui.text.style.s.f42722d, false, null, bE2, 14156160, 824);
                bE2.X(false);
            }
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, str, str2, z12, z13);
        }
    }
}
