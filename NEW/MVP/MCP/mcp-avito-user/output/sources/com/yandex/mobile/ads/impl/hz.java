package com.yandex.mobile.ads.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.mobile.ads.impl.gz;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public final class hz {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final InterfaceC44804n f386246a;

    /* renamed from: b, reason: collision with root package name */
    private long f386247b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    public hz(@Y61.k InterfaceC44804n interfaceC44804n) {
        this.f386246a = interfaceC44804n;
    }

    @Y61.k
    public final gz a() {
        gz.a aVar = new gz.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.a();
            }
            aVar.a(strB);
        }
    }

    @Y61.k
    public final String b() {
        String strX1 = this.f386246a.X1(this.f386247b);
        this.f386247b -= strX1.length();
        return strX1;
    }
}
