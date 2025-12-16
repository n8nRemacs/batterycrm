package y30;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import com.google.gson.Gson;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<C50051e> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f442875a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f442876b;

    public f(C30214v6 c30214v6, Provider provider) {
        this.f442875a = c30214v6;
        this.f442876b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50051e((l) this.f442875a.get(), dagger.internal.g.b(this.f442876b));
    }
}
