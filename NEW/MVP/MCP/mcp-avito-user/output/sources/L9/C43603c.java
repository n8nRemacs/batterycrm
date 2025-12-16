package l9;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectParametersV2Module_Companion_ProvideAutoSelectAdvantageItemBinderFactory.java */
@e
@y
@x
/* renamed from: l9.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C43603c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_core.auto_select_parameters_v2.advantage.b f413547a;

    public C43603c(com.avito.android.advert_core.auto_select_parameters_v2.advantage.b bVar) {
        this.f413547a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_core.auto_select_parameters_v2.advantage.a aVar = (com.avito.android.advert_core.auto_select_parameters_v2.advantage.a) this.f413547a.get();
        InterfaceC43602b.f413545a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
