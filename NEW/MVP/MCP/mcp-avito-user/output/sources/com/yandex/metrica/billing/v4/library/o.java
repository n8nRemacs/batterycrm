package com.yandex.metrica.billing.v4.library;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import j.l0;
import java.util.LinkedHashSet;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f377594a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f377595b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f377596c;

    public o(BillingClient billingClient, Handler handler, int i12) {
        Handler handler2 = (i12 & 2) != 0 ? new Handler(Looper.getMainLooper()) : null;
        this.f377595b = billingClient;
        this.f377596c = handler2;
        this.f377594a = new LinkedHashSet();
    }

    @l0
    public final void b(@Y61.k Object obj) {
        LinkedHashSet linkedHashSet = this.f377594a;
        linkedHashSet.remove(obj);
        if (linkedHashSet.size() == 0) {
            this.f377596c.post(new n(this));
        }
    }
}
