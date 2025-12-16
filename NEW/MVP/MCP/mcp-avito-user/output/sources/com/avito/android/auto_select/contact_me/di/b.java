package com.avito.android.auto_select.contact_me.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment;
import com.avito.android.auto_select.contact_me.di.a;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeBottomSheetOpenArguments;
import com.avito.android.auto_select.contact_me.mvi.h;
import com.avito.android.auto_select.contact_me.mvi.j;
import com.avito.android.auto_select.contact_me.r;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import p002if.InterfaceC41393a;

/* compiled from: DaggerAutoSelectContactMeComponent.java */
@e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerAutoSelectContactMeComponent.java */
    /* renamed from: com.avito.android.auto_select.contact_me.di.b$b, reason: collision with other inner class name */
    public static final class C2839b implements com.avito.android.auto_select.contact_me.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.auto_select.contact_me.mvi.e f95961a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f95962b;

        /* renamed from: c, reason: collision with root package name */
        public final j f95963c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f95964d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f95965e;

        /* renamed from: f, reason: collision with root package name */
        public final r f95966f;

        /* compiled from: DaggerAutoSelectContactMeComponent.java */
        /* renamed from: com.avito.android.auto_select.contact_me.di.b$b$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC41393a f95967a;

            public a(InterfaceC41393a interfaceC41393a) {
                this.f95967a = interfaceC41393a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f95967a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAutoSelectContactMeComponent.java */
        /* renamed from: com.avito.android.auto_select.contact_me.di.b$b$b, reason: collision with other inner class name */
        public static final class C2840b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC41393a f95968a;

            public C2840b(InterfaceC41393a interfaceC41393a) {
                this.f95968a = interfaceC41393a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f95968a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C2839b(cv.b bVar, InterfaceC41393a interfaceC41393a, C28478k c28478k, AutoSelectContactMeBottomSheetOpenArguments autoSelectContactMeBottomSheetOpenArguments, a aVar) {
            this.f95961a = new com.avito.android.auto_select.contact_me.mvi.e(l.a(autoSelectContactMeBottomSheetOpenArguments));
            this.f95963c = new j(new a(interfaceC41393a));
            this.f95964d = new C2840b(interfaceC41393a);
            this.f95965e = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f95964d);
            this.f95966f = new r(new h(com.avito.android.auto_select.contact_me.mvi.c.a(), com.avito.android.auto_select.contact_me.mvi.l.a(), this.f95961a, this.f95963c, this.f95965e));
        }

        @Override // com.avito.android.auto_select.contact_me.di.a
        public final void a(AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment) {
            autoSelectContactMeBottomSheetFragment.f95930h0 = this.f95966f;
            autoSelectContactMeBottomSheetFragment.f95932j0 = this.f95965e.get();
        }
    }

    /* compiled from: DaggerAutoSelectContactMeComponent.java */
    public static final class c implements a.InterfaceC2838a {
        public c() {
        }

        @Override // com.avito.android.auto_select.contact_me.di.a.InterfaceC2838a
        public final com.avito.android.auto_select.contact_me.di.a a(InterfaceC39417a interfaceC39417a, InterfaceC41393a interfaceC41393a, C28478k c28478k, AutoSelectContactMeBottomSheetOpenArguments autoSelectContactMeBottomSheetOpenArguments) {
            interfaceC39417a.getClass();
            autoSelectContactMeBottomSheetOpenArguments.getClass();
            return new C2839b(interfaceC39417a, interfaceC41393a, c28478k, autoSelectContactMeBottomSheetOpenArguments, null);
        }
    }

    public static a.InterfaceC2838a a() {
        return new c();
    }
}
