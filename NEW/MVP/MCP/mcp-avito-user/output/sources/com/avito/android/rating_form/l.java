package com.avito.android.rating_form;

import com.avito.android.photo_list_view.N;
import javax.inject.Provider;

/* compiled from: RatingFormFieldMapper_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N> f248688a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248689b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f248690c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34199b> f248691d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f248692e;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f248688a = provider;
        this.f248689b = lVar;
        this.f248690c = lVar2;
        this.f248691d = provider2;
        this.f248692e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f248688a.get(), (com.avito.android.deep_linking.links.w) this.f248689b.f393949a, (com.avito.android.deep_linking.links.x) this.f248690c.f393949a, this.f248691d.get(), (com.avito.android.rating_form.custom_params.d) this.f248692e.get());
    }
}
