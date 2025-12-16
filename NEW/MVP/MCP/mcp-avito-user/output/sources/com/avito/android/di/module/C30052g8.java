package com.avito.android.di.module;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideBigAdvertSpanCountProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.g8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30052g8 implements dagger.internal.h<com.avito.android.serp.adapter.G> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f144305a;

    public C30052g8(Provider<Resources> provider) {
        this.f144305a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = this.f144305a.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.b1(resources.getInteger(R.integer.serp_big_item_span_count));
    }
}
