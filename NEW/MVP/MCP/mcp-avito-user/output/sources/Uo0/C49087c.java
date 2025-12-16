package uo0;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SafetySettingsModule_ProvideScreenPerformanceTrackerFactory.java */
@e
@y
@x
/* renamed from: uo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49087c implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f440284a;

    /* renamed from: b, reason: collision with root package name */
    public final l f440285b;

    public C49087c(l lVar, Provider provider) {
        this.f440284a = provider;
        this.f440285b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f440284a.get();
        C28478k c28478k = (C28478k) this.f440285b.f393949a;
        C49086b.f440283a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
