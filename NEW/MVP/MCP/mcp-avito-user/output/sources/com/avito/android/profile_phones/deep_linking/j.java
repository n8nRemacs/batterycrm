package com.avito.android.profile_phones.deep_linking;

import com.avito.android.N1;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import mb0.C44043c;

/* compiled from: PhoneVerificationStatusSyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C44043c f227146a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f227147b;

    public j(C44043c c44043c, dv.b bVar) {
        this.f227146a = c44043c;
        this.f227147b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((N1) this.f227146a.get(), (a.InterfaceC4053a) this.f227147b.get());
    }
}
