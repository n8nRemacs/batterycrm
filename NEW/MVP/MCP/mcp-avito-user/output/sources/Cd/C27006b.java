package cD;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeaturedWidgetInteractor_Factory.java */
@e
@y
@x
/* renamed from: cD.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C27006b implements h<C27005a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.featured.b> f57795a;

    public C27006b(Provider<com.avito.android.serp.adapter.vertical_main.featured.b> provider) {
        this.f57795a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27005a(this.f57795a.get());
    }
}
