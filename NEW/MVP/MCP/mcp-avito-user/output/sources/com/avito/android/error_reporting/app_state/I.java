package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorTooLargeTransaction_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147788a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f147789b;

    public I(dagger.internal.u uVar, Provider provider) {
        this.f147788a = provider;
        this.f147789b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f147788a.get(), (com.avito.android.large_transaction.d) this.f147789b.get());
    }
}
