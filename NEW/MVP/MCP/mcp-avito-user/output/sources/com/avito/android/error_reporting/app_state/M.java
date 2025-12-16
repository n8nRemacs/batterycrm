package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorUptime_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147799a;

    public M(Provider<InterfaceC30362a.InterfaceC4322a> provider) {
        this.f147799a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L(this.f147799a.get());
    }
}
