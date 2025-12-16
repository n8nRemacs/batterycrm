package bf0;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactMethodResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: bf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C25644c implements dagger.internal.h<C25643b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f57319a;

    public C25644c(Provider<Context> provider) {
        this.f57319a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C25643b(this.f57319a.get());
    }
}
