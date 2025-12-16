package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.TrafficStats;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class ha7 {
    public final Context a;
    public final String b;
    public final int c;

    public ha7(Context context, String str, int i) {
        this.a = context;
        this.b = str;
        this.c = i;
    }

    public static void a(HttpURLConnection httpURLConnection, int i) {
        int threadStatsTag;
        if (i != -1) {
            threadStatsTag = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(i);
        } else {
            threadStatsTag = -1;
        }
        try {
            try {
                try {
                    try {
                        httpURLConnection.connect();
                    } catch (SecurityException e) {
                        Throwable cause = e.getCause();
                        if (cause == null) {
                            throw e;
                        }
                        String name = cause.getClass().getName();
                        if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                            throw e;
                        }
                        throw new UnknownHostException();
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (NullPointerException e3) {
                throw e3;
            }
        } finally {
            if (threadStatsTag != -1) {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
        }
    }

    public final ba7 b(hc8 hc8Var) {
        String str;
        BufferedInputStream bufferedInputStream;
        byte[] byteArray;
        String str2 = (String) hc8Var.b;
        String str3 = (String) hc8Var.c;
        aa7 aa7Var = (aa7) hc8Var.d;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            X509TrustManager x509TrustManager = (X509TrustManager) ys.v(trustManagerFactory.getTrustManagers());
            int i = q2d.rootca_ssl_rsa2022;
            Resources resources = this.a.getApplicationContext().getResources();
            InputStream inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X509").generateCertificate(inputStreamOpenRawResource);
                r4j.a(inputStreamOpenRawResource, null);
                String resourceEntryName = resources.getResourceEntryName(i);
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setCertificateEntry(resourceEntryName, (X509Certificate) certificateGenerateCertificate);
                TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                trustManagerFactory2.init(keyStore);
                om3 om3Var = new om3(new X509TrustManager[]{x509TrustManager, (X509TrustManager) ys.v(trustManagerFactory2.getTrustManagers())});
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, new TrustManager[]{om3Var}, null);
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } finally {
            }
        }
        try {
            httpURLConnection.setRequestMethod(str2);
            String str4 = this.b;
            if (str4 != null) {
                httpURLConnection.setRequestProperty(HTTP.USER_AGENT, str4);
            }
            httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, aa7Var.getContentType());
            httpURLConnection.setDoOutput(true);
            if (aa7Var.getContentLength() >= 0) {
                httpURLConnection.setFixedLengthStreamingMode(aa7Var.getContentLength());
            } else {
                httpURLConnection.setChunkedStreamingMode(4096);
            }
            a(httpURLConnection, this.c);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                aa7Var.writeTo(outputStream);
                outputStream.close();
            } finally {
            }
            try {
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    List<String> list = httpURLConnection.getHeaderFields().get(HTTP.CONTENT_TYPE);
                    if (list == null || (str = (String) ue3.I(list)) == null) {
                        str = "application/octet-stream";
                    }
                    if (responseCode < 400) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, bufferedInputStream.available()));
                            swi.a(bufferedInputStream, byteArrayOutputStream);
                            byteArray = byteArrayOutputStream.toByteArray();
                            bufferedInputStream.close();
                        } finally {
                        }
                    } else {
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(Math.max(8192, bufferedInputStream.available()));
                            swi.a(bufferedInputStream, byteArrayOutputStream2);
                            byteArray = byteArrayOutputStream2.toByteArray();
                            bufferedInputStream.close();
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    return new ba7(responseCode, responseMessage, new rw5(str, 1, byteArray), 0);
                } catch (NullPointerException e) {
                    String message = e.getMessage();
                    if (message == null || !dnf.r(message, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false)) {
                        throw e;
                    }
                    throw new IOException(e);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            httpURLConnection.disconnect();
            throw e3;
        }
    }
}
