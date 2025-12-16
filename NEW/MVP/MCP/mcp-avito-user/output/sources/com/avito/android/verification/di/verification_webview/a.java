package com.avito.android.verification.di.verification_webview;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.verification.di.verification_webview.b;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerVerificationWebViewComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVerificationWebViewComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.verification_webview.b.a
        public final com.avito.android.verification.di.verification_webview.b a(com.avito.android.verification.di.verification_webview.c cVar) {
            return new c(cVar, null);
        }
    }

    /* compiled from: DaggerVerificationWebViewComponent.java */
    public static final class c implements com.avito.android.verification.di.verification_webview.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.verification.di.verification_webview.c f323863a;

        public c(com.avito.android.verification.di.verification_webview.c cVar, C10028a c10028a) {
            this.f323863a = cVar;
        }

        @Override // com.avito.android.verification.di.verification_webview.b
        public final InterfaceC28373a getAnalytics() {
            InterfaceC28373a interfaceC28373aA = this.f323863a.a();
            t.c(interfaceC28373aA);
            return interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
