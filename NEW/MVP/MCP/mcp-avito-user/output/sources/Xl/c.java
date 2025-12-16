package xL;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacSocketConnectionWatcherListener_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C49856a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AL.a> f442406a;

    public c(Provider<AL.a> provider) {
        this.f442406a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49856a(this.f442406a.get());
    }
}
