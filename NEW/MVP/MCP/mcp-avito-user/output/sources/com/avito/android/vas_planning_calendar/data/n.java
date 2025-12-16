package com.avito.android.vas_planning_calendar.data;

import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.vas_planning_calendar.model.DateRange;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Date;

/* compiled from: PlanDataSourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f322623a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f322624b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f322625c;

    public n(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f322623a = lVar;
        this.f322624b = lVar2;
        this.f322625c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((Date) this.f322623a.f393949a, (DateRange) this.f322624b.f393949a, (CalendarSelectionType) this.f322625c.f393949a);
    }
}
