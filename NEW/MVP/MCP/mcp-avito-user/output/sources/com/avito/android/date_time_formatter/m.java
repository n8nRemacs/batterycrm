package com.avito.android.date_time_formatter;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: Job24ResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f132578a;

    /* renamed from: b, reason: collision with root package name */
    public final k f132579b;

    public m(Provider provider, k kVar) {
        this.f132578a = provider;
        this.f132579b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f132578a.get(), (f) this.f132579b.get());
    }
}
