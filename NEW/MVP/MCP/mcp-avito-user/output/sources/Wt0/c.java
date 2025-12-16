package wt0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DaySettingsAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f441841a;

    /* renamed from: b, reason: collision with root package name */
    public final l f441842b;

    public c(l lVar, Provider provider) {
        this.f441841a = provider;
        this.f441842b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f441841a.get(), (String) this.f441842b.f393949a);
    }
}
