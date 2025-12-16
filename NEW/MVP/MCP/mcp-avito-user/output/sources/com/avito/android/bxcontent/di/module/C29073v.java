package com.avito.android.bxcontent.di.module;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.bxcontent.di.module.C29070s;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;

/* compiled from: BxContentModule_ProvideBannerPageSourceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29073v implements dagger.internal.h<BannerPageSource> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f111026a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f111027b;

    public C29073v(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f111026a = lVar;
        this.f111027b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PresentationType presentationType = (PresentationType) this.f111026a.f393949a;
        String str = (String) this.f111027b.f393949a;
        C29070s.f111022a.getClass();
        String strA = C35800g5.a(new C35792f5(str));
        return (strA == null || strA.length() == 0) ? C29070s.b.f111023a[presentationType.ordinal()] == 1 ? BannerPageSource.f87777c : BannerPageSource.f87778d : BannerPageSource.f87782h;
    }
}
