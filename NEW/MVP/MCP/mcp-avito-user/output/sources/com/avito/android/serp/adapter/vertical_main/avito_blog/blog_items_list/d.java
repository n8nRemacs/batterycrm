package com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list;

import com.avito.android.C36135w2;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoBlogArticlePresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f272608a;

    /* renamed from: b, reason: collision with root package name */
    public final h f272609b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f272610c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C36135w2> f272611d;

    /* renamed from: e, reason: collision with root package name */
    public final u f272612e;

    public d(dagger.internal.f fVar, h hVar, Provider provider, Provider provider2, u uVar) {
        this.f272608a = fVar;
        this.f272609b = hVar;
        this.f272610c = provider;
        this.f272611d = provider2;
        this.f272612e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f272608a), (g) this.f272609b.get(), this.f272610c.get(), this.f272611d.get(), (com.avito.android.serp.adapter.vertical_main.avito_blog.a) this.f272612e.get());
    }
}
