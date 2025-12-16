package com.avito.android.di.module;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: SerpItemConverterModule_ProvideItemAdvertSpanCountProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.u8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30205u8 implements dagger.internal.h<com.avito.android.serp.adapter.G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144621a;

    public C30205u8(dagger.internal.l lVar) {
        this.f144621a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f144621a.f393949a;
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.b1(resources.getInteger(R.integer.serp_item_span_count));
    }
}
