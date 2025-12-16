package com.yandex.mobile.ads.core.identifiers.ad.huawei;

import com.yandex.mobile.ads.impl.s8;
import com.yandex.mobile.ads.impl.t8;
import j.N;
import j.P;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final t8 f382704a = new t8();

    @P
    public final s8 a(@N b bVar) {
        try {
            OpenDeviceIdentifierService openDeviceIdentifierServiceA = bVar.a();
            if (openDeviceIdentifierServiceA == null) {
                return null;
            }
            String oaid = openDeviceIdentifierServiceA.getOaid();
            boolean zIsOaidTrackLimited = openDeviceIdentifierServiceA.isOaidTrackLimited();
            this.f382704a.getClass();
            if (oaid != null) {
                return new s8(oaid, zIsOaidTrackLimited);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
