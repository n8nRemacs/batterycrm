package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    final C37848w f365875a;

    /* renamed from: b, reason: collision with root package name */
    final f2 f365876b;

    /* renamed from: c, reason: collision with root package name */
    final Context f365877c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f365878a;

        /* renamed from: b, reason: collision with root package name */
        public final String f365879b;

        /* renamed from: c, reason: collision with root package name */
        public final String f365880c;

        public a(int i12, String str, String str2) {
            this.f365878a = i12;
            this.f365879b = str;
            this.f365880c = str2;
        }
    }

    public y0(C37848w c37848w, f2 f2Var, Context context) {
        this.f365875a = c37848w;
        this.f365876b = f2Var;
        this.f365877c = context.getApplicationContext();
    }

    public a a() {
        if (!this.f365876b.s()) {
            e2.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a aVarB = b();
        if (aVarB != null) {
            return aVarB;
        }
        a aVarA = a(1);
        if (aVarA != null) {
            return aVarA;
        }
        if (this.f365876b.t()) {
            return a(2);
        }
        return null;
    }

    public a b() {
        String strF = androidx.camera.camera2.internal.G.f("ro.mtpi.", this.f365876b.g());
        String strA = h1.a(strF);
        if (TextUtils.isEmpty(strA)) {
            e2.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        e2.a("PreInstallHandler: raw data in SystemProperties has been found: " + strA);
        return a(3, strA, strF);
    }

    @Deprecated
    public void c() {
        String strN = this.f365876b.n();
        if (TextUtils.isEmpty(strN)) {
            return;
        }
        z0 z0VarA = z0.a(this.f365877c);
        if (z0VarA.p()) {
            return;
        }
        e2.a("PreInstallHandler: checking preinstall");
        try {
            String strA = a(this.f365877c.getPackageManager().getResourcesForApplication(strN), this.f365877c.getPackageName(), strN);
            z0VarA.t();
            if (TextUtils.isEmpty(strA)) {
                e2.a("PreInstallHandler: referrer is empty");
                return;
            }
            e2.a("PreInstallHandler: referrer " + strA);
            this.f365875a.a(strA, AbstractC37840n.b(this.f365877c), (Runnable) null);
            z0.a(this.f365877c).u();
        } catch (Throwable unused) {
            e2.a("PreInstallHandler: unable to locate vendor app " + strN);
        }
    }

    public a a(int i12) {
        String string;
        String str;
        StringBuilder sb2;
        if (i12 == 1) {
            str = "ro.mytracker.preinstall.path";
        } else {
            if (i12 != 2) {
                string = "PreInstallHandler: wrong property property key";
                e2.a(string);
                return null;
            }
            str = "ro.appsflyer.preinstall.path";
        }
        String strA = h1.a(str);
        if (TextUtils.isEmpty(strA)) {
            sb2 = new StringBuilder("PreInstallHandler: empty path for source: ");
        } else {
            String strA2 = a(strA);
            if (!TextUtils.isEmpty(strA2)) {
                e2.a("PreInstallHandler: raw data for source has been found: " + strA2);
                return a(i12, strA2, strA);
            }
            sb2 = new StringBuilder("PreInstallHandler: empty data for source: ");
        }
        sb2.append(i12);
        string = sb2.toString();
        e2.a(string);
        return null;
    }

    public static a a(int i12, String str, String str2) {
        try {
            e2.a("PreInstallHandler: converting raw data to json");
            return new a(i12, new JSONObject(str).toString(), str2);
        } catch (Throwable th2) {
            e2.a("PreInstallHandler error: exception when converting raw data to json", th2);
            try {
                e2.a("PreInstallHandler: converting raw data to json with pid");
                return new a(i12, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th3) {
                e2.b("PreInstallHandler error: exception when converting raw data to json with pid", th3);
                e2.a("PreInstallHandler: nothing has been found for source: " + i12);
                return null;
            }
        }
    }

    public static y0 a(C37848w c37848w, f2 f2Var, Context context) {
        return new y0(c37848w, f2Var, context);
    }

    public static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:41|4|(3:6|(1:47)(3:44|10|(3:37|12|13)(1:48))|45))|35|16) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "PreInstallHandler: searching string in file "
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L71
            r2.append(r8)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L71
            com.my.tracker.obfuscated.e2.a(r0)     // Catch: java.lang.Throwable -> L71
            android.content.Context r0 = r7.f365877c     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r2.<init>()     // Catch: java.lang.Throwable -> L71
            r2.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "="
            r2.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L71
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L71
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L71
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L71
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L71
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L71
        L37:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L6d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = "PreInstallHandler: processing string "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6b
            r5.append(r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6b
            com.my.tracker.obfuscated.e2.a(r5)     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L37
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L6b
            if (r5 <= r2) goto L37
            java.lang.String r4 = r4.substring(r2)     // Catch: java.lang.Throwable -> L6b
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L6b
            if (r5 != 0) goto L37
            r3.close()     // Catch: java.lang.Throwable -> L6a
        L6a:
            return r4
        L6b:
            r0 = move-exception
            goto L73
        L6d:
            r3.close()     // Catch: java.lang.Throwable -> L8a
            goto L8a
        L71:
            r0 = move-exception
            r3 = r1
        L73:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r2.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "PreInstallHandler error: exception while retrieving data in file"
            r2.append(r4)     // Catch: java.lang.Throwable -> L8b
            r2.append(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L8b
            com.my.tracker.obfuscated.e2.b(r8, r0)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L8a
            goto L6d
        L8a:
            return r1
        L8b:
            r8 = move-exception
            if (r3 == 0) goto L91
            r3.close()     // Catch: java.lang.Throwable -> L91
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.y0.a(java.lang.String):java.lang.String");
    }
}
