package com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishMethodWithAllSelectedBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f237091a;

    public f(Provider<g> provider) {
        this.f237091a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f237091a.get());
    }
}
