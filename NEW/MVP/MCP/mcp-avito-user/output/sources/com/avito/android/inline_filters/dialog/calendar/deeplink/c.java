package com.avito.android.inline_filters.dialog.calendar.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.inline_filters.dialog.calendar.j;
import com.avito.android.inline_filters.dialog.calendar.k;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersCalendarPickerDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final k f171208a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f171209b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f171210c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f171211d;

    public c(k kVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f171208a = kVar;
        this.f171209b = bVar;
        this.f171210c = bVar2;
        this.f171211d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f171208a.getClass();
        return new b(new j(), (a.d) this.f171209b.get(), (a.f) this.f171210c.get(), this.f171211d.get());
    }
}
