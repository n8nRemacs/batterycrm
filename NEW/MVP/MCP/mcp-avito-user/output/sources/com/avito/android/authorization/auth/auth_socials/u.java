package com.avito.android.authorization.auth.auth_socials;

import com.avito.android.social.M;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: AuthSocialsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M> f92923a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.social.button.g> f92924b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f92925c;

    public u(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f92923a = provider;
        this.f92924b = provider2;
        this.f92925c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f92923a.get(), this.f92924b.get(), (Map) this.f92925c.get());
    }
}
