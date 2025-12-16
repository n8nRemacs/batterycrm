package com.avito.android.advert_core.pp_recall_promo;

import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPpRecallPromoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f83976a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f83977b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f83978c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f83979d;

    public i(dagger.internal.f fVar, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f83976a = provider;
        this.f83977b = lVar;
        this.f83978c = fVar;
        this.f83979d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f83976a.get(), (String) this.f83977b.f393949a, (o) this.f83978c.get(), (Kundle) this.f83979d.f393949a);
    }
}
