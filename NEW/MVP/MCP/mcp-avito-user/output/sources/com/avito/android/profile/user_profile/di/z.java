package com.avito.android.profile.user_profile.di;

import Sa0.C15167a;
import com.avito.android.socketEvents.SocketEventParserByClass;

/* compiled from: UserProfileSocketEventMappingsModule_ProvideAvitoFinanceSocketEventMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class z implements dagger.internal.h<mx0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final y f226143a;

    public z(y yVar) {
        this.f226143a = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f226143a.getClass();
        return new mx0.c(C15167a.class, new mx0.e("widget.BalanceUpdated", null, false, 6, null), new SocketEventParserByClass(C15167a.class));
    }
}
