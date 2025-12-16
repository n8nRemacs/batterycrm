package zs;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditPartnerTrackerImpl_Factory.java */
@e
@y
@x
/* renamed from: zs.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50622c implements h<C50621b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f444308a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f444309b;

    /* renamed from: c, reason: collision with root package name */
    public final u f444310c;

    public C50622c(u uVar, Provider provider, Provider provider2) {
        this.f444308a = provider;
        this.f444309b = provider2;
        this.f444310c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50621b(this.f444308a.get(), this.f444309b.get(), (o) this.f444310c.get());
    }
}
