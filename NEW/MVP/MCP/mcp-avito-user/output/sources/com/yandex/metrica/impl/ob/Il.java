package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Il extends C39107rl {

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public volatile String f378529h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public volatile String f378530i;

    public Il(@j.N String str, @j.N String str2, @j.P C39107rl.b bVar, int i12, boolean z12) {
        super(str, str2, null, i12, z12, C39107rl.c.VIEW, C39107rl.a.WEBVIEW);
        this.f378529h = null;
        this.f378530i = null;
    }

    @Override // com.yandex.metrica.impl.ob.C39107rl
    public boolean a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.C39107rl
    public String toString() {
        return "WebViewElement{url='" + this.f378529h + "', originalUrl='" + this.f378530i + "', mClassName='" + this.f381777a + "', mId='" + this.f381778b + "', mParseFilterReason=" + this.f381779c + ", mDepth=" + this.f381780d + ", mListItem=" + this.f381781e + ", mViewType=" + this.f381782f + ", mClassType=" + this.f381783g + "} ";
    }

    @Override // com.yandex.metrica.impl.ob.C39107rl
    @j.P
    public JSONArray a(@j.N C38861hl c38861hl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", "HTML");
            if (c38861hl.f380742j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", A2.a(this.f378529h, c38861hl.f380747o));
                jSONObject2.putOpt("ou", A2.a(this.f378530i, c38861hl.f380747o));
                if (jSONObject2.length() > 0) {
                    jSONObject.put("i", jSONObject2);
                }
            }
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
