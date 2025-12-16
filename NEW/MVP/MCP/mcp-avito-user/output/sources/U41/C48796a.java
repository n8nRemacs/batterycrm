package u41;

import android.content.Context;
import x41.InterfaceC49766c;

/* compiled from: AndroidEventBuilderHelper.java */
/* renamed from: u41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48796a implements InterfaceC49766c {

    /* renamed from: b, reason: collision with root package name */
    public static final Boolean f439787b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f439788c;

    /* renamed from: d, reason: collision with root package name */
    public static String[] f439789d;

    /* renamed from: a, reason: collision with root package name */
    public Context f439790a;

    /* JADX WARN: Can't wrap try/catch for region: R(6:31|(2:56|32)|50|33|45|46) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    static {
        /*
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = "generic"
            r2 = 0
            java.lang.String r3 = android.os.Build.FINGERPRINT     // Catch: java.lang.Exception -> L58
            boolean r4 = r3.startsWith(r1)     // Catch: java.lang.Exception -> L58
            if (r4 != 0) goto L52
            java.lang.String r4 = "unknown"
            boolean r3 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L58
            if (r3 != 0) goto L52
            java.lang.String r3 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L58
            boolean r4 = r3.contains(r0)     // Catch: java.lang.Exception -> L58
            if (r4 != 0) goto L52
            java.lang.String r4 = "Emulator"
            boolean r4 = r3.contains(r4)     // Catch: java.lang.Exception -> L58
            if (r4 != 0) goto L52
            java.lang.String r4 = "Android SDK built for x86"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Exception -> L58
            if (r3 != 0) goto L52
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = "Genymotion"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Exception -> L58
            if (r3 != 0) goto L52
            java.lang.String r3 = android.os.Build.BRAND     // Catch: java.lang.Exception -> L58
            boolean r3 = r3.startsWith(r1)     // Catch: java.lang.Exception -> L58
            if (r3 == 0) goto L47
            java.lang.String r3 = android.os.Build.DEVICE     // Catch: java.lang.Exception -> L58
            boolean r1 = r3.startsWith(r1)     // Catch: java.lang.Exception -> L58
            if (r1 != 0) goto L52
        L47:
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch: java.lang.Exception -> L58
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L58
            if (r0 == 0) goto L50
            goto L52
        L50:
            r0 = 0
            goto L53
        L52:
            r0 = 1
        L53:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L58
            goto L59
        L58:
            r0 = r2
        L59:
            u41.C48796a.f439787b = r0
            java.lang.String r0 = "os.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r3 = "/proc/version"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            boolean r3 = r1.canRead()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            if (r3 != 0) goto L6f
            goto L91
        L6f:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L8e
        L7d:
            r3.close()     // Catch: java.io.IOException -> L91
            goto L91
        L81:
            r0 = move-exception
            r2 = r3
            goto L88
        L84:
            r0 = move-exception
            goto L88
        L86:
            r3 = r2
            goto L8e
        L88:
            if (r2 == 0) goto L8d
            r2.close()     // Catch: java.io.IOException -> L8d
        L8d:
            throw r0
        L8e:
            if (r3 == 0) goto L91
            goto L7d
        L91:
            u41.C48796a.f439788c = r0
            u41.C48796a.f439789d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u41.C48796a.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    @Override // x41.InterfaceC49766c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(io.sentry.event.b r32) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u41.C48796a.a(io.sentry.event.b):void");
    }
}
