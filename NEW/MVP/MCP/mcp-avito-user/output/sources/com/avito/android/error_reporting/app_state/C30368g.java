package com.avito.android.error_reporting.app_state;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Provider;

/* compiled from: AppStateCollectorAppSignature_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.error_reporting.app_state.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30368g implements dagger.internal.h<C30367f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147811a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f147812b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f147813c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f147814d;

    public C30368g(Provider provider, C30102l3 c30102l3, Provider provider2, dagger.internal.f fVar) {
        this.f147811a = provider;
        this.f147812b = c30102l3;
        this.f147813c = provider2;
        this.f147814d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30367f(this.f147811a.get(), (Context) this.f147812b.get(), this.f147813c.get(), (InterfaceC28373a) this.f147814d.get());
    }
}
