package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.category_parameters.HiddenParameter;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public enum pj1 implements k80 {
    f388868b("default"),
    f388869c("loading"),
    f388870d(HiddenParameter.TYPE);


    /* renamed from: a, reason: collision with root package name */
    private final String f388872a;

    pj1(String str) {
        this.f388872a = str;
    }

    @Override // com.yandex.mobile.ads.impl.k80
    @j.N
    public final String a() {
        return androidx.camera.camera2.internal.G.f("state: ", JSONObject.quote(this.f388872a));
    }
}
