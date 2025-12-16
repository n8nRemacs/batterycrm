package Bo0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchMainModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f1700a;

    public e(u uVar) {
        this.f1700a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.b bVar = (com.avito.android.recycler.data_aware.b) this.f1700a.get();
        c.f1696a.getClass();
        return new com.avito.android.recycler.data_aware.i(bVar, null, false, null, 14, null);
    }
}
