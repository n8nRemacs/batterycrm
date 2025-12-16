package com.avito.android.serp.adapter.rich_snippets.realty;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: DevelopmentRichItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34764i implements dagger.internal.h<C34763h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f270987a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f270988b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f270989c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f270990d;

    public C34764i(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f270987a = uVar;
        this.f270988b = lVar;
        this.f270989c = provider;
        this.f270990d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34763h((InterfaceC34765j) this.f270987a.get(), (RecyclerView.t) this.f270988b.f393949a, this.f270989c.get(), this.f270990d.get());
    }
}
