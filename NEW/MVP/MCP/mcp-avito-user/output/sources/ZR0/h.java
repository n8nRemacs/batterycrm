package Zr0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishModule_ProvidePublishCheckboxBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.c> f20532a;

    public h(Provider<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.c> provider) {
        this.f20532a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.c cVar = this.f20532a.get();
        int i12 = d.f20527a;
        return new com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox.a(cVar);
    }
}
