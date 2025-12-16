package com.avito.android.serp.adapter.closable.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClosedItemModule_ProvideClosedItemEventInteractorFactory.java */
@e
@x
@y
/* loaded from: classes3.dex */
public final class b implements h<com.avito.android.serp.adapter.closable.a> {

    /* compiled from: ClosedItemModule_ProvideClosedItemEventInteractorFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f269426a = new b();
    }

    public static b a() {
        return a.f269426a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = com.avito.android.serp.adapter.closable.di.a.f269425a;
        return new com.avito.android.serp.adapter.closable.b();
    }
}
