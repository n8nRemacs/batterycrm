package com.avito.android.tariff_cpt.common.ui.compose;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.J3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCptImage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-cpt_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {
    @InterfaceC22132o
    public static final void a(@l Image image, float f12, float f13, @l v vVar, @l i iVar, @l InterfaceC22374n.a.e eVar, @l A a12, int i12) {
        B bE2 = a12.E(1048129197);
        bE2.C(-1148606382);
        J3 j32 = Q0.f41199h;
        int iY02 = ((androidx.compose.ui.unit.d) bE2.o(j32)).y0(f12);
        bE2.h();
        bE2.C(-1148606382);
        int iY03 = ((androidx.compose.ui.unit.d) bE2.o(j32)).y0(f13);
        bE2.h();
        Uri uriC = C35829k2.b(image, iY02, iY03, 0.0f, 0, 60).c(g.f297556b);
        if (uriC == null) {
            uriC = Uri.EMPTY;
        }
        coil.compose.v.a(uriC, null, C20588k2.q(C22501m2.a(vVar, "tariff_cpt_configure_landing_feature_image_tag"), f12, f13), null, null, null, null, null, null, iVar, eVar, null, bE2, 299064, 0, 63936);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(image, f12, f13, vVar, iVar, eVar, i12);
        }
    }

    @InterfaceC22132o
    public static final void b(@k iC0.f fVar, float f12, float f13, @l A a12, int i12) {
        B bE2 = a12.E(1451509861);
        v.a aVar = v.f42878y1;
        InterfaceC22215f.f39074a.getClass();
        i iVar = InterfaceC22215f.a.f39080f;
        InterfaceC22374n.f40491a.getClass();
        InterfaceC22374n.a.e eVar = InterfaceC22374n.a.f40494c;
        a(fVar.a((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)), f12, f13, aVar, iVar, eVar, bE2, 2362808);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(fVar, f12, f13, aVar, iVar, eVar, i12);
        }
    }
}
