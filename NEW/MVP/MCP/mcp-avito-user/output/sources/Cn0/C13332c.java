package Cn0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReasonDetailsBlueprintsModule_ProvideItemBinder$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Cn0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13332c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13330a f2672a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.c f2673b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.b f2674c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.b f2675d;

    public C13332c(C13330a c13330a, com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.c cVar, com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.b bVar, com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.b bVar2) {
        this.f2672a = c13330a;
        this.f2673b = cVar;
        this.f2674c = bVar;
        this.f2675d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.b bVar = (com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.b) this.f2673b.get();
        com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.a aVar = (com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.a) this.f2674c.get();
        com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.a aVar2 = (com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input.a) this.f2675d.get();
        this.f2672a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
