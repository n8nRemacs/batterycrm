package com.avito.android.calendar_select.domain;

import com.avito.android.calendar_select.CalendarSettings;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarLoadResultMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113361a;

    /* renamed from: b, reason: collision with root package name */
    public final l f113362b;

    public d(l lVar, u uVar) {
        this.f113361a = uVar;
        this.f113362b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.calendar_select.presentation.view.data.g) this.f113361a.get(), (CalendarSettings) this.f113362b.f393949a);
    }
}
