package Qx;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EarlyAccessUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C14947c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f14038a;

    public d(Provider<SK0.b> provider) {
        this.f14038a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14947c(this.f14038a.get());
    }
}
