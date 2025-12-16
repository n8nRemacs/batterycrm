package com.avito.android.analytics.clickstream;

import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamCommonModule_ProvideDiskStorageConverterFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.analytics.clickstream.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28383h implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.c<EventOuterClass.Event>> {

    /* compiled from: ClickStreamCommonModule_ProvideDiskStorageConverterFactory.java */
    /* renamed from: com.avito.android.analytics.clickstream.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C28383h f89803a = new C28383h();
    }

    public static C28383h a() {
        return a.f89803a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C28379d c28379d = C28379d.f89781a;
        return new e0();
    }
}
