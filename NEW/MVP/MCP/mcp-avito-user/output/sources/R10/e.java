package r10;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationFlowAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f429566a;

    public e(Provider<InterfaceC28373a> provider) {
        this.f429566a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f429566a.get());
    }
}
