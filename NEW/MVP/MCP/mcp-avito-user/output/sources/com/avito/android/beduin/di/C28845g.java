package com.avito.android.beduin.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: BeduinAdvertCollectionToastModule_FromPageSourceFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.beduin.di.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28845g implements dagger.internal.h<FromPageSource> {

    /* compiled from: BeduinAdvertCollectionToastModule_FromPageSourceFactory.java */
    /* renamed from: com.avito.android.beduin.di.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C28845g f103920a = new C28845g();
    }

    public static C28845g a() {
        return a.f103920a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C28844f.f103919a.getClass();
        FromPageSource.AppLink appLink = FromPageSource.AppLink.f82325c;
        dagger.internal.t.d(appLink);
        return appLink;
    }
}
