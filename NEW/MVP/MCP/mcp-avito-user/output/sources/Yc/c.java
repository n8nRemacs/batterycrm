package yc;

import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishAnalyticsDataProvider_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C50213a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f443216a;

    public c(Provider<C> provider) {
        this.f443216a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f443216a.get().o().getClass();
        return new C50213a(false);
    }
}
