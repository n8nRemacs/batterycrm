package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class mm0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final zb f388031a;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final bc1 f388033c = new bc1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final i90 f388032b = new i90();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final l30 f388034d = new l30();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ar f388035e = new ar();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final h30 f388036f = new h30();

    public mm0(@j.N Context context) {
        this.f388031a = new zb(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @j.N
    public final bl0 a(@j.N String str) throws JSONException, yk0 {
        List<nj0> listE;
        String str2;
        Iterator<String> it;
        String str3;
        AdImpressionData adImpressionData;
        boolean z12;
        JSONObject jSONObject = new JSONObject(str);
        boolean z13 = false;
        bl0 bl0Var = (bl0) nx0.a(bl0.class, new Object[0]);
        if (bl0Var != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("native");
            String str4 = "ads";
            if (!nm0.a(jSONObject2, "ads")) {
                throw new yk0("Native Ad json has not required attributes");
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (str4.equals(next)) {
                    ArrayList arrayList = new ArrayList();
                    ?? jSONArray = jSONObject2.getJSONArray(str4);
                    for (?? r14 = z13; r14 < jSONArray.length(); r14++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(r14);
                        String str5 = "adType";
                        String str6 = "link";
                        if (!nm0.a(jSONObject3, "adType", "assets", "link")) {
                            throw new yk0("Native Ad json has not required attributes");
                        }
                        String str7 = str4;
                        nj0 nj0Var = new nj0();
                        Iterator<String> itKeys2 = jSONObject3.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            if (str5.equals(next2)) {
                                nj0Var.c(a(next2, jSONObject3));
                            } else if ("assets".equals(next2)) {
                                nj0Var.c(this.f388031a.a(jSONObject3));
                            } else {
                                if (str6.equals(next2)) {
                                    str2 = str5;
                                    nj0Var.a(this.f388032b.a(jSONObject3.getJSONObject(next2)));
                                } else {
                                    str2 = str5;
                                    if ("showNotice".equals(next2)) {
                                        nj0Var.a(a(jSONObject3.getJSONObject(next2)));
                                    } else {
                                        if ("showNotices".equals(next2)) {
                                            ArrayList arrayList2 = new ArrayList();
                                            JSONArray jSONArray2 = jSONObject3.getJSONArray("showNotices");
                                            it = itKeys;
                                            str3 = str6;
                                            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                                                arrayList2.add(a(jSONArray2.getJSONObject(i12)));
                                            }
                                            nj0Var.b(arrayList2);
                                        } else {
                                            it = itKeys;
                                            str3 = str6;
                                            if (RequestReviewResultKt.INFO_TYPE.equals(next2)) {
                                                nj0Var.d(jSONObject3.optString(next2, null));
                                            } else if ("hideConditions".equals(next2)) {
                                                nj0Var.a(new al().a(next2, jSONObject3));
                                            } else if ("showConditions".equals(next2)) {
                                                nj0Var.b(new al().a(next2, jSONObject3));
                                            } else if ("renderTrackingUrl".equals(next2)) {
                                                this.f388033c.getClass();
                                                nj0Var.a(bc1.a(next2, jSONObject3));
                                            } else if ("renderTrackingUrls".equals(next2)) {
                                                ArrayList arrayList3 = new ArrayList();
                                                JSONArray jSONArray3 = jSONObject3.getJSONArray("renderTrackingUrls");
                                                for (int i13 = 0; i13 < jSONArray3.length(); i13++) {
                                                    arrayList3.add(jSONArray3.getString(i13));
                                                }
                                                nj0Var.a(arrayList3);
                                            } else if ("id".equals(next2)) {
                                                nj0Var.b(jSONObject3.optString("id", null));
                                            } else if ("impressionData".equals(next2)) {
                                                this.f388034d.getClass();
                                                try {
                                                    adImpressionData = new AdImpressionData(m80.a("impressionData", jSONObject3));
                                                } catch (Exception e12) {
                                                    e12.getMessage();
                                                    adImpressionData = null;
                                                }
                                                nj0Var.a(adImpressionData);
                                            }
                                        }
                                        str5 = str2;
                                        itKeys = it;
                                        str6 = str3;
                                    }
                                }
                                str5 = str2;
                            }
                        }
                        Iterator<String> it2 = itKeys;
                        List<eb<?>> listB = nj0Var.b();
                        h90 h90VarE = nj0Var.e();
                        int iG2 = nj0Var.g();
                        if (listB.isEmpty() || h90VarE == null || iG2 == 0) {
                            throw new yk0("Native Ad json has not required attributes");
                        }
                        arrayList.add(nj0Var);
                        str4 = str7;
                        itKeys = it2;
                    }
                    bl0Var.a((List<nj0>) arrayList);
                } else {
                    String str8 = str4;
                    Iterator<String> it3 = itKeys;
                    if ("assets".equals(next)) {
                        ArrayList arrayListA = this.f388031a.a(jSONObject2);
                        bl0Var.a(arrayListA.isEmpty() ? null : arrayListA);
                        str4 = str8;
                        itKeys = it3;
                    } else {
                        if ("settings".equals(next)) {
                            z12 = false;
                            l31 l31Var = (l31) nx0.a(l31.class, new Object[0]);
                            if (l31Var != null) {
                                JSONObject jSONObject4 = jSONObject2.getJSONObject("settings");
                                Iterator<String> itKeys3 = jSONObject4.keys();
                                while (itKeys3.hasNext()) {
                                    String next3 = itKeys3.next();
                                    if ("templateType".equals(next3)) {
                                        l31Var.a(a(next3, jSONObject4));
                                    } else if ("highlightingEnabled".equals(next3)) {
                                        l31Var.a(jSONObject4.getBoolean(next3));
                                    } else if ("multiBannerAutoScrollInterval".equals(next3)) {
                                        l31Var.a(Long.valueOf(jSONObject4.getLong(next3)));
                                    }
                                }
                            }
                            bl0Var.a(l31Var);
                        } else {
                            z12 = false;
                            if ("showNotices".equals(next)) {
                                ArrayList arrayList4 = new ArrayList();
                                JSONArray jSONArray4 = jSONObject2.getJSONArray("showNotices");
                                for (int i14 = 0; i14 < jSONArray4.length(); i14++) {
                                    arrayList4.add(a(jSONArray4.getJSONObject(i14)));
                                }
                                bl0Var.d(arrayList4);
                            } else if ("ver".equals(next)) {
                                bl0Var.a(a(next, jSONObject2));
                            } else if ("renderTrackingUrls".equals(next)) {
                                ArrayList arrayList5 = new ArrayList();
                                JSONArray jSONArray5 = jSONObject2.getJSONArray("renderTrackingUrls");
                                for (int i15 = 0; i15 < jSONArray5.length(); i15++) {
                                    arrayList5.add(jSONArray5.getString(i15));
                                }
                                bl0Var.c(arrayList5);
                            } else if ("designs".equals(next)) {
                                ArrayList arrayList6 = new ArrayList();
                                JSONArray jSONArray6 = jSONObject2.getJSONArray("designs");
                                for (int i16 = 0; i16 < jSONArray6.length(); i16++) {
                                    JSONObject jSONObject5 = jSONArray6.getJSONObject(i16);
                                    if (jSONObject5.has("type") && jSONObject5.has("layout") && jSONObject5.has("target")) {
                                        String string = jSONObject5.getString("type");
                                        String string2 = jSONObject5.getString("target");
                                        String string3 = jSONObject5.getString("layout");
                                        JSONArray jSONArrayOptJSONArray = jSONObject5.optJSONArray("images");
                                        vq vqVarA = this.f388035e.a(new tp(string, string2, string3, jSONArrayOptJSONArray != null ? this.f388036f.a(jSONArrayOptJSONArray) : null));
                                        if (vqVarA != null) {
                                            arrayList6.add(vqVarA);
                                        }
                                    }
                                }
                                bl0Var.b(arrayList6);
                            } else if ("ad_pod".equals(next)) {
                                bl0Var.a(x4.a(jSONObject2.getJSONObject("ad_pod")));
                            }
                        }
                        z13 = z12;
                        str4 = str8;
                        itKeys = it3;
                    }
                }
                z13 = false;
            }
        }
        if ((bl0Var == null || (listE = bl0Var.e()) == null) ? z13 : !listE.isEmpty()) {
            return bl0Var;
        }
        throw new yk0("Native Ad json has not required attributes");
    }

    @j.N
    @j.k0
    public final q31 a(JSONObject jSONObject) throws yk0 {
        if (nm0.a(jSONObject, "delay", ContextActionHandler.Link.URL)) {
            q31 q31Var = new q31();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if ("delay".equals(next)) {
                    q31Var.a(jSONObject.getLong(next));
                } else if (ContextActionHandler.Link.URL.equals(next)) {
                    this.f388033c.getClass();
                    q31Var.a(bc1.a(next, jSONObject));
                } else if ("visibilityPercent".equals(next)) {
                    q31Var.a(Math.max(Math.min(jSONObject.optInt(next, 0), 100), 0));
                }
            }
            return q31Var;
        }
        throw new yk0("Native Ad json has not required attributes");
    }

    @j.N
    public static String a(@j.N String str, @j.N JSONObject jSONObject) throws JSONException, yk0 {
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string) || "null".equals(string)) {
            throw new yk0("Native Ad json has not required attributes");
        }
        return string;
    }
}
