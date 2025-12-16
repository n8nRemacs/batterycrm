package CW;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProgressItemModule_ProvideBlueprint$_avito_login_suggests_implFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f2196a;

    /* renamed from: b, reason: collision with root package name */
    public final u f2197b;

    public b(a aVar, u uVar) {
        this.f2196a = aVar;
        this.f2197b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.login_suggests_impl.adapter.progress.b bVar = (com.avito.android.login_suggests_impl.adapter.progress.b) this.f2197b.get();
        this.f2196a.getClass();
        return new com.avito.android.login_suggests_impl.adapter.progress.a(bVar);
    }
}
