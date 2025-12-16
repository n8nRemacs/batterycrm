package com.my.target;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39882k1;
import e11.C39901r0;
import e11.C39919x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import shark.AndroidResourceIdNames;

/* loaded from: classes7.dex */
public class P extends AbstractC37789h0<C39919x0> {
    @Override // com.my.target.AbstractC37789h0
    @j.P
    public final AbstractC39858c1 b(@j.N String str, @j.N C39882k1 c39882k1, @j.P AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.N p1 p1Var, @j.P ArrayList arrayList, @j.N Context context) {
        JSONArray jSONArrayNames;
        boolean z12;
        JSONArray jSONArrayOptJSONArray;
        e11.J j12;
        PackageManager packageManager;
        Intent launchIntentForPackage;
        List<ResolveInfo> listQueryIntentActivities;
        String str2;
        C39919x0 c39919x0 = (C39919x0) abstractC39858c1;
        JSONObject jSONObjectC = AbstractC37789h0.c(str, aVar, p1Var, arrayList);
        if (jSONObjectC != null && (jSONArrayNames = jSONObjectC.names()) != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= jSONArrayNames.length()) {
                    z12 = false;
                    break;
                }
                String strOptString = jSONArrayNames.optString(i12);
                if ("appwall".equals(strOptString) || "showcaseApps".equals(strOptString) || "showcaseGames".equals(strOptString) || "showcase".equals(strOptString)) {
                    JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(strOptString);
                    if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("banners")) == null || jSONArrayOptJSONArray.length() <= 0) {
                        c39919x0 = null;
                    } else {
                        C39919x0 c39919x02 = new C39919x0(strOptString);
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("settings");
                        if (jSONObjectOptJSONObject2 != null) {
                            c39919x02.f394880f = jSONObjectOptJSONObject2.optString("title", c39919x02.f394880f);
                            c39919x02.f394881g = jSONObjectOptJSONObject2.optString("icon_hd", c39919x02.f394881g);
                            c39919x02.f394882h = jSONObjectOptJSONObject2.optString("bubble_icon_hd", c39919x02.f394882h);
                            c39919x02.f394883i = jSONObjectOptJSONObject2.optString("label_icon_hd", c39919x02.f394883i);
                            c39919x02.f394884j = jSONObjectOptJSONObject2.optString("goto_app_icon_hd", c39919x02.f394884j);
                            c39919x02.f394885k = jSONObjectOptJSONObject2.optString("item_highlight_icon", c39919x02.f394885k);
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("icon_status");
                            if (jSONArrayOptJSONArray2 != null) {
                                int length = jSONArrayOptJSONArray2.length();
                                for (int i13 = 0; i13 < length; i13++) {
                                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i13);
                                    if (jSONObjectOptJSONObject3 != null) {
                                        c39919x02.f394877c.add(new Pair<>(jSONObjectOptJSONObject3.optString("value"), jSONObjectOptJSONObject3.optString("icon_hd")));
                                    }
                                }
                            }
                        }
                        e11.J j13 = new e11.J(c39919x02, c39882k1, c39901r0, context);
                        int i14 = 0;
                        while (i14 < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i14);
                            if (jSONObjectOptJSONObject4 != null) {
                                e11.E e12 = new e11.E();
                                j13.f394370b.c(jSONObjectOptJSONObject4, e12);
                                e12.f394315M = jSONObjectOptJSONObject4.optBoolean("hasNotification", e12.f394315M);
                                e12.f394319Q = jSONObjectOptJSONObject4.optBoolean("Banner", e12.f394319Q);
                                e12.f394317O = jSONObjectOptJSONObject4.optBoolean("RequireCategoryHighlight", e12.f394317O);
                                e12.f394318P = jSONObjectOptJSONObject4.optBoolean("ItemHighlight", e12.f394318P);
                                e12.f394316N = jSONObjectOptJSONObject4.optBoolean("Main", e12.f394316N);
                                e12.f394320R = jSONObjectOptJSONObject4.optBoolean("RequireWifi", e12.f394320R);
                                e12.f394321S = jSONObjectOptJSONObject4.optBoolean("subitem", e12.f394321S);
                                e12.f394310H = jSONObjectOptJSONObject4.optString("bubble_id", e12.f394310H);
                                e12.f394311I = jSONObjectOptJSONObject4.optString("labelType", e12.f394311I);
                                e12.f394312J = jSONObjectOptJSONObject4.optString("status", e12.f394312J);
                                jSONObjectOptJSONObject4.optInt("mrgs_id");
                                jSONObjectOptJSONObject4.optInt("coins");
                                e12.f394313K = e11.X.a(jSONObjectOptJSONObject4, "coins_icon_bgcolor", e12.f394313K);
                                e12.f394314L = e11.X.a(jSONObjectOptJSONObject4, "coins_icon_textcolor", e12.f394314L);
                                String strOptString2 = jSONObjectOptJSONObject4.optString("icon_hd");
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    e12.f394717p = new com.my.target.common.models.b(strOptString2);
                                }
                                String strOptString3 = jSONObjectOptJSONObject4.optString("coins_icon_hd");
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    e12.f394322T = new com.my.target.common.models.b(strOptString3);
                                }
                                String strOptString4 = jSONObjectOptJSONObject4.optString("cross_notif_icon_hd");
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    e12.f394328Z = new com.my.target.common.models.b(strOptString4);
                                }
                                C39919x0 c39919x03 = j13.f394369a;
                                String str3 = c39919x03.f394882h;
                                if (!TextUtils.isEmpty(str3)) {
                                    e12.f394326X = new com.my.target.common.models.b(str3);
                                }
                                String str4 = c39919x03.f394884j;
                                if (!TextUtils.isEmpty(str4)) {
                                    e12.f394324V = new com.my.target.common.models.b(str4);
                                }
                                String str5 = c39919x03.f394883i;
                                if (!TextUtils.isEmpty(str5)) {
                                    e12.f394323U = new com.my.target.common.models.b(str5);
                                }
                                String str6 = e12.f394312J;
                                if (str6 != null) {
                                    Iterator<Pair<String, String>> it = c39919x03.f394877c.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            j12 = j13;
                                            str2 = null;
                                            break;
                                        }
                                        Pair<String, String> next = it.next();
                                        j12 = j13;
                                        if (str6.equals(next.first)) {
                                            str2 = (String) next.second;
                                            break;
                                        }
                                        j13 = j12;
                                    }
                                    if (!TextUtils.isEmpty(str2)) {
                                        e12.f394325W = new com.my.target.common.models.b(str2);
                                    }
                                } else {
                                    j12 = j13;
                                }
                                String str7 = c39919x03.f394885k;
                                if (e12.f394318P && !TextUtils.isEmpty(str7)) {
                                    e12.f394327Y = new com.my.target.common.models.b(str7);
                                }
                                String str8 = e12.f394695A;
                                if (!TextUtils.isEmpty(str8) && (launchIntentForPackage = (packageManager = context.getPackageManager()).getLaunchIntentForPackage(str8)) != null) {
                                    try {
                                        listQueryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
                                    } catch (Throwable unused) {
                                        listQueryIntentActivities = null;
                                    }
                                    if (listQueryIntentActivities != null) {
                                        listQueryIntentActivities.isEmpty();
                                    }
                                }
                                c39919x02.f394876b.add(e12);
                            } else {
                                j12 = j13;
                            }
                            i14++;
                            j13 = j12;
                        }
                        c39919x0 = c39919x02;
                    }
                    if (c39919x0 != null && !new ArrayList(c39919x0.f394876b).isEmpty()) {
                        z12 = true;
                        break;
                    }
                }
                i12++;
            }
            if (z12) {
                c39919x0.f394879e = c39882k1.f394662t;
                c39919x0.f394878d = jSONObjectC;
                return c39919x0;
            }
        }
        return null;
    }
}
