package com.avito.android.passport.profile_add.merge.accounts_profile_error;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.a;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.k;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerAccountsProfileErrorComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class j {

    /* compiled from: DaggerAccountsProfileErrorComponent.java */
    public static final class b implements com.avito.android.passport.profile_add.merge.accounts_profile_error.a {

        /* renamed from: a, reason: collision with root package name */
        public final k f212413a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f212414b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C28478k> f212415c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f212416d;

        /* renamed from: e, reason: collision with root package name */
        public final i f212417e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f212418f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler.d> f212419g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f212420h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f212421i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f212422j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f212423k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f212424l;

        /* compiled from: DaggerAccountsProfileErrorComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.merge.accounts_profile_error.b f212425a;

            public a(com.avito.android.passport.profile_add.merge.accounts_profile_error.b bVar) {
                this.f212425a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f212425a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerAccountsProfileErrorComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.merge.accounts_profile_error.j$b$b, reason: collision with other inner class name */
        public static final class C6347b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.merge.accounts_profile_error.b f212426a;

            public C6347b(com.avito.android.passport.profile_add.merge.accounts_profile_error.b bVar) {
                this.f212426a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f212426a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.passport.profile_add.merge.accounts_profile_error.b bVar, cv.b bVar2, PassportUserDialogWithProfile passportUserDialogWithProfile, r rVar, a aVar) {
            this.f212413a = new k(l.a(passportUserDialogWithProfile));
            this.f212414b = new C6347b(bVar);
            u<C28478k> uVarD = dagger.internal.g.d(new g(l.a(rVar)));
            this.f212415c = uVarD;
            this.f212416d = com.avito.android.advert.item.delivery_suggests.l.i(this.f212414b, uVarD);
            this.f212417e = new i(new com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.g(com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.d.a(), com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.b.a(), com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.i.a(), this.f212413a, this.f212416d));
            this.f212418f = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler.d> uVarD2 = dagger.internal.g.d(com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler.f.a());
            this.f212419g = uVarD2;
            this.f212421i = dagger.internal.g.d(new com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler.b(uVarD2, new a(bVar)));
            A.b bVarA = A.a(1, 1);
            bVarA.f393938b.add(this.f212418f);
            bVarA.f393937a.add(this.f212421i);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f212422j = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f212423k = uVarH;
            this.f212424l = dagger.internal.g.d(new e(uVarH, this.f212422j));
        }
    }

    /* compiled from: DaggerAccountsProfileErrorComponent.java */
    public static final class c implements a.InterfaceC6346a {
        public c() {
        }
    }
}
