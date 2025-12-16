package com.avito.android.authorization.upgrade_password;

import com.avito.android.P;
import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: UpgradePasswordInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f94813a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f94814b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<P> f94815c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f94816d;

    public g(Provider<InterfaceC34258d> provider, Provider<G> provider2, Provider<P> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f94813a = provider;
        this.f94814b = provider2;
        this.f94815c = provider3;
        this.f94816d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f94813a.get(), this.f94814b.get(), this.f94815c.get(), this.f94816d.get());
    }
}
