package W9;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f17814a;

    public e(Provider<SK0.b> provider) {
        this.f17814a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f17814a.get());
    }
}
