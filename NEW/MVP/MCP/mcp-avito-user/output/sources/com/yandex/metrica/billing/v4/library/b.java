package com.yandex.metrica.billing.v4.library;

import com.android.billingclient.api.PurchaseHistoryResponseListener;

/* loaded from: classes7.dex */
public final class b extends T21.c {

    public static final class a extends T21.c {
        public a() {
        }

        @Override // T21.c
        public final void a() {
            b.this.getClass();
            throw null;
        }
    }

    @Override // T21.c
    public final void a() {
        if (!null.f377586a.isReady()) {
            null.f377587b.a().execute(new a());
        } else {
            null.f377586a.queryPurchaseHistoryAsync((String) null, (PurchaseHistoryResponseListener) null);
        }
    }
}
