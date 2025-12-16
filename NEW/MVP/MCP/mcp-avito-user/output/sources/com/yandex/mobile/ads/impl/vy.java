package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes8.dex */
public final class vy {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391228a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nx0 f391229b = new nx0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final t8 f391230c = new t8();

    public vy(@j.N Context context) {
        this.f391228a = context.getApplicationContext();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @j.P
    public final s8 a() {
        try {
            this.f391229b.getClass();
            if (AdvertisingIdClient.class == 0) {
                return null;
            }
            nx0 nx0Var = this.f391229b;
            Object[] objArr = {this.f391228a};
            nx0Var.getClass();
            Object objA = nx0.a(AdvertisingIdClient.class, "getAdvertisingIdInfo", objArr);
            if (objA == null) {
                return null;
            }
            String str = (String) nx0.a(objA, "getId", new Object[0]);
            Boolean bool = (Boolean) nx0.a(objA, "isLimitAdTrackingEnabled", new Object[0]);
            this.f391230c.getClass();
            if (bool == null || str == null) {
                return null;
            }
            return new s8(str, bool.booleanValue());
        } catch (Throwable unused) {
            return null;
        }
    }
}
