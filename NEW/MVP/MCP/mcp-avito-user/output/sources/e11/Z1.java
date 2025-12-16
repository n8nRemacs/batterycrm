package e11;

import android.content.Context;
import android.text.TextUtils;
import com.avito.android.remote.model.ProfileTab;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class Z1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39882k1 f394523a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f394524b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f394525c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final R1 f394526d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394527e = true;

    public Z1(@j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f394523a = c39882k1;
        this.f394524b = c39901r0;
        this.f394525c = context;
        this.f394526d = new R1(c39882k1, c39901r0, context);
    }

    public final void a(@j.N String str, @j.N String str2, @j.P String str3) {
        if (this.f394527e) {
            C39882k1 c39882k1 = this.f394523a;
            String str4 = c39882k1.f394643a;
            C39866f0 c39866f0 = new C39866f0(str);
            c39866f0.f394595b = str2;
            c39866f0.f394596c = this.f394524b.f394772i;
            c39866f0.f394598e = str3;
            if (str4 == null) {
                str4 = c39882k1.f394644b;
            }
            c39866f0.f394597d = str4;
            c39866f0.a(this.f394525c);
        }
    }

    public final void b(@j.N JSONObject jSONObject, @j.N C39913v0<? extends D0<String>> c39913v0) {
        c(jSONObject, c39913v0);
        C39882k1 c39882k1 = this.f394523a;
        Boolean bool = c39882k1.f394666x;
        c39913v0.f394867U = bool != null ? bool.booleanValue() : jSONObject.optBoolean("allowClose", c39913v0.f394867U);
        Boolean bool2 = c39882k1.f394667y;
        c39913v0.f394871Y = bool2 != null ? bool2.booleanValue() : jSONObject.optBoolean("hasPause", c39913v0.f394871Y);
        Boolean bool3 = c39882k1.f394636E;
        c39913v0.f394865S = bool3 != null ? bool3.booleanValue() : jSONObject.optBoolean("allowReplay", c39913v0.f394865S);
        float fOptDouble = c39882k1.f394665w;
        if (fOptDouble < 0.0f) {
            fOptDouble = (float) jSONObject.optDouble("allowCloseDelay", c39913v0.f394872Z);
        }
        c39913v0.f394872Z = fOptDouble;
    }

    public final void c(@j.N JSONObject jSONObject, @j.N C39913v0<? extends D0<String>> c39913v0) {
        C39882k1 c39882k1 = this.f394523a;
        if (c39882k1.f394660r < 0.0f && jSONObject.has("point")) {
            float fOptDouble = (float) jSONObject.optDouble("point");
            if (fOptDouble < 0.0f) {
                a("Bad value", "Wrong value " + fOptDouble + " for point", c39913v0.f394726y);
            }
        }
        if (c39882k1.f394661s >= 0.0f || !jSONObject.has("pointP")) {
            return;
        }
        float fOptDouble2 = (float) jSONObject.optDouble("pointP");
        if (fOptDouble2 < 0.0f) {
            a("Bad value", "Wrong value " + fOptDouble2 + " for pointP", c39913v0.f394726y);
        }
    }

    public final void d(@j.N JSONObject jSONObject, @j.N C39913v0<? extends D0<String>> c39913v0) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("companionAds");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
            if (jSONObjectOptJSONObject != null) {
                String str = c39913v0.f394726y;
                n2 n2Var = new n2();
                this.f394526d.c(jSONObjectOptJSONObject, n2Var);
                if (n2Var.f394722u == 0 || n2Var.f394723v == 0) {
                    a("Required field", "Unable to add companion banner with width " + n2Var.f394722u + " and height " + n2Var.f394723v, str);
                    n2Var = null;
                } else {
                    jSONObjectOptJSONObject.optInt("assetWidth");
                    jSONObjectOptJSONObject.optInt("assetHeight");
                    jSONObjectOptJSONObject.optInt("expandedWidth");
                    jSONObjectOptJSONObject.optInt("expandedHeight");
                    n2Var.f394689H = jSONObjectOptJSONObject.optString("staticResource");
                    jSONObjectOptJSONObject.optString("iframeResource");
                    n2Var.f394690I = jSONObjectOptJSONObject.optString("htmlResource");
                    jSONObjectOptJSONObject.optString("apiFramework");
                    jSONObjectOptJSONObject.optString("adSlotID");
                    String strOptString = jSONObjectOptJSONObject.optString("required");
                    if (!TextUtils.isEmpty(strOptString) && !ProfileTab.ALL.equals(strOptString) && !"any".equals(strOptString) && !"none".equals(strOptString)) {
                        a("Bad value", "Wrong companion required attribute:" + strOptString, str);
                    }
                }
                if (n2Var != null) {
                    c39913v0.f394854H.add(n2Var);
                }
            }
        }
    }
}
