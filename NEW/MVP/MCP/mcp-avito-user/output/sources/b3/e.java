package B3;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoginSuggestStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.db.sqlbrite.a> f846a;

    public e(Provider<com.avito.android.db.sqlbrite.a> provider) {
        this.f846a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f846a.get());
    }
}
