package com.huawei.hms.opendevice;

/* compiled from: HttpClient.java */
/* loaded from: classes7.dex */
public abstract class d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpClient.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f363594b = {new a("GET", 0), new a("POST", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f363594b.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.HttpURLConnection a(android.content.Context r2, java.lang.String r3) throws java.lang.Exception {
        /*
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3)
            java.net.URLConnection r3 = r0.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            java.lang.String r0 = "PushHttpClient"
            boolean r1 = r3 instanceof javax.net.ssl.HttpsURLConnection
            if (r1 == 0) goto L50
            r1 = r3
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1
            com.huawei.secure.android.common.ssl.i r2 = com.huawei.secure.android.common.ssl.i.a(r2)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalAccessException -> L1f java.io.IOException -> L25 java.security.GeneralSecurityException -> L2b java.security.KeyStoreException -> L31 java.security.NoSuchAlgorithmException -> L37
            goto L3d
        L19:
            java.lang.String r2 = "Get SocketFactory Illegal Argument Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L3c
        L1f:
            java.lang.String r2 = "Get SocketFactory Illegal Access Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L3c
        L25:
            java.lang.String r2 = "Get SocketFactory IO Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L3c
        L2b:
            java.lang.String r2 = "Get SocketFactory General Security Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L3c
        L31:
            java.lang.String r2 = "Get SocketFactory Key Store exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L3c
        L37:
            java.lang.String r2 = "Get SocketFactory Algorithm Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L48
            r1.setSSLSocketFactory(r2)
            org.apache.http.conn.ssl.StrictHostnameVerifier r2 = com.huawei.secure.android.common.ssl.i.f363727d
            r1.setHostnameVerifier(r2)
            goto L50
        L48:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "No ssl socket factory set."
            r2.<init>(r3)
            throw r2
        L50:
            java.lang.String r2 = "POST"
            r3.setRequestMethod(r2)
            r2 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r2)
            r3.setReadTimeout(r2)
            r2 = 1
            r3.setDoOutput(r2)
            r3.setDoInput(r2)
            java.lang.String r2 = "Content-type"
            java.lang.String r0 = "application/json; charset=UTF-8"
            r3.setRequestProperty(r2, r0)
            java.lang.String r2 = "Connection"
            java.lang.String r0 = "close"
            r3.setRequestProperty(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.opendevice.d.a(android.content.Context, java.lang.String):java.net.HttpURLConnection");
    }
}
