package com.avito.android.di.module;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: SerpItemConverterModule_ProvideIsTablet$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.t8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30194t8 implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144594a;

    public C30194t8(dagger.internal.l lVar) {
        this.f144594a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f144594a.f393949a;
        C29986a8.f144230a.getClass();
        return Boolean.valueOf(resources.getBoolean(R.bool.is_tablet));
    }
}
