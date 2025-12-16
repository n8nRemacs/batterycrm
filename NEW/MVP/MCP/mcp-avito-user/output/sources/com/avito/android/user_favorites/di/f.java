package com.avito.android.user_favorites.di;

import com.avito.android.user_favorites.C35721f;
import com.avito.android.user_favorites.C35723h;
import com.avito.android.user_favorites.SearchSubscriptionLink;
import lv.C43834a;

/* compiled from: SubscriptionsSearchLinkHandlerModule_ProvideSubscriptionsSearchLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f316895a;

    /* renamed from: b, reason: collision with root package name */
    public final C35723h f316896b;

    public f(e eVar, C35723h c35723h) {
        this.f316895a = eVar;
        this.f316896b = c35723h;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35723h c35723h = this.f316896b;
        this.f316895a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SearchSubscriptionLink.class, new C35721f(), new C43834a.b.C11809b(c35723h));
    }
}
