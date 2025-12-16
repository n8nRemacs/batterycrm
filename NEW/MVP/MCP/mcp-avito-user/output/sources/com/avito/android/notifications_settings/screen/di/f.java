package com.avito.android.notifications_settings.screen.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationsSettingsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.notifications_settings.info.b f208086a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.notifications_settings.title.b f208087b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.notifications_settings.toggle.b f208088c;

    public f(com.avito.android.notifications_settings.info.b bVar, com.avito.android.notifications_settings.title.b bVar2, com.avito.android.notifications_settings.toggle.b bVar3) {
        this.f208086a = bVar;
        this.f208087b = bVar2;
        this.f208088c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.notifications_settings.info.a aVar = (com.avito.android.notifications_settings.info.a) this.f208086a.get();
        com.avito.android.notifications_settings.title.a aVar2 = (com.avito.android.notifications_settings.title.a) this.f208087b.get();
        com.avito.android.notifications_settings.toggle.a aVar3 = (com.avito.android.notifications_settings.toggle.a) this.f208088c.get();
        int i12 = d.f208084a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
