package com.avito.android.rating_form.item.photo_picker.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormUploadServiceModule_ProvideUploadErrorStreamFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<com.jakewharton.rxrelay3.c<Throwable>> {

    /* compiled from: RatingFormUploadServiceModule_ProvideUploadErrorStreamFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f248535a = new n();
    }

    public static n a() {
        return a.f248535a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j.f248534a.getClass();
        return new com.jakewharton.rxrelay3.c();
    }
}
