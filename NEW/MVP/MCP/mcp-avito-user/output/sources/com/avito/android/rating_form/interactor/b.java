package com.avito.android.rating_form.interactor;

import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GsonBase64Converter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f248210a;

    public b(Provider<Gson> provider) {
        this.f248210a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f248210a.get());
    }
}
