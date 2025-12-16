package com.avito.android.developments_agency_search.screen.deal_room.di;

import android.content.ContentResolver;
import android.content.Context;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealRoomModule_ProvideContentResolverFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<ContentResolver> {

    /* renamed from: a, reason: collision with root package name */
    public final l f137526a;

    public e(l lVar) {
        this.f137526a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f137526a.f393949a;
        d.f137525a.getClass();
        return context.getApplicationContext().getContentResolver();
    }
}
