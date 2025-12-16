package com.yandex.metrica.impl.ob;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C38756dg;

/* renamed from: com.yandex.metrica.impl.ob.qg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39079qg implements InterfaceC38930kg {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InstallReferrerClient f381579a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f381580b;

    @j.k0
    public C39079qg(@j.N InstallReferrerClient installReferrerClient, @j.N ICommonExecutor iCommonExecutor) {
        this.f381579a = installReferrerClient;
        this.f381580b = iCommonExecutor;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38930kg
    public void a(@j.N InterfaceC39198vg interfaceC39198vg) {
        this.f381579a.startConnection(new a(interfaceC39198vg));
    }

    public static void a(C39079qg c39079qg, InterfaceC39198vg interfaceC39198vg, Throwable th2) {
        c39079qg.f381580b.execute(new RunnableC39102rg(c39079qg, interfaceC39198vg, th2));
    }

    /* renamed from: com.yandex.metrica.impl.ob.qg$a */
    public class a implements InstallReferrerStateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC39198vg f381581a;

        /* renamed from: com.yandex.metrica.impl.ob.qg$a$a, reason: collision with other inner class name */
        public class RunnableC10962a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C38756dg f381583a;

            public RunnableC10962a(C38756dg c38756dg) {
                this.f381583a = c38756dg;
            }

            @Override // java.lang.Runnable
            @j.l0
            public void run() {
                a.this.f381581a.a(this.f381583a);
            }
        }

        public a(InterfaceC39198vg interfaceC39198vg) {
            this.f381581a = interfaceC39198vg;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        @j.K
        public void onInstallReferrerSetupFinished(int i12) {
            if (i12 == 0) {
                try {
                    ReferrerDetails installReferrer = C39079qg.this.f381579a.getInstallReferrer();
                    C39079qg.this.f381580b.execute(new RunnableC10962a(new C38756dg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), C38756dg.a.GP)));
                } catch (Throwable th2) {
                    C39079qg.a(C39079qg.this, this.f381581a, th2);
                }
            } else {
                C39079qg.a(C39079qg.this, this.f381581a, new IllegalStateException(AK.c.g(i12, "Referrer check failed with error ")));
            }
            try {
                C39079qg.this.f381579a.endConnection();
            } catch (Throwable unused) {
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        @j.K
        public void onInstallReferrerServiceDisconnected() {
        }
    }
}
