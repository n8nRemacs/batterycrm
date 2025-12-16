package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
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
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: BbipPrivateV2ForecastBanner.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* compiled from: BbipPrivateV2ForecastBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f261272l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f261273m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f261274n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, int i12) {
            super(2);
            this.f261272l = str;
            this.f261273m = str2;
            this.f261274n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f261274n | 1);
            n.b(this.f261272l, this.f261273m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1447141966);
        if (((i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.B(str3) ? 256 : 128) | (bE2.B(str4) ? 2048 : 1024) | (bE2.B(str5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192)) & 374491) == 74898 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            if (str == null || str3 == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new i(str, str2, str3, str4, str5, vVar, i12);
                    return;
                }
                return;
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.banner.h f66889a = com.akita.compose.theme.re23.b.b(bE2).getF66889a();
            float f12 = (float) 24.0d;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.component.banner.g.c(f66889a, C22501m2.a(C20588k2.d(vVar, 1.0f), "BBIP_PRIVATE_V2_FORECAST_BANNER_TEST_TAG"), R1.d(f12, (float) 20.0d, f12, (float) 28.0d), null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(-778265358, new k(str, str2, str3, str4, str5), bE2), b12, com.akita.compose.component.banner.h.f60462o | 12583296, 120);
        }
        C22039c2 c22039c2Z2 = b12.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new l(str, str2, str3, str4, str5, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(String str, String str2, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(186982450);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
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
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, iVar.f65234e, C22501m2.a(aVar, "BBIP_PRIVATE_V2_FORECAST_BANNER_BUDGET_VALUE_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, (i13 & 14) | 384, 1016);
            b12.C(-1841558637);
            if (str2 != null) {
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                C20608p2.a(b12, C20588k2.t(aVar, 8));
                com.akita.compose.component.strikethrough.b.b(str2, iVar.f65241l, com.akita.compose.theme.re23.b.f63984b.f63880R0, C22501m2.a(aVar, "BBIP_PRIVATE_V2_FORECAST_BANNER_BUDGET_OLD_VALUE_TEST_TAG"), 0, 0, b12, 3072, 48);
            }
            b12.X(false);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(str, str2, i12);
        }
    }

    public static final void c(String str, String str2, String str3, androidx.compose.runtime.A a12, int i12) {
        int i13;
        String str4;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(217422343);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(str3) ? 256 : 128;
        }
        int i14 = i13;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
            str4 = str3;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            str4 = str3;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65244o, C22501m2.a(aVar, "BBIP_PRIVATE_V2_FORECAST_BANNER_BUDGET_TITLE_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, (i14 & 14) | 384, 1016);
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            C20608p2.a(b12, C20588k2.f(aVar, 2));
            b12.C(-1606901778);
            b(str2, str4, b12, (i14 >> 3) & 112);
            b12.X(false);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(str, str2, str4, i12);
        }
    }

    public static final void d(String str, String str2, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        boolean z12;
        androidx.compose.runtime.B bE2 = a12.E(-2146107366);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(str, iVar.f65244o, C22501m2.a(aVar, "BBIP_PRIVATE_V2_FORECAST_BANNER_FORECAST_TITLE_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, (i14 & 14) | 384, 1016);
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(2, null, bE2, 6);
            if (str2 != null) {
                bE2.C(1919785467);
                com.akita.compose.foundation.ui.p.b(str2, iVar.f65234e, C22501m2.a(aVar, "BBIP_PRIVATE_V2_FORECAST_BANNER_FORECAST_VALUE_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, ((i14 >> 3) & 14) | 384, 1016);
                bE2.X(false);
                b12 = bE2;
                z12 = true;
            } else {
                b12 = bE2;
                b12.C(1920019238);
                z12 = true;
                com.akita.compose.foundation.ui.g.a(1, null, b12, 6);
                C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(R1.k(0.0f, 7, 1, aVar), 100, 14), androidx.compose.foundation.shape.o.a(6), com.akita.compose.theme.re23.b.p(b12).getF66675a(), false, b12, 6, 4), b12, 0);
                b12.X(false);
            }
            b12.X(z12);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(str, str2, i12);
        }
    }
}
