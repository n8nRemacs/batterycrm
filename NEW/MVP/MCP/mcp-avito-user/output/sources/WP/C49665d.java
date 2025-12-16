package wp;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DigitalRegistrationAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: wp.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49665d implements h<C49664c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f441800a;

    public C49665d(Provider<InterfaceC28373a> provider) {
        this.f441800a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49664c(this.f441800a.get());
    }
}
