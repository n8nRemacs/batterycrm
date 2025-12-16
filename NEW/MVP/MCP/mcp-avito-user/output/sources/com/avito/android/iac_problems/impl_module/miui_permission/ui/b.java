package com.avito.android.iac_problems.impl_module.miui_permission.ui;

import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.O0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
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

/* compiled from: AsyncUniversalImageOrSpacer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-problems_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k UniversalImage universalImage, float f12, float f13, @l InterfaceC22374n.a.d dVar, @l A a12, int i12) {
        B bE2 = a12.E(-176301512);
        v.a aVar = v.f42878y1;
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, !O0.a(bE2));
        J3 j32 = Q0.f41199h;
        Uri uriD = C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(((androidx.compose.ui.unit.d) bE2.o(j32)).M0(f12)), kotlin.math.b.b(((androidx.compose.ui.unit.d) bE2.o(j32)).M0(f13)), 0.0f, 2, 44).d();
        String string = uriD != null ? uriD.toString() : null;
        if (string != null) {
            bE2.C(-1401747733);
            coil.compose.v.b(string, null, C20588k2.q(aVar, f12, f13), null, dVar, null, bE2, 1572912, 4024);
            bE2.X(false);
        } else {
            bE2.C(-1401537274);
            bE2.C(-183755004);
            v vVarQ = C20588k2.q(aVar, f12, f13);
            boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
            bE2.C(-183752232);
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
            c22039c2Z.f38184d = new a(universalImage, f12, f13, aVar, dVar, i12);
        }
    }
}
