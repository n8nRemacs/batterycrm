package GL;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacEnableDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f6460a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<F> f6461b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f6462c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<NL.e> f6463d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f6464e;

    public c(dagger.internal.f fVar, Provider provider, dagger.internal.f fVar2, Provider provider2, Provider provider3) {
        this.f6460a = fVar;
        this.f6461b = provider;
        this.f6462c = fVar2;
        this.f6463d = provider2;
        this.f6464e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.deeplink_handler.handler.composite.a) this.f6460a.get(), this.f6461b.get(), (InterfaceC28373a) this.f6462c.get(), this.f6463d.get(), this.f6464e.get());
    }
}
