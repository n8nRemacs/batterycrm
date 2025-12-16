package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorActiveInAppCalls_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.error_reporting.app_state.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30364c implements dagger.internal.h<C30363b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147801a;

    public C30364c(Provider<InterfaceC30362a.InterfaceC4322a> provider) {
        this.f147801a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30363b(this.f147801a.get());
    }
}
