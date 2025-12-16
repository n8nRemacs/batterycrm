package com.yandex.mobile.ads.common;

import Y61.k;
import android.location.Location;
import com.yandex.mobile.ads.impl.g5;
import java.util.List;
import java.util.Map;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class a {
    @k
    public static g5 a(@k AdRequestConfiguration adRequestConfiguration) {
        String strB = adRequestConfiguration.b();
        String strF = adRequestConfiguration.f();
        String strD = adRequestConfiguration.d();
        List<String> listE = adRequestConfiguration.e();
        Location locationG = adRequestConfiguration.g();
        Map<String, String> mapH = adRequestConfiguration.h();
        String strC = adRequestConfiguration.c();
        AdTheme adThemeI = adRequestConfiguration.i();
        g5.a aVar = new g5.a();
        if (strB != null) {
            if (C43066x.K(strB)) {
                strB = null;
            }
            if (strB != null) {
                aVar.a(strB);
            }
        }
        if (strF != null) {
            if (C43066x.K(strF)) {
                strF = null;
            }
            if (strF != null) {
                aVar.d(strF);
            }
        }
        if (strD != null) {
            aVar = aVar.c(strD);
        }
        if (listE != null) {
            aVar = aVar.a(listE);
        }
        if (locationG != null) {
            aVar = aVar.a(locationG);
        }
        if (mapH != null) {
            aVar = aVar.a(mapH);
        }
        if (strC != null) {
            aVar = aVar.b(strC);
        }
        if (adThemeI != null) {
            aVar = aVar.a(adThemeI);
        }
        return aVar.a();
    }

    @k
    public static String b(@k AdRequestConfiguration adRequestConfiguration) {
        return adRequestConfiguration.a();
    }
}
