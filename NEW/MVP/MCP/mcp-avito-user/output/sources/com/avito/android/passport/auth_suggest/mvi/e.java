package com.avito.android.passport.auth_suggest.mvi;

import com.avito.android.passport.auth_suggest.PassportAuthSuggestOpenParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: PassportAuthSuggestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f211034a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<I50.a> f211035b;

    /* renamed from: c, reason: collision with root package name */
    public final u f211036c;

    public e(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f211034a = lVar;
        this.f211035b = provider;
        this.f211036c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((PassportAuthSuggestOpenParams) this.f211034a.f393949a, this.f211035b.get(), (Set) this.f211036c.get());
    }
}
