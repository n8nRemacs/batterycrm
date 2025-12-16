package z5;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertGigPresenterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f443836a;

    public c(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f443836a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f443836a.get());
    }
}
