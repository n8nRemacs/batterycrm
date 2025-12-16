package com.yandex.metrica.network.impl;

import com.yandex.metrica.network.Call;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.L;

/* loaded from: classes7.dex */
public final class c implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkClient f382394a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f382395b;

    public c(NetworkClient networkClient, Request request, d dVar) {
        this.f382394a = networkClient;
        this.f382395b = request;
    }

    public final void a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Request request = this.f382395b;
        for (Map.Entry entry : request.f382381d.entrySet()) {
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        NetworkClient networkClient = this.f382394a;
        Integer num = networkClient.f382367b;
        if (num != null) {
            httpsURLConnection.setReadTimeout(num.intValue());
        }
        Integer num2 = networkClient.f382366a;
        if (num2 != null) {
            httpsURLConnection.setConnectTimeout(num2.intValue());
        }
        Boolean bool = networkClient.f382369d;
        if (bool != null) {
            httpsURLConnection.setUseCaches(bool.booleanValue());
        }
        Boolean bool2 = networkClient.f382370e;
        if (bool2 != null) {
            httpsURLConnection.setInstanceFollowRedirects(bool2.booleanValue());
        }
        httpsURLConnection.setRequestMethod(request.f382379b);
        SSLSocketFactory sSLSocketFactory = networkClient.f382368c;
        if (sSLSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
        }
    }

    public final Response b() {
        int responseCode;
        Map<String, List<String>> headerFields;
        int i12;
        boolean z12;
        byte[] bArr;
        Throwable th2;
        byte[] bArr2;
        Map<String, List<String>> map;
        NetworkClient networkClient = this.f382394a;
        Request request = this.f382395b;
        String str = request.f382378a;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
                uRLConnectionOpenConnection = null;
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException(AK.c.k("Connection created for ", str, " does not represent https connection")));
            }
            byte[] bArrA = new byte[0];
            byte[] bArr3 = new byte[0];
            try {
                a(httpsURLConnection);
                if (L.f(request.f382379b, "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(request.f382380c);
                            outputStream.flush();
                            kotlin.io.c.a(outputStream, null);
                        } finally {
                        }
                    }
                }
                responseCode = httpsURLConnection.getResponseCode();
            } catch (Throwable th3) {
                th = th3;
                responseCode = 0;
            }
            try {
                headerFields = httpsURLConnection.getHeaderFields();
                try {
                    e eVar = e.f382396a;
                    int i13 = networkClient.f382371f;
                    a aVar = new a(httpsURLConnection);
                    eVar.getClass();
                    bArrA = e.a(i13, aVar);
                    byte[] bArrA2 = e.a(networkClient.f382371f, new b(httpsURLConnection));
                    try {
                        httpsURLConnection.disconnect();
                    } catch (Throwable unused) {
                    }
                    i12 = responseCode;
                    bArr = bArrA;
                    th2 = null;
                    bArr2 = bArrA2;
                    map = headerFields;
                    z12 = true;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    try {
                        httpsURLConnection.disconnect();
                    } catch (Throwable unused2) {
                    }
                    i12 = responseCode;
                    z12 = false;
                    bArr = bArrA;
                    th2 = th5;
                    bArr2 = bArr3;
                    map = headerFields;
                    return new Response(z12, i12, bArr, bArr2, map, th2);
                }
            } catch (Throwable th6) {
                th = th6;
                headerFields = null;
                Throwable th52 = th;
                httpsURLConnection.disconnect();
                i12 = responseCode;
                z12 = false;
                bArr = bArrA;
                th2 = th52;
                bArr2 = bArr3;
                map = headerFields;
                return new Response(z12, i12, bArr, bArr2, map, th2);
            }
            return new Response(z12, i12, bArr, bArr2, map, th2);
        } catch (Throwable th7) {
            return new Response(th7);
        }
    }
}
