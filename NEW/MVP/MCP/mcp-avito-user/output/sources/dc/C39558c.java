package dC;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetCarouselContainerItemModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* renamed from: dC.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39558c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_widgets.adapter.universal.single.b f393738a;

    public C39558c(com.avito.android.extended_profile_widgets.adapter.universal.single.b bVar) {
        this.f393738a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.extended_profile_widgets.adapter.universal.single.a aVar = (com.avito.android.extended_profile_widgets.adapter.universal.single.a) this.f393738a.get();
        int i12 = C39556a.f393736a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
