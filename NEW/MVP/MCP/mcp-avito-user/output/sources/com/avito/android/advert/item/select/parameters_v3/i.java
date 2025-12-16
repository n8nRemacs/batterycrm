package com.avito.android.advert.item.select.parameters_v3;

import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AutoSelectParametersV3PresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<C28201d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f79580a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f79581b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert.item.select.number_input.j f79582c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f79583d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f79584e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f79585f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f79586g;

    public i(dagger.internal.l lVar, Provider provider, com.avito.android.advert.item.select.number_input.j jVar, Provider provider2, Provider provider3, Provider provider4, dagger.internal.l lVar2) {
        this.f79580a = lVar;
        this.f79581b = provider;
        this.f79582c = jVar;
        this.f79583d = provider2;
        this.f79584e = provider3;
        this.f79585f = provider4;
        this.f79586g = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28201d((String) this.f79580a.f393949a, this.f79581b.get(), (com.avito.android.advert.item.select.number_input.g) this.f79582c.get(), this.f79583d.get(), dagger.internal.g.b(this.f79584e), this.f79585f.get(), (Kundle) this.f79586g.f393949a);
    }
}
