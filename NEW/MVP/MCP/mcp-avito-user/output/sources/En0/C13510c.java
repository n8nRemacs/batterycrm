package En0;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.FbsEntryPointScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FbsEntryPointTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@e
@y
@x
/* renamed from: En0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13510c implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4230b;

    public C13510c(l lVar, Provider provider) {
        this.f4229a = provider;
        this.f4230b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f4229a.get();
        r rVar = (r) this.f4230b.f393949a;
        C13509b.f4228a.getClass();
        return interfaceC28481c.a(new C28478k(FbsEntryPointScreen.f90356d, rVar, "concrete-cancellation-reason"));
    }
}
