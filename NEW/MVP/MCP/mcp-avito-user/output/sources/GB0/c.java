package GB0;

import com.avito.android.util.C35793f6;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxLevelsMapperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C35793f6> f6364a;

    public c(Provider<C35793f6> provider) {
        this.f6364a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f6364a.get());
    }
}
