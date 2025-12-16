package com.avito.android.publish_limits_info.history.tab.di;

import com.avito.android.publish_limits_info.history.tab.PublishAdvertsHistoryFragment;
import com.avito.android.publish_limits_info.history.tab.di.e;
import com.avito.android.publish_limits_info.history.tab.di.g;
import com.avito.konveyor.adapter.j;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPublishAdvertsHistoryComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerPublishAdvertsHistoryComponent.java */
    public static final class b implements g.a {
        public b() {
        }

        @Override // com.avito.android.publish_limits_info.history.tab.di.g.a
        public final g a(h hVar) {
            return new c(hVar, null);
        }
    }

    /* compiled from: DaggerPublishAdvertsHistoryComponent.java */
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final h f245904a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.publish_limits_info.history.tab.advert.d> f245905b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.publish_limits_info.history.tab.advert.c f245906c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.publish_limits_info.history.tab.info.d> f245907d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f245908e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f245909f;

        /* renamed from: g, reason: collision with root package name */
        public final u<j> f245910g;

        public c(h hVar, C7370a c7370a) {
            this.f245904a = hVar;
            u<com.avito.android.publish_limits_info.history.tab.advert.d> uVarD = dagger.internal.g.d(com.avito.android.publish_limits_info.history.tab.advert.f.a());
            this.f245905b = uVarD;
            this.f245906c = new com.avito.android.publish_limits_info.history.tab.advert.c(uVarD);
            u<com.avito.android.publish_limits_info.history.tab.info.d> uVarD2 = dagger.internal.g.d(e.a.f245915a);
            this.f245907d = uVarD2;
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new d(this.f245906c, new com.avito.android.publish_limits_info.history.tab.info.c(uVarD2)));
            this.f245908e = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new com.avito.android.publish_limits_info.history.tab.di.c(uVarD3));
            this.f245909f = uVarD4;
            this.f245910g = dagger.internal.g.d(new f(uVarD4, this.f245908e));
        }

        @Override // com.avito.android.publish_limits_info.history.tab.di.g
        public final void a(PublishAdvertsHistoryFragment publishAdvertsHistoryFragment) {
            publishAdvertsHistoryFragment.f245881n0 = this.f245909f.get();
            publishAdvertsHistoryFragment.f245882o0 = this.f245910g.get();
            com.avito.android.publish_limits_info.history.tab.d dVarFa = this.f245904a.fa();
            t.c(dVarFa);
            publishAdvertsHistoryFragment.f245883p0 = dVarFa;
        }
    }

    public static g.a a() {
        return new b();
    }
}
