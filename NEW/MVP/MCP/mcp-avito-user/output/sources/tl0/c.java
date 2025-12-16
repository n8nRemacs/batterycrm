package TL0;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PerformanceVasTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f15597a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f15598b;

    /* renamed from: c, reason: collision with root package name */
    public final u f15599c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f15597a = provider;
        this.f15598b = provider2;
        this.f15599c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f15597a.get(), this.f15598b.get(), (o) this.f15599c.get());
    }
}
