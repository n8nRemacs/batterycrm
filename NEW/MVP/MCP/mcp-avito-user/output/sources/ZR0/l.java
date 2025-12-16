package Zr0;

import com.avito.android.serp.adapter.vertical_main.q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishModule_ProvideVerticalSearchFilterItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<com.avito.android.serp.adapter.vertical_main.publish.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<q> f20538a;

    public l(Provider<q> provider) {
        this.f20538a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = this.f20538a.get();
        int i12 = d.f20527a;
        return new com.avito.android.serp.adapter.vertical_main.publish.item.a(qVar);
    }
}
