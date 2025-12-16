package com.avito.android.gig_motivations_list.ui.compose;

import android.content.Context;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wH.C49505a;
import wH.C49506b;

/* compiled from: MotivationsListEmptyContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_motivations-list_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C49505a c49505a, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(135248572);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        FillElement fillElement = C20588k2.f28682c;
        aVar.getClass();
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarA = C22501m2.a(R1.k(16, 0.0f, 2, fillElement), "MotivationsListEmptyContent");
        InterfaceC22215f.f39074a.getClass();
        i.a aVar3 = InterfaceC22215f.a.f39089o;
        C20585k.f28659a.getClass();
        I iA2 = H.a(C20585k.f28664f, aVar3, bE2, 54);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(c49505a.f441338b, com.avito.android.lib.util.darkTheme.c.b(context));
        float f12 = 211;
        float f13 = 165;
        coil.compose.v.b(C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(dVar.M0(f12)), kotlin.math.b.b(dVar.M0(f13)), 0.0f, 1, 44).c(p.f160328b), null, C20588k2.q(aVar, f12, f13), null, null, null, bE2, 440, 4088);
        float f14 = 12;
        androidx.compose.ui.v vVarM = R1.m(aVar, 0.0f, f14, 0.0f, 0.0f, 13);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.r rVar = iVar.f65232c;
        androidx.compose.ui.text.style.i.f42675b.getClass();
        int i14 = androidx.compose.ui.text.style.i.f42678e;
        com.akita.compose.foundation.ui.p.b(c49505a.f441340d, rVar, vVarM, false, 0L, androidx.compose.ui.text.style.i.a(i14), 0, 0, false, null, bE2, 384, 984);
        com.akita.compose.foundation.ui.p.b(c49505a.f441339c, iVar.f65241l, R1.m(aVar, 0.0f, 6, 0.0f, 0.0f, 13), false, 0L, androidx.compose.ui.text.style.i.a(i14), 0, 0, false, null, bE2, 384, 984);
        C49506b c49506b = c49505a.f441337a;
        com.akita.compose.component.button.m.c(c49506b.f441341a, new o(lVar, c49506b), com.akita.compose.theme.re23.b.c(bE2).M(), R1.m(aVar, 0.0f, f14, 0.0f, 0.0f, 13), null, null, null, false, false, null, bE2, 3584, 1008);
        C20608p2.a(bE2, C20588k2.f(aVar, 48));
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(c49505a, lVar, aVar, i12);
        }
    }
}
