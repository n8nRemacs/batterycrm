package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
final class ym0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final fl0 f392022a;

    public ym0(@j.N Context context) {
        this.f392022a = new fl0(context);
    }

    @j.P
    public final bl0 a(@j.N AdResponse<String> adResponse) {
        String strB = adResponse.B();
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return this.f392022a.a(strB);
    }
}
