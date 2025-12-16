package ZK0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipUxFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f20111a;

    public c(Provider<SK0.b> provider) {
        this.f20111a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f20111a.get());
    }
}
