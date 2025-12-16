package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class sd0 implements qb<rd0> {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ph1 f389879b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final cd0 f389878a = new cd0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final v20 f389880c = new v20(new bc1());

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final h30 f389881d = new h30();

    public sd0(@j.N Context context) {
        this.f389879b = new ph1(context);
    }

    @Override // com.yandex.mobile.ads.impl.qb
    @j.N
    public final rd0 a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            throw new yk0("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        Object objA = null;
        rb0 rb0Var = (rb0) ((!jSONObject2.has("media") || jSONObject2.isNull("media")) ? null : this.f389878a.a(jSONObject2.getJSONObject("media")));
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("images");
        ArrayList arrayListA = jSONArrayOptJSONArray != null ? this.f389881d.a(jSONArrayOptJSONArray) : null;
        b30 b30VarA = (!jSONObject2.has("image") || jSONObject2.isNull("image")) ? null : this.f389880c.a(jSONObject2.getJSONObject("image"));
        if ((arrayListA == null || arrayListA.isEmpty()) && b30VarA != null) {
            arrayListA = new ArrayList();
            arrayListA.add(b30VarA);
        }
        ph1 ph1Var = this.f389879b;
        if (jSONObject2.has("video") && !jSONObject2.isNull("video")) {
            objA = ph1Var.a(jSONObject2.getJSONObject("video"));
        }
        me1 me1Var = (me1) objA;
        if (rb0Var == null && ((arrayListA == null || arrayListA.isEmpty()) && me1Var == null)) {
            throw new yk0("Native Ad json has not required attributes");
        }
        return new rd0(rb0Var, me1Var, arrayListA);
    }
}
