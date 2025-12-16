package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorFreeMemory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147825a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.error_reporting.memory.c f147826b;

    public p(Provider provider, com.avito.android.error_reporting.memory.c cVar) {
        this.f147825a = provider;
        this.f147826b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC30362a.InterfaceC4322a interfaceC4322a = this.f147825a.get();
        this.f147826b.getClass();
        return new o(interfaceC4322a, new com.avito.android.error_reporting.memory.b());
    }
}
