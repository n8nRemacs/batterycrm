package gs0;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalMainAfterStoriesUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f396894a;

    public d(Provider<SK0.b> provider) {
        this.f396894a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f396894a.get());
    }
}
