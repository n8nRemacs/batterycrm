package com.avito.android.search.filter.adapter.banner_chekbox_with_image;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BannerCheckBoxWithImagePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f261976a;

    public j(Provider<InterfaceC34581l> provider) {
        this.f261976a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f261976a.get());
    }
}
