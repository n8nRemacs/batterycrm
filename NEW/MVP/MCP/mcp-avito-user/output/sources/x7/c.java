package X7;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionToastAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f18642a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f18642a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f18642a.get());
    }
}
