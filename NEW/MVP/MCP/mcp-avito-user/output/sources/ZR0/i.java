package Zr0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishModule_ProvidePublishMultiSelectItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.publish.item.a> f20533a;

    public i(Provider<com.avito.android.serp.adapter.vertical_main.publish.item.a> provider) {
        this.f20533a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.vertical_main.publish.item.a aVar = this.f20533a.get();
        int i12 = d.f20527a;
        return new com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.m(aVar);
    }
}
