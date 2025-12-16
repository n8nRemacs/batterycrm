package B3;

import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PrefLastUserStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f850a;

    public n(C30214v6 c30214v6) {
        this.f850a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((AK0.l) this.f850a.get());
    }
}
