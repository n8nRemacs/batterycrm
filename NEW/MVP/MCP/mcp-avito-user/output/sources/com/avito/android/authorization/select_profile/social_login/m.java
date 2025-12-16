package com.avito.android.authorization.select_profile.social_login;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: SocialRegistrationSuggestsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f94421a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f94422b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f94423c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<SelectProfileField>> f94424d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f94425e;

    /* renamed from: f, reason: collision with root package name */
    public final C15204c f94426f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC50647a> f94427g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f94428h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f94429i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f94430j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f94431k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f94432l;

    public m(Provider provider, dagger.internal.l lVar, Provider provider2, Provider provider3, Provider provider4, C15204c c15204c, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, dagger.internal.l lVar2) {
        this.f94421a = provider;
        this.f94422b = lVar;
        this.f94423c = provider2;
        this.f94424d = provider3;
        this.f94425e = provider4;
        this.f94426f = c15204c;
        this.f94427g = provider5;
        this.f94428h = provider6;
        this.f94429i = provider7;
        this.f94430j = provider8;
        this.f94431k = provider9;
        this.f94432l = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f94421a.get(), (SocialRegistrationSuggestsParams) this.f94422b.f393949a, this.f94423c.get(), this.f94424d.get(), this.f94425e.get(), (InterfaceC15202a) this.f94426f.get(), this.f94427g.get(), this.f94428h.get(), this.f94429i.get(), this.f94430j.get(), this.f94431k.get(), (Kundle) this.f94432l.f393949a);
    }
}
