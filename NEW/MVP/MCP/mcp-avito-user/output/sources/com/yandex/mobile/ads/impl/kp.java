package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class kp implements ho {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f387242a;

    public kp(@Y61.k Context context) {
        this.f387242a = context;
    }

    @Override // com.yandex.mobile.ads.impl.ho
    @Y61.k
    public final eb<?> a() {
        return new eb<>("sponsored", "string", this.f387242a.getResources().getText(R.string.monetization_ads_internal_instream_sponsored_default), null, false, true);
    }
}
