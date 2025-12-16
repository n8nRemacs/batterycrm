package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class me {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ke f387981a = new ke();

    @j.N
    public final String a(@j.N String str, @j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = mm0.a(str, jSONObject);
        this.f387981a.getClass();
        String strA2 = ke.a(strA);
        if (TextUtils.isEmpty(strA2)) {
            throw new yk0("Native Ad json has attribute with broken base64 encoding");
        }
        return strA2;
    }
}
