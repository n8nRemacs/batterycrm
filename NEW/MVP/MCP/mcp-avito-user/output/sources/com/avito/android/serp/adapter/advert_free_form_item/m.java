package com.avito.android.serp.adapter.advert_free_form_item;

import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertFreeFormItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f268736a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.empty_placeholder.a> f268737b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f268738c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<A> f268739d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f268740e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f268741f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f268742g;

    public m(dagger.internal.f fVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.f fVar2) {
        this.f268736a = fVar;
        this.f268737b = provider;
        this.f268738c = provider2;
        this.f268739d = provider3;
        this.f268740e = provider4;
        this.f268741f = provider5;
        this.f268742g = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(dagger.internal.g.b(this.f268736a), this.f268737b.get(), dagger.internal.g.b(this.f268738c), this.f268739d.get(), this.f268740e.get(), this.f268741f.get(), dagger.internal.g.b(this.f268742g));
    }
}
