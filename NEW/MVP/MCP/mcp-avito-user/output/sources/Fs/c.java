package fs;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoInternalActionGeneratorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C40471b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.c f396165a;

    public c(com.avito.android.cpx_promo.c cVar) {
        this.f396165a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40471b((com.avito.android.cpx_promo.b) this.f396165a.get());
    }
}
