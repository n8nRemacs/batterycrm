package com.huawei.hms.availableupdate;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: HttpRequestHelper.java */
/* loaded from: classes7.dex */
public class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public HttpsURLConnection f363392a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f363393b = -1;

    @Override // com.huawei.hms.availableupdate.l
    public void a() {
        this.f363393b = 1;
    }

    @Override // com.huawei.hms.availableupdate.l
    public void close() {
        this.f363393b = -1;
        HttpsURLConnection httpsURLConnection = this.f363392a;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    @Override // com.huawei.hms.availableupdate.l
    public int a(String str, OutputStream outputStream, int i12, int i13, Context context) throws IOException {
        InputStream inputStream = null;
        try {
            a(str, context);
            HttpsURLConnection httpsURLConnection = this.f363392a;
            if (httpsURLConnection == null) {
                HMSLog.i("HttpRequestHelper", "mConnection is null");
                IOUtils.closeQuietly((InputStream) null);
                return -1;
            }
            httpsURLConnection.setRequestMethod("GET");
            if (i12 > 0) {
                this.f363392a.addRequestProperty("Range", "bytes=" + i12 + "-" + i13);
            }
            int responseCode = this.f363392a.getResponseCode();
            if ((i12 > 0 && responseCode == 206) || (i12 <= 0 && responseCode == 200)) {
                inputStream = this.f363392a.getInputStream();
                a(new BufferedInputStream(inputStream, 4096), outputStream);
                outputStream.flush();
            }
            return responseCode;
        } finally {
            IOUtils.closeQuietly((InputStream) null);
        }
    }

    public final void a(String str, Context context) throws IOException {
        if (this.f363393b == 0) {
            HMSLog.e("HttpRequestHelper", "Not allowed to repeat open http(s) connection.");
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (uRLConnectionOpenConnection == null) {
            HMSLog.i("HttpRequestHelper", "urlConnection is null");
            return;
        }
        if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
            this.f363392a = (HttpsURLConnection) uRLConnectionOpenConnection;
            try {
                com.huawei.secure.android.common.ssl.i iVarA = com.huawei.secure.android.common.ssl.i.a(context);
                if (iVarA != null) {
                    this.f363392a.setSSLSocketFactory(iVarA);
                }
                this.f363392a.setSSLSocketFactory(iVarA);
                this.f363392a.setHostnameVerifier(new U01.b());
                this.f363392a.setConnectTimeout(30000);
                this.f363392a.setReadTimeout(30000);
                this.f363392a.setDoInput(true);
                this.f363392a.setDoOutput(true);
                this.f363392a.setUseCaches(false);
                this.f363392a.setInstanceFollowRedirects(true);
                this.f363393b = 0;
                return;
            } catch (IOException e12) {
                e = e12;
                HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            } catch (IllegalAccessException e13) {
                e = e13;
                HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            } catch (IllegalArgumentException e14) {
                e = e14;
                HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            } catch (KeyManagementException e15) {
                e = e15;
                HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            } catch (KeyStoreException e16) {
                e = e16;
                HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            } catch (NoSuchAlgorithmException e17) {
                e = e17;
                HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            } catch (CertificateException e18) {
                e = e18;
                HMSLog.e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            }
        }
        HMSLog.i("HttpRequestHelper", "current request is http not allow connection");
        this.f363392a = null;
    }

    public final void a(InputStream inputStream, OutputStream outputStream) throws j, IOException {
        byte[] bArr = new byte[4096];
        do {
            int i12 = inputStream.read(bArr);
            if (-1 == i12) {
                return;
            } else {
                outputStream.write(bArr, 0, i12);
            }
        } while (this.f363393b != 1);
        throw new j("HTTP(s) request was canceled.");
    }
}
