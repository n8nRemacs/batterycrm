package v90;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProStatsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f440488a;

    public j(Provider<Context> provider) {
        this.f440488a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f440488a.get();
        return new i();
    }
}
