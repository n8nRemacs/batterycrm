package com.avito.android.publish.drafts.di;

import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishDraftsModule_ProvideAttributesTreeConverterFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<AttributesTreeConverter> {

    /* compiled from: PublishDraftsModule_ProvideAttributesTreeConverterFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f235351a = new j();
    }

    public static j a() {
        return a.f235351a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = h.f235345a;
        return new AttributesTreeConverter(null, null, null, null, 15, null);
    }
}
