package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39121sb {

    /* renamed from: a, reason: collision with root package name */
    private final String f381824a;

    /* renamed from: b, reason: collision with root package name */
    private final int f381825b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f381826c;

    public C39121sb(@j.N JSONObject jSONObject) {
        this.f381824a = jSONObject.getString("name");
        this.f381826c = jSONObject.getBoolean("required");
        this.f381825b = jSONObject.optInt("version", -1);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("name", this.f381824a).put("required", this.f381826c);
        int i12 = this.f381825b;
        if (i12 != -1) {
            jSONObjectPut.put("version", i12);
        }
        return jSONObjectPut;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39121sb.class != obj.getClass()) {
            return false;
        }
        C39121sb c39121sb = (C39121sb) obj;
        if (this.f381825b != c39121sb.f381825b || this.f381826c != c39121sb.f381826c) {
            return false;
        }
        String str = this.f381824a;
        String str2 = c39121sb.f381824a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f381824a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f381825b) * 31) + (this.f381826c ? 1 : 0);
    }

    public C39121sb(String str, int i12, boolean z12) {
        this.f381824a = str;
        this.f381825b = i12;
        this.f381826c = z12;
    }
}
