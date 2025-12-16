package com.avito.android.re_agent_landing.landing.error_dialog.di;

import com.avito.android.re_agent_landing.landing.error_dialog.ReAgentProfileCreateLandingErrorDialogFragment;
import com.avito.android.re_agent_landing.landing.error_dialog.di.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerReAgentProfileCreateLandingErrorComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerReAgentProfileCreateLandingErrorComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.re_agent_landing.landing.error_dialog.di.b.a
        public final com.avito.android.re_agent_landing.landing.error_dialog.di.b a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerReAgentProfileCreateLandingErrorComponent.java */
    public static final class c implements com.avito.android.re_agent_landing.landing.error_dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f250620a;

        public c(cv.b bVar, C7514a c7514a) {
            this.f250620a = bVar;
        }

        @Override // com.avito.android.re_agent_landing.landing.error_dialog.di.b
        public final void a(ReAgentProfileCreateLandingErrorDialogFragment reAgentProfileCreateLandingErrorDialogFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f250620a.u4();
            t.c(aVarU4);
            reAgentProfileCreateLandingErrorDialogFragment.f250616h0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
