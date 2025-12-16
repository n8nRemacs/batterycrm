package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorEmployeeMode_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.error_reporting.app_state.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30370i implements dagger.internal.h<C30369h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147816a;

    public C30370i(Provider<InterfaceC30362a.InterfaceC4322a> provider) {
        this.f147816a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30369h(this.f147816a.get());
    }
}
