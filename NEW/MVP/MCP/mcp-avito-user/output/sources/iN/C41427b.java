package in;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47101d;

/* compiled from: CartSimilarItemsBeduinModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: in.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C41427b implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f398751a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f398752b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f398753c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f398754d;

    /* renamed from: e, reason: collision with root package name */
    public final l f398755e;

    public C41427b(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f398751a = provider;
        this.f398752b = provider2;
        this.f398753c = provider3;
        this.f398754d = provider4;
        this.f398755e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = this.f398751a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f398752b.get();
        a.b bVar = this.f398753c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f398754d.get();
        C28478k c28478k = (C28478k) this.f398755e.f393949a;
        C41426a.f398750a.getClass();
        return d.a.a(dVar, aVar, bVar, new C47101d(screenPerformanceTracker), null, null, null, new C42699b(c28478k.f90636a.f90471b, Collections.singletonList(Owners.f210404F0), "CartSimilarItems", false, 8, null), 56);
    }
}
