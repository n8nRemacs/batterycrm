package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SetProfileNameActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final M50.c f212171a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f212172b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f212173c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f212174d;

    /* renamed from: e, reason: collision with root package name */
    public final u f212175e;

    public g(M50.c cVar, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, u uVar) {
        this.f212171a = cVar;
        this.f212172b = lVar;
        this.f212173c = lVar2;
        this.f212174d = provider;
        this.f212175e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((M50.a) this.f212171a.get(), (SetProfileNameArgs) this.f212172b.f393949a, (Z1) this.f212173c.f393949a, this.f212174d.get(), (com.avito.android.passport.profile_add.domain.interactor.a) this.f212175e.get());
    }
}
