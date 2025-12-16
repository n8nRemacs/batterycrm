package com.avito.android.avl_entry.impl.ui.internal_item.video;

import Lg.InterfaceC14392c;
import com.avito.android.account.E;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortVideosWidgetCarouselItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14392c> f98602a;

    /* renamed from: b, reason: collision with root package name */
    public final l f98603b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.avl_analytics.a> f98604c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f98605d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f98606e;

    public h(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f98602a = provider;
        this.f98603b = lVar;
        this.f98604c = provider2;
        this.f98605d = provider3;
        this.f98606e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f98602a.get(), (com.avito.android.avl_entry.impl.util.d) this.f98603b.f393949a, this.f98604c.get(), this.f98605d.get(), this.f98606e.get());
    }
}
