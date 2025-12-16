package com.avito.android.rating_ui.attributed_text;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAttributedTextItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<b>> f249949a;

    public i(Provider<l41.g<b>> provider) {
        this.f249949a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f249949a.get());
    }
}
