package JL;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CallStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f8883a;

    public c(C30214v6 c30214v6) {
        this.f8883a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((l) this.f8883a.get());
    }
}
