package x7;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CsatServiceBookingFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<C49781c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f442242a;

    public d(Provider<SK0.b> provider) {
        this.f442242a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49781c(this.f442242a.get());
    }
}
