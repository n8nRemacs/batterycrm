package f90;

import com.avito.android.di.module.C30214v6;

/* compiled from: PrefSessionStorage_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f395707a;

    public w(C30214v6 c30214v6) {
        this.f395707a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v((AK0.l) this.f395707a.get());
    }
}
