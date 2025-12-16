package com.avito.android.sx_address.address_video_verification.domain;

import com.avito.android.remote.R0;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxAddressVideoVerificationApi_Module_ProvideSxAddressVideoVerificationApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f292606a;

    public c(dagger.internal.f fVar) {
        this.f292606a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f292606a.get();
        b.f292605a.getClass();
        a aVar = (a) r02.create(a.class);
        t.d(aVar);
        return aVar;
    }
}
