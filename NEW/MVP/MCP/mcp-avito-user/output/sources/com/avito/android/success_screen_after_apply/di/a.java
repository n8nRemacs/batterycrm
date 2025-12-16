package com.avito.android.success_screen_after_apply.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.success_screen_after_apply.di.b;
import com.avito.android.success_screen_after_apply.mvi.h;
import com.avito.android.success_screen_after_apply.mvi.o;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyDialogFragment;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyOpenParams;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hA0.C40794b;

/* compiled from: DaggerSuccessScreenAfterApplyComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerSuccessScreenAfterApplyComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.success_screen_after_apply.di.b.a
        public final com.avito.android.success_screen_after_apply.di.b a(SuccessScreenAfterApplyOpenParams successScreenAfterApplyOpenParams, com.avito.android.success_screen_after_apply.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, successScreenAfterApplyOpenParams, null);
        }
    }

    /* compiled from: DaggerSuccessScreenAfterApplyComponent.java */
    public static final class c implements com.avito.android.success_screen_after_apply.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.success_screen_after_apply.di.c f291716a;

        /* renamed from: b, reason: collision with root package name */
        public final l f291717b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f291718c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f291719d;

        /* renamed from: e, reason: collision with root package name */
        public final o f291720e;

        /* compiled from: DaggerSuccessScreenAfterApplyComponent.java */
        /* renamed from: com.avito.android.success_screen_after_apply.di.a$c$a, reason: collision with other inner class name */
        public static final class C8833a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.success_screen_after_apply.di.c f291721a;

            public C8833a(com.avito.android.success_screen_after_apply.di.c cVar) {
                this.f291721a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f291721a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSuccessScreenAfterApplyComponent.java */
        public static final class b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.success_screen_after_apply.di.c f291722a;

            public b(com.avito.android.success_screen_after_apply.di.c cVar) {
                this.f291722a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f291722a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        public c(com.avito.android.success_screen_after_apply.di.c cVar, cv.b bVar, SuccessScreenAfterApplyOpenParams successScreenAfterApplyOpenParams, C8832a c8832a) {
            this.f291716a = cVar;
            l lVarA = l.a(successScreenAfterApplyOpenParams);
            this.f291717b = lVarA;
            this.f291720e = new o(new h(new com.avito.android.success_screen_after_apply.mvi.e(lVarA, new C40794b(lVarA, new C8833a(cVar), new b(cVar))), com.avito.android.success_screen_after_apply.mvi.l.a(), this.f291717b));
        }

        @Override // com.avito.android.success_screen_after_apply.di.b
        public final void a(SuccessScreenAfterApplyDialogFragment successScreenAfterApplyDialogFragment) {
            com.avito.android.analytics.provider.a aVarV = this.f291716a.v();
            t.c(aVarV);
            successScreenAfterApplyDialogFragment.f291752h0 = aVarV;
            successScreenAfterApplyDialogFragment.f291753i0 = this.f291720e;
        }
    }

    public static b.a a() {
        return new b();
    }
}
