package com.avito.android.vas_planning_calendar.data;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlanCalendarResourceProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f322619a;

    public k(dagger.internal.l lVar) {
        this.f322619a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Resources) this.f322619a.f393949a);
    }
}
