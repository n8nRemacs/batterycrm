package com.yandex.metrica.billing.v3.library;

import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;

/* loaded from: classes7.dex */
class f extends T21.c {

    public class a extends T21.c {
        public a() {
        }

        @Override // T21.c
        public final void a() {
            f.this.getClass();
            throw null;
        }
    }

    @Override // T21.c
    public final void a() {
        if (g.a(null).isReady()) {
            g.a(null).querySkuDetailsAsync((SkuDetailsParams) null, (SkuDetailsResponseListener) null);
        } else {
            g.b(null).execute(new a());
        }
    }
}
