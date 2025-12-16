package e11;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: e11.l1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39885l1 extends F1<String> {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f394680d = StandardCharsets.UTF_8;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.String] */
    @Override // e11.F1
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@j.N java.lang.String r4, @j.P java.lang.String r5, @j.P java.util.HashMap r6, @j.N android.content.Context r7) {
        /*
            r3 = this;
            r7 = 0
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> Lbe
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lbe
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> Lbe
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> Lbe
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L46
            r4.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L46
            r0 = 1
            r4.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "connection"
            java.lang.String r2 = "close"
            r4.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L4a
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L46
        L2a:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L46
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L46
            r4.setRequestProperty(r2, r1)     // Catch: java.lang.Throwable -> L46
            goto L2a
        L46:
            r5 = move-exception
            r0 = r4
            goto Lbf
        L4a:
            if (r5 == 0) goto L76
            r4.setDoOutput(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = "POST"
            r4.setRequestMethod(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = "Content-Type"
            java.lang.String r0 = "application/x-mtrgdata-v1"
            r4.setRequestProperty(r6, r0)     // Catch: java.lang.Throwable -> L46
            java.io.OutputStream r6 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L46
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L6a
            r6.write(r5)     // Catch: java.lang.Throwable -> L6a
            r6.close()     // Catch: java.lang.Throwable -> L46
            goto L79
        L6a:
            r5 = move-exception
            if (r6 == 0) goto L75
            r6.close()     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L46
        L75:
            throw r5     // Catch: java.lang.Throwable -> L46
        L76:
            r4.connect()     // Catch: java.lang.Throwable -> L46
        L79:
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L46
            r3.f394351b = r5     // Catch: java.lang.Throwable -> L46
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto Lb7
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L46
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L46
            java.io.InputStream r0 = r4.getInputStream()     // Catch: java.lang.Throwable -> L46
            java.nio.charset.Charset r1 = e11.C39885l1.f394680d     // Catch: java.lang.Throwable -> L46
            r6.<init>(r0, r1)     // Catch: java.lang.Throwable -> L46
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r6.<init>()     // Catch: java.lang.Throwable -> La2
        L98:
            java.lang.String r0 = r5.readLine()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La4
            r6.append(r0)     // Catch: java.lang.Throwable -> La2
            goto L98
        La2:
            r6 = move-exception
            goto Lae
        La4:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La2
            r3.f394352c = r6     // Catch: java.lang.Throwable -> La2
            r5.close()     // Catch: java.lang.Throwable -> L46
            goto Lc5
        Lae:
            r5.close()     // Catch: java.lang.Throwable -> Lb2
            goto Lb6
        Lb2:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L46
        Lb6:
            throw r6     // Catch: java.lang.Throwable -> L46
        Lb7:
            r6 = 204(0xcc, float:2.86E-43)
            if (r5 == r6) goto Lc5
            r3.f394350a = r7     // Catch: java.lang.Throwable -> L46
            goto Lc5
        Lbe:
            r5 = move-exception
        Lbf:
            r3.f394350a = r7
            r5.getMessage()
            r4 = r0
        Lc5:
            if (r4 == 0) goto Lca
            r4.disconnect()
        Lca:
            T r4 = r3.f394352c
            java.lang.String r4 = (java.lang.String) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39885l1.a(java.lang.String, java.lang.String, java.util.HashMap, android.content.Context):java.lang.Object");
    }
}
