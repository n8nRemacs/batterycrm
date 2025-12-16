package com.avito.android.serp.adapter.resizable_service_widget.row.item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ResizableServiceWidgetRowBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f270743a;

    public b(Provider<e> provider) {
        this.f270743a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f270743a.get());
    }
}
