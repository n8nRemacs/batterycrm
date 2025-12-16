package Fc1;

import com.avito.android.publish.drafts.LocalPublishState;
import feedback.shared.sdk.api.network.entities.CampaignPagesResult;
import feedback.shared.sdk.api.network.entities.FieldResult;
import feedback.shared.sdk.api.network.entities.FieldType;
import feedback.shared.sdk.api.network.entities.PageResult;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.collections.C42784z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13587d {
    @i31.c
    public C13587d() {
    }

    @Y61.k
    public static CampaignPagesResult a(@Y61.k String str) throws JSONException, ParseException {
        JSONArray jSONArray;
        int i12;
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject2.getString(next));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray2 = jSONObject.getJSONArray("pages");
        int length = jSONArray2.length();
        int i13 = 0;
        while (i13 < length) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i13);
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray3 = jSONObject3.getJSONArray(LocalPublishState.FIELDS);
            int length2 = jSONArray3.length();
            int i14 = 0;
            while (i14 < length2) {
                JSONObject jSONObject4 = jSONArray3.getJSONObject(i14);
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArray4 = jSONObject4.getJSONArray("scenarios");
                int length3 = jSONArray4.length();
                int i15 = 0;
                while (true) {
                    jSONArray = jSONArray2;
                    if (i15 >= length3) {
                        break;
                    }
                    arrayList3.add(jSONArray4.getString(i15));
                    i15++;
                    jSONArray2 = jSONArray;
                }
                ArrayList arrayList4 = new ArrayList();
                JSONArray jSONArray5 = jSONObject4.getJSONArray("values");
                int length4 = jSONArray5.length();
                int i16 = 0;
                while (true) {
                    i12 = length;
                    if (i16 >= length4) {
                        break;
                    }
                    arrayList4.add(jSONArray5.getString(i16));
                    i16++;
                    length = i12;
                }
                ArrayList arrayList5 = new ArrayList();
                JSONArray jSONArray6 = jSONObject4.getJSONArray("positions");
                int length5 = jSONArray6.length();
                int i17 = 0;
                while (i17 < length5) {
                    arrayList5.add(Integer.valueOf(jSONArray6.getInt(i17)));
                    i17++;
                    jSONArray6 = jSONArray6;
                }
                arrayList2.add(new FieldResult(jSONObject4.getString("fieldId"), FieldType.valueOf(jSONObject4.getString("type")), arrayList3, arrayList4, C42784z0.f406748b, arrayList5));
                i14++;
                jSONArray2 = jSONArray;
                length = i12;
            }
            arrayList.add(new PageResult(jSONObject3.getString("pageId"), jSONObject3.getInt("close"), arrayList2, jSONObject3.getInt("externalLink")));
            i13++;
            jSONArray2 = jSONArray2;
            length = length;
        }
        int i18 = jSONObject.getInt("campaignId");
        int i19 = jSONObject.getInt("projectId");
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ", Locale.getDefault()).parse(new StringBuilder(jSONObject.getString("createdAtClient")).deleteCharAt(r0.length() - 3).toString());
        if (date == null) {
            date = new Date();
        }
        return new CampaignPagesResult(i18, i19, date, arrayList, linkedHashMap);
    }
}
