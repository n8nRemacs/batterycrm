package Qg;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BarcodeAnalyticsTracker_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<C14892a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f13972a;

    public b(Provider<InterfaceC28373a> provider) {
        this.f13972a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14892a(this.f13972a.get());
    }
}
