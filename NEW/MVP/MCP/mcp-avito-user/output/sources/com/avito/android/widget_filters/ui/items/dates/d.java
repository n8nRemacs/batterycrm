package com.avito.android.widget_filters.ui.items.dates;

import androidx.fragment.app.FragmentManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WidgetFiltersDatesWidgetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f330370a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f330371b;

    public d(j jVar, dagger.internal.l lVar) {
        this.f330370a = jVar;
        this.f330371b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((i) this.f330370a.get(), (FragmentManager) this.f330371b.f393949a);
    }
}
