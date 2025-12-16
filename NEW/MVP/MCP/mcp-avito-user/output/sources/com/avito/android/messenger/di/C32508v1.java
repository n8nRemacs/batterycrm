package com.avito.android.messenger.di;

import android.app.Application;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideMessengerPreferencesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.v1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32508v1 implements dagger.internal.h<AK0.l> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196303a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f196304b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AK0.i> f196305c;

    public C32508v1(U0 u02, dagger.internal.l lVar, Provider provider) {
        this.f196303a = u02;
        this.f196304b = lVar;
        this.f196305c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f196304b.f393949a;
        AK0.i iVar = this.f196305c.get();
        this.f196303a.getClass();
        return iVar.a(application, NotificationsSettings.Section.SECTION_MESSENGER);
    }
}
