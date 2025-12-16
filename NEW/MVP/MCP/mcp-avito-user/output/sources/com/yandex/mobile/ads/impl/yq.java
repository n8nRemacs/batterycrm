package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class yq implements vp {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<?> f392055a;

    public yq(@j.N AdResponse<?> adResponse) {
        this.f392055a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.vp
    public final boolean a(@j.N Context context) {
        return "divkit".equals(this.f392055a.v());
    }
}
