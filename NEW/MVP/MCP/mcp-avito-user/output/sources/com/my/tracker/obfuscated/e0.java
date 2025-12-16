package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: f, reason: collision with root package name */
    static int f365596f = 3;

    /* renamed from: g, reason: collision with root package name */
    static volatile e0 f365597g;

    /* renamed from: a, reason: collision with root package name */
    final C37848w f365598a;

    /* renamed from: b, reason: collision with root package name */
    final C37836j f365599b;

    /* renamed from: c, reason: collision with root package name */
    final Context f365600c;

    /* renamed from: d, reason: collision with root package name */
    InstallReferrerClient f365601d;

    /* renamed from: e, reason: collision with root package name */
    int f365602e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            e2.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + e0.this.f365602e);
            e0.this.a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i12) {
            e2.a("ReferrerHandler: install referrer setup is finished");
            if (i12 == -1) {
                e0.this.a(this);
            } else {
                e0.this.a(i12);
            }
        }
    }

    public e0(C37848w c37848w, C37836j c37836j, Context context) {
        this.f365598a = c37848w;
        this.f365599b = c37836j;
        this.f365600c = context.getApplicationContext();
    }

    public void a() {
        if (z0.a(this.f365600c).n()) {
            return;
        }
        C37835i.f(new K(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        try {
            e2.a("ReferrerHandler: initialize InstallReferrerClient");
            this.f365601d = InstallReferrerClient.newBuilder(this.f365600c).build();
            a(new a());
        } catch (Throwable th2) {
            e2.b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th2);
        }
    }

    public void a(int i12) {
        if (this.f365601d == null) {
            e2.b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i12 == 0) {
                e2.a("ReferrerHandler: retrieving install referrer");
                C37835i.a(new H(7, this, this.f365601d.getInstallReferrer()));
            } else {
                e2.a("ReferrerHandler: InstallReferrerResponse code: " + i12);
            }
        } catch (Throwable th2) {
            e2.b("ReferrerHandler: error occurred while retrieving install referrer", th2);
        }
        try {
            this.f365601d.endConnection();
        } catch (Throwable unused) {
        }
        this.f365601d = null;
    }

    public void b() {
        z0 z0VarA = z0.a(this.f365600c);
        if (z0VarA.q()) {
            return;
        }
        String strL = z0VarA.l();
        if (TextUtils.isEmpty(strL)) {
            return;
        }
        a(strL, null);
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.f365601d;
        if (installReferrerClient == null) {
            e2.a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i12 = this.f365602e;
        if (i12 >= f365596f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.f365601d = null;
            return;
        }
        this.f365602e = i12 + 1;
        try {
            e2.a("ReferrerHandler: connect to referrer client");
            this.f365601d.startConnection(installReferrerStateListener);
        } catch (Throwable th2) {
            e2.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th2);
            a(installReferrerStateListener);
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(ReferrerDetails referrerDetails) {
        z0 z0VarA = z0.a(this.f365600c);
        if (z0VarA.n()) {
            e2.a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        e2.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f365598a.a(installReferrer, AbstractC37840n.b(this.f365600c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f365599b.a(installReferrer);
        z0VarA.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(e0 e0Var) {
        e0Var.b();
        e0Var.a();
    }

    public static void a(C37848w c37848w, C37836j c37836j, Context context) {
        if (f365597g != null) {
            return;
        }
        synchronized (e0.class) {
            try {
                if (f365597g != null) {
                    return;
                }
                e0 e0Var = new e0(c37848w, c37836j, context);
                C37835i.a(new K(e0Var, 1));
                f365597g = e0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(String str, Context context, Runnable runnable) {
        e0 e0Var = f365597g;
        if (e0Var != null) {
            e0Var.a(str, runnable);
            return;
        }
        z0 z0VarA = z0.a(context);
        if (!z0VarA.q()) {
            z0VarA.l(str);
        }
        runnable.run();
    }

    public void a(String str, Runnable runnable) {
        z0 z0VarA = z0.a(this.f365600c);
        if (z0VarA.q()) {
            e2.a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.f365598a.a(str, AbstractC37840n.b(this.f365600c), runnable);
        this.f365599b.a(str);
        z0VarA.u();
    }
}
