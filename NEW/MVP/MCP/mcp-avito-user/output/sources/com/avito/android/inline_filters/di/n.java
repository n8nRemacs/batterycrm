package com.avito.android.inline_filters.di;

import com.avito.android.inline_filters.link.InlineFiltersApplyLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: InlineFiltersApplyLinkModule_ProvideInlineFiltersApplyLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.inline_filters.link.b f171127a;

    public n(com.avito.android.inline_filters.link.b bVar) {
        this.f171127a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.inline_filters.link.b bVar = this.f171127a;
        m.f171126a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(InlineFiltersApplyLink.class, new com.avito.android.inline_filters.link.e(), new C43834a.b.C11809b(bVar));
    }
}
