package com.avito.android.messenger;

import ru.avito.messenger.C47740g0;

/* compiled from: MessengerPluginModule_ProvideAuthorizationPluginFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class L implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f186161a;

    public L(dagger.internal.u uVar) {
        this.f186161a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C47740g0 c47740g0 = (C47740g0) this.f186161a.get();
        K.f186160a.getClass();
        return new J(c47740g0);
    }
}
