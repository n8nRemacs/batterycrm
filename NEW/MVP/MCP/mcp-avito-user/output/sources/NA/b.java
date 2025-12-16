package nA;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlaceholderItemModule_ProvideBlueprint$_avito_extended_profile_adverts_implFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<com.avito.android.extended_profile_adverts.adapter.placeholder.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C44222a f414914a;

    /* renamed from: b, reason: collision with root package name */
    public final u f414915b;

    public b(C44222a c44222a, u uVar) {
        this.f414914a = c44222a;
        this.f414915b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.extended_profile_adverts.adapter.placeholder.c cVar = (com.avito.android.extended_profile_adverts.adapter.placeholder.c) this.f414915b.get();
        this.f414914a.getClass();
        return new com.avito.android.extended_profile_adverts.adapter.placeholder.b(cVar);
    }
}
