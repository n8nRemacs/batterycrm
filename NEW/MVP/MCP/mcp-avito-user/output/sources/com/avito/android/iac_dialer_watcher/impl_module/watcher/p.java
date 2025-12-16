package com.avito.android.iac_dialer_watcher.impl_module.watcher;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacWatcherTimerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168183a;

    public p(Provider<InterfaceC35745a5> provider) {
        this.f168183a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f168183a.get());
    }
}
