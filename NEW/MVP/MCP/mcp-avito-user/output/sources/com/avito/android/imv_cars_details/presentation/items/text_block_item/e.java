package com.avito.android.imv_cars_details.presentation.items.text_block_item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsTextBlockPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<WM.a>> f170237a;

    public e(Provider<l41.g<WM.a>> provider) {
        this.f170237a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f170237a.get());
    }
}
