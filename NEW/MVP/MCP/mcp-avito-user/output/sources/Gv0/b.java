package gv0;

import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PortfolioProjectBuyerTracker_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<C40742a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f396949a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f396950b;

    public b(Provider<InterfaceC28373a> provider, Provider<C29640d> provider2) {
        this.f396949a = provider;
        this.f396950b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40742a(this.f396949a.get(), this.f396950b.get());
    }
}
