package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location.element;

import Y41.p;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.E;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ts.C48709c;

/* compiled from: CpxPromoGeoTriggerBanner.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k {

    /* compiled from: CpxPromoGeoTriggerBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C48709c.B f128143l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f128144m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C48709c.B b12, String str, int i12) {
            super(2);
            this.f128143l = b12;
            this.f128144m = str;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(49);
            String str = this.f128144m;
            k.a(this.f128143l, str, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C48709c.B b12, @Y61.k String str, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-185394644);
        if ((((bE2.B(b12) ? 4 : 2) | i12) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = v.f42878y1;
            v vVarD = C20588k2.d(aVar, 1.0f);
            long jC2 = ((com.akita.compose.foundation.p) b12.f439513d.invoke(bE2, 0)).c(bE2);
            float f12 = 20;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarA = C22501m2.a(E.a(R1.l(androidx.compose.foundation.A.b(vVarD, jC2, o.a(f12)), f12, 16, f12, f12), -1.0f), str);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(b12.f439510a, iVar.f65241l, C22501m2.a(aVar, "CPX_PROMO_GEO_TRIGGER_BANNER_TITLE_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            com.akita.compose.foundation.ui.g.a(2, null, bE2, 6);
            com.akita.compose.foundation.ui.p.b(b12.f439511b, iVar.f65245p, C22501m2.a(aVar, "CPX_PROMO_GEO_TRIGGER_BANNER_SUBTITLE_TEST_TAG"), false, com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(b12, str, i12);
        }
    }
}
