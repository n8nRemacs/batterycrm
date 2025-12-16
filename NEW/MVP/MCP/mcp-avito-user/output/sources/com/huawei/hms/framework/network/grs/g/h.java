package com.huawei.hms.framework.network.grs.g;

import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public class h extends a implements Callable<e> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Type inference failed for: r10v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r15v2 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.hms.framework.network.grs.g.e call() throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            com.huawei.hms.framework.network.grs.g.d r2 = r1.f363531d
            java.lang.String r3 = r1.f363530c
            java.lang.String r0 = "Get call execute"
            java.lang.String r4 = "f"
            com.huawei.hms.framework.common.Logger.i(r4, r0)
            r5 = 0
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L8a
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L29
            android.content.Context r0 = r1.f363532e     // Catch: java.io.IOException -> L29
            java.lang.String r9 = r1.f363533f     // Catch: java.io.IOException -> L29
            javax.net.ssl.HttpsURLConnection r0 = u01.C48757a.a(r0, r3, r9)     // Catch: java.io.IOException -> L29
            r9 = 0
            if (r0 != 0) goto L30
            java.lang.String r0 = "create HttpsURLConnection instance by url return null."
            com.huawei.hms.framework.common.Logger.w(r4, r0)     // Catch: java.io.IOException -> L29
            goto Lb2
        L29:
            r0 = move-exception
            r20 = r5
            r5 = r7
            r7 = r20
            goto L8c
        L30:
            java.lang.String r10 = "GET"
            r0.setRequestMethod(r10)     // Catch: java.io.IOException -> L29
            if (r2 == 0) goto L3a
            java.lang.String r10 = r2.f363556l     // Catch: java.io.IOException -> L29
            goto L3c
        L3a:
            java.lang.String r10 = ""
        L3c:
            java.lang.String r11 = "If-None-Match"
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch: java.io.IOException -> L29
            if (r12 == 0) goto L46
            java.lang.String r10 = "&"
        L46:
            r0.setRequestProperty(r11, r10)     // Catch: java.io.IOException -> L29
            r0.connect()     // Catch: java.io.IOException -> L29
            int r13 = r0.getResponseCode()     // Catch: java.io.IOException -> L29
            r10 = 200(0xc8, float:2.8E-43)
            if (r13 != r10) goto L66
            java.io.InputStream r9 = r0.getInputStream()     // Catch: java.lang.Throwable -> L61
            byte[] r10 = com.huawei.hms.framework.common.IoUtils.toByteArray(r9)     // Catch: java.lang.Throwable -> L61
            com.huawei.hms.framework.common.IoUtils.closeSecure(r9)     // Catch: java.io.IOException -> L29
            r9 = r10
            goto L66
        L61:
            r0 = move-exception
            com.huawei.hms.framework.common.IoUtils.closeSecure(r9)     // Catch: java.io.IOException -> L29
            throw r0     // Catch: java.io.IOException -> L29
        L66:
            java.util.Map r14 = r0.getHeaderFields()     // Catch: java.io.IOException -> L29
            r0.disconnect()     // Catch: java.io.IOException -> L29
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L29
            long r18 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L29
            if (r9 != 0) goto L7c
            r0 = 0
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L29
            r15 = r0
            goto L7d
        L7c:
            r15 = r9
        L7d:
            com.huawei.hms.framework.network.grs.g.e r0 = new com.huawei.hms.framework.network.grs.g.e     // Catch: java.io.IOException -> L29
            long r16 = r10 - r7
            r12 = r0
            r12.<init>(r13, r14, r15, r16)     // Catch: java.io.IOException -> L29
            r1.f363529b = r0     // Catch: java.io.IOException -> L29
        L87:
            r7 = r18
            goto La3
        L8a:
            r0 = move-exception
            r7 = r5
        L8c:
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r18 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "RequestCallable run task catch IOException"
            com.huawei.hms.framework.common.Logger.w(r4, r11, r0)
            com.huawei.hms.framework.network.grs.g.e r4 = new com.huawei.hms.framework.network.grs.g.e
            long r9 = r9 - r5
            r4.<init>(r0, r9)
            r1.f363529b = r4
            r5 = r7
            goto L87
        La3:
            com.huawei.hms.framework.network.grs.g.e r0 = r1.f363529b
            r0.f363571n = r3
            r0.f363562e = r5
            r0.f363563f = r7
            if (r2 == 0) goto Lb0
            r2.b(r0)
        Lb0:
            com.huawei.hms.framework.network.grs.g.e r9 = r1.f363529b
        Lb2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.h.call():java.lang.Object");
    }
}
