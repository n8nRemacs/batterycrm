package sA0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestLocationsAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C48021b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f437505a;

    /* renamed from: b, reason: collision with root package name */
    public final l f437506b;

    public c(l lVar, Provider provider) {
        this.f437505a = provider;
        this.f437506b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C48021b(this.f437505a.get(), (String) this.f437506b.f393949a);
    }
}
