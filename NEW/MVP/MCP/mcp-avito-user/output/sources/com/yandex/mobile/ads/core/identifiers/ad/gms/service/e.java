package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import com.yandex.mobile.ads.impl.s8;
import com.yandex.mobile.ads.impl.t8;
import j.N;
import j.P;

/* loaded from: classes8.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final t8 f382696a = new t8();

    /* renamed from: b, reason: collision with root package name */
    @N
    private final b f382697b = new b();

    @P
    public final s8 a(@N c cVar) {
        try {
            IBinder iBinderA = cVar.a();
            if (iBinderA == null) {
                return null;
            }
            this.f382697b.getClass();
            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            a gmsServiceAdvertisingInfoReader = iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new GmsServiceAdvertisingInfoReader(iBinderA);
            String advertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
            Boolean adTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
            this.f382696a.getClass();
            if (adTrackingLimited == null || advertisingId == null) {
                return null;
            }
            return new s8(advertisingId, adTrackingLimited.booleanValue());
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
