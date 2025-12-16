package Sq;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonHeaderItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f15158a;

    public f(u uVar) {
        this.f15158a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.comparison.e) this.f15158a.get());
    }
}
