package Fc1;

import com.avito.android.remote.model.Navigation;
import feedback.shared.sdk.api.network.entities.CheckAttributesResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.text.C43047d;
import org.json.JSONException;
import org.json.JSONObject;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.z2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13787z2 extends AbstractC13777y1<CheckAttributesResponse> {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final ArrayList f5919t;

    public C13787z2(@Y61.k ArrayList arrayList, @Y61.k String str, @Y61.k kotlinx.coroutines.r rVar) {
        super(1, str, rVar);
        this.f5919t = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.volley.Request
    @Y61.k
    public final byte[] e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (kotlin.Q q12 : this.f5919t) {
            jSONObject.put((String) q12.f406619b, q12.f406620c);
        }
        return new JSONObject().put(Navigation.ATTRIBUTES, jSONObject).toString().getBytes(C43047d.f410589b);
    }

    @Override // Fc1.AbstractC13777y1
    public final CheckAttributesResponse o(String str) {
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Navigation.ATTRIBUTES);
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(next, false)));
            }
        }
        return new CheckAttributesResponse(jSONObject.optBoolean("checkAttributes", false), linkedHashMap);
    }
}
