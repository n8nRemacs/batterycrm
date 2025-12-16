package com.google.firebase.crashlytics.internal.settings;

import com.google.android.gms.tasks.InterfaceC37027j;

/* compiled from: SettingsController.java */
/* loaded from: classes4.dex */
class f implements InterfaceC37027j<Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f361469a;

    public f(g gVar) {
        this.f361469a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    @Override // com.google.android.gms.tasks.InterfaceC37027j
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.tasks.Task<java.lang.Void> a(@j.P java.lang.Void r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Void r11 = (java.lang.Void) r11
            com.google.firebase.crashlytics.internal.settings.g r11 = r10.f361469a
            com.google.firebase.crashlytics.internal.settings.c r0 = r11.f361475f
            com.google.firebase.crashlytics.internal.settings.l r1 = r11.f361471b
            r0.getClass()
            com.google.firebase.crashlytics.internal.d r2 = com.google.firebase.crashlytics.internal.d.f361031a
            r3 = 2
            r4 = 3
            r5 = 0
            java.util.HashMap r6 = com.google.firebase.crashlytics.internal.settings.c.c(r1)     // Catch: java.io.IOException -> L65
            lZ0.a r7 = new lZ0.a     // Catch: java.io.IOException -> L65
            java.lang.String r0 = r0.f361454a     // Catch: java.io.IOException -> L65
            r7.<init>(r0, r6)     // Catch: java.io.IOException -> L65
            java.util.HashMap r0 = r7.f413901c     // Catch: java.io.IOException -> L65
            java.lang.String r8 = "User-Agent"
            java.lang.String r9 = "Crashlytics Android SDK/18.3.7"
            r0.put(r8, r9)     // Catch: java.io.IOException -> L65
            java.lang.String r8 = "X-CRASHLYTICS-DEVELOPER-TOKEN"
            java.lang.String r9 = "470fa2b4ae81cd56ecbcda9735803434cec591fa"
            r0.put(r8, r9)     // Catch: java.io.IOException -> L65
            com.google.firebase.crashlytics.internal.settings.c.a(r7, r1)     // Catch: java.io.IOException -> L65
            r2.a(r4)     // Catch: java.io.IOException -> L65
            r6.toString()     // Catch: java.io.IOException -> L65
            r2.a(r3)     // Catch: java.io.IOException -> L65
            lZ0.c r0 = r7.b()     // Catch: java.io.IOException -> L65
            r2.a(r3)     // Catch: java.io.IOException -> L65
            int r6 = r0.f413902a     // Catch: java.io.IOException -> L65
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 == r7) goto L55
            r7 = 201(0xc9, float:2.82E-43)
            if (r6 == r7) goto L55
            r7 = 202(0xca, float:2.83E-43)
            if (r6 == r7) goto L55
            r7 = 203(0xcb, float:2.84E-43)
            if (r6 != r7) goto L51
            goto L55
        L51:
            r2.b()     // Catch: java.io.IOException -> L65
            goto L68
        L55:
            java.lang.String r0 = r0.f413903b     // Catch: java.io.IOException -> L65
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5d
            r6.<init>(r0)     // Catch: java.lang.Exception -> L5d
            goto L69
        L5d:
            r0 = 5
            r2.a(r0)     // Catch: java.io.IOException -> L65
            r2.a(r0)     // Catch: java.io.IOException -> L65
            goto L68
        L65:
            r2.b()
        L68:
            r6 = r5
        L69:
            if (r6 == 0) goto Ld1
            com.google.firebase.crashlytics.internal.settings.i r0 = r11.f361472c
            com.google.firebase.crashlytics.internal.settings.d r0 = r0.a(r6)
            long r7 = r0.f361457c
            com.google.firebase.crashlytics.internal.settings.a r9 = r11.f361474e
            r9.getClass()
            r2.a(r3)
            java.lang.String r3 = "expires_at"
            r6.put(r3, r7)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.io.File r7 = r9.f361453a     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r7 = r6.toString()     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L9b
            r3.write(r7)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L9b
            r3.flush()     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L9b
        L91:
            com.google.firebase.crashlytics.internal.common.C37586h.a(r3)
            goto L9f
        L95:
            r11 = move-exception
            r5 = r3
            goto Lcd
        L98:
            r11 = move-exception
            goto Lcd
        L9a:
            r3 = r5
        L9b:
            r2.b()     // Catch: java.lang.Throwable -> L95
            goto L91
        L9f:
            r6.toString()
            r2.a(r4)
            java.lang.String r1 = r1.f361485f
            java.lang.String r2 = "com.google.firebase.crashlytics"
            r3 = 0
            android.content.Context r4 = r11.f361470a
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "existing_instance_identifier"
            r2.putString(r3, r1)
            r2.apply()
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.settings.d> r1 = r11.f361477h
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.k<com.google.firebase.crashlytics.internal.settings.d>> r11 = r11.f361478i
            java.lang.Object r11 = r11.get()
            com.google.android.gms.tasks.k r11 = (com.google.android.gms.tasks.C37028k) r11
            r11.d(r0)
            goto Ld1
        Lcd:
            com.google.firebase.crashlytics.internal.common.C37586h.a(r5)
            throw r11
        Ld1:
            com.google.android.gms.tasks.Task r11 = com.google.android.gms.tasks.C37030m.f(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.settings.f.a(java.lang.Object):com.google.android.gms.tasks.Task");
    }
}
