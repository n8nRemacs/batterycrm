package jM0;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanFeedbackSessionStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C42285b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f405584a;

    public c(Provider<l> provider) {
        this.f405584a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42285b(this.f405584a.get());
    }
}
