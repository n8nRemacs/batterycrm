package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Oh;
import com.yandex.metrica.impl.ob.Tl;
import com.yandex.metrica.impl.ob.Ui;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Ti {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ii f379532a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Hi f379533b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Oi f379534c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Ri f379535d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Qi f379536e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final Ni f379537f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final Si f379538g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final Ji f379539h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final Wi f379540i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final Li f379541j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final Pi f379542k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final Z9 f379543l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final Yi f379544m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final Xi f379545n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private final Ci f379546o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final Di f379547p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final Ei f379548q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final Bi f379549r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private final Ki f379550s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private final Fi f379551t;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    private final Gi f379552u;

    /* renamed from: v, reason: collision with root package name */
    @j.N
    private final Vi f379553v;

    /* renamed from: w, reason: collision with root package name */
    @j.N
    private final Mi f379554w;

    public Ti() {
        this(new Ki(), new Ii(), new Hi(), new Oi(), new Ri(), new Qi(), new Ni(), new Si(), new Ji(), new Wi(), new Li(), new Pi(), new Z9(), new Yi(), new Xi(), new Di(), new Ei(), new Ci(), new Bi(), new Fi(), new Gi(), new Vi(), new Mi());
    }

    public Ui a(byte[] bArr) {
        String strOptString;
        String strOptString2;
        Ui ui2 = new Ui();
        try {
            this.f379550s.getClass();
            Tl.a aVar = new Tl.a(new String(bArr, Constants.ENCODING));
            JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("device_id");
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("hash");
                strOptString2 = jSONObjectOptJSONObject.optString("value");
            } else {
                strOptString = "";
                strOptString2 = "";
            }
            ui2.d(strOptString2);
            ui2.c(strOptString);
            a(ui2, aVar);
            ui2.a(Ui.a.OK);
            return ui2;
        } catch (Throwable unused) {
            Ui ui3 = new Ui();
            ui3.a(Ui.a.BAD);
            return ui3;
        }
    }

    @j.k0
    public Ti(@j.N Ki ki2, @j.N Ii ii2, @j.N Hi hi2, @j.N Oi oi2, @j.N Ri ri2, @j.N Qi qi2, @j.N Ni ni2, @j.N Si si2, @j.N Ji ji2, @j.N Wi wi2, @j.N Li li2, @j.N Pi pi2, @j.N Z9 z92, @j.N Yi yi2, @j.N Xi xi2, @j.N Di di2, @j.N Ei ei2, @j.N Ci ci2, @j.N Bi bi2, @j.N Fi fi2, @j.N Gi gi2, @j.N Vi vi2, @j.N Mi mi2) {
        this.f379532a = ii2;
        this.f379533b = hi2;
        this.f379534c = oi2;
        this.f379535d = ri2;
        this.f379536e = qi2;
        this.f379537f = ni2;
        this.f379538g = si2;
        this.f379539h = ji2;
        this.f379540i = wi2;
        this.f379541j = li2;
        this.f379542k = pi2;
        this.f379543l = z92;
        this.f379544m = yi2;
        this.f379545n = xi2;
        this.f379547p = di2;
        this.f379548q = ei2;
        this.f379546o = ci2;
        this.f379549r = bi2;
        this.f379550s = ki2;
        this.f379551t = fi2;
        this.f379552u = gi2;
        this.f379553v = vi2;
        this.f379554w = mi2;
    }

    private void a(Ui ui2, Tl.a aVar) {
        long jOptLong;
        long jOptLong2;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3 = aVar.optJSONObject("queries");
        if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("list")) != null) {
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("sdk_list");
            if (jSONObjectOptJSONObject4 != null) {
                ui2.h(jSONObjectOptJSONObject4.optString(ContextActionHandler.Link.URL, null));
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("host");
            if (jSONObjectOptJSONObject5 != null) {
                ui2.a(jSONObjectOptJSONObject5.optString(ContextActionHandler.Link.URL, null));
            }
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = aVar.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject6 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject6 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject6.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject(next);
                if (jSONObjectOptJSONObject7 != null && jSONObjectOptJSONObject7.has("value")) {
                    map.put(next, jSONObjectOptJSONObject7.getString("value"));
                }
            }
            ui2.e(Tl.c(map));
        }
        JSONObject jSONObjectOptJSONObject8 = aVar.optJSONObject("locale");
        ui2.b((jSONObjectOptJSONObject8 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject8.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", ""));
        JSONObject jSONObjectOptJSONObject9 = aVar.optJSONObject(CrashHianalyticsData.TIME);
        if (jSONObjectOptJSONObject9 != null) {
            try {
                ui2.a(Long.valueOf(jSONObjectOptJSONObject9.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused2) {
            }
        }
        If.s sVar = new If.s();
        JSONObject jSONObjectOptJSONObject10 = aVar.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject10 != null) {
            sVar.f378453a = Tl.a(Tl.a(jSONObjectOptJSONObject10, "disabled_reporting_interval_seconds", (Long) null), TimeUnit.SECONDS, sVar.f378453a);
        }
        ui2.a(this.f379543l.toModel(sVar));
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject11 = aVar.optJSONObject("mediascope_api_keys");
        if (jSONObjectOptJSONObject11 != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject11.optJSONArray("list")) != null) {
            for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray2.getString(i12));
                } catch (Throwable unused3) {
                }
            }
        }
        ui2.d(arrayList);
        this.f379533b.a(ui2, aVar);
        this.f379532a.a(ui2, aVar);
        this.f379534c.getClass();
        JSONObject jSONObjectOptJSONObject12 = aVar.optJSONObject("permissions");
        if (jSONObjectOptJSONObject12 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject12.optJSONArray("list")) != null) {
            for (int i13 = 0; i13 < jSONArrayOptJSONArray.length(); i13++) {
                JSONObject jSONObjectOptJSONObject13 = jSONArrayOptJSONArray.optJSONObject(i13);
                if (jSONObjectOptJSONObject13 != null) {
                    String strOptString = jSONObjectOptJSONObject13.optString("name");
                    boolean zOptBoolean = jSONObjectOptJSONObject13.optBoolean("enabled");
                    if (TextUtils.isEmpty(strOptString)) {
                        ui2.a("", false);
                    } else {
                        ui2.a(strOptString, zOptBoolean);
                    }
                }
            }
        }
        this.f379535d.a(ui2, aVar);
        this.f379536e.getClass();
        If r02 = new If();
        JSONObject jSONObjectOptJSONObject14 = aVar.optJSONObject("retry_policy");
        int iOptInt = r02.f378295H;
        int iOptInt2 = r02.f378296I;
        if (jSONObjectOptJSONObject14 != null) {
            iOptInt = jSONObjectOptJSONObject14.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject14.optInt("exponential_multiplier", r02.f378296I);
        }
        ui2.a(new RetryPolicyConfig(iOptInt, iOptInt2));
        this.f379537f.getClass();
        if (ui2.e().f379394c) {
            JSONObject jSONObjectOptJSONObject15 = aVar.optJSONObject("permissions_collecting");
            If.n nVar = new If.n();
            if (jSONObjectOptJSONObject15 != null) {
                jOptLong = jSONObjectOptJSONObject15.optLong("check_interval_seconds", nVar.f378426a);
                jOptLong2 = jSONObjectOptJSONObject15.optLong("force_send_interval_seconds", nVar.f378427b);
            } else {
                jOptLong = nVar.f378426a;
                jOptLong2 = nVar.f378427b;
            }
            ui2.a(new C38683ai(jOptLong, jOptLong2));
        }
        this.f379538g.a(ui2, aVar);
        this.f379539h.a(ui2, aVar);
        this.f379541j.a(ui2, aVar);
        this.f379542k.a(ui2, aVar);
        this.f379544m.a(ui2, aVar);
        ui2.b(this.f379545n.a(aVar, "ui_event_sending", C38964m0.b()));
        ui2.c(this.f379545n.a(aVar, "ui_raw_event_sending", C38964m0.b()));
        ui2.a(this.f379545n.a(aVar, "ui_collecting_for_bridge", C38964m0.a()));
        this.f379546o.a(ui2, aVar);
        ui2.a(this.f379540i.a(aVar, "throttling"));
        ui2.a(this.f379547p.a(aVar));
        this.f379548q.a(ui2, aVar);
        this.f379549r.getClass();
        JSONObject jSONObjectOptJSONObject16 = aVar.optJSONObject("attribution");
        if (jSONObjectOptJSONObject16 != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject16.optJSONArray("deeplink_conditions");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i14 = 0; i14 < jSONArrayOptJSONArray3.length(); i14++) {
                    JSONObject jSONObjectOptJSONObject17 = jSONArrayOptJSONArray3.optJSONObject(i14);
                    String strOptString2 = jSONObjectOptJSONObject17.optString("key", null);
                    if (!TextUtils.isEmpty(strOptString2)) {
                        String strOptString3 = jSONObjectOptJSONObject17.optString("value", null);
                        arrayList2.add(new Pair(strOptString2, strOptString3 == null ? null : new Oh.a(strOptString3)));
                    }
                }
            }
            ui2.a(new Oh(arrayList2));
        }
        this.f379551t.a(ui2, aVar);
        if (ui2.e().f379414w) {
            this.f379552u.a(ui2, aVar);
        }
        this.f379553v.a(ui2, aVar);
        this.f379554w.a(ui2, aVar);
    }
}
