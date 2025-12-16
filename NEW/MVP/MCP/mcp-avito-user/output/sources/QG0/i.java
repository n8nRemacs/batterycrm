package QG0;

import AK0.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UsedCarsFeedbackStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f13651a;

    public i(Provider<l> provider) {
        this.f13651a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f13651a.get());
    }
}
