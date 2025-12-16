package com.avito.android.publish.slots.fashion_authentication_check_banner.interactor;

import com.avito.android.remote.H0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FashionAuthenticationBannerInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f243872a;

    public c(u uVar) {
        this.f243872a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((H0) this.f243872a.get());
    }
}
