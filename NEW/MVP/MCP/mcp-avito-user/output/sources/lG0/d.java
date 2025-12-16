package lg0;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PushTokenStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<C43769c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f414144a;

    public d(C30214v6 c30214v6) {
        this.f414144a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43769c((l) this.f414144a.get());
    }
}
