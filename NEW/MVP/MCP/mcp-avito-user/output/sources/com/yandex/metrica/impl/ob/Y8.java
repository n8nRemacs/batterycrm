package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Y8 {

    /* renamed from: a, reason: collision with root package name */
    private final C38698b8 f379956a;

    public Y8(@Y61.k C38698b8 c38698b8) {
        this.f379956a = c38698b8;
    }

    public final int a(int i12) {
        JSONObject jSONObjectD = this.f379956a.d();
        if (jSONObjectD != null) {
            return jSONObjectD.optInt(String.valueOf(i12));
        }
        return 0;
    }

    public final void a(int i12, int i13) throws JSONException {
        JSONObject jSONObjectD = this.f379956a.d();
        if (jSONObjectD == null) {
            jSONObjectD = new JSONObject();
        }
        jSONObjectD.put(String.valueOf(i12), i13);
        this.f379956a.a(jSONObjectD);
    }
}
