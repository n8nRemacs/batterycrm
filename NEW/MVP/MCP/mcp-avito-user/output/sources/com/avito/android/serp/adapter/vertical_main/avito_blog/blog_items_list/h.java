package com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list;

import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.L0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoBlogArticleWidthProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<L0> f272621a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f272622b;

    /* renamed from: c, reason: collision with root package name */
    public final l f272623c;

    public h(l lVar, Provider provider, Provider provider2) {
        this.f272621a = provider;
        this.f272622b = provider2;
        this.f272623c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f272621a.get(), this.f272622b.get(), (Resources) this.f272623c.f393949a);
    }
}
