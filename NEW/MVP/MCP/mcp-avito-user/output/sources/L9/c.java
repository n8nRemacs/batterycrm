package L9;

import com.avito.android.recycler.data_aware.g;
import com.avito.android.recycler.data_aware.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertPriceListSectionModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.recycler.data_aware.h f9811a;

    public c(com.avito.android.recycler.data_aware.h hVar) {
        this.f9811a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f9811a.getClass();
        g gVar = new g();
        b.f9810a.getClass();
        return new i(gVar, null, false, null, 10, null);
    }
}
