package com.avito.android.passport.deep_linking;

import com.avito.android.N1;
import com.avito.android.deeplink_handler.view.a;
import mb0.C44043c;

/* compiled from: PhonesListAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final C44043c f211056a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f211057b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f211058c;

    public D(dv.b bVar, dv.b bVar2, C44043c c44043c) {
        this.f211056a = c44043c;
        this.f211057b = bVar;
        this.f211058c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((N1) this.f211056a.get(), (a.InterfaceC4053a) this.f211057b.get(), (a.b) this.f211058c.get());
    }
}
