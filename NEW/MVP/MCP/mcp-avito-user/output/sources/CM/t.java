package cM;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacProblemNotificationIacCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<QK.a> f57832a;

    public t(Provider<QK.a> provider) {
        this.f57832a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f57832a.get());
    }
}
