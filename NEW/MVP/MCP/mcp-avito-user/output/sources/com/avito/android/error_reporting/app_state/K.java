package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorTouchedFeaturesToggles_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f147794a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147795b;

    public K(Provider<com.avito.android.util.C> provider, Provider<InterfaceC30362a.InterfaceC4322a> provider2) {
        this.f147794a = provider;
        this.f147795b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new J(this.f147794a.get(), this.f147795b.get());
    }
}
