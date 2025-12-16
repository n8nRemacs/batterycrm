package dA0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessBlueprintsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: dA0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39550c implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.success.konveyor.header.b f393716a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.success.konveyor.title.b f393717b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.success.konveyor.service.b f393718c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.success.konveyor.charity.b f393719d;

    public C39550c(com.avito.android.success.konveyor.header.b bVar, com.avito.android.success.konveyor.title.b bVar2, com.avito.android.success.konveyor.service.b bVar3, com.avito.android.success.konveyor.charity.b bVar4) {
        this.f393716a = bVar;
        this.f393717b = bVar2;
        this.f393718c = bVar3;
        this.f393719d = bVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.success.konveyor.header.a aVar = (com.avito.android.success.konveyor.header.a) this.f393716a.get();
        com.avito.android.success.konveyor.title.a aVar2 = (com.avito.android.success.konveyor.title.a) this.f393717b.get();
        com.avito.android.success.konveyor.service.a aVar3 = (com.avito.android.success.konveyor.service.a) this.f393718c.get();
        com.avito.android.success.konveyor.charity.a aVar4 = (com.avito.android.success.konveyor.charity.a) this.f393719d.get();
        C39548a.f393714a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        return c10493a.a();
    }
}
