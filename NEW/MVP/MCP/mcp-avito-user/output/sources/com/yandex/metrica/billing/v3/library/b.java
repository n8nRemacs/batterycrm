package com.yandex.metrica.billing.v3.library;

import com.android.billingclient.api.PurchaseHistoryResponseListener;

/* loaded from: classes7.dex */
class b extends T21.c {

    public class a extends T21.c {
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
        if (null.f377565c.isReady()) {
            null.f377565c.queryPurchaseHistoryAsync((String) null, (PurchaseHistoryResponseListener) null);
        } else {
            null.f377563a.execute(new a());
        }
    }
}
