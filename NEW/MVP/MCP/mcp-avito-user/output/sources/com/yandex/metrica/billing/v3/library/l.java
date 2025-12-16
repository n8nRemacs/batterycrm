package com.yandex.metrica.billing.v3.library;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import j.N;
import java.util.HashSet;

/* loaded from: classes7.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Handler f377572a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final BillingClient f377573b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f377574c;

    public l(@N BillingClient billingClient) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f377573b = billingClient;
        this.f377574c = new HashSet();
        this.f377572a = handler;
    }
}
