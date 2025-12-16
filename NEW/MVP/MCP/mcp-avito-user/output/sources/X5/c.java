package x5;

import com.avito.android.analytics.InterfaceC28373a;
import com.google.gson.Gson;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAddressGeoDistanceAnalyticsImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f442214a;

    /* renamed from: b, reason: collision with root package name */
    public final l f442215b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f442216c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f442214a = provider;
        this.f442215b = lVar;
        this.f442216c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f442214a.get(), (String) this.f442215b.f393949a, this.f442216c.get());
    }
}
