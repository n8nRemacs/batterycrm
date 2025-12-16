package Ew0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SilentUpdatePermissionsAnalytics_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f4421a;

    public d(Provider<InterfaceC28373a> provider) {
        this.f4421a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f4421a.get());
    }
}
