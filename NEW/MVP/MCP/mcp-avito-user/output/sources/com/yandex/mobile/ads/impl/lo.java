package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class lo implements ho {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f387587a;

    public lo(@Y61.k Context context) {
        this.f387587a = context;
    }

    @Override // com.yandex.mobile.ads.impl.ho
    @Y61.k
    public final eb<?> a() {
        return new eb<>("call_to_action", "string", this.f387587a.getResources().getText(R.string.monetization_ads_internal_instream_call_to_action), null, true, true);
    }
}
