package com.avito.android.serp.adapter.resizable_service_widget.row;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ResizableServiceWidgetRowItemConverter_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f270726a;

    public b(d dVar) {
        this.f270726a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f270726a.get());
    }
}
