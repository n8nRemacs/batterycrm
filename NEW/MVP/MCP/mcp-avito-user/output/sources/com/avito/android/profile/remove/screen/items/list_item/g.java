package com.avito.android.profile.remove.screen.items.list_item;

import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ListItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f224108a;

    /* renamed from: b, reason: collision with root package name */
    public final H90.a f224109b;

    public g(l lVar, H90.a aVar) {
        this.f224108a = lVar;
        this.f224109b = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Y41.l) this.f224108a.f393949a, (ProfileRemoveAnalytics) this.f224109b.get());
    }
}
