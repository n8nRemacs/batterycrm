package com.avito.android.bxcontent.di.module;

import com.avito.android.analytics.event.ImageViewportEvent;

/* compiled from: BxContentModule_ProvideImageViewportEventSourceFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes12.dex */
public final class E implements dagger.internal.h<ImageViewportEvent.EventSource> {

    /* compiled from: BxContentModule_ProvideImageViewportEventSourceFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final E f110884a = new E();
    }

    public static E a() {
        return a.f110884a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29070s.f111022a.getClass();
        return ImageViewportEvent.EventSource.f89949c;
    }
}
