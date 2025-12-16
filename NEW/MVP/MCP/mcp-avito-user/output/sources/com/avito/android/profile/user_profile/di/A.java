package com.avito.android.profile.user_profile.di;

import com.avito.android.socketEvents.SocketEventParserByClass;

/* compiled from: UserProfileSocketEventMappingsModule_ProvideWalletSocketEventMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<mx0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final y f225816a;

    public A(y yVar) {
        this.f225816a = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f225816a.getClass();
        return new mx0.c(Sa0.b.class, new mx0.e("wallet.balance_updated", null, false, 6, null), new SocketEventParserByClass(Sa0.b.class));
    }
}
