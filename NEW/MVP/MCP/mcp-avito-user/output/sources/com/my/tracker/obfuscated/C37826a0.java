package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.a0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37826a0 {

    /* renamed from: a, reason: collision with root package name */
    boolean f365374a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f365375b = true;

    /* renamed from: c, reason: collision with root package name */
    String f365376c;

    public void a(Context context) {
        if (this.f365374a) {
            return;
        }
        b(context);
        this.f365374a = true;
    }

    public void b(Context context) {
        e2.a("get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.f365376c = advertisingIdInfo.getId();
            e2.a("AId: " + this.f365376c);
            this.f365375b = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            e2.a("AId ad tracking enabled: " + this.f365375b);
        } catch (Throwable th2) {
            e2.b("failed to get google AId", th2);
        }
    }

    public void a(a1 a1Var, Context context) {
        if (TextUtils.isEmpty(this.f365376c)) {
            return;
        }
        a1Var.a(this.f365376c, this.f365375b);
    }

    public void c(Context context) {
    }
}
