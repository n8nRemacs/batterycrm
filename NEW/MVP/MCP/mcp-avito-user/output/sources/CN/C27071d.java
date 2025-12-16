package cN;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertOldPriceFormatter_Factory.java */
@e
@y
@x
/* renamed from: cN.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C27071d implements h<C27070c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f57836a;

    public C27071d(Provider<Locale> provider) {
        this.f57836a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27070c(this.f57836a.get());
    }
}
