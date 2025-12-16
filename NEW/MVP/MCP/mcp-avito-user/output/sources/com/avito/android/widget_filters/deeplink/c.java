package com.avito.android.widget_filters.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WidgetFiltersLinkHandlerModule_ProvideWidgetFiltersLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f329758a;

    public c(d dVar) {
        this.f329758a = dVar;
    }

    public static c a(d dVar) {
        return new c(dVar);
    }

    public static C43834a b(d dVar) {
        b.f329757a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(WidgetFiltersLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(WidgetFiltersLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return b(this.f329758a);
    }
}
