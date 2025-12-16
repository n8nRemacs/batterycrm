package com.avito.android.bxcontent.mvi;

import android.content.res.Resources;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.search_bar.InterfaceC34826e;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BxContentSavedSearchPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class V0 implements dagger.internal.h<P0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f111487a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.libs.saved_searches.domain.i> f111488b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<TV.f> f111489c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f111490d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f111491e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f111492f;

    public V0(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f111487a = lVar;
        this.f111488b = provider;
        this.f111489c = provider2;
        this.f111490d = provider3;
        this.f111491e = lVar2;
        this.f111492f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new P0((SearchParams) this.f111487a.f393949a, this.f111488b.get(), this.f111489c.get(), this.f111490d.get(), (Resources) this.f111491e.f393949a, (InterfaceC34826e) this.f111492f.get());
    }
}
