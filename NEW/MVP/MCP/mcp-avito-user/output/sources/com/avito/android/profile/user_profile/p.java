package com.avito.android.profile.user_profile;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.profile.generated.api.ProfileApi;
import com.avito.android.util.R0;
import javax.inject.Provider;
import nF.C44245a;

/* compiled from: UserProfileInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f226556a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ProfileApi> f226557b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.cards.active_orders.j> f226558c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33369d> f226559d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.cards.wallet.finance_dynamic.d> f226560e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.cards.service_booking.a> f226561f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.profile.user_profile.di.j f226562g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<gD.f> f226563h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C44245a> f226564i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f226565j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<R0> f226566k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<N90.p> f226567l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<Bw0.i> f226568m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.profile.user_profile.cards.silent_update.d f226569n;

    public p(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, com.avito.android.profile.user_profile.di.j jVar, Provider provider7, Provider provider8, dagger.internal.u uVar, Provider provider9, Provider provider10, Provider provider11, com.avito.android.profile.user_profile.cards.silent_update.d dVar) {
        this.f226556a = provider;
        this.f226557b = provider2;
        this.f226558c = provider3;
        this.f226559d = provider4;
        this.f226560e = provider5;
        this.f226561f = provider6;
        this.f226562g = jVar;
        this.f226563h = provider7;
        this.f226564i = provider8;
        this.f226565j = uVar;
        this.f226566k = provider9;
        this.f226567l = provider10;
        this.f226568m = provider11;
        this.f226569n = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.b(this.f226556a), dagger.internal.g.b(this.f226557b), this.f226558c.get(), this.f226559d.get(), this.f226560e.get(), this.f226561f.get(), (com.avito.android.profile.user_profile.cards.wallet.d) this.f226562g.get(), this.f226563h.get(), this.f226564i.get(), (com.avito.android.photo_picker.converter.f) this.f226565j.get(), this.f226566k.get(), this.f226567l.get(), this.f226568m.get(), (com.avito.android.profile.user_profile.cards.silent_update.c) this.f226569n.get());
    }
}
