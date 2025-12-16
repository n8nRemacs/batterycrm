package com.avito.android.loyalty.di.badges_list;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.loyalty.di.badges_list.a;
import com.avito.android.loyalty.ui.badges_list.BadgesListActivity;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerBadgesListComponent.java */
@e
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: DaggerBadgesListComponent.java */
    public static final class b implements com.avito.android.loyalty.di.badges_list.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f183027a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.loyalty.di.badges_list.b f183028b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f183029c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f183030d;

        /* compiled from: DaggerBadgesListComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.badges_list.b f183031a;

            public a(com.avito.android.loyalty.di.badges_list.b bVar) {
                this.f183031a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f183031a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public b(cv.b bVar, com.avito.android.loyalty.di.badges_list.b bVar2, C28478k c28478k, a aVar) {
            this.f183027a = bVar;
            this.f183028b = bVar2;
            this.f183029c = new a(bVar2);
            this.f183030d = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f183029c);
        }

        @Override // com.avito.android.loyalty.di.badges_list.a
        public final void a(BadgesListActivity badgesListActivity) {
            badgesListActivity.f183359m = this.f183030d.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183027a.u4();
            t.c(aVarU4);
            badgesListActivity.f183361o = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f183028b.a();
            t.c(interfaceC28373aA);
            badgesListActivity.f183362p = interfaceC28373aA;
        }
    }

    /* compiled from: DaggerBadgesListComponent.java */
    /* renamed from: com.avito.android.loyalty.di.badges_list.c$c, reason: collision with other inner class name */
    public static final class C5366c implements a.InterfaceC5365a {
        public C5366c() {
        }

        @Override // com.avito.android.loyalty.di.badges_list.a.InterfaceC5365a
        public final com.avito.android.loyalty.di.badges_list.a a(C28478k c28478k, InterfaceC39417a interfaceC39417a, com.avito.android.loyalty.di.badges_list.b bVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC39417a, bVar, c28478k, null);
        }
    }

    public static a.InterfaceC5365a a() {
        return new C5366c();
    }
}
