package com.yandex.mobile.ads.impl;

import android.net.Uri;

/* loaded from: classes8.dex */
public final class hr {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final dc1 f386209a;

    public hr(@Y61.k qs0 qs0Var) {
        this.f386209a = qs0Var;
    }

    public final void a(@Y61.k Uri uri) {
        String queryParameter = uri.getQueryParameter("trackingUrl");
        if (queryParameter == null || queryParameter.length() <= 0) {
            return;
        }
        this.f386209a.a(queryParameter);
    }
}
