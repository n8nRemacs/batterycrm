package GP0;

import com.avito.android.P;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppVersionHeaderProviderImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<P> f6496a;

    public d(Provider<P> provider) {
        this.f6496a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f6496a.get());
    }
}
