package B3;

import android.content.SharedPreferences;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PrefLastLoggedEmailStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f848a;

    public l(Provider<SharedPreferences> provider) {
        this.f848a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f848a.get());
    }
}
