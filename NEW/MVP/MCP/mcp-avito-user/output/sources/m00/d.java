package M00;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreApprovalFormAnalyticsHandlerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f10336a;

    public d(Provider<InterfaceC28373a> provider) {
        this.f10336a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f10336a.get());
    }
}
