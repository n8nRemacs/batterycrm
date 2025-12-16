package com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts;

import com.avito.android.section.item.s;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: OtherAdvertsItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f155514a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<s> f155515b;

    public f(u uVar, Provider provider) {
        this.f155514a = uVar;
        this.f155515b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y1) this.f155514a.get(), this.f155515b.get());
    }
}
