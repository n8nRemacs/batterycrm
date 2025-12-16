package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.J;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Z6 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f379985a;

    /* renamed from: b, reason: collision with root package name */
    private final String f379986b;

    /* renamed from: c, reason: collision with root package name */
    private final int f379987c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final HashMap<J.a, Integer> f379988d;

    /* renamed from: e, reason: collision with root package name */
    private final String f379989e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f379990f;

    /* renamed from: g, reason: collision with root package name */
    private final String f379991g;

    /* renamed from: h, reason: collision with root package name */
    private final String f379992h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final CounterConfiguration.b f379993i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private final String f379994j;

    public Z6(@j.N String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f379985a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f379986b = jSONObject2.getString("name");
        this.f379987c = jSONObject2.getInt("bytes_truncated");
        this.f379994j = Tl.b(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f379988d = new HashMap<>();
        if (strOptString != null) {
            try {
                HashMap<String, String> mapD = Tl.d(strOptString);
                if (mapD != null) {
                    for (Map.Entry<String, String> entry : mapD.entrySet()) {
                        this.f379988d.put(J.a.valueOf(entry.getKey()), Integer.valueOf(Integer.parseInt(entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f379989e = jSONObject3.getString("package_name");
        this.f379990f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f379991g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f379992h = jSONObject4.getString("api_key");
        this.f379993i = a(jSONObject4);
    }

    public String a() {
        return this.f379992h;
    }

    public int b() {
        return this.f379987c;
    }

    public byte[] c() {
        return this.f379985a;
    }

    @j.P
    public String d() {
        return this.f379994j;
    }

    public String e() {
        return this.f379986b;
    }

    public String f() {
        return this.f379989e;
    }

    public Integer g() {
        return this.f379990f;
    }

    public String h() {
        return this.f379991g;
    }

    @j.N
    public CounterConfiguration.b i() {
        return this.f379993i;
    }

    @j.N
    public HashMap<J.a, Integer> j() {
        return this.f379988d;
    }

    public String k() {
        HashMap map = new HashMap();
        for (Map.Entry<J.a, Integer> entry : this.f379988d.entrySet()) {
            map.put(entry.getKey().name(), entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f379990f).put("psid", this.f379991g).put("package_name", this.f379989e)).put("reporter_configuration", new JSONObject().put("api_key", this.f379992h).put("reporter_type", this.f379993i.f377502b)).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f379985a, 0)).put("name", this.f379986b).put("bytes_truncated", this.f379987c).put("trimmed_fields", Tl.g(map)).putOpt("environment", this.f379994j)).toString();
    }

    @j.N
    @Deprecated
    private CounterConfiguration.b a(@j.N JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfiguration.b.a(jSONObject.getString("reporter_type")) : jSONObject.getBoolean("is_commutation") ? CounterConfiguration.b.COMMUTATION : CounterConfiguration.b.MAIN;
    }

    public Z6(@j.N C38715c0 c38715c0, @j.N C39281z3 c39281z3, @j.P HashMap<J.a, Integer> map) {
        this.f379985a = c38715c0.r();
        this.f379986b = c38715c0.g();
        this.f379987c = c38715c0.d();
        if (map != null) {
            this.f379988d = map;
        } else {
            this.f379988d = new HashMap<>();
        }
        A3 a3A = c39281z3.a();
        this.f379989e = a3A.f();
        this.f379990f = a3A.g();
        this.f379991g = a3A.h();
        CounterConfiguration counterConfigurationB = c39281z3.b();
        this.f379992h = counterConfigurationB.c();
        this.f379993i = CounterConfiguration.b.a(counterConfigurationB.f377493b.getAsString("CFG_REPORTER_TYPE"));
        this.f379994j = c38715c0.h();
    }
}
