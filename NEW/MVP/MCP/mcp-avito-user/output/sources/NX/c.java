package Nx;

import android.content.Context;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StringsProviderImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f11875a;

    public c(Provider<Context> provider) {
        this.f11875a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f11875a.get());
    }
}
