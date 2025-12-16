package BW;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommonLoginItemModule_ProvideBlueprint$_avito_login_suggests_implFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f1436a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1437b;

    public b(a aVar, u uVar) {
        this.f1436a = aVar;
        this.f1437b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.login_suggests_impl.adapter.common_login.b bVar = (com.avito.android.login_suggests_impl.adapter.common_login.b) this.f1437b.get();
        this.f1436a.getClass();
        return new com.avito.android.login_suggests_impl.adapter.common_login.a(bVar);
    }
}
