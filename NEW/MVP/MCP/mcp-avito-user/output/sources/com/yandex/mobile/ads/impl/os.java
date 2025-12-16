package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.impl.lp0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class os {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f388627a;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final a7 f388629c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final lp0 f388630d;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final le f388628b = new le();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Handler f388631e = new Handler(Looper.getMainLooper());

    public final class a implements lp0.b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final rf f388632a;

        public /* synthetic */ a(os osVar, rf rfVar, int i12) {
            this(rfVar);
        }

        @j.l0
        public final void a(@j.P JSONArray jSONArray) throws JSONException {
            os.this.a(this.f388632a, os.a(os.this, jSONArray));
        }

        private a(rf rfVar) {
            this.f388632a = rfVar;
        }
    }

    public os(@j.N n2 n2Var, @j.N BiddingSettings biddingSettings) {
        this.f388627a = n2Var;
        this.f388629c = new a7(biddingSettings);
        this.f388630d = new lp0(new re0(n2Var, null));
    }

    public static String a(os osVar, JSONArray jSONArray) throws JSONException {
        osVar.getClass();
        if (jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("networks", jSONArray);
                le leVar = osVar.f388628b;
                String string = jSONObject.toString();
                leVar.getClass();
                return le.a(string);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @j.l0
    public final void a(@j.N Context context, @j.N rf rfVar) {
        AdUnitIdBiddingSettings adUnitIdBiddingSettingsA = this.f388629c.a(this.f388627a.c());
        if (adUnitIdBiddingSettingsA != null) {
            this.f388630d.b(context, adUnitIdBiddingSettingsA.d(), new a(this, rfVar, 0));
        } else {
            rfVar.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@j.N rf rfVar, @j.P String str) {
        this.f388631e.post(new H(4, rfVar, str));
    }
}
