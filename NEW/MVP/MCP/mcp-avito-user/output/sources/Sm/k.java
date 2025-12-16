package sM;

import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RunOnceLinkStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f437623a;

    public k(C30214v6 c30214v6) {
        this.f437623a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((AK0.l) this.f437623a.get());
    }
}
