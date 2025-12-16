package eB;

import com.avito.android.extended_profile_ui_components.search_input.suggest.f;
import com.avito.android.extended_profile_ui_components.search_input.suggest.g;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestItemModule_ProvideSuggestsItemBinderFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f395045a;

    public d(g gVar) {
        this.f395045a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        f fVar = (f) this.f395045a.get();
        C39982a.f395041a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(fVar);
        return c10493a.a();
    }
}
