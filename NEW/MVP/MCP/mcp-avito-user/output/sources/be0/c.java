package Be0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishVinScannerEventTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<C13141b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f1574a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f1575b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.x> f1576c;

    public c(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2, Provider<com.avito.android.permissions.x> provider3) {
        this.f1574a = provider;
        this.f1575b = provider2;
        this.f1576c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13141b(this.f1574a.get(), this.f1575b.get(), this.f1576c.get());
    }
}
