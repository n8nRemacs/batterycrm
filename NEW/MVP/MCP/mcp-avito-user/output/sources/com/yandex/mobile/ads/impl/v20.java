package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class v20 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bc1 f390783a;

    public v20(@j.N bc1 bc1Var) {
        this.f390783a = bc1Var;
    }

    @j.N
    public final b30 a(@j.N JSONObject jSONObject) {
        b30 b30Var = new b30();
        this.f390783a.getClass();
        b30Var.b(bc1.a(ContextActionHandler.Link.URL, jSONObject));
        b30Var.b(jSONObject.getInt("w"));
        b30Var.a(jSONObject.getInt("h"));
        if (jSONObject.has("smartCenterSettings")) {
            b30Var.a(new l51().a(jSONObject.getJSONObject("smartCenterSettings")));
        }
        String strOptString = jSONObject.optString("sizeType");
        if (!TextUtils.isEmpty(strOptString)) {
            b30Var.a(strOptString);
        }
        return b30Var;
    }
}
