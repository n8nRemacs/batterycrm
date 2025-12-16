package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.C39054pf;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ad, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38678ad {
    @j.N
    public C39054pf.b a(@j.N Hc hc2) {
        C39054pf.b bVar = new C39054pf.b();
        Location locationC = hc2.c();
        bVar.f381306a = hc2.b() == null ? bVar.f381306a : hc2.b().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.f381308c = timeUnit.toSeconds(locationC.getTime());
        bVar.f381316k = J1.a(hc2.f378254a);
        bVar.f381307b = timeUnit.toSeconds(hc2.e());
        bVar.f381317l = timeUnit.toSeconds(hc2.d());
        bVar.f381309d = locationC.getLatitude();
        bVar.f381310e = locationC.getLongitude();
        bVar.f381311f = Math.round(locationC.getAccuracy());
        bVar.f381312g = Math.round(locationC.getBearing());
        bVar.f381313h = Math.round(locationC.getSpeed());
        bVar.f381314i = (int) Math.round(locationC.getAltitude());
        String provider = locationC.getProvider();
        bVar.f381315j = "gps".equals(provider) ? 1 : "network".equals(provider) ? 2 : "fused".equals(provider) ? 3 : 0;
        bVar.f381318m = J1.a(hc2.a());
        return bVar;
    }
}
