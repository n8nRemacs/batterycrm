package Co0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchSettingsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.info.b f2681a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.chips.b f2682b;

    public e(com.avito.android.saved_searches.presentation.items.info.b bVar, com.avito.android.saved_searches.presentation.items.chips.b bVar2) {
        this.f2681a = bVar;
        this.f2682b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.saved_searches.presentation.items.info.a aVar = (com.avito.android.saved_searches.presentation.items.info.a) this.f2681a.get();
        com.avito.android.saved_searches.presentation.items.chips.a aVar2 = (com.avito.android.saved_searches.presentation.items.chips.a) this.f2682b.get();
        c.f2679a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
