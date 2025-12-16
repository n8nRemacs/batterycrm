package x00;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ManagerUspAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<C49713b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f441936a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f441936a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49713b(this.f441936a.get());
    }
}
