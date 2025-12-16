package x01;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class X implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public String f442013a;

    /* renamed from: b, reason: collision with root package name */
    public String f442014b;

    /* renamed from: c, reason: collision with root package name */
    public String f442015c;

    /* renamed from: d, reason: collision with root package name */
    public String f442016d;

    /* renamed from: e, reason: collision with root package name */
    public String f442017e;

    /* renamed from: f, reason: collision with root package name */
    public String f442018f;

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f442013a);
        jSONObject.put("eventtime", this.f442016d);
        jSONObject.put("event", this.f442014b);
        jSONObject.put("event_session_name", this.f442017e);
        jSONObject.put("first_session_event", this.f442018f);
        if (TextUtils.isEmpty(this.f442015c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f442015c));
        return jSONObject;
    }

    public final void b(JSONObject jSONObject) throws Throwable {
        if (jSONObject == null) {
            return;
        }
        this.f442014b = jSONObject.optString("event");
        this.f442015c = jSONObject.optString("properties");
        this.f442015c = C49728m.a(this.f442015c, C49726k.c().a());
        this.f442013a = jSONObject.optString("type");
        this.f442016d = jSONObject.optString("eventtime");
        this.f442017e = jSONObject.optString("event_session_name");
        this.f442018f = jSONObject.optString("first_session_event");
    }

    public final JSONObject c() throws Throwable {
        JSONObject jSONObjectA = a();
        String strA = C49726k.c().a();
        byte[] bytes = this.f442015c.getBytes(C49728m.f442047a);
        byte[] bArrB = S01.c.b(strA);
        byte[] bArrA = S01.b.a(16);
        byte[] bArrD = N01.a.d(bytes, bArrB, bArrA);
        byte[] bArr = new byte[bArrA.length + bArrD.length];
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        System.arraycopy(bArrD, 0, bArr, bArrA.length, bArrD.length);
        jSONObjectA.put("properties", S01.c.a(bArr));
        return jSONObjectA;
    }
}
