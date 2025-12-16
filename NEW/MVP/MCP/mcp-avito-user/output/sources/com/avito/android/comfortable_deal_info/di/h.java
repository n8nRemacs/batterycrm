package com.avito.android.comfortable_deal_info.di;

import Y41.l;
import androidx.fragment.app.DialogFragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.comfortable_deal_info.ComfortableDealInfoDialogFragment;
import com.avito.android.comfortable_deal_info.ComfortableDealInfoDialogParams;
import com.avito.android.comfortable_deal_info.ComfortableDealInfoFragment;
import com.avito.android.comfortable_deal_info.di.a;
import com.avito.android.comfortable_deal_info.di.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import uq.C49096b;

/* compiled from: DaggerComfortableDealInfoDialogComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class h {

    /* compiled from: DaggerComfortableDealInfoDialogComponent.java */
    public static final class b implements a.InterfaceC3687a {

        /* renamed from: a, reason: collision with root package name */
        public final d f123476a;

        public b(d dVar, a aVar) {
            this.f123476a = dVar;
        }

        @Override // com.avito.android.comfortable_deal_info.di.a.InterfaceC3687a
        public final com.avito.android.comfortable_deal_info.di.a create() {
            return new c(this.f123476a, null);
        }
    }

    /* compiled from: DaggerComfortableDealInfoDialogComponent.java */
    public static final class c implements com.avito.android.comfortable_deal_info.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final d f123477a;

        public c(d dVar, a aVar) {
            this.f123477a = dVar;
        }

        @Override // com.avito.android.comfortable_deal_info.di.a
        public final void a(ComfortableDealInfoFragment comfortableDealInfoFragment) {
            comfortableDealInfoFragment.f123454n0 = this.f123477a.f123479b;
        }
    }

    /* compiled from: DaggerComfortableDealInfoDialogComponent.java */
    public static final class d implements com.avito.android.comfortable_deal_info.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.comfortable_deal_info.di.d f123478a;

        /* renamed from: b, reason: collision with root package name */
        public final l<? super Integer, G0> f123479b;

        /* renamed from: c, reason: collision with root package name */
        public final d f123480c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f123481d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal_info.f> f123482e;

        public d() {
            throw null;
        }

        public d(com.avito.android.comfortable_deal_info.di.d dVar, ComfortableDealInfoDialogParams comfortableDealInfoDialogParams, DialogFragment dialogFragment, l lVar, a aVar) {
            this.f123480c = this;
            this.f123478a = dVar;
            this.f123479b = lVar;
            this.f123481d = dagger.internal.l.a(dialogFragment);
            this.f123482e = dagger.internal.g.d(new g(this.f123481d, dagger.internal.l.a(comfortableDealInfoDialogParams)));
        }

        @Override // com.avito.android.comfortable_deal_info.di.e
        public final void a(ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment) {
            comfortableDealInfoDialogFragment.f123437h0 = this.f123482e.get();
            InterfaceC28373a interfaceC28373aA = this.f123478a.a();
            t.c(interfaceC28373aA);
            comfortableDealInfoDialogFragment.f123438i0 = new C49096b(interfaceC28373aA);
        }

        @Override // com.avito.android.comfortable_deal_info.di.e
        public final a.InterfaceC3687a b() {
            return new b(this.f123480c, null);
        }
    }

    /* compiled from: DaggerComfortableDealInfoDialogComponent.java */
    public static final class e implements e.a {
        public e() {
        }

        @Override // com.avito.android.comfortable_deal_info.di.e.a
        public final com.avito.android.comfortable_deal_info.di.e a(com.avito.android.comfortable_deal_info.di.d dVar, ComfortableDealInfoDialogParams comfortableDealInfoDialogParams, ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment, l lVar) {
            comfortableDealInfoDialogParams.getClass();
            return new d(dVar, comfortableDealInfoDialogParams, comfortableDealInfoDialogFragment, lVar, null);
        }
    }

    public static e.a a() {
        return new e();
    }
}
