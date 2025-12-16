package com.android.volley.toolbox;

import Fc1.C4;
import com.adjust.sdk.Constants;
import com.android.volley.Request;
import j.k0;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: HurlStack.java */
/* loaded from: classes10.dex */
public class q extends AbstractC27625e {

    /* renamed from: a, reason: collision with root package name */
    public final C4 f67144a;

    /* compiled from: HurlStack.java */
    public static class a extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        public final HttpURLConnection f67145b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(HttpURLConnection httpURLConnection) throws IOException {
            InputStream errorStream;
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpURLConnection.getErrorStream();
            }
            super(errorStream);
            this.f67145b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f67145b.disconnect();
        }
    }

    /* compiled from: HurlStack.java */
    public interface b extends K {
    }

    public q() {
        this(null);
    }

    @k0
    public static ArrayList b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.android.volley.o((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.android.volley.toolbox.AbstractC27625e
    public final o a(Request<?> request, Map<String, String> map) throws Throwable {
        C4 c42;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(request.i());
        URL url = new URL(request.f67027d);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i12 = request.f67036m.f67083a;
        httpURLConnection.setConnectTimeout(i12);
        httpURLConnection.setReadTimeout(i12);
        boolean z12 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (Constants.SCHEME.equals(url.getProtocol()) && (c42 = this.f67144a) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(c42);
        }
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            int i13 = request.f67026c;
            if (i13 == 0) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("Unknown method type.");
                }
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrE = request.e();
                if (bArrE != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", request.f());
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrE);
                    dataOutputStream.close();
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (i13 == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                o oVar = new o(responseCode, b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return oVar;
            }
            try {
                return new o(responseCode, b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new a(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z12 = true;
                if (!z12) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public q(C4 c42) {
        this.f67144a = c42;
    }
}
