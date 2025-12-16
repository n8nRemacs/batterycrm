package w7;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CsatRatingFormFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f441296a;

    public d(Provider<SK0.b> provider) {
        this.f441296a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f441296a.get());
    }
}
