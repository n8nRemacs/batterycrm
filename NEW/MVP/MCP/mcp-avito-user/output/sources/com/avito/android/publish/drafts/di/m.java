package com.avito.android.publish.drafts.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishDraftsModule_ProvidePublishDraftUpdateObservableFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<com.jakewharton.rxrelay3.c<String>> {

    /* compiled from: PublishDraftsModule_ProvidePublishDraftUpdateObservableFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f235366a = new m();
    }

    public static m a() {
        return a.f235366a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = h.f235345a;
        return new com.jakewharton.rxrelay3.c();
    }
}
