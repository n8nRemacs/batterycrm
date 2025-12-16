package com.avito.android.advert.item.select.no_click_contact;

import com.avito.android.account.E;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AutoSelectNoClickContactPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f79458a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f79459b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert.item.select.number_input.j f79460c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f79461d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f79462e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f79463f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f79464g;

    public i(dagger.internal.l lVar, Provider provider, com.avito.android.advert.item.select.number_input.j jVar, Provider provider2, Provider provider3, Provider provider4, dagger.internal.l lVar2) {
        this.f79458a = lVar;
        this.f79459b = provider;
        this.f79460c = jVar;
        this.f79461d = provider2;
        this.f79462e = provider3;
        this.f79463f = provider4;
        this.f79464g = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((String) this.f79458a.f393949a, this.f79459b.get(), (com.avito.android.advert.item.select.number_input.g) this.f79460c.get(), this.f79461d.get(), dagger.internal.g.b(this.f79462e), this.f79463f.get(), (Kundle) this.f79464g.f393949a);
    }
}
