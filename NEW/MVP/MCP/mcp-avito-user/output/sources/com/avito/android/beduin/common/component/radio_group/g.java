package com.avito.android.beduin.common.component.radio_group;

import com.avito.android.AbstractC35201t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinRadioGroupComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f102212a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f102213b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f102214c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<AbstractC35201t> f102215d;

    public g(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f102212a = provider;
        this.f102213b = lVar;
        this.f102214c = fVar;
        this.f102215d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f102212a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f102213b.f393949a, dagger.internal.g.b(this.f102214c), this.f102215d.get());
    }
}
