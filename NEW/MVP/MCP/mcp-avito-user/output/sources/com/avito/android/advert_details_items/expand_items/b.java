package com.avito.android.advert_details_items.expand_items;

import com.avito.android.advert_core.expand_items_button.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpandItemsButtonRe23Blueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f84653a;

    public b(Provider<g> provider) {
        this.f84653a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f84653a.get());
    }
}
