package com.my.tracker.personalize;

import android.text.TextUtils;
import androidx.camera.camera2.internal.G;
import com.my.tracker.obfuscated.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
final class d extends b<List<PersonalizePlacement>> {
    public static c<PersonalizeItem> b(JSONObject jSONObject) {
        String strA = a(jSONObject, "sku", "payload", "value", "discount_value", "price", "discount_price");
        if (strA != null) {
            return new c<>(null, strA);
        }
        String strOptString = jSONObject.optString("sku");
        if (TextUtils.isEmpty(strOptString)) {
            return a("Invalid value for key: ", "sku");
        }
        String strOptString2 = jSONObject.optString("payload");
        if (TextUtils.isEmpty(strOptString2)) {
            return a("Invalid value for key: ", "payload");
        }
        return new c<>(new PersonalizeItem(strOptString, strOptString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), jSONObject.optInt("value"), jSONObject.optInt("discount_value")), null);
    }

    public static c<PersonalizeOffer> c(JSONObject jSONObject) {
        String str;
        StringBuilder sb2;
        String strA = a(jSONObject, "offer_id", "subitems");
        if (strA != null) {
            return new c<>(null, strA);
        }
        int iOptInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subitems");
        if (jSONArrayOptJSONArray == null) {
            return a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
            c<PersonalizeItem> cVarB = b(jSONArrayOptJSONArray.optJSONObject(i12));
            String strA2 = cVarB.a();
            if (TextUtils.isEmpty(strA2)) {
                PersonalizeItem personalizeItemB = cVarB.b();
                if (personalizeItemB == null) {
                    str = "Can't parse item " + i12 + " without errors";
                    arrayList2.add(str);
                    sb2 = new StringBuilder("PersonalizePlacementsParser: ");
                } else {
                    arrayList.add(personalizeItemB);
                }
            } else {
                str = "Can't parse item " + i12 + " with errors: " + strA2;
                arrayList2.add(str);
                sb2 = new StringBuilder("PersonalizePlacementsParser: ");
            }
            sb2.append(str);
            e2.a(sb2.toString());
        }
        return arrayList2.size() > 0 ? new c<>(null, String.join(", ", arrayList2)) : new c<>(new PersonalizeOffer(iOptInt, arrayList), null);
    }

    public static c<PersonalizePlacement> d(JSONObject jSONObject) {
        String strA = a(jSONObject, "placement_id", "test_id", "group_id", "offer");
        if (strA != null) {
            return new c<>(null, strA);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("offer");
        if (jSONObjectOptJSONObject == null) {
            return a("Invalid value for key: ", "offer");
        }
        c<PersonalizeOffer> cVarC = c(jSONObjectOptJSONObject);
        String strA2 = cVarC.a();
        if (strA2 != null) {
            e2.a("PersonalizePlacementsParser: Can't parse offer's object with error: ".concat(strA2));
            return new c<>(null, strA2);
        }
        PersonalizeOffer personalizeOfferB = cVarC.b();
        if (personalizeOfferB == null) {
            return a("Can't parse offer's object without error from parser", null);
        }
        String strOptString = jSONObject.optString("placement_id");
        return TextUtils.isEmpty(strOptString) ? a("Invalid value for key: ", "placement_id") : new c<>(new PersonalizePlacement(strOptString, jSONObject.optInt("group_id"), jSONObject.optInt("test_id"), personalizeOfferB), null);
    }

    @Override // com.my.tracker.personalize.b
    public c<List<PersonalizePlacement>> a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("errors");
        ArrayList arrayList = new ArrayList();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                arrayList.add(next + ": " + jSONObjectOptJSONObject.optString(next));
            }
            return new c<>(null, String.join(", ", arrayList));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            return a("No value for key: ", "data");
        }
        if (jSONArrayOptJSONArray.length() == 0) {
            return a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
            c<PersonalizePlacement> cVarD = d(jSONArrayOptJSONArray.optJSONObject(i12));
            String strA = cVarD.a();
            if (strA != null) {
                e2.a("PersonalizePlacementsParser: Placement parsing error: ".concat(strA));
            } else {
                PersonalizePlacement personalizePlacementB = cVarD.b();
                if (personalizePlacementB != null) {
                    arrayList2.add(personalizePlacementB);
                }
            }
        }
        return arrayList2.isEmpty() ? a("No placements in the list") : new c<>(arrayList2, null);
    }

    public static <T> c<T> a(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            sb2.append(str);
        }
        String string = sb2.toString();
        e2.a("PersonalizePlacementsParser: " + string);
        return new c<>(null, string);
    }

    public static String a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String strF = G.f("No value for key: ", str);
                e2.a("PersonalizePlacementsParser: " + strF);
                return strF;
            }
        }
        return null;
    }
}
