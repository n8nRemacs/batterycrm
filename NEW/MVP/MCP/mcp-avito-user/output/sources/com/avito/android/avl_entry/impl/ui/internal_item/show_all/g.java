package com.avito.android.avl_entry.impl.ui.internal_item.show_all;

import Fg.InterfaceC13800a;
import Lg.InterfaceC14392c;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortVideosShowAllWidgetCarouselItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f98575a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14392c> f98576b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.avl_analytics.a> f98577c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f98578d;

    public g(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f98575a = uVar;
        this.f98576b = provider;
        this.f98577c = provider2;
        this.f98578d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((InterfaceC13800a) this.f98575a.get(), this.f98576b.get(), this.f98577c.get(), this.f98578d.get());
    }
}
