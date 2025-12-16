package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorErrorGroup_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.error_reporting.app_state.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30372k implements dagger.internal.h<C30371j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147818a;

    public C30372k(Provider<InterfaceC30362a.InterfaceC4322a> provider) {
        this.f147818a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30371j(this.f147818a.get());
    }
}
