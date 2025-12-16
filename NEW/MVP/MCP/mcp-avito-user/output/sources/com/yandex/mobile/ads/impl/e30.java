package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class e30 implements qb<b30> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bc1 f384751a = new bc1();

    @Override // com.yandex.mobile.ads.impl.qb
    @j.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b30 a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            throw new yk0("Native Ad json has not required attributes");
        }
        b30 b30Var = new b30();
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        this.f384751a.getClass();
        b30Var.b(bc1.a(ContextActionHandler.Link.URL, jSONObject2));
        b30Var.b(jSONObject2.getInt("w"));
        b30Var.a(jSONObject2.getInt("h"));
        String strOptString = jSONObject2.optString("sizeType");
        if (!TextUtils.isEmpty(strOptString)) {
            b30Var.a(strOptString);
        }
        return b30Var;
    }
}
