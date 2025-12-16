package com.avito.android.serp.adapter.resizable_service_widget.block.item;

import com.avito.android.serp.analytics.widgets_tracker.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ResizableServiceWidgetBlockPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f270718a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f270719b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<g> f270720c;

    public e(dagger.internal.f fVar, u uVar, Provider provider) {
        this.f270718a = uVar;
        this.f270719b = fVar;
        this.f270720c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.serp.adapter.resizable_service_widget.row.item.e) this.f270718a.get(), dagger.internal.g.b(this.f270719b), this.f270720c.get());
    }
}
