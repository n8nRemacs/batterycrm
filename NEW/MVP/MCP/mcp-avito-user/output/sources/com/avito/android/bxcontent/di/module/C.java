package com.avito.android.bxcontent.di.module;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: BxContentModule_ProvideFromPageSourceFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes12.dex */
public final class C implements dagger.internal.h<FromPageSource> {

    /* compiled from: BxContentModule_ProvideFromPageSourceFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C f110880a = new C();
    }

    public static C a() {
        return a.f110880a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29070s.f111022a.getClass();
        FromPageSource.BXContent bXContent = FromPageSource.BXContent.f82326c;
        dagger.internal.t.d(bXContent);
        return bXContent;
    }
}
