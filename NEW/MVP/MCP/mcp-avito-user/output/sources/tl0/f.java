package TL0;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualVasTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f15606a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f15607b;

    /* renamed from: c, reason: collision with root package name */
    public final u f15608c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.vas_performance.di.visual_legacy.d f15609d;

    public f(Provider provider, Provider provider2, u uVar, com.avito.android.vas_performance.di.visual_legacy.d dVar) {
        this.f15606a = provider;
        this.f15607b = provider2;
        this.f15608c = uVar;
        this.f15609d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f15606a.get(), this.f15607b.get(), (o) this.f15608c.get(), (String) this.f15609d.get());
    }
}
