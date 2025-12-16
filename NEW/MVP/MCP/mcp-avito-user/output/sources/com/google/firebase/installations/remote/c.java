package com.google.firebase.installations.remote;

import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.heartbeatinfo.i;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.a;
import com.google.firebase.installations.remote.b;
import j.N;
import j.P;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseInstallationServiceClient.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f361710d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f361711e = Charset.forName(Constants.ENCODING);

    /* renamed from: a, reason: collision with root package name */
    public final Context f361712a;

    /* renamed from: b, reason: collision with root package name */
    public final wZ0.b<i> f361713b;

    /* renamed from: c, reason: collision with root package name */
    public final d f361714c = new d();

    public c(@N Context context, @N wZ0.b<i> bVar) {
        this.f361712a = context;
        this.f361713b = bVar;
    }

    public static URL c(String str) throws FirebaseInstallationsException {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e12) {
            throw new FirebaseInstallationsException(e12.getMessage());
        }
    }

    public static void d(HttpURLConnection httpURLConnection, @P String str, @N String str2, @N String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f361711e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            return;
        }
        new StringBuilder(", ").append(str);
    }

    @VisibleForTesting
    public static long f(String str) {
        C36729v.a("Invalid Expiration Timestamp.", f361710d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static InstallationResponse g(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f361711e));
        TokenResult.a aVarA = TokenResult.a();
        a.b bVar = new a.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                bVar.f361700a = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                bVar.f361701b = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                bVar.f361702c = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        ((b.C10726b) aVarA).f361707a = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        ((b.C10726b) aVarA).f361708b = Long.valueOf(f(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                bVar.f361703d = aVarA.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(bVar.f361700a, bVar.f361701b, bVar.f361702c, bVar.f361703d, InstallationResponse.ResponseCode.f361688b, null);
    }

    public static TokenResult h(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f361711e));
        TokenResult.a aVarA = TokenResult.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                ((b.C10726b) aVarA).f361707a = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                ((b.C10726b) aVarA).f361708b = Long.valueOf(f(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        b.C10726b c10726b = (b.C10726b) aVarA;
        c10726b.f361709c = TokenResult.ResponseCode.f361691b;
        return c10726b.a();
    }

    public static void i(HttpURLConnection httpURLConnection, @P String str, @N String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.3");
            k(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static void j(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            k(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static void k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @N
    public final InstallationResponse a(@N String str, @P String str2, @N String str3, @N String str4, @P String str5) {
        int responseCode;
        d dVar = this.f361714c;
        if (!dVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlC = c("projects/" + str3 + "/installations");
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionE = e(urlC, str);
            try {
                try {
                    httpURLConnectionE.setRequestMethod("POST");
                    httpURLConnectionE.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionE.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    try {
                        i(httpURLConnectionE, str2, str4);
                        responseCode = httpURLConnectionE.getResponseCode();
                        dVar.b(responseCode);
                        if (responseCode < 200 || responseCode >= 300) {
                            z12 = false;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (z12) {
                    return g(httpURLConnectionE);
                }
                d(httpURLConnectionE, str4, str, str3);
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    break;
                }
                i12++;
            } finally {
                httpURLConnectionE.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        a.b bVar = new a.b();
        return new a(bVar.f361700a, bVar.f361701b, bVar.f361702c, bVar.f361703d, InstallationResponse.ResponseCode.f361689c, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        r4 = (com.google.firebase.installations.remote.b.C10726b) com.google.firebase.installations.remote.TokenResult.a();
        r4.f361709c = com.google.firebase.installations.remote.TokenResult.ResponseCode.f361693d;
        r10 = r4.a();
     */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.installations.remote.TokenResult b(@j.N java.lang.String r10, @j.N java.lang.String r11, @j.N java.lang.String r12, @j.N java.lang.String r13) {
        /*
            r9 = this;
            com.google.firebase.installations.remote.d r0 = r9.f361714c
            boolean r1 = r0.a()
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            if (r1 == 0) goto Ld0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "projects/"
            r1.<init>(r3)
            r1.append(r12)
            java.lang.String r3 = "/installations/"
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = "/authTokens:generate"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.net.URL r11 = c(r11)
            r1 = 0
            r3 = r1
        L2b:
            r4 = 1
            if (r3 > r4) goto Lca
            r5 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r5)
            java.net.HttpURLConnection r5 = r9.e(r11, r10)
            java.lang.String r6 = "POST"
            r5.setRequestMethod(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            java.lang.String r6 = "Authorization"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            r7.<init>()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            java.lang.String r8 = "FIS_v2 "
            r7.append(r8)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            r7.append(r13)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            r5.addRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            r5.setDoOutput(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            j(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            int r6 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            r0.b(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 < r7) goto L69
            r7 = 300(0x12c, float:4.2E-43)
            if (r6 >= r7) goto L69
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 == 0) goto L79
            com.google.firebase.installations.remote.TokenResult r10 = h(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92
        L70:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r10
        L77:
            r10 = move-exception
            goto Lbf
        L79:
            r4 = 0
            d(r5, r4, r10, r12)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            r4 = 401(0x191, float:5.62E-43)
            if (r6 == r4) goto Lb0
            r4 = 404(0x194, float:5.66E-43)
            if (r6 != r4) goto L86
            goto Lb0
        L86:
            r4 = 429(0x1ad, float:6.01E-43)
            if (r6 == r4) goto La8
            r4 = 500(0x1f4, float:7.0E-43)
            if (r6 < r4) goto L99
            r4 = 600(0x258, float:8.41E-43)
            if (r6 >= r4) goto L99
        L92:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto Lc6
        L99:
            com.google.firebase.installations.remote.TokenResult$a r4 = com.google.firebase.installations.remote.TokenResult.a()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            com.google.firebase.installations.remote.TokenResult$ResponseCode r6 = com.google.firebase.installations.remote.TokenResult.ResponseCode.f361692c     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            com.google.firebase.installations.remote.b$b r4 = (com.google.firebase.installations.remote.b.C10726b) r4     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            r4.f361709c = r6     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            com.google.firebase.installations.remote.TokenResult r10 = r4.a()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            goto L70
        La8:
            com.google.firebase.installations.FirebaseInstallationsException r4 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            java.lang.String r6 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            throw r4     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
        Lb0:
            com.google.firebase.installations.remote.TokenResult$a r4 = com.google.firebase.installations.remote.TokenResult.a()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            com.google.firebase.installations.remote.TokenResult$ResponseCode r6 = com.google.firebase.installations.remote.TokenResult.ResponseCode.f361693d     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            com.google.firebase.installations.remote.b$b r4 = (com.google.firebase.installations.remote.b.C10726b) r4     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            r4.f361709c = r6     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            com.google.firebase.installations.remote.TokenResult r10 = r4.a()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L92 java.lang.Throwable -> L92
            goto L70
        Lbf:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r10
        Lc6:
            int r3 = r3 + 1
            goto L2b
        Lca:
            com.google.firebase.installations.FirebaseInstallationsException r10 = new com.google.firebase.installations.FirebaseInstallationsException
            r10.<init>(r2)
            throw r10
        Ld0:
            com.google.firebase.installations.FirebaseInstallationsException r10 = new com.google.firebase.installations.FirebaseInstallationsException
            r10.<init>(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.c.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.google.firebase.installations.remote.TokenResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: NameNotFoundException -> 0x00be, TryCatch #3 {NameNotFoundException -> 0x00be, blocks: (B:9:0x0059, B:11:0x006b, B:17:0x0075, B:23:0x0082, B:26:0x0092, B:27:0x0096, B:29:0x00a0, B:30:0x00b9), top: B:41:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[Catch: NameNotFoundException -> 0x00be, TryCatch #3 {NameNotFoundException -> 0x00be, blocks: (B:9:0x0059, B:11:0x006b, B:17:0x0075, B:23:0x0082, B:26:0x0092, B:27:0x0096, B:29:0x00a0, B:30:0x00b9), top: B:41:0x0059 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection e(java.net.URL r9, java.lang.String r10) throws java.security.NoSuchAlgorithmException, com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r8 = this;
            java.net.URLConnection r9 = r9.openConnection()     // Catch: java.io.IOException -> Lcc
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch: java.io.IOException -> Lcc
            r0 = 10000(0x2710, float:1.4013E-41)
            r9.setConnectTimeout(r0)
            r1 = 0
            r9.setUseCaches(r1)
            r9.setReadTimeout(r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/json"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "Accept"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r9.addRequestProperty(r0, r2)
            android.content.Context r0 = r8.f361712a
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r9.addRequestProperty(r3, r2)
            wZ0.b<com.google.firebase.heartbeatinfo.i> r2 = r8.f361713b
            java.lang.Object r2 = r2.get()
            com.google.firebase.heartbeatinfo.i r2 = (com.google.firebase.heartbeatinfo.i) r2
            if (r2 == 0) goto L58
            java.lang.String r3 = "x-firebase-client"
            com.google.android.gms.tasks.Task r2 = r2.b()     // Catch: java.lang.InterruptedException -> L51 java.util.concurrent.ExecutionException -> L58
            java.lang.Object r2 = com.google.android.gms.tasks.C37030m.a(r2)     // Catch: java.lang.InterruptedException -> L51 java.util.concurrent.ExecutionException -> L58
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.InterruptedException -> L51 java.util.concurrent.ExecutionException -> L58
            r9.addRequestProperty(r3, r2)     // Catch: java.lang.InterruptedException -> L51 java.util.concurrent.ExecutionException -> L58
            goto L58
        L51:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L58:
            r2 = 0
            java.lang.String r3 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            aY0.b r4 = aY0.c.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r5 = 64
            android.content.pm.PackageInfo r3 = r4.b(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            android.content.pm.Signature[] r4 = r3.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            if (r4 == 0) goto L8f
            int r4 = r4.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r5 = 1
            if (r4 != r5) goto L8f
            java.lang.String r4 = "SHA1"
            r5 = r1
        L72:
            r6 = 2
            if (r5 >= r6) goto L7e
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r4)     // Catch: java.security.NoSuchAlgorithmException -> L7b android.content.pm.PackageManager.NameNotFoundException -> Lbe
            if (r6 != 0) goto L7f
        L7b:
            int r5 = r5 + 1
            goto L72
        L7e:
            r6 = r2
        L7f:
            if (r6 != 0) goto L82
            goto L8f
        L82:
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r3 = r3[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            byte[] r3 = r3.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            byte[] r3 = r6.digest(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            goto L90
        L8f:
            r3 = r2
        L90:
            if (r3 != 0) goto L96
            r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            goto Lc1
        L96:
            int r4 = r3.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            int r5 = r4 + r4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r6.<init>(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
        L9e:
            if (r1 >= r4) goto Lb9
            char[] r5 = com.google.android.gms.common.util.n.f349616a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r7 = r3[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >>> 4
            char r7 = r5[r7]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r6.append(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r7 = r3[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r7 = r7 & 15
            char r5 = r5[r7]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r6.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            int r1 = r1 + 1
            goto L9e
        Lb9:
            java.lang.String r2 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            goto Lc1
        Lbe:
            r0.getPackageName()
        Lc1:
            java.lang.String r0 = "X-Android-Cert"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "x-goog-api-key"
            r9.addRequestProperty(r0, r10)
            return r9
        Lcc:
            com.google.firebase.installations.FirebaseInstallationsException r9 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r10 = "Firebase Installations Service is unavailable. Please try again later."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.c.e(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
