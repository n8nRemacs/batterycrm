package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.yh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39271yh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39241xb f382254a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Context f382255b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private String f382256c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private String f382257d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f382258e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private C39057pi f382259f;

    public C39271yh(@j.N Context context, @j.N C39057pi c39057pi) {
        this(context, c39057pi, F0.g().r());
    }

    @j.N
    public String a() throws ExecutionException, InterruptedException {
        C39145tb c39145tb;
        C39145tb c39145tb2;
        JSONObject jSONObject = new JSONObject();
        if (!this.f382258e) {
            C39289zb c39289zbA = this.f382254a.a(this.f382255b);
            C39169ub c39169ubA = c39289zbA.a();
            String str = null;
            this.f382256c = (!c39169ubA.a() || (c39145tb2 = c39169ubA.f381928a) == null) ? null : c39145tb2.f381872b;
            C39169ub c39169ubB = c39289zbA.b();
            if (c39169ubB.a() && (c39145tb = c39169ubB.f381928a) != null) {
                str = c39145tb.f381872b;
            }
            this.f382257d = str;
            this.f382258e = true;
        }
        try {
            a(jSONObject, "uuid", this.f382259f.V());
            a(jSONObject, "device_id", this.f382259f.i());
            a(jSONObject, "google_aid", this.f382256c);
            a(jSONObject, "huawei_aid", this.f382257d);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @j.k0
    public C39271yh(@j.N Context context, @j.N C39057pi c39057pi, @j.N C39241xb c39241xb) {
        this.f382258e = false;
        this.f382255b = context;
        this.f382259f = c39057pi;
        this.f382254a = c39241xb;
    }

    public void a(@j.N C39057pi c39057pi) {
        this.f382259f = c39057pi;
    }

    private void a(@j.N JSONObject jSONObject, @j.N String str, @j.P String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
