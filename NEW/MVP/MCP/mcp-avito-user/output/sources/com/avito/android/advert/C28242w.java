package com.avito.android.advert;

import android.content.res.Resources;
import com.avito.android.di.module.C30125n4;

/* compiled from: AdvertDetailsResourcesProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28242w implements dagger.internal.h<C28241v> {

    /* renamed from: a, reason: collision with root package name */
    public final C30125n4 f81070a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f81071b;

    public C28242w(C30125n4 c30125n4, dagger.internal.l lVar) {
        this.f81070a = c30125n4;
        this.f81071b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28241v((com.avito.android.date_time_formatter.b) this.f81070a.get(), (Resources) this.f81071b.f393949a);
    }
}
