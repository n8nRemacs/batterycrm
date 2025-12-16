package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorLogcat_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147840a;

    public t(Provider<InterfaceC30362a.InterfaceC4322a> provider) {
        this.f147840a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f147840a.get());
    }
}
