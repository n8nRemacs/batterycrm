package iY;

import android.content.SharedPreferences;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ViewedPinsStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f398552a;

    public g(Provider<SharedPreferences> provider) {
        this.f398552a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f398552a.get());
    }
}
