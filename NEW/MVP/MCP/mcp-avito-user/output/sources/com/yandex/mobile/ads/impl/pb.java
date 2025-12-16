package com.yandex.mobile.ads.impl;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class pb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388753a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final i90 f388754b;

    public pb(@j.N Context context, @j.N i90 i90Var) {
        this.f388753a = context.getApplicationContext();
        this.f388754b = i90Var;
    }

    @j.N
    public final eb a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        qb rjVar;
        if (!nm0.a(jSONObject, "name", "type", "clickable", "required", "value")) {
            throw new yk0("Native Ad json has not required attributes");
        }
        String strA = mm0.a("type", jSONObject);
        String strA2 = mm0.a("name", jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("link");
        h90 h90VarA = jSONObjectOptJSONObject != null ? this.f388754b.a(jSONObjectOptJSONObject) : null;
        Context context = this.f388753a;
        strA2.getClass();
        if (strA2.equals("close_button")) {
            rjVar = new rj();
        } else if (strA2.equals("feedback")) {
            rjVar = new sv(new e30());
        } else {
            strA.getClass();
            switch (strA) {
                case "number":
                    rjVar = new tp0();
                    break;
                case "string":
                    rjVar = new n71();
                    break;
                case "image":
                    rjVar = new e30();
                    break;
                case "media":
                    rjVar = new sd0(context);
                    break;
                default:
                    throw new yk0("Native Ad json has not required attributes");
            }
        }
        return new eb(strA2, strA, rjVar.a(jSONObject), h90VarA, jSONObject.getBoolean("clickable"), jSONObject.getBoolean("required"));
    }
}
