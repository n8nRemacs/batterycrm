package com.avito.android.virtual_deal_room_client_creation.common;

import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.J3;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.d;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_virtual-deal-room-client-creation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @InterfaceC22132o
    @l
    public static final Uri a(@l UniversalImage universalImage, float f12, float f13, @l A a12) {
        a12.C(1621152166);
        Uri uriC = null;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, !((Boolean) a12.o(com.akita.compose.foundation.b.f63571a)).booleanValue()) : null;
        if (imageDependsOnThemeOrDefault != null) {
            a12.C(-984095593);
            a12.C(1290103069);
            J3 j32 = Q0.f41199h;
            int iY02 = ((d) a12.o(j32)).y0(f12);
            a12.h();
            a12.C(1290103069);
            int iY03 = ((d) a12.o(j32)).y0(f13);
            a12.h();
            uriC = C35829k2.b(imageDependsOnThemeOrDefault, iY02, iY03, 0.0f, 1, 44).c(a.f326689b);
            a12.h();
        }
        a12.h();
        return uriC;
    }
}
