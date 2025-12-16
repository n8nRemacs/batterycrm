package com.avito.android.calendar_select.presentation.mvicalendarselect.mvi;

import com.avito.android.calendar_select.CalendarSettings;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalendarSelectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f113436a;

    /* renamed from: b, reason: collision with root package name */
    public final u f113437b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.calendar_select.presentation.view.data.g> f113438c;

    public f(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f113436a = lVar;
        this.f113437b = uVar;
        this.f113438c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((CalendarSettings) this.f113436a.f393949a, (com.avito.android.calendar_select.domain.e) this.f113437b.get(), this.f113438c.get());
    }
}
