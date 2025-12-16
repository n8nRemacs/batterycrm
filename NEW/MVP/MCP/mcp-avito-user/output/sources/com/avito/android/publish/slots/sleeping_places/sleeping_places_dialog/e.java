package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wf0.C49618c;

/* compiled from: SleepingPlacesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.d f245017a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.b f245018b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.f f245019c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.h f245020d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f245021e;

    public e(com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.d dVar, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.b bVar, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.f fVar, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.h hVar, Provider provider) {
        this.f245017a = dVar;
        this.f245018b = bVar;
        this.f245019c = fVar;
        this.f245020d = hVar;
        this.f245021e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.c cVar = (com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.c) this.f245017a.get();
        this.f245018b.getClass();
        com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.a aVar = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.a();
        this.f245019c.getClass();
        com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.e eVar = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.e();
        com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.g gVar = (com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.g) this.f245020d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f245021e.get();
        C49618c.f441725g.getClass();
        return new d("SleepingPlacesDialog", C49618c.f441726h, new c(cVar, aVar, screenPerformanceTracker, gVar, eVar));
    }
}
