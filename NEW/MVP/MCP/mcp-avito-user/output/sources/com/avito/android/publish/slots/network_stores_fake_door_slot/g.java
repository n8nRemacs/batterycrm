package com.avito.android.publish.slots.network_stores_fake_door_slot;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.M1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InformationCard.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l String str, @Y61.l UniversalImage universalImage, boolean z12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        ?? r12;
        float f12;
        float f13;
        float f14;
        ?? r122;
        androidx.compose.runtime.B bE2 = a12.E(999864162);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        float f15 = z12 ? 130 : 90;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        float f16 = f15;
        float f17 = z12 ? 134 : 90;
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        Uri uriC = C35829k2.b(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null, kotlin.math.b.b(dVar.M0(f16)), kotlin.math.b.b(dVar.M0(f17)), 0.0f, 1, 44).c(C34125e.f244618b);
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
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
        R3.b(pVar, bE2, interfaceC22365i0D);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        float f18 = 16;
        androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(C20588k2.q(aVar, 164, 234), androidx.compose.foundation.shape.o.a(f18));
        com.akita.compose.theme.re23.b.f63983a.getClass();
        androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63842E1.c(bE2), Y0.f39346a);
        if (z12) {
            r12 = 0;
            f12 = 0;
        } else {
            r12 = 0;
            f12 = f18;
        }
        androidx.compose.ui.v vVarL = R1.l(vVarB, f18, 12, f12, z12 ? (float) r12 : 20);
        InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, r12);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarL);
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
        R3.b(pVar, bE2, interfaceC22365i0D2);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20585k.f28659a.getClass();
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S3 = bE2.S();
        androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, aVar);
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
        R3.b(pVar, bE2, iA2);
        R3.b(pVar2, bE2, o1S3);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC3);
        K k12 = K.f28344a;
        bE2.C(-1224711111);
        if (str != null) {
            f14 = f17;
            f13 = f16;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, i12 & 14, 1020);
            r122 = 0;
        } else {
            f13 = f16;
            f14 = f17;
            r122 = 0;
        }
        bE2.X(r122);
        C20608p2.a(bE2, k12.a(aVar, 1.0f, true));
        bE2.C(-1224704775);
        if (uriC != null) {
            coil.compose.v.b(uriC, null, M1.b(C20588k2.q(aVar, f13, f14), z12 ? 40 : (float) r122, z12 ? 25 : (float) r122), null, null, null, bE2, 56, 4088);
        }
        bE2.X(r122);
        bE2.X(true);
        bE2.X(true);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C34124d(str, universalImage, z12, aVar, i12);
        }
    }
}
