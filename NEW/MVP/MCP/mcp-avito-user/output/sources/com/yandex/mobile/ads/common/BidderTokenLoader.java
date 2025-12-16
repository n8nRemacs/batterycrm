package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.impl.jn1;
import j.N;

/* loaded from: classes8.dex */
public final class BidderTokenLoader {
    private BidderTokenLoader() {
    }

    public static void loadBidderToken(@N Context context, @N BidderTokenLoadListener bidderTokenLoadListener) {
        jn1.a().b(context, bidderTokenLoadListener);
    }
}
