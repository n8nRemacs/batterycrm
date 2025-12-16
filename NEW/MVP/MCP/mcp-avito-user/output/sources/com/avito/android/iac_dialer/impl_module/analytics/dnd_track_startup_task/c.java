package com.avito.android.iac_dialer.impl_module.analytics.dnd_track_startup_task;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.notification.m;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DndTrackStartupTask_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<DndTrackStartupTask> {

    /* renamed from: a, reason: collision with root package name */
    public final f f165668a;

    /* renamed from: b, reason: collision with root package name */
    public final f f165669b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f165670c;

    public c(f fVar, f fVar2, Provider provider) {
        this.f165668a = fVar;
        this.f165669b = fVar2;
        this.f165670c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new DndTrackStartupTask((m) this.f165668a.get(), (InterfaceC28373a) this.f165669b.get(), this.f165670c.get());
    }
}
