package com.avito.android.comparison.di;

import com.avito.android.comparison.ComparisonDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ComparisonDeeplinkHandlerModule_ProvideComparisonDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comparison.b f123840a;

    public d(com.avito.android.comparison.b bVar) {
        this.f123840a = bVar;
    }

    public static C43834a a(com.avito.android.comparison.b bVar) {
        c.f123839a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ComparisonDeepLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ComparisonDeepLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f123840a);
    }
}
