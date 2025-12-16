package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecallMeActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.recall_me.domain.n> f252188a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.recall_me_v2.presentation.recallme.g> f252189b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f252190c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f252191d;

    public j(Provider<com.avito.android.recall_me.domain.n> provider, Provider<com.avito.android.recall_me_v2.presentation.recallme.g> provider2, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider3, Provider<R0> provider4) {
        this.f252188a = provider;
        this.f252189b = provider2;
        this.f252190c = provider3;
        this.f252191d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f252188a.get(), this.f252189b.get(), this.f252190c.get(), this.f252191d.get());
    }
}
