package FP0;

import com.avito.android.Y2;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WebViewAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f4704a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Y2> f4705b;

    public c(Provider<InterfaceC28373a> provider, Provider<Y2> provider2) {
        this.f4704a = provider;
        this.f4705b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f4704a.get(), this.f4705b.get());
    }
}
