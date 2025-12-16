package N90;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AvitoFinanceBlocksInfoImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f11244a;

    public d(Provider<Locale> provider) {
        this.f11244a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f11244a.get());
    }
}
