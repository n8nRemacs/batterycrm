package d4;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdditionalSellerButtonItemShownTracker_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<C39503b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f393661a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f393662b;

    public c(Provider<InterfaceC28373a> provider, Provider<E> provider2) {
        this.f393661a = provider;
        this.f393662b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39503b(this.f393662b.get(), this.f393661a.get());
    }
}
