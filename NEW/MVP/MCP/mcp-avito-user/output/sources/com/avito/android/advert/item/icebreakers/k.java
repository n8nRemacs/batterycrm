package com.avito.android.advert.item.icebreakers;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.E;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IceBreakersPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f76486a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f76487b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f76488c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f76489d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f76490e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<u3.g<SimpleTestGroupWithNone>> f76491f;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f76486a = provider;
        this.f76487b = provider2;
        this.f76488c = lVar;
        this.f76489d = lVar2;
        this.f76490e = provider3;
        this.f76491f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f76486a.get(), this.f76487b.get(), (String) this.f76488c.f393949a, (Kundle) this.f76489d.f393949a, this.f76490e.get(), this.f76491f.get());
    }
}
