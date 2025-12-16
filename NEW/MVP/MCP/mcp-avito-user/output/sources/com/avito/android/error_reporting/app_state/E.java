package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorSecurityPatchLevel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147783a;

    public E(Provider<InterfaceC30362a.InterfaceC4322a> provider) {
        this.f147783a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f147783a.get());
    }
}
