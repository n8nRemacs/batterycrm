package X9;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsGalleryFeedbackHelper_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f18725a;

    public d(Provider<SK0.b> provider) {
        this.f18725a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f18725a.get());
    }
}
