package com.my.tracker.core.o;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.TrackerConfig;
import com.my.tracker.core.net.HttpCore;
import com.my.tracker.core.net.HttpResult;
import com.my.tracker.core.utils.PermissionUtils;
import defpackage.i17;
import defpackage.ivi;
import defpackage.kc3;
import defpackage.kw6;
import defpackage.ood;
import defpackage.qod;
import defpackage.ua9;
import defpackage.zmd;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class x implements HttpCore {
    private final TrackerConfig a;
    private final Application b;

    private x(TrackerConfig trackerConfig, Application application) {
        this.a = trackerConfig;
        this.b = application;
    }

    public static x a(TrackerConfig trackerConfig, Application application) {
        return new x(trackerConfig, application);
    }

    @Override // com.my.tracker.core.net.HttpCore
    public HttpResult doGet(String str) {
        MyTrackerConfig.OkHttpClientProvider okHttpClientProvider = this.a.getOkHttpClientProvider();
        return okHttpClientProvider == null ? a(str) : a(str, okHttpClientProvider);
    }

    @Override // com.my.tracker.core.net.HttpCore
    public HttpResult doPost(String str, byte[] bArr, boolean z) {
        MyTrackerConfig.OkHttpClientProvider okHttpClientProvider = this.a.getOkHttpClientProvider();
        return okHttpClientProvider == null ? a(str, bArr, z) : a(str, bArr, z, okHttpClientProvider);
    }

    @Override // com.my.tracker.core.net.HttpCore
    public boolean isConnected() {
        NetworkInfo activeNetworkInfo;
        if (!PermissionUtils.checkPermission("android.permission.ACCESS_NETWORK_STATE", this.b)) {
            return true;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Throwable unused) {
            return true;
        }
    }

    private HttpResult a(String str) {
        String string;
        HttpURLConnection httpURLConnection;
        boolean z;
        BufferedReader bufferedReader;
        boolean z2 = false;
        HttpURLConnection httpURLConnection2 = null;
        String str2 = null;
        try {
            Tracer.d("HttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setRequestMethod(HttpGet.METHOD_NAME);
                int responseCode = httpURLConnection.getResponseCode();
                Tracer.d("HttpGetRequest: response received with response code: " + responseCode);
                z = responseCode == 200;
                try {
                    Tracer.d("HttpGetRequest: processing server response");
                    bufferedReader = z ? new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        if (sb.length() > 0) {
                            string = sb.toString();
                        } else {
                            Tracer.d("HttpGetRequest: response data is empty");
                            string = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
                string = null;
            }
        } catch (Throwable th4) {
            th = th4;
            string = null;
        }
        try {
            bufferedReader.close();
            httpURLConnection.disconnect();
            z2 = z;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection2 = httpURLConnection;
            try {
                Tracer.d("HttpGetRequest: error", th);
                str2 = "HttpGetRequest: error while sending data";
                return new HttpResult(z2, string, str2);
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
        return new HttpResult(z2, string, str2);
    }

    private HttpResult a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        String strQ;
        boolean z;
        boolean z2 = false;
        String str2 = null;
        try {
            Tracer.d("OkHttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            kw6 kw6Var = new kw6();
            kw6Var.m(str);
            kw6Var.e(HttpGet.METHOD_NAME, null);
            ood oodVarF = okHttpClientProvider.getOkHttpClient().b(kw6Var.a()).f();
            try {
                int i = oodVarF.d;
                if (i == 200) {
                    Tracer.d("OkHttpGetRequest: response successfully received");
                    z = true;
                } else {
                    Tracer.d("OkHttpGetRequest error: response code " + i);
                    z = false;
                }
                if (i == 200) {
                    Tracer.d("OkHttpGetRequest: processing server response");
                    qod qodVar = oodVarF.Y;
                    strQ = qodVar != null ? qodVar.Q() : null;
                    if (TextUtils.isEmpty(strQ)) {
                        Tracer.d("OkHttpGetRequest: response data is empty");
                        strQ = null;
                        oodVarF.close();
                        z2 = z;
                    } else {
                        try {
                            oodVarF.close();
                            z2 = z;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strQ;
                            Tracer.d("OkHttpGetRequest error: error while sending data", th);
                            String str3 = str2;
                            str2 = "OkHttpGetRequest error: error while sending data";
                            strQ = str3;
                            return new HttpResult(z2, strQ, str2);
                        }
                    }
                } else {
                    strQ = null;
                    oodVarF.close();
                    z2 = z;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            Tracer.d("OkHttpGetRequest error: error while sending data", th);
            String str32 = str2;
            str2 = "OkHttpGetRequest error: error while sending data";
            strQ = str32;
            return new HttpResult(z2, strQ, str2);
        }
        return new HttpResult(z2, strQ, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100 A[Catch: all -> 0x00a9, TryCatch #5 {all -> 0x00a9, blocks: (B:5:0x0028, B:19:0x0088, B:24:0x0098, B:50:0x00f7, B:51:0x00fa, B:28:0x00ad, B:54:0x0100, B:55:0x0103), top: B:77:0x0028 }] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.FilterOutputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.FilterOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.my.tracker.core.net.HttpResult a(java.lang.String r8, byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.core.o.x.a(java.lang.String, byte[], boolean):com.my.tracker.core.net.HttpResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4 */
    private HttpResult a(String str, byte[] bArr, boolean z, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        ood oodVar;
        String str2;
        ood oodVarF;
        ?? r10;
        ood oodVar2;
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ua9 ua9VarA;
        int i;
        boolean z2;
        boolean z3 = false;
        ood oodVar3 = null;
        try {
            Tracer.d("HttpCoreReal: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (z) {
                        Tracer.d("HttpCoreReal: populating post request body using gzip");
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.finish();
                        } catch (Throwable th) {
                            th = th;
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        Tracer.d("HttpCoreReal: populating post request body without using gzip");
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.flush();
                        gZIPOutputStream = null;
                    }
                    Pattern pattern = ua9.d;
                    try {
                        ua9VarA = ivi.a("application/octet-stream");
                    } catch (IllegalArgumentException unused) {
                        ua9VarA = null;
                    }
                    kw6 kw6Var = new kw6();
                    kw6Var.m(str);
                    ((i17) kw6Var.c).h(HTTP.CONTENT_ENCODING, "gzip");
                    kw6Var.e(HttpPost.METHOD_NAME, kc3.s(byteArrayOutputStream.toByteArray(), ua9VarA, 6));
                    zmd zmdVarA = kw6Var.a();
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    byteArrayOutputStream.close();
                    oodVarF = okHttpClientProvider.getOkHttpClient().b(zmdVarA).f();
                    try {
                        i = oodVarF.d;
                        if (i != 200 && i != 204) {
                            Tracer.d("HttpCoreReal error: response code " + i);
                            z2 = false;
                        } else {
                            Tracer.d("HttpCoreReal: response successfully received");
                            z2 = true;
                        }
                    } catch (Throwable th2) {
                        oodVar3 = oodVarF;
                        th = th2;
                        oodVar = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            oodVar = null;
        }
        if (i == 200) {
            Tracer.d("HttpCoreReal: processing server response");
            qod qodVar = oodVarF.Y;
            if (qodVar != null) {
                ?? Q = qodVar.Q();
                try {
                } catch (Throwable th6) {
                    oodVar3 = oodVarF;
                    th = th6;
                    oodVar = Q;
                    try {
                        str2 = "HttpCoreReal error: error while sending data";
                        Tracer.d("HttpCoreReal error: error while sending data", th);
                        r10 = oodVar;
                        if (oodVar3 != null) {
                            oodVarF = oodVar3;
                            oodVar2 = oodVar;
                            oodVar3 = oodVar2;
                            oodVarF.close();
                            r10 = oodVar3;
                        }
                        return new HttpResult(z3, r10, str2);
                    } catch (Throwable th7) {
                        if (oodVar3 != null) {
                            oodVar3.close();
                        }
                        throw th7;
                    }
                }
                if (TextUtils.isEmpty(Q)) {
                    Tracer.d("HttpCoreReal: response data is empty");
                } else {
                    z3 = z2;
                    str2 = null;
                    oodVar2 = Q;
                    oodVar3 = oodVar2;
                    oodVarF.close();
                    r10 = oodVar3;
                    return new HttpResult(z3, r10, str2);
                }
            }
        }
        z3 = z2;
        str2 = null;
        oodVarF.close();
        r10 = oodVar3;
        return new HttpResult(z3, r10, str2);
    }
}
