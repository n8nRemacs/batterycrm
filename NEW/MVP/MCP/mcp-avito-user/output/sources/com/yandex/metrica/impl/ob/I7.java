package com.yandex.metrica.impl.ob;

import android.util.Base64;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class I7 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private String f378280a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private String f378281b;

    public void a(@j.P String str) {
        this.f378280a = str;
    }

    public void b(@j.P String str) {
        this.f378281b = str;
    }

    @j.N
    public String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f378280a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.f378281b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
