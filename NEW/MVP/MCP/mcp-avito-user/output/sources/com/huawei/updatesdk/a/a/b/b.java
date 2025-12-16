package com.huawei.updatesdk.a.a.b;

import V01.e;
import android.content.Context;
import com.huawei.secure.android.common.ssl.g;
import com.huawei.secure.android.common.ssl.j;
import com.huawei.secure.android.common.ssl.k;
import com.huawei.updatesdk.a.a.d.d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private HttpURLConnection f363752a = null;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f363753a;

        /* renamed from: b, reason: collision with root package name */
        private int f363754b;

        public int a() {
            return this.f363754b;
        }

        public String b() {
            return this.f363753a;
        }
    }

    public a a(String str, String str2, String str3, String str4, Context context) throws Throwable {
        Throwable th2;
        DataOutputStream dataOutputStream;
        a aVar = new a();
        BufferedInputStream bufferedInputStream = null;
        try {
            HttpURLConnection httpURLConnectionA = a(str, context);
            this.f363752a = httpURLConnectionA;
            httpURLConnectionA.setDoInput(true);
            this.f363752a.setDoOutput(true);
            this.f363752a.setUseCaches(false);
            this.f363752a.setConnectTimeout(5000);
            this.f363752a.setReadTimeout(10000);
            this.f363752a.setRequestMethod("POST");
            this.f363752a.setRequestProperty("Content-Type", "application/x-gzip");
            this.f363752a.setRequestProperty("Content-Encoding", "gzip");
            this.f363752a.setRequestProperty("Connection", "Keep-Alive");
            this.f363752a.setRequestProperty("User-Agent", str4);
            dataOutputStream = new DataOutputStream(this.f363752a.getOutputStream());
            try {
                dataOutputStream.write(a(str2.getBytes(str3)));
                dataOutputStream.flush();
                int responseCode = this.f363752a.getResponseCode();
                aVar.f363754b = responseCode;
                bufferedInputStream = responseCode == 200 ? new BufferedInputStream(this.f363752a.getInputStream()) : new BufferedInputStream(this.f363752a.getErrorStream());
                com.huawei.updatesdk.a.a.d.b bVar = new com.huawei.updatesdk.a.a.d.b();
                byte[] bArrA = com.huawei.updatesdk.a.a.b.a.b().a();
                while (true) {
                    int i12 = bufferedInputStream.read(bArrA);
                    if (i12 == -1) {
                        break;
                    }
                    bVar.a(bArrA, i12);
                }
                com.huawei.updatesdk.a.a.b.a.b().a(bArrA);
                aVar.f363753a = bVar.a();
                HttpURLConnection httpURLConnection = this.f363752a;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                d.a(dataOutputStream);
                d.a(bufferedInputStream);
                return aVar;
            } catch (Throwable th3) {
                th2 = th3;
                HttpURLConnection httpURLConnection2 = this.f363752a;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                d.a(dataOutputStream);
                d.a(bufferedInputStream);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            dataOutputStream = null;
        }
    }

    public void a() {
        HttpURLConnection httpURLConnection = this.f363752a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private byte[] a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        dataOutputStream2 = null;
        dataOutputStream2 = null;
        dataOutputStream2 = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream, bArr.length));
                    } catch (IOException e12) {
                        e = e12;
                    }
                } catch (IOException e13) {
                    com.huawei.updatesdk.a.a.c.a.a.a.a("HttpsUtil", "gzip error!", e13);
                }
            } catch (IOException e14) {
                e = e14;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int length = bArr.length;
            dataOutputStream.write(bArr, 0, length);
            dataOutputStream.flush();
            dataOutputStream.close();
            dataOutputStream2 = length;
        } catch (IOException e15) {
            e = e15;
            dataOutputStream2 = dataOutputStream;
            com.huawei.updatesdk.a.a.c.a.a.a.a("HttpsUtil", "gzip error!", e);
            if (dataOutputStream2 != null) {
                dataOutputStream2.close();
                dataOutputStream2 = dataOutputStream2;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.close();
                } catch (IOException e16) {
                    com.huawei.updatesdk.a.a.c.a.a.a.a("HttpsUtil", "gzip error!", e16);
                }
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static HttpURLConnection a(String str, Context context) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        j jVar = j.f363732d;
        System.currentTimeMillis();
        if (context != null && e.f16866a == null) {
            e.f16866a = context.getApplicationContext();
        }
        if (j.f363732d == null) {
            synchronized (j.class) {
                try {
                    if (j.f363732d == null) {
                        j jVar2 = new j();
                        jVar2.f363733a = null;
                        if (context != null) {
                            jVar2.f363734b = context.getApplicationContext();
                            jVar2.f363733a = g.c();
                            jVar2.f363733a.init(null, new X509TrustManager[]{k.a(context)}, null);
                        }
                        j.f363732d = jVar2;
                    }
                } finally {
                }
            }
        }
        if (j.f363732d.f363734b == null && context != null) {
            j jVar3 = j.f363732d;
            jVar3.getClass();
            jVar3.f363734b = context.getApplicationContext();
        }
        System.currentTimeMillis();
        httpsURLConnection.setSSLSocketFactory(j.f363732d);
        httpsURLConnection.setHostnameVerifier(new U01.b());
        return httpsURLConnection;
    }
}
