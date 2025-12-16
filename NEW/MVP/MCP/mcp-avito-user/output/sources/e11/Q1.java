package e11;

import android.content.Context;
import android.text.TextUtils;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.my.target.C37788h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Q1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39882k1 f394468a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f394469b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f394470c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final t2 f394471d;

    public Q1(@j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f394468a = c39882k1;
        this.f394469b = c39901r0;
        this.f394470c = context;
        this.f394471d = new t2(c39882k1, c39901r0, context);
    }

    @j.P
    public final C39882k1 a(@j.N JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        X1 x1B;
        C39882k1 c39882k1 = this.f394468a;
        int i12 = c39882k1.f394654l;
        if (i12 >= 5) {
            return null;
        }
        int iOptInt = jSONObject.optInt("id", c39882k1.f394655m);
        String strOptString = jSONObject.optString(ContextActionHandler.Link.URL);
        if (TextUtils.isEmpty(strOptString)) {
            b("Required field", "No url in additionalData Id = " + iOptInt);
            return null;
        }
        C39882k1 c39882k12 = new C39882k1(strOptString, null);
        c39882k12.f394654l = i12 + 1;
        c39882k12.f394655m = iOptInt;
        c39882k12.f394663u = jSONObject.optBoolean("doAfter", c39882k12.f394663u);
        c39882k12.f394657o = jSONObject.optInt("doOnEmptyResponseFromId", c39882k12.f394657o);
        c39882k12.f394664v = jSONObject.optBoolean("isMidrollPoint", c39882k12.f394664v);
        float fOptDouble = c39882k1.f394665w;
        if (fOptDouble < 0.0f) {
            fOptDouble = (float) jSONObject.optDouble("allowCloseDelay", c39882k12.f394665w);
        }
        c39882k12.f394665w = fOptDouble;
        Boolean boolValueOf = c39882k1.f394666x;
        if (boolValueOf == null) {
            boolValueOf = jSONObject.has("allowClose") ? Boolean.valueOf(jSONObject.optBoolean("allowClose")) : null;
        }
        c39882k12.f394666x = boolValueOf;
        Boolean boolValueOf2 = c39882k1.f394667y;
        if (boolValueOf2 == null) {
            boolValueOf2 = jSONObject.has("hasPause") ? Boolean.valueOf(jSONObject.optBoolean("hasPause")) : null;
        }
        c39882k12.f394667y = boolValueOf2;
        Boolean boolValueOf3 = c39882k1.f394668z;
        if (boolValueOf3 == null) {
            boolValueOf3 = jSONObject.has("allowSeek") ? Boolean.valueOf(jSONObject.optBoolean("allowSeek")) : null;
        }
        c39882k12.f394668z = boolValueOf3;
        Boolean boolValueOf4 = c39882k1.f394632A;
        if (boolValueOf4 == null) {
            boolValueOf4 = jSONObject.has("allowSkip") ? Boolean.valueOf(jSONObject.optBoolean("allowSkip")) : null;
        }
        c39882k12.f394632A = boolValueOf4;
        Boolean boolValueOf5 = c39882k1.f394633B;
        if (boolValueOf5 == null) {
            boolValueOf5 = jSONObject.has("allowTrackChange") ? Boolean.valueOf(jSONObject.optBoolean("allowTrackChange")) : null;
        }
        c39882k12.f394633B = boolValueOf5;
        Boolean boolValueOf6 = c39882k1.f394635D;
        if (boolValueOf6 == null) {
            boolValueOf6 = jSONObject.has("openInBrowser") ? Boolean.valueOf(jSONObject.optBoolean("openInBrowser")) : null;
        }
        c39882k12.f394635D = boolValueOf6;
        Boolean boolValueOf7 = c39882k1.f394634C;
        if (boolValueOf7 == null) {
            boolValueOf7 = jSONObject.has("directLink") ? Boolean.valueOf(jSONObject.optBoolean("directLink")) : null;
        }
        c39882k12.f394634C = boolValueOf7;
        Boolean boolValueOf8 = c39882k1.f394636E;
        if (boolValueOf8 == null) {
            boolValueOf8 = jSONObject.has("allowReplay") ? Boolean.valueOf(jSONObject.optBoolean("allowReplay")) : null;
        }
        c39882k12.f394636E = boolValueOf8;
        Boolean boolValueOf9 = c39882k1.f394637F;
        if (boolValueOf9 == null) {
            boolValueOf9 = jSONObject.has("allowBackButton") ? Boolean.valueOf(jSONObject.optBoolean("allowBackButton")) : null;
        }
        c39882k12.f394637F = boolValueOf9;
        Boolean boolValueOf10 = c39882k1.f394638G;
        if (boolValueOf10 == null) {
            boolValueOf10 = jSONObject.has("automute") ? Boolean.valueOf(jSONObject.optBoolean("automute")) : null;
        }
        c39882k12.f394638G = boolValueOf10;
        Boolean boolValueOf11 = c39882k1.f394639H;
        if (boolValueOf11 == null) {
            boolValueOf11 = jSONObject.has("autoplay") ? Boolean.valueOf(jSONObject.optBoolean("autoplay")) : null;
        }
        c39882k12.f394639H = boolValueOf11;
        int iOptInt2 = c39882k1.f394658p;
        if (iOptInt2 < 0) {
            iOptInt2 = jSONObject.optInt(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, c39882k12.f394658p);
        }
        c39882k12.f394658p = iOptInt2;
        int iOptInt3 = c39882k1.f394659q;
        if (iOptInt3 < 0) {
            iOptInt3 = jSONObject.optInt("clickArea", c39882k12.f394659q);
        }
        c39882k12.f394659q = iOptInt3;
        Boolean boolValueOf12 = c39882k1.f394640I;
        if (boolValueOf12 == null) {
            boolValueOf12 = jSONObject.has("logErrors") ? Boolean.valueOf(jSONObject.optBoolean("logErrors")) : null;
        }
        c39882k12.f394640I = boolValueOf12;
        float fOptDouble2 = c39882k1.f394660r;
        if (fOptDouble2 < 0.0f && jSONObject.has("point")) {
            fOptDouble2 = (float) jSONObject.optDouble("point");
            if (fOptDouble2 < 0.0f) {
                b("Bad value", "Wrong value -1.0 for point in additionalData object");
                fOptDouble2 = -1.0f;
            }
        }
        c39882k12.f394660r = fOptDouble2;
        float fOptDouble3 = c39882k1.f394661s;
        if (fOptDouble3 < 0.0f && jSONObject.has("pointP")) {
            fOptDouble3 = (float) jSONObject.optDouble("pointP");
            if (fOptDouble3 < 0.0f || fOptDouble3 > 100.0f) {
                b("Bad value", "Wrong value -1.0 for pointP in additionalData object");
                fOptDouble3 = -1.0f;
            }
        }
        c39882k12.f394661s = fOptDouble3;
        ArrayList<X1> arrayList = c39882k1.f394648f != null ? new ArrayList<>(c39882k1.f394648f) : null;
        ArrayList<X1> arrayList2 = c39882k12.f394648f;
        if (arrayList2 == null) {
            c39882k12.f394648f = arrayList;
        } else if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        C1 c1A = c39882k1.f394641J;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("omdata");
        C39901r0 c39901r0 = this.f394469b;
        if (jSONObjectOptJSONObject2 != null) {
            c1A = new H1(c39901r0, c39882k1.f394644b, true, this.f394470c).a(c1A, jSONObjectOptJSONObject2);
        }
        c39882k12.f394641J = c1A;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("serviceStatistics");
        t2 t2Var = this.f394471d;
        if (jSONArrayOptJSONArray != null) {
            for (int i13 = 0; i13 < jSONArrayOptJSONArray.length(); i13++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i13);
                if (jSONObjectOptJSONObject3 != null && (x1B = t2Var.b(jSONObjectOptJSONObject3, -1.0f)) != null) {
                    c39882k12.f394646d.add(x1B);
                }
            }
        }
        t2Var.c(c39882k12.f394647e, jSONObject, String.valueOf(c39882k12.f394655m), -1.0f);
        C37788h c37788hA = c39882k1.f394642K;
        if (c37788hA == null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("adChoices")) != null) {
            new com.my.target.M();
            c37788hA = com.my.target.M.a(jSONObjectOptJSONObject, null, c39882k12.f394643a, c39901r0.f394772i, boolValueOf12 != null ? boolValueOf12.booleanValue() : true, this.f394470c);
        }
        c39882k12.f394642K = c37788hA;
        String strOptString2 = c39882k1.f394653k;
        if (strOptString2 == null && jSONObject.has("advertisingLabel")) {
            strOptString2 = jSONObject.optString("advertisingLabel");
        }
        c39882k12.f394653k = strOptString2;
        return c39882k12;
    }

    public final void b(@j.N String str, @j.N String str2) {
        C39882k1 c39882k1 = this.f394468a;
        String str3 = c39882k1.f394643a;
        C39866f0 c39866f0 = new C39866f0(str);
        c39866f0.f394595b = str2;
        c39866f0.f394596c = this.f394469b.f394772i;
        if (str3 == null) {
            str3 = c39882k1.f394644b;
        }
        c39866f0.f394597d = str3;
        c39866f0.a(this.f394470c);
    }
}
