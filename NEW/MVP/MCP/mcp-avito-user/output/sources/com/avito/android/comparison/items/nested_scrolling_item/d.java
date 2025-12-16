package com.avito.android.comparison.items.nested_scrolling_item;

import com.avito.android.comparison.q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NestedScrollingBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final g f124007a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<q> f124008b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f124009c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<io.reactivex.rxjava3.subjects.b<Integer>> f124010d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.comparison.text_measurer.a> f124011e;

    public d(g gVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f124007a = gVar;
        this.f124008b = provider;
        this.f124009c = provider2;
        this.f124010d = provider3;
        this.f124011e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f124007a.getClass();
        return new c(new f(), this.f124008b.get(), this.f124009c.get(), this.f124010d.get(), this.f124011e.get());
    }
}
