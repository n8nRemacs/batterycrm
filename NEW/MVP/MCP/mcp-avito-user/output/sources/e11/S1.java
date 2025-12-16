package e11;

import android.content.Context;

/* loaded from: classes7.dex */
public class S1 extends AbstractC39860d0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f394480b = false;

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@j.N android.content.Context r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "com.huawei.hms.ads.identifier.AdvertisingIdClient"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "getAdvertisingIdInfo"
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L68
            java.lang.Object[] r2 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L68
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "getId"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L37
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L6a
            goto L38
        L37:
            r2 = r0
        L38:
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L65
            java.lang.reflect.Method r3 = r3.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L65
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r3.invoke(r1, r4)     // Catch: java.lang.Throwable -> L65
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r3.<init>()     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L65
            r1 = r1 ^ 1
            r3.append(r1)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = ""
            r3.append(r1)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L65
        L65:
            r1 = r0
            r0 = r2
            goto L6c
        L68:
            r1 = r0
            goto L6c
        L6a:
            r2 = r0
            goto L65
        L6c:
            monitor-enter(r7)
            java.lang.String r2 = "oaid"
            r7.a(r2, r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "oaid_tracking_enabled"
            r7.a(r2, r1)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8b
            e11.r2 r2 = e11.r2.a(r8)
            java.lang.String r3 = "hoaid"
            r2.b(r3, r0)
            e11.r2 r8 = e11.r2.a(r8)
            java.lang.String r0 = "hlimit"
            r8.b(r0, r1)
            return
        L8b:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.S1.g(android.content.Context):void");
    }

    @j.l0
    public final synchronized void h(@j.N Context context) {
        try {
            if (m2.b()) {
                return;
            }
            if (this.f394480b) {
                return;
            }
            r2 r2VarA = r2.a(context);
            try {
                Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
                String strC = r2VarA.c("hoaid");
                String strC2 = r2VarA.c("hlimit");
                if (strC.length() == 0) {
                    g(context);
                } else {
                    a("oaid", strC);
                    a("oaid_tracking_enabled", strC2);
                    m2.c(new com.vk.id.captcha.web.h(17, this, context));
                }
                this.f394480b = true;
            } catch (Throwable unused) {
                r2VarA.b("hoaid", null);
                r2VarA.b("hlimit", null);
                this.f394480b = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
