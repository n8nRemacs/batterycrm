package Do0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Do0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13427c implements h<C13426b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f3455a;

    public C13427c(Provider<InterfaceC28373a> provider) {
        this.f3455a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13426b(this.f3455a.get());
    }
}
