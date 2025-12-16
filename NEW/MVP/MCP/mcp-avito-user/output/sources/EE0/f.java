package EE0;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f3902a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f3903b;

    /* renamed from: c, reason: collision with root package name */
    public final u f3904c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f3902a = provider;
        this.f3903b = provider2;
        this.f3904c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f3902a.get(), this.f3903b.get(), (o) this.f3904c.get());
    }
}
