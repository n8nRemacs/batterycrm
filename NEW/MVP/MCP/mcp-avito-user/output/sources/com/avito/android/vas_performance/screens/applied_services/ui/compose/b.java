package com.avito.android.vas_performance.screens.applied_services.ui.compose;

import Y41.p;
import android.content.Context;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServicesBanner.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_vas-performance_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k AppliedServicesState.Section.a aVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        long jC2;
        float f12;
        boolean z12;
        B bE2 = a12.E(-1582319258);
        if ((((bE2.B(aVar) ? 4 : 2) | i12) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
            v vVarD = C20588k2.d(vVar, 1.0f);
            float f13 = 118;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarB = C20588k2.b(0.0f, f13, 1, vVarD);
            Integer numA = aVar.f320307c.a(context);
            T tA2 = numA != null ? T.a(V.b(numA.intValue())) : null;
            bE2.C(-2017264651);
            if (tA2 == null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                jC2 = com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2);
            } else {
                jC2 = tA2.f39331a;
            }
            bE2.X(false);
            float f14 = 10;
            v vVarB2 = androidx.compose.foundation.A.b(vVarB, jC2, o.a(f14));
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarB2);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            bE2.C(853101036);
            wZ.l lVar = aVar.f320306b;
            if (lVar == null) {
                f12 = f14;
                z12 = false;
            } else {
                f12 = f14;
                z12 = false;
                com.avito.android.mnz_common.compose.i.b(lVar, 170, f13, "", c20644z.d(v.f42878y1, InterfaceC22215f.a.f39084j), null, null, null, bE2, 3512, 480);
            }
            bE2.X(z12);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(aVar.f320305a, com.akita.compose.theme.re23.b.f63988f.f65240k, R1.l(C20588k2.d(v.f42878y1, 1.0f), 16, f12, 102, 42), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(aVar, vVar, i12);
        }
    }
}
