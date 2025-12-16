package zl;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.brand_global_rubricator.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import dk.InterfaceC39743e;
import javax.inject.Provider;

/* compiled from: BrandGlobalRubricatorModule_ProvidePresenterFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39743e> f444216a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f444217b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f444218c;

    public c(Provider<InterfaceC39743e> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2, Provider<InterfaceC28373a> provider3) {
        this.f444216a = provider;
        this.f444217b = provider2;
        this.f444218c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC39743e interfaceC39743e = this.f444216a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f444217b.get();
        InterfaceC28373a interfaceC28373a = this.f444218c.get();
        C50583a.f444213a.getClass();
        return interfaceC39743e.a(interfaceC28373a, aVar);
    }
}
