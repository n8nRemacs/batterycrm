package com.avito.android.profile.user_profile.cards.recommendations;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecommendationsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f225284a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f225285b;

    public c(u uVar, Provider provider) {
        this.f225284a = uVar;
        this.f225285b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f225284a.get(), this.f225285b.get());
    }
}
