package DW;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestItemModule_ProvideBlueprint$_avito_login_suggests_implFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final u f3218b;

    public b(a aVar, u uVar) {
        this.f3217a = aVar;
        this.f3218b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.login_suggests_impl.adapter.suggest.b bVar = (com.avito.android.login_suggests_impl.adapter.suggest.b) this.f3218b.get();
        this.f3217a.getClass();
        return new com.avito.android.login_suggests_impl.adapter.suggest.a(bVar);
    }
}
