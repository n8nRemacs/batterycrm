package com.avito.android.publish.step.request.suggest.mvi;

import com.avito.android.publish.C0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestRequestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f245467a;

    public c(Provider<C0> provider) {
        this.f245467a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f245467a.get());
    }
}
