package Oa1;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class f0 {
    public static String a(Na1.c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", cVar.f11607a);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : cVar.f11608b.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("data", jSONObject2);
        jSONObject.put(CrashHianalyticsData.TIME, cVar.f11609c);
        return jSONObject.toString(0);
    }
}
