package com.avito.android.authorization.select_social;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.select_social.adapter.SelectSocialField;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectSocialPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f94563a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f94564b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f94565c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f94566d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<SelectSocialField>> f94567e;

    /* renamed from: f, reason: collision with root package name */
    public final C15204c f94568f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f94569g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f94570h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f94571i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f94572j;

    public p(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, C15204c c15204c, Provider provider6, Provider provider7, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f94563a = provider;
        this.f94564b = provider2;
        this.f94565c = provider3;
        this.f94566d = provider4;
        this.f94567e = provider5;
        this.f94568f = c15204c;
        this.f94569g = provider6;
        this.f94570h = provider7;
        this.f94571i = lVar;
        this.f94572j = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f94563a.get(), this.f94564b.get(), this.f94565c.get(), this.f94566d.get(), this.f94567e.get(), (InterfaceC15202a) this.f94568f.get(), this.f94569g.get(), this.f94570h.get(), (String) this.f94571i.f393949a, (Kundle) this.f94572j.f393949a);
    }
}
