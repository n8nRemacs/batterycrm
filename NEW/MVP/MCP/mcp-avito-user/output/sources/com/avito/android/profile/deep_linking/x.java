package com.avito.android.profile.deep_linking;

/* compiled from: ProfileTfaSettingsSyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f221933a;

    public x(dagger.internal.f fVar) {
        this.f221933a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((com.avito.android.deeplink_handler.handler.composite.a) this.f221933a.get());
    }
}
