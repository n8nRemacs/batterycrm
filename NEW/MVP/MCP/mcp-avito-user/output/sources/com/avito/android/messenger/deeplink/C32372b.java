package com.avito.android.messenger.deeplink;

import javax.inject.Provider;

/* compiled from: BlockUserDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32372b implements dagger.internal.h<C32370a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.blacklist_reasons.y> f195450a;

    public C32372b(Provider<com.avito.android.messenger.blacklist_reasons.y> provider) {
        this.f195450a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32370a(this.f195450a.get());
    }
}
