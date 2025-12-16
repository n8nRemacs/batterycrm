package com.avito.android.extended_profile_widgets.adapter.search.search_button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShowAllSearchButtonItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f154782a;

    public j(Provider<c> provider) {
        this.f154782a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f154782a.get());
    }
}
