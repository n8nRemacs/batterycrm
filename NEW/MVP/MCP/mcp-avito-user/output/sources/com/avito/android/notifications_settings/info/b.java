package com.avito.android.notifications_settings.info;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationsSettingsInfoBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f208006a;

    public b(u uVar) {
        this.f208006a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f208006a.get());
    }
}
