package com.avito.android.authorization.login.di;

import Tv0.C15416b;
import Tv0.InterfaceC15415a;
import android.content.res.Resources;
import com.avito.android.authorization.login.di.a;
import com.avito.android.util.C;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import l90.n;

/* compiled from: LoginModule_ProvidesSupportEmailResourceProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<InterfaceC15415a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f94041a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n> f94042b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f94043c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f94041a = lVar;
        this.f94042b = provider;
        this.f94043c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f94041a.f393949a;
        n nVar = (n) ((a.c.h) this.f94042b).get();
        C c12 = (C) ((a.c.d) this.f94043c).get();
        d.f94040a.getClass();
        return new C15416b(resources, nVar, c12);
    }
}
