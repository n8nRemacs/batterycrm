package ru.cyberity.cbr.core.theme;

import Y61.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;

/* compiled from: JSONObjectExt.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/json/JSONArray;", "", "", "b", "(Lorg/json/JSONArray;)Ljava/util/List;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {
    @k
    public static final List<String> b(@k JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            arrayList.add(jSONArray.optString(i12));
        }
        return arrayList;
    }
}
