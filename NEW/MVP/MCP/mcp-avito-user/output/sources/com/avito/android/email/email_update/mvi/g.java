package com.avito.android.email.email_update.mvi;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmailUpdateBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f147237a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f147238b;

    public g(Provider<InterfaceC34401z0> provider, Provider<R0> provider2) {
        this.f147237a = provider;
        this.f147238b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f147237a.get(), this.f147238b.get());
    }
}
