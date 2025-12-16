package KX;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mU.C44012a;

/* compiled from: MallAnalyticsImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f9507a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C44012a> f9508b;

    public d(Provider<InterfaceC28373a> provider, Provider<C44012a> provider2) {
        this.f9507a = provider;
        this.f9508b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f9507a.get(), this.f9508b.get());
    }
}
