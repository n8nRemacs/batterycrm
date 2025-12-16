package com.avito.android.rating_form.select_item;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormSelectItemInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Vg0.d> f249024a;

    /* renamed from: b, reason: collision with root package name */
    public final l f249025b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249026c;

    /* renamed from: d, reason: collision with root package name */
    public final u f249027d;

    public h(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f249024a = provider;
        this.f249025b = lVar;
        this.f249026c = provider2;
        this.f249027d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f249024a.get(), (RatingFormSelectItemArguments) this.f249025b.f393949a, this.f249026c.get(), (com.avito.android.rating_form.custom_params.d) this.f249027d.get());
    }
}
