package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: FinalizingBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class G implements dagger.internal.h<FinalizingBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IacMetaInfoStorage> f165131a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f165132b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f165133c;

    public G(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f165131a = provider;
        this.f165132b = uVar;
        this.f165133c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FinalizingBootstrap(this.f165131a.get(), (IacFinalLinkInteractor) this.f165132b.get(), this.f165133c.get());
    }
}
