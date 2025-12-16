package Oa1;

import Oa1.C14666z;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final H f12360a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC42726C f12361b = C42727D.c(new a0(this));

    public e0(H h12, C14660t c14660t, C14666z.b bVar) {
        this.f12360a = h12;
    }

    public final String a(ArrayList arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14659s c14659s = (C14659s) it.next();
            JSONObject jSONObject2 = new JSONObject();
            Na1.c cVar = c14659s.f12387e;
            jSONObject2.put("event_name", cVar.f11607a);
            String str = c14659s.f12385c;
            jSONObject2.put("user_id", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("package_name", c14659s.f12383a);
            String str2 = c14659s.f12386d;
            if (str2 == null) {
                str2 = null;
            }
            jSONObject3.put("appVersion", str2);
            jSONObject3.put("userIdSdk", str);
            jSONObject3.put(CrashHianalyticsData.TIME, String.valueOf(cVar.f11609c));
            for (Map.Entry<String, String> entry : cVar.f11608b.entrySet()) {
                jSONObject3.put(entry.getKey(), entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            jSONArray.put(new JSONObject(jSONObject2.toString()));
        }
        jSONObject.put("events", jSONArray);
        return jSONObject.toString();
    }

    public final HttpsURLConnection b() throws ProtocolException {
        InterfaceC42726C interfaceC42726C = this.f12361b;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URL) interfaceC42726C.getValue()).openConnection();
        final URL url = (URL) interfaceC42726C.getValue();
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: Oa1.d0
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return str.equals(url.getHost());
            }
        });
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("content-type", "application/json");
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }
}
