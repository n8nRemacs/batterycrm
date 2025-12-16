package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorLogs_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147843a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f147844b;

    public w(dagger.internal.u uVar, Provider provider) {
        this.f147843a = provider;
        this.f147844b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f147843a.get(), (com.avito.android.timber.a) this.f147844b.get());
    }
}
