package com.avito.android.messenger.blacklist_reasons;

import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BlacklistReasonsPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<y> f186610a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<m> f186611b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f186612c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f186613d;

    public k(Provider<y> provider, Provider<m> provider2, Provider<InterfaceC35741a1> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f186610a = provider;
        this.f186611b = provider2;
        this.f186612c = provider3;
        this.f186613d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f186610a.get(), this.f186611b.get(), this.f186612c.get(), this.f186613d.get());
    }
}
