package com.avito.android.advert.item.video_call_request;

import com.avito.android.advert.item.InterfaceC28153o;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertVideoCallRequestItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OL.a> f80695a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f80696b;

    public f(dagger.internal.f fVar, Provider provider) {
        this.f80695a = provider;
        this.f80696b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f80695a.get(), (InterfaceC28153o) this.f80696b.get());
    }
}
