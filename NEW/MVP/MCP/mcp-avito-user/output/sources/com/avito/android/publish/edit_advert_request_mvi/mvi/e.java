package com.avito.android.publish.edit_advert_request_mvi.mvi;

import com.avito.android.publish.C0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditRequestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f235621a;

    /* renamed from: b, reason: collision with root package name */
    public final u f235622b;

    public e(u uVar, Provider provider) {
        this.f235621a = provider;
        this.f235622b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f235621a.get(), (com.avito.android.publish.edit_advert_request_mvi.f) this.f235622b.get());
    }
}
