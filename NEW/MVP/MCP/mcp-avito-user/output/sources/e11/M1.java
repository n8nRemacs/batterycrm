package e11;

/* loaded from: classes7.dex */
public final class M1 extends F1<String> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    @Override // e11.F1
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@j.N java.lang.String r3, @j.P java.lang.String r4, @j.P java.util.HashMap r5, @j.N android.content.Context r6) {
        /*
            r2 = this;
            e11.B r4 = e11.C39847B.a(r6)
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L68
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = r4.f(r3, r0)
            r2.f394352c = r0
            if (r0 == 0) goto L14
            r5 = r0
            goto L6a
        L14:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L56
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L56
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L56
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L56
            r5 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r5)     // Catch: java.lang.Throwable -> L50
            r0.setConnectTimeout(r5)     // Catch: java.lang.Throwable -> L50
            r5 = 1
            r0.setInstanceFollowRedirects(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "connection"
            java.lang.String r1 = "close"
            r0.setRequestProperty(r5, r1)     // Catch: java.lang.Throwable -> L50
            r0.connect()     // Catch: java.lang.Throwable -> L50
            int r5 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L50
            r2.f394351b = r5     // Catch: java.lang.Throwable -> L50
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 != r1) goto L53
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Throwable -> L50
            java.io.File r3 = r4.e(r5, r3)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L53
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            r2.f394352c = r3     // Catch: java.lang.Throwable -> L50
            goto L5d
        L50:
            r3 = move-exception
            r5 = r0
            goto L57
        L53:
            r2.f394350a = r6     // Catch: java.lang.Throwable -> L50
            goto L5d
        L56:
            r3 = move-exception
        L57:
            r2.f394350a = r6
            r3.getMessage()
            r0 = r5
        L5d:
            if (r0 == 0) goto L62
            r0.disconnect()
        L62:
            T r3 = r2.f394352c
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L6a
        L68:
            r2.f394350a = r6
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.M1.a(java.lang.String, java.lang.String, java.util.HashMap, android.content.Context):java.lang.Object");
    }
}
