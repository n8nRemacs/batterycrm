package WI0;

import com.avito.android.user_adverts.tab_actions.host.items.l;
import com.avito.android.user_adverts.tab_actions.host.items.m;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsActionsModule_ProvideActionsItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_adverts.tab_actions.host.items.c f17846a;

    /* renamed from: b, reason: collision with root package name */
    public final m f17847b;

    public c(com.avito.android.user_adverts.tab_actions.host.items.c cVar, m mVar) {
        this.f17846a = cVar;
        this.f17847b = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.user_adverts.tab_actions.host.items.b bVar = (com.avito.android.user_adverts.tab_actions.host.items.b) this.f17846a.get();
        l lVar = (l) this.f17847b.get();
        b.f17845a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(lVar);
        return c10493a.a();
    }
}
