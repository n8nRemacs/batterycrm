package com.avito.android.advert_core.expand_items_button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpandItemsButtonPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f83586a;

    public j(Provider<f> provider) {
        this.f83586a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f83586a.get());
    }
}
