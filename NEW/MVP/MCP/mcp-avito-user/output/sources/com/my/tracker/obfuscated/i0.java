package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes7.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    String f365670b;

    /* renamed from: a, reason: collision with root package name */
    boolean f365669a = false;

    /* renamed from: c, reason: collision with root package name */
    boolean f365671c = true;

    public void a(Context context) {
        if (this.f365669a) {
            return;
        }
        this.f365669a = true;
        b(context);
    }

    public void b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.f365670b = advertisingIdInfo.getId();
            e2.a("HuaweiAIdDataProvider: oaid: " + this.f365670b);
            this.f365671c = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            e2.a("HuaweiAIdDataProvider: oaid tracking enabled: " + this.f365671c);
        } catch (Throwable unused) {
        }
    }

    public void a(a1 a1Var, Context context) {
        if (TextUtils.isEmpty(this.f365670b)) {
            return;
        }
        a1Var.b(this.f365670b, this.f365671c);
    }

    public void c(Context context) {
    }
}
