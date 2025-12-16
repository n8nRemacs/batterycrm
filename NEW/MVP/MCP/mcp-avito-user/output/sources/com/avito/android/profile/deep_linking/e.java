package com.avito.android.profile.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: EditProfileLinkSyncHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l90.q f221899a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f221900b;

    public e(l90.q qVar, dv.b bVar) {
        this.f221899a = qVar;
        this.f221900b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((l90.o) this.f221899a.get(), (a.InterfaceC4053a) this.f221900b.get());
    }
}
