package com.avito.android.date_time_formatter;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: Job23ResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f132575a;

    public k(Provider<Resources> provider) {
        this.f132575a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f132575a.get());
    }
}
