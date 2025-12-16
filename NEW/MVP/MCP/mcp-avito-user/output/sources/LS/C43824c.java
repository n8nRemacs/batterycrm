package ls;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoV2InternalActionGeneratorImpl_Factory.java */
@e
@y
@x
/* renamed from: ls.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43824c implements h<C43823b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.c f414221a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.cpx_promo.v2.b f414222b;

    public C43824c(com.avito.android.cpx_promo.c cVar, com.avito.android.cpx_promo.v2.b bVar) {
        this.f414221a = cVar;
        this.f414222b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43823b((com.avito.android.cpx_promo.b) this.f414221a.get(), (com.avito.android.cpx_promo.v2.a) this.f414222b.get());
    }
}
