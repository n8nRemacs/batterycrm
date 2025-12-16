package PI;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EnterDataAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f12951a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f12952b;

    public c(Provider<InterfaceC28373a> provider, Provider<Context> provider2) {
        this.f12951a = provider;
        this.f12952b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f12952b.get(), this.f12951a.get());
    }
}
