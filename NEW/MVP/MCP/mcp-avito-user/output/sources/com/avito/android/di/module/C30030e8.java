package com.avito.android.di.module;

import android.content.res.Resources;
import com.avito.android.C36135w2;
import com.avito.android.R;

/* compiled from: SerpItemConverterModule_ProvideAdvertXlConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.e8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30030e8 implements dagger.internal.h<com.avito.android.serp.adapter.advert_xl.D> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144279a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144280b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.serp.adapter.P f144281c;

    public C30030e8(dagger.internal.l lVar, dagger.internal.u uVar, com.avito.android.serp.adapter.P p12) {
        this.f144279a = lVar;
        this.f144280b = uVar;
        this.f144281c = p12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f144279a.f393949a;
        C36135w2 c36135w2 = (C36135w2) this.f144280b.get();
        com.avito.android.serp.adapter.N n12 = (com.avito.android.serp.adapter.N) this.f144281c.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.advert_xl.E(resources.getInteger(R.integer.advert_xl_span_count), c36135w2, n12);
    }
}
