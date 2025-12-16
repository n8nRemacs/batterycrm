package Ls0;

import com.avito.android.B2;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingAdditionalSettingsUxfLinksFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B2> f10165a;

    public e(Provider<B2> provider) {
        this.f10165a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f10165a.get());
    }
}
