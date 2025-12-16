package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import android.net.Uri;
import androidx.compose.foundation.O0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.J3;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsNotificationsBannerRedesign.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k String str2, @Y61.l UniversalImage universalImage, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        B bE2 = a12.E(-664095976);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.banner.g.c(com.akita.compose.theme.re23.b.b(bE2).getF66889a(), aVar3, null, null, null, 0.0f, aVar2, androidx.compose.runtime.internal.r.c(1505509976, new r(aVar, universalImage, str, str2), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 14155776, 60);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new s(str, str2, universalImage, aVar, aVar2, aVar3, i12);
        }
    }

    public static final void b(UniversalImage universalImage, float f12, float f13, float f14, float f15, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.ui.v vVarB;
        B bE2 = a12.E(-1940623389);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        InterfaceC22374n.f40491a.getClass();
        InterfaceC22374n.a.e eVar = InterfaceC22374n.a.f40494c;
        bE2.C(-861184186);
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
            bE2.C(-926435780);
            coil.compose.v.b(string, null, R1.m(C20588k2.h(0.0f, f13, 1, C20588k2.v(0.0f, f12, 1, aVar)), 0.0f, 0.0f, f14, 0.0f, 11), null, eVar, null, bE2, (i12 & 3670016) | 48, 4024);
            bE2.X(false);
        } else {
            bE2.C(-926110032);
            bE2.C(-861156387);
            boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
            bE2.C(-861153859);
            if (zBooleanValue) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                vVarB = androidx.compose.foundation.A.b(aVar, com.akita.compose.theme.re23.b.f63984b.f63945n0.c(bE2), Y0.f39346a);
            } else {
                vVarB = aVar;
            }
            bE2.X(false);
            bE2.X(false);
            com.akita.compose.foundation.ui.g.b(f15, vVarB, bE2, (i12 >> 12) & 14, 0);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(universalImage, f12, f13, f14, f15, aVar, eVar, i12);
        }
    }
}
