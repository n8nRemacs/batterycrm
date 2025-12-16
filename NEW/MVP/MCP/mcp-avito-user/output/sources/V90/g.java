package v90;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProDashboardItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f440487a;

    public g(Provider<Context> provider) {
        this.f440487a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f440487a.get();
        return new f();
    }
}
