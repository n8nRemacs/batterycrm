package com.avito.android.inline_filters.dialog.calendar;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import com.avito.android.util.InterfaceC35745a5;
import java.util.List;
import javax.inject.Provider;

/* compiled from: InlineFiltersCalendarViewModelImplFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<KN.f> f171176a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<KN.c> f171177b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f171178c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.inline_filters.dialog.calendar.view.h> f171179d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f171180e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<CalendarPickerConstraints> f171181f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<HN.a<List<? extends MN.c>>> f171182g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f171183h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f171184i;

    public E(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f171176a = provider;
        this.f171177b = provider2;
        this.f171178c = provider3;
        this.f171179d = provider4;
        this.f171180e = provider5;
        this.f171181f = provider6;
        this.f171182g = provider7;
        this.f171183h = lVar;
        this.f171184i = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f171176a.get(), this.f171177b.get(), this.f171178c.get(), this.f171179d.get(), this.f171180e.get(), this.f171181f.get(), this.f171182g.get(), (FiltersCalendarPickerConfig) this.f171183h.f393949a, (FiltersCalendarPickerUiConfig) this.f171184i.f393949a);
    }
}
