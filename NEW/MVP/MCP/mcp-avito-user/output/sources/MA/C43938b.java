package mA;

import com.avito.android.extended_profile_adverts.adapter.loading_item.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PageLoadingItemModule_ProvideBlueprint$_avito_extended_profile_adverts_implFactory.java */
@e
@y
@x
/* renamed from: mA.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43938b implements h<com.avito.android.extended_profile_adverts.adapter.loading_item.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C43937a f414354a;

    /* renamed from: b, reason: collision with root package name */
    public final u f414355b;

    public C43938b(C43937a c43937a, u uVar) {
        this.f414354a = c43937a;
        this.f414355b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f414355b.get();
        this.f414354a.getClass();
        return new com.avito.android.extended_profile_adverts.adapter.loading_item.c(dVar);
    }
}
