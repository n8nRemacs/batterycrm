package com.avito.android.service_fee_conditions.ui.compose;

import android.content.Context;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceFeeConditionsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\b²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lqu0/a;", "Lkotlin/G0;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkEvent", "Lkotlin/Function0;", "finishFlowEvent", "_avito_service-fee-conditions_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k qu0.c cVar, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1209674505);
        v.a aVar2 = v.f42878y1;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(aVar, bE2);
        androidx.appcompat.app.m mVarC = C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        C22187u0.d(new b(interfaceC43160i, mVarC, interfaceC22204y1M2, interfaceC22204y1M3, null), bE2, G0.f406611a);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-460719346, new l(aVar2, cVar, lVar, interfaceC22204y1M2, interfaceC22204y1M), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(cVar, interfaceC43160i, aVar, lVar, lVar2, aVar2, i12);
        }
    }

    public static final void b(qu0.c cVar, Y41.l lVar, float f12, v.a aVar, A a12, int i12) {
        int i13;
        v.a aVar2;
        B bE2 = a12.E(155481146);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(cVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.k(f12) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            v.a aVar3 = v.f42878y1;
            v vVarB = a2.b(aVar3, a2.a(bE2), true, true);
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            AttributedText attributedText = cVar.f429483g;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 16;
            com.avito.android.service_fee_conditions.ui.compose.items.k.a(attributedText, R1.k(f13, 0.0f, 2, R1.m(aVar3, 0.0f, 12, 0.0f, 0.0f, 13)), bE2, 56);
            float f14 = 20;
            com.avito.android.service_fee_conditions.ui.compose.items.p.a(cVar.f429484h, R1.k(10, 0.0f, 2, R1.m(aVar3, 0.0f, f14, 0.0f, 0.0f, 13)), bE2, 48, 0);
            com.avito.android.service_fee_conditions.ui.compose.items.g.a(cVar.f429485i, R1.k(f13, 0.0f, 2, R1.m(aVar3, 0.0f, f14, 0.0f, 0.0f, 13)), bE2, 56, 0);
            com.avito.android.service_fee_conditions.ui.compose.items.f.a(cVar.f429486j, lVar, R1.k(f13, 0.0f, 2, R1.m(aVar3, 0.0f, 24, 0.0f, 0.0f, 13)), bE2, (i14 & 112) | 384);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, (i14 >> 6) & 14);
            bE2.X(true);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(cVar, lVar, f12, aVar2, i12);
        }
    }
}
