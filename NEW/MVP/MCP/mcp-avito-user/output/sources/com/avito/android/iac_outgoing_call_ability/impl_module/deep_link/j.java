package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

/* compiled from: IacLaunchCallAfterCanCallLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f168592a;

    public j(dagger.internal.f fVar) {
        this.f168592a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.deeplink_handler.handler.composite.a) this.f168592a.get());
    }
}
