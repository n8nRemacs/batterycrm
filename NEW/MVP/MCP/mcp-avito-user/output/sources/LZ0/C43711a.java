package lZ0;

import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.d;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: HttpGetRequest.java */
/* renamed from: lZ0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C43711a {

    /* renamed from: a, reason: collision with root package name */
    public final String f413899a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f413900b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f413901c = new HashMap();

    public C43711a(String str, HashMap map) {
        this.f413899a = str;
        this.f413900b = map;
    }

    public static String a(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), Constants.ENCODING) : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append(ContainerUtils.FIELD_DELIMITER);
            sb2.append((String) entry2.getKey());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), Constants.ENCODING) : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return r.r(str, "?", string);
        }
        if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
            string = ContainerUtils.FIELD_DELIMITER.concat(string);
        }
        return r.q(str, string);
    }

    public final c b() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = a(this.f413899a, this.f413900b);
            d.f361031a.a(2);
            httpsURLConnection = (HttpsURLConnection) new URL(strA).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f413901c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, Constants.ENCODING));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i12 = bufferedReader.read(cArr);
                            if (i12 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i12);
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, string);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }
}
