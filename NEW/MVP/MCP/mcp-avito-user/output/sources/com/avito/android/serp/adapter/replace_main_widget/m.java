package com.avito.android.serp.adapter.replace_main_widget;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReplaceMainWidgetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f270694a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f270695b;

    public m(dagger.internal.f fVar, Provider provider) {
        this.f270694a = provider;
        this.f270695b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f270694a.get(), dagger.internal.g.b(this.f270695b));
    }
}
