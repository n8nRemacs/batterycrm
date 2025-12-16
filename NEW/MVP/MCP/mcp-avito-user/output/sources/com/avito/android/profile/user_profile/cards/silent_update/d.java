package com.avito.android.profile.user_profile.cards.silent_update;

import android.content.Context;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SilentUpdateConfigChecker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f225523a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f225524b;

    public d(Provider<Context> provider, Provider<C> provider2) {
        this.f225523a = provider;
        this.f225524b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f225523a.get(), this.f225524b.get());
    }
}
