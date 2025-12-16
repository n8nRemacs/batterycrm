package com.huawei.hms.hatool;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import x01.c0;
import x01.m0;

/* loaded from: classes7.dex */
public abstract class a0 {

    public static class a extends Exception {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.HttpURLConnection a(java.lang.String r4, int r5, java.util.HashMap r6) throws java.net.ProtocolException, com.huawei.hms.hatool.a0.a {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            java.lang.String r2 = "hmsSdk"
            if (r0 == 0) goto Lf
            java.lang.String r4 = "CreateConnection: invalid urlPath."
            x01.m0.a(r2, r4)
            return r1
        Lf:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r4)
            java.net.URLConnection r4 = r0.openConnection()
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4
            boolean r0 = r4 instanceof javax.net.ssl.HttpsURLConnection
            if (r0 == 0) goto L52
            r0 = r4
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
            android.content.Context r3 = x01.AbstractC49722g.b()     // Catch: java.lang.IllegalAccessException -> L2a java.io.IOException -> L30 java.security.GeneralSecurityException -> L33 java.security.KeyStoreException -> L36 java.security.NoSuchAlgorithmException -> L39
            com.huawei.secure.android.common.ssl.i r1 = com.huawei.secure.android.common.ssl.i.a(r3)     // Catch: java.lang.IllegalAccessException -> L2a java.io.IOException -> L30 java.security.GeneralSecurityException -> L33 java.security.KeyStoreException -> L36 java.security.NoSuchAlgorithmException -> L39
            goto L3c
        L2a:
            java.lang.String r3 = "getSocketFactory(): Illegal Access Exception "
        L2c:
            x01.m0.e(r2, r3)
            goto L3c
        L30:
            java.lang.String r3 = "getSocketFactory(): IO Exception!"
            goto L2c
        L33:
            java.lang.String r3 = "getSocketFactory(): General Security Exception"
            goto L2c
        L36:
            java.lang.String r3 = "getSocketFactory(): Key Store exception"
            goto L2c
        L39:
            java.lang.String r3 = "getSocketFactory(): Algorithm Exception!"
            goto L2c
        L3c:
            if (r1 == 0) goto L4a
            r0.setSSLSocketFactory(r1)
            U01.b r1 = new U01.b
            r1.<init>()
            r0.setHostnameVerifier(r1)
            goto L52
        L4a:
            com.huawei.hms.hatool.a0$a r4 = new com.huawei.hms.hatool.a0$a
            java.lang.String r5 = "No ssl socket factory set"
            r4.<init>(r5)
            throw r4
        L52:
            java.lang.String r0 = "POST"
            r4.setRequestMethod(r0)
            r0 = 15000(0x3a98, float:2.102E-41)
            r4.setConnectTimeout(r0)
            r4.setReadTimeout(r0)
            r0 = 1
            r4.setDoOutput(r0)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json; charset=UTF-8"
            r4.setRequestProperty(r1, r2)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Content-Length"
            r4.setRequestProperty(r1, r5)
            java.lang.String r5 = "Connection"
            java.lang.String r1 = "close"
            r4.setRequestProperty(r5, r1)
            int r5 = r6.size()
            if (r5 >= r0) goto L81
            return r4
        L81:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L89:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lae
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L89
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto La4
            goto L89
        La4:
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r4.setRequestProperty(r0, r6)
            goto L89
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.a0.a(java.lang.String, int, java.util.HashMap):java.net.HttpURLConnection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r6 r7
  0x0026: PHI (r6v18 java.net.HttpURLConnection) = 
  (r6v22 java.net.HttpURLConnection)
  (r6v23 java.net.HttpURLConnection)
  (r6v24 java.net.HttpURLConnection)
  (r6v25 java.net.HttpURLConnection)
  (r6v26 java.net.HttpURLConnection)
  (r6v27 java.net.HttpURLConnection)
  (r6v28 java.net.HttpURLConnection)
  (r6v29 java.net.HttpURLConnection)
 binds: [B:42:0x009b, B:62:0x00f2, B:57:0x00dc, B:47:0x00b0, B:52:0x00c6, B:67:0x0108, B:72:0x011e, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r7v19 x01.e) = (r7v5 x01.e), (r7v7 x01.e), (r7v9 x01.e), (r7v11 x01.e), (r7v13 x01.e), (r7v15 x01.e), (r7v17 x01.e), (r7v23 x01.e) binds: [B:42:0x009b, B:62:0x00f2, B:57:0x00dc, B:47:0x00b0, B:52:0x00c6, B:67:0x0108, B:72:0x011e, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x01.C49720e b(java.lang.String r6, byte[] r7, java.util.HashMap r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.a0.b(java.lang.String, byte[], java.util.HashMap):x01.e");
    }

    public static String c(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                return c0.a(inputStream);
            } catch (IOException unused) {
                m0.e("hmsSdk", "When Response Content From Connection inputStream operation exception! " + httpURLConnection.getResponseCode());
                c0.b(inputStream);
                return "";
            }
        } finally {
            c0.b(inputStream);
        }
    }
}
