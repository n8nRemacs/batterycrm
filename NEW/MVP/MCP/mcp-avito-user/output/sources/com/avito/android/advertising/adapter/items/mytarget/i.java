package com.avito.android.advertising.adapter.items.mytarget;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MyTargetListBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f87628a;

    public i(Provider<j> provider) {
        this.f87628a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f87628a.get());
    }
}
