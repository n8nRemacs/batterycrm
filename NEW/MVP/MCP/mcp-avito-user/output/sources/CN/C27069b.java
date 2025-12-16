package cN;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertNormalizedPriceFormatter_Factory.java */
@e
@y
@x
/* renamed from: cN.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C27069b implements h<C27068a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f57835a;

    public C27069b(Provider<Locale> provider) {
        this.f57835a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27068a(this.f57835a.get());
    }
}
