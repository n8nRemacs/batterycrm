package com.avito.android.notification_center.list.item;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: NotificationCenterListItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f207630a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f207631b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f207632c;

    public q(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f207630a = provider;
        this.f207631b = lVar;
        this.f207632c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f207630a.get(), (Resources) this.f207631b.f393949a, (Y41.l) this.f207632c.f393949a);
    }
}
