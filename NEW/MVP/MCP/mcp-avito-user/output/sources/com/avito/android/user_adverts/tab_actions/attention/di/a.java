package com.avito.android.user_adverts.tab_actions.attention.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.tab_actions.attention.UserAdvertsActionAttentionFragment;
import com.avito.android.user_adverts.tab_actions.attention.di.b;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.u;

/* compiled from: DaggerUserAdvertsActionAttentionComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerUserAdvertsActionAttentionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.user_adverts.tab_actions.attention.di.b.a
        public final com.avito.android.user_adverts.tab_actions.attention.di.b a(r rVar, com.avito.android.user_adverts.tab_actions.attention.di.c cVar) {
            return new c(new d(), cVar, rVar, null);
        }
    }

    /* compiled from: DaggerUserAdvertsActionAttentionComponent.java */
    public static final class c implements com.avito.android.user_adverts.tab_actions.attention.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_adverts.tab_actions.attention.di.c f314211a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f314212b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f314213c;

        /* compiled from: DaggerUserAdvertsActionAttentionComponent.java */
        /* renamed from: com.avito.android.user_adverts.tab_actions.attention.di.a$c$a, reason: collision with other inner class name */
        public static final class C9695a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_actions.attention.di.c f314214a;

            public C9695a(com.avito.android.user_adverts.tab_actions.attention.di.c cVar) {
                this.f314214a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f314214a.f();
            }
        }

        public c(d dVar, com.avito.android.user_adverts.tab_actions.attention.di.c cVar, r rVar, C9694a c9694a) {
            this.f314211a = cVar;
            this.f314212b = new C9695a(cVar);
            this.f314213c = g.d(new e(dVar, this.f314212b, l.a(rVar)));
        }

        @Override // com.avito.android.user_adverts.tab_actions.attention.di.b
        public final void a(UserAdvertsActionAttentionFragment userAdvertsActionAttentionFragment) {
            userAdvertsActionAttentionFragment.f314205m0 = this.f314211a.e();
            userAdvertsActionAttentionFragment.f314206n0 = this.f314213c.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
