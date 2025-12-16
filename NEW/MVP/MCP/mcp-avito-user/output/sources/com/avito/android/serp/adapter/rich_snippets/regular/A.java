package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertRichSmallItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class A implements dagger.internal.h<C34802z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271024a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271025b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271026c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271027d;

    public A(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271024a = provider;
        this.f271025b = lVar;
        this.f271026c = provider2;
        this.f271027d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34802z(this.f271024a.get(), (RecyclerView.t) this.f271025b.f393949a, this.f271026c.get(), this.f271027d.get());
    }
}
