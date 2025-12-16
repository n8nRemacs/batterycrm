package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class st5 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5c b;

    public /* synthetic */ st5(l5c l5cVar, int i) {
        this.a = i;
        this.b = l5cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [cne] */
    @Override // defpackage.cm6
    public final Object invoke() {
        JSONArray jSONArray;
        ArrayList arrayList;
        Object next;
        String strOptString;
        String strOptString2;
        mke mkeVar;
        switch (this.a) {
            case 0:
                String cneVar = null;
                String string = this.b.g.getString("settings-entry-banners", null);
                if (string == null) {
                    jSONArray = null;
                } else {
                    try {
                        jSONArray = new JSONArray(string);
                    } catch (JSONException unused) {
                    }
                }
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                bne bneVar = bne.b;
                int i = 0;
                if (length == 0) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(jSONArray.length());
                    int length2 = jSONArray.length();
                    int i2 = 0;
                    while (i2 < length2) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            int iOptInt = jSONObjectOptJSONObject.optInt("id", i);
                            String strOptString3 = jSONObjectOptJSONObject.optString("logo", cneVar);
                            String strOptString4 = jSONObjectOptJSONObject.optString("title", cneVar);
                            int iOptInt2 = jSONObjectOptJSONObject.optInt("align", 1);
                            Iterator it = bne.d.iterator();
                            while (true) {
                                f2 f2Var = (f2) it;
                                if (f2Var.hasNext()) {
                                    next = f2Var.next();
                                    if (((bne) next).a == iOptInt2) {
                                    }
                                } else {
                                    next = cneVar;
                                }
                            }
                            bne bneVar2 = (bne) next;
                            if (bneVar2 == null) {
                                bneVar2 = bneVar;
                            }
                            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(CallAnalyticsApiRequest.KEY_ITEMS);
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                                ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray.length());
                                int length3 = jSONArrayOptJSONArray.length();
                                for (int i3 = 0; i3 < length3; i3++) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                                    if (jSONObjectOptJSONObject2 != null) {
                                        mke mkeVar2 = null;
                                        String strOptString5 = jSONObjectOptJSONObject2.optString("icon", null);
                                        if (strOptString5 != null && (strOptString = jSONObjectOptJSONObject2.optString("title", null)) != null) {
                                            String strOptString6 = jSONObjectOptJSONObject2.optString(KwsFeaturesConfigProviderImpl.URL_KEY, null);
                                            Long lValueOf = !jSONObjectOptJSONObject2.has("appid") ? null : Long.valueOf(jSONObjectOptJSONObject2.optLong("appid"));
                                            mkeVar2 = ((strOptString6 == null || strOptString6.length() == 0) && lValueOf == null) ? null : new mke(lValueOf, strOptString5, strOptString, strOptString6, jSONObjectOptJSONObject2.optString("startParam", null));
                                        }
                                        if (mkeVar2 != null) {
                                            arrayList2.add(mkeVar2);
                                        }
                                    }
                                }
                                cneVar = arrayList2.isEmpty() ? null : new cne(iOptInt, strOptString3, strOptString4, bneVar2, arrayList2);
                            }
                            if (cneVar != null) {
                                arrayList.add(cneVar);
                            }
                        }
                        i2++;
                        cneVar = null;
                        i = 0;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                }
                if (arrayList != null) {
                    return arrayList;
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                ArrayList arrayList3 = new ArrayList(jSONArray.length());
                int length4 = jSONArray.length();
                for (int i4 = 0; i4 < length4; i4++) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArray.optJSONObject(i4);
                    if (jSONObjectOptJSONObject3 != null) {
                        String strOptString7 = jSONObjectOptJSONObject3.optString("icon", null);
                        if (strOptString7 == null || (strOptString2 = jSONObjectOptJSONObject3.optString("title", null)) == null) {
                            mkeVar = null;
                        } else {
                            String strOptString8 = jSONObjectOptJSONObject3.optString(KwsFeaturesConfigProviderImpl.URL_KEY, null);
                            Long lValueOf2 = !jSONObjectOptJSONObject3.has("appid") ? null : Long.valueOf(jSONObjectOptJSONObject3.optLong("appid"));
                            mkeVar = ((strOptString8 == null || strOptString8.length() == 0) && lValueOf2 == null) ? null : new mke(lValueOf2, strOptString7, strOptString2, strOptString8, jSONObjectOptJSONObject3.optString("startParam", null));
                        }
                        if (mkeVar != null) {
                            arrayList3.add(mkeVar);
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return null;
                }
                return Collections.singletonList(new cne(0, null, null, bneVar, arrayList3));
            case 1:
                return ucf.a(Integer.valueOf((int) this.b.m(PmsKey.f37debugmode, 0)));
            case 2:
                return ucf.a(Long.valueOf(this.b.m(PmsKey.f148userdebugreport, 0L)));
            default:
                l5c l5cVar = this.b;
                xs xsVar = age.a;
                try {
                    List listE = l5cVar.e(PmsKey.f125reacterrors.name(), null);
                    return listE != null ? new xs(listE) : xsVar;
                } catch (Throwable th) {
                    wqi.e(l5cVar.f, "reactErrors parse failure!", th);
                    return xsVar;
                }
        }
    }
}
