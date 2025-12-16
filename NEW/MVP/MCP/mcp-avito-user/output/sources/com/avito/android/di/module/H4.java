package com.avito.android.di.module;

import com.avito.android.serp.adapter.rich_snippets.realty.C34760e;
import com.avito.android.serp.adapter.rich_snippets.realty.InterfaceC34758c;

/* compiled from: DevelopmentItemModule_ProvideDevelopmentListItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H4 implements dagger.internal.h<InterfaceC34758c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f143983a;

    public H4(dagger.internal.f fVar) {
        this.f143983a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f143983a);
        F4 f42 = F4.f143954a;
        return new C34760e(eVarB);
    }
}
