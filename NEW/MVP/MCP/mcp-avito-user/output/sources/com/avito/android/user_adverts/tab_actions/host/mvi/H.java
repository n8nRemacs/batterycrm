package com.avito.android.user_adverts.tab_actions.host.mvi;

/* compiled from: UserAdvertsActionsReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_adverts.tab_actions.host.converter.f f314395a;

    public H(com.avito.android.user_adverts.tab_actions.host.converter.f fVar) {
        this.f314395a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G((com.avito.android.user_adverts.tab_actions.host.converter.d) this.f314395a.get());
    }
}
