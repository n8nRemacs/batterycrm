package Y00;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: MortgageRootAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Y00.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C18245f implements dagger.internal.h<C18244e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f19229a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f19230b;

    public C18245f(dagger.internal.u uVar, Provider provider) {
        this.f19229a = provider;
        this.f19230b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C18244e(this.f19229a.get(), (InterfaceC18246g) this.f19230b.get());
    }
}
