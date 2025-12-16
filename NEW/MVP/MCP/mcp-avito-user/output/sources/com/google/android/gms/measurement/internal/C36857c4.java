package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@j.k0
@j.K
/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36857c4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f355056b;

    public C36857c4(C36967s3 c36967s3) {
        this.f355056b = c36967s3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r10, android.os.Bundle r11) {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.s3 r0 = r9.f355056b
            com.google.android.gms.measurement.internal.S1 r1 = r0.zzj()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            com.google.android.gms.measurement.internal.U1 r1 = r1.f354897n     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            java.lang.String r2 = "onActivityCreated"
            r1.b(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            android.content.Intent r1 = r10.getIntent()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r1 != 0) goto L1b
            com.google.android.gms.measurement.internal.n4 r0 = r0.g()
            r0.n(r10, r11)
            return
        L1b:
            android.net.Uri r2 = r1.getData()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L2e
            boolean r3 = r2.isHierarchical()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r3 == 0) goto L2e
        L27:
            r6 = r2
            goto L47
        L29:
            r1 = move-exception
            goto L9e
        L2c:
            r1 = move-exception
            goto L8b
        L2e:
            android.os.Bundle r2 = r1.getExtras()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L45
            java.lang.String r3 = "com.android.vending.referral_url"
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r3 != 0) goto L45
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            goto L27
        L45:
            r2 = 0
            goto L27
        L47:
            if (r6 == 0) goto L83
            boolean r2 = r6.isHierarchical()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 != 0) goto L50
            goto L83
        L50:
            r0.c()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            boolean r1 = com.google.android.gms.measurement.internal.N5.O(r1)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r1 == 0) goto L5d
            java.lang.String r1 = "gs"
        L5b:
            r7 = r1
            goto L60
        L5d:
            java.lang.String r1 = "auto"
            goto L5b
        L60:
            java.lang.String r1 = "referrer"
            java.lang.String r8 = r6.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r11 != 0) goto L6b
            r1 = 1
        L69:
            r5 = r1
            goto L6d
        L6b:
            r1 = 0
            goto L69
        L6d:
            com.google.android.gms.measurement.internal.A2 r1 = r0.zzl()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            com.google.android.gms.measurement.internal.g4 r2 = new com.google.android.gms.measurement.internal.g4     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            r3 = r2
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            r1.n(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            com.google.android.gms.measurement.internal.n4 r0 = r0.g()
            r0.n(r10, r11)
            return
        L83:
            com.google.android.gms.measurement.internal.n4 r0 = r0.g()
            r0.n(r10, r11)
            return
        L8b:
            com.google.android.gms.measurement.internal.S1 r2 = r0.zzj()     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.measurement.internal.U1 r2 = r2.f354889f     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.c(r3, r1)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.measurement.internal.n4 r0 = r0.g()
            r0.n(r10, r11)
            return
        L9e:
            com.google.android.gms.measurement.internal.n4 r0 = r0.g()
            r0.n(r10, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36857c4.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C36934n4 c36934n4G = this.f355056b.g();
        synchronized (c36934n4G.f355286l) {
            try {
                if (activity == c36934n4G.f355281g) {
                    c36934n4G.f355281g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c36934n4G.f355183a.f354715g.t()) {
            c36934n4G.f355280f.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @j.K
    public final void onActivityPaused(Activity activity) {
        C36967s3 c36967s3 = this.f355056b;
        c36967s3.g().u(activity);
        C36879f5 c36879f5H = c36967s3.h();
        c36879f5H.f355183a.f354722n.getClass();
        c36879f5H.zzl().n(new RunnableC36900i5(c36879f5H, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @j.K
    public final void onActivityResumed(Activity activity) {
        C36967s3 c36967s3 = this.f355056b;
        C36879f5 c36879f5H = c36967s3.h();
        c36879f5H.f355183a.f354722n.getClass();
        c36879f5H.zzl().n(new RunnableC36872e5(c36879f5H, SystemClock.elapsedRealtime()));
        c36967s3.g().v(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C36941o4 c36941o4;
        C36934n4 c36934n4G = this.f355056b.g();
        if (!c36934n4G.f355183a.f354715g.t() || bundle == null || (c36941o4 = (C36941o4) c36934n4G.f355280f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c36941o4.f355294c);
        bundle2.putString("name", c36941o4.f355292a);
        bundle2.putString("referrer_name", c36941o4.f355293b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
