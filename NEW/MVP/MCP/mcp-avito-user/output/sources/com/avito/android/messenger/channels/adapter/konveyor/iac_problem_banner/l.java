package com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner;

import android.net.Uri;
import androidx.compose.foundation.O0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsIacProblemBannerUI.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k String str2, @Y61.l UniversalImage universalImage, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1082858955);
        v.a aVar3 = v.f42878y1;
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, aVar3);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.banner.g.c(com.akita.compose.theme.re23.b.b(bE2).getF66896f(), null, null, null, null, 0.0f, aVar2, androidx.compose.runtime.internal.r.c(-807610501, new i(aVar, universalImage, str, str2), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 14155776, 62);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(str, str2, universalImage, aVar, aVar2, aVar3, i12);
        }
    }

    public static final void b(UniversalImage universalImage, float f12, float f13, v vVar, A a12, int i12) {
        B bE2 = a12.E(1772331925);
        InterfaceC22374n.f40491a.getClass();
        InterfaceC22374n.a.C1667a c1667a = InterfaceC22374n.a.f40493b;
        bE2.C(1061803008);
        String string = null;
        if (universalImage != null) {
            Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, !O0.a(bE2));
            J3 j32 = Q0.f41199h;
            Uri uriD = C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(((androidx.compose.ui.unit.d) bE2.o(j32)).M0(f12)), kotlin.math.b.b(((androidx.compose.ui.unit.d) bE2.o(j32)).M0(f13)), 0.0f, 2, 44).d();
            if (uriD != null) {
                string = uriD.toString();
            }
        }
        bE2.X(false);
        if (string != null) {
            bE2.C(-1443381575);
            coil.compose.v.b(string, null, C20588k2.q(vVar, f12, f13), null, c1667a, null, bE2, ((i12 << 6) & 3670016) | 48, 4024);
            bE2.X(false);
        } else {
            bE2.C(-1443171116);
            bE2.C(1061827958);
            v vVarQ = C20588k2.q(vVar, f12, f13);
            boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
            bE2.C(1061830730);
            if (zBooleanValue) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                vVarQ = androidx.compose.foundation.A.b(vVarQ, com.akita.compose.theme.re23.b.f63984b.f63945n0.c(bE2), Y0.f39346a);
            }
            bE2.X(false);
            bE2.X(false);
            C20608p2.a(bE2, vVarQ);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(universalImage, f12, f13, vVar, c1667a, i12);
        }
    }
}
