package com.avito.android.photo_gallery.di;

import Id.InterfaceC14060a;
import ac.C19864a;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.advert_core.contactbar.G;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_core.contactbar.SourceScreen;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_gallery.di.C33182b;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.util.C35865p;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.R0;
import javax.inject.Provider;
import okhttp3.internal.http2.Http2Connection;
import wv.C49686b;

/* compiled from: LegacyPhotoGalleryModule_ProvideAdvertContactsPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<InterfaceC28265d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C29640d> f217031a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B2> f217032b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f217033c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<l90.n> f217034d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f217035e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<WL.a> f217036f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.messenger.a> f217037g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<E> f217038h;

    /* renamed from: i, reason: collision with root package name */
    public final C35865p f217039i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f217040j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<SourceScreen> f217041k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.deal_confirmation.d> f217042l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f217043m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<W9.c> f217044n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<ProgressInfoToastBarPresenter> f217045o;

    /* renamed from: p, reason: collision with root package name */
    public final G f217046p;

    /* renamed from: q, reason: collision with root package name */
    public final C49686b f217047q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<R0> f217048r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.safedeal.trust_factors.a> f217049s;

    /* renamed from: t, reason: collision with root package name */
    public final q f217050t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<InterfaceC14060a> f217051u;

    /* renamed from: v, reason: collision with root package name */
    public final Provider<com.avito.android.progress_info_toast_bar.interactor.g> f217052v;

    public n(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, C35865p c35865p, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, G g12, C49686b c49686b, Provider provider15, Provider provider16, q qVar, Provider provider17, Provider provider18) {
        this.f217031a = provider;
        this.f217032b = provider2;
        this.f217033c = provider3;
        this.f217034d = provider4;
        this.f217035e = provider5;
        this.f217036f = provider6;
        this.f217037g = provider7;
        this.f217038h = provider8;
        this.f217039i = c35865p;
        this.f217040j = provider9;
        this.f217041k = provider10;
        this.f217042l = provider11;
        this.f217043m = provider12;
        this.f217044n = provider13;
        this.f217045o = provider14;
        this.f217046p = g12;
        this.f217047q = c49686b;
        this.f217048r = provider15;
        this.f217049s = provider16;
        this.f217050t = qVar;
        this.f217051u = provider17;
        this.f217052v = provider18;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29640d c29640d = (C29640d) ((C33182b.c.C6497b) this.f217031a).get();
        B2 b22 = (B2) ((C33182b.c.x) this.f217032b).get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C33182b.c.C6498c) this.f217033c).get();
        l90.n nVar = (l90.n) ((C33182b.c.t) this.f217034d).get();
        com.avito.android.advert_core.analytics.a aVar = this.f217035e.get();
        WL.a aVar2 = (WL.a) ((C33182b.c.j) this.f217036f).get();
        com.avito.android.advert_core.messenger.a aVar3 = this.f217037g.get();
        E e12 = (E) ((C33182b.c.a) this.f217038h).get();
        InterfaceC35945t1 interfaceC35945t1 = (InterfaceC35945t1) this.f217039i.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C33182b.c.v) this.f217040j).get();
        SourceScreen sourceScreen = this.f217041k.get();
        com.avito.android.deal_confirmation.d dVar = this.f217042l.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar4 = (com.avito.android.deeplink_handler.handler.composite.a) ((C33182b.c.n) this.f217043m).get();
        W9.c cVar = this.f217044n.get();
        ProgressInfoToastBarPresenter progressInfoToastBarPresenter = (ProgressInfoToastBarPresenter) ((C33182b.c.u) this.f217045o).get();
        com.avito.android.advert_core.contactbar.C c12 = (com.avito.android.advert_core.contactbar.C) this.f217046p.get();
        com.avito.android.delayed_ux_feedback.d dVar2 = (com.avito.android.delayed_ux_feedback.d) this.f217047q.get();
        R0 r02 = (R0) ((C33182b.c.o) this.f217048r).get();
        com.avito.android.advert_core.safedeal.trust_factors.a aVar5 = this.f217049s.get();
        C19864a c19864a = (C19864a) this.f217050t.get();
        InterfaceC14060a interfaceC14060a = (InterfaceC14060a) ((C33182b.c.f) this.f217051u).get();
        com.avito.android.progress_info_toast_bar.interactor.g gVar = (com.avito.android.progress_info_toast_bar.interactor.g) ((C33182b.c.z) this.f217052v).get();
        l.f217029a.getClass();
        return new C28266e(nVar, aVar3, aVar2, aVar, e12, interfaceC35945t1, interfaceC28373a, interfaceC35745a5, c29640d, b22, sourceScreen, null, dVar, aVar4, cVar, progressInfoToastBarPresenter, null, c12, dVar2, c19864a, interfaceC14060a, aVar5, r02, gVar, null, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, null);
    }
}
