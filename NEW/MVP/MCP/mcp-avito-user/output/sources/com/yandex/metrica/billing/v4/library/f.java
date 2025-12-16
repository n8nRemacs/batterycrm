package com.yandex.metrica.billing.v4.library;

import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;

/* loaded from: classes7.dex */
public final class f extends T21.c {

    public static final class a extends T21.c {
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
        if (!g.a(null).isReady()) {
            g.b(null).a().execute(new a());
        } else {
            g.a(null).querySkuDetailsAsync((SkuDetailsParams) null, (SkuDetailsResponseListener) null);
        }
    }
}
