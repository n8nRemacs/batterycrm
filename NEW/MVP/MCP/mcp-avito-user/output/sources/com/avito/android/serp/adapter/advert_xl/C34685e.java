package com.avito.android.serp.adapter.advert_xl;

import android.content.res.Resources;
import javax.inject.Provider;

/* compiled from: AdvertXlItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.advert_xl.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34685e implements dagger.internal.h<C34684d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f268832a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f268833b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f268834c;

    public C34685e(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f268832a = uVar;
        this.f268833b = provider;
        this.f268834c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34684d((h) this.f268832a.get(), this.f268833b.get(), (Resources) this.f268834c.f393949a);
    }
}
