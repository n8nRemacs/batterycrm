package com.avito.android.profile.user_profile.cards.phones;

import com.avito.android.remote.H;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhonesCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f225162a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H> f225163b;

    public f(l lVar, Provider provider) {
        this.f225162a = lVar;
        this.f225163b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f225162a.f393949a, this.f225163b.get());
    }
}
