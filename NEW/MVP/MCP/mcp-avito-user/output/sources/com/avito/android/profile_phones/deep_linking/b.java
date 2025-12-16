package com.avito.android.profile_phones.deep_linking;

import com.avito.android.N1;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import mb0.C44043c;

/* compiled from: LandlinePhoneVerificationAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C44043c f227111a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f227112b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f227113c;

    public b(dv.b bVar, dv.b bVar2, C44043c c44043c) {
        this.f227111a = c44043c;
        this.f227112b = bVar;
        this.f227113c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((N1) this.f227111a.get(), (a.InterfaceC4053a) this.f227112b.get(), (a.b) this.f227113c.get());
    }
}
