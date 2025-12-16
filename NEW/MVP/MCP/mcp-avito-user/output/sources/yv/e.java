package yv;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceReductionAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f443604a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f443605b;

    public e(l lVar, Provider provider) {
        this.f443604a = lVar;
        this.f443605b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(((Long) this.f443604a.f393949a).longValue(), this.f443605b.get());
    }
}
