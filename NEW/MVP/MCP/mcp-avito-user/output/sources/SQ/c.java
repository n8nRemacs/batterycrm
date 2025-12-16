package Sq;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComparisonBodyItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.comparison.e> f15156a;

    public c(Provider<com.avito.android.comparison.e> provider) {
        this.f15156a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f15156a.get());
    }
}
