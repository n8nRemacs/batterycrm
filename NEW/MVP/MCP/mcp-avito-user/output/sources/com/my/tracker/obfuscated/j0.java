package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;

/* loaded from: classes7.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    static int f365675f = 3;

    /* renamed from: g, reason: collision with root package name */
    static volatile j0 f365676g;

    /* renamed from: a, reason: collision with root package name */
    final C37848w f365677a;

    /* renamed from: b, reason: collision with root package name */
    final C37836j f365678b;

    /* renamed from: c, reason: collision with root package name */
    final Context f365679c;

    /* renamed from: d, reason: collision with root package name */
    InstallReferrerClient f365680d;

    /* renamed from: e, reason: collision with root package name */
    int f365681e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            e2.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + j0.this.f365681e);
            j0.this.a(this);
        }

        public void onInstallReferrerSetupFinished(int i12) {
            if (i12 == -1) {
                j0.this.a(this);
            } else {
                e2.a("HuaweiReferrerHandler: install referrer setup is finished");
                j0.this.a(i12);
            }
        }
    }

    public j0(C37848w c37848w, C37836j c37836j, Context context) {
        this.f365677a = c37848w;
        this.f365678b = c37836j;
        this.f365679c = context.getApplicationContext();
    }

    public void a() {
        if (z0.a(this.f365679c).o()) {
            return;
        }
        try {
            e2.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.f365680d = InstallReferrerClient.newBuilder(this.f365679c).build();
            a(new a());
        } catch (Throwable th2) {
            e2.b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th2);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:17:0x0034). Please report as a decompilation issue!!! */
    public void a(int i12) {
        if (this.f365680d == null) {
            e2.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i12 == 0) {
                e2.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.f365680d.getInstallReferrer());
            } else {
                e2.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i12);
            }
        } catch (Throwable th2) {
            e2.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th2);
        }
        try {
            this.f365680d.endConnection();
        } catch (Throwable unused) {
        }
        this.f365680d = null;
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.f365680d == null) {
            e2.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i12 = this.f365681e;
        if (i12 >= f365675f) {
            e2.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.f365680d.endConnection();
            } catch (Throwable unused) {
            }
            this.f365680d = null;
            return;
        }
        this.f365681e = i12 + 1;
        try {
            e2.a("HuaweiReferrerHandler: connect to referrer client");
            this.f365680d.startConnection(installReferrerStateListener);
        } catch (Throwable th2) {
            e2.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th2);
            a(installReferrerStateListener);
        }
    }

    public void a(ReferrerDetails referrerDetails) {
        z0 z0VarA = z0.a(this.f365679c);
        if (z0VarA.o()) {
            e2.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        e2.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f365677a.b(installReferrer, AbstractC37840n.b(this.f365679c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f365678b.a(installReferrer);
        z0VarA.s();
    }

    public static void a(C37848w c37848w, C37836j c37836j, Context context) {
        if (f365676g != null) {
            return;
        }
        synchronized (j0.class) {
            try {
                if (f365676g != null) {
                    return;
                }
                j0 j0Var = new j0(c37848w, c37836j, context);
                C37835i.a(new J(j0Var, 1));
                f365676g = j0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
