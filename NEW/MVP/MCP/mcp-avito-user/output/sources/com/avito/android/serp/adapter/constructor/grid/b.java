package com.avito.android.serp.adapter.constructor.grid;

import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.serp.adapter.E0;
import com.avito.android.serp.adapter.F0;
import com.avito.android.serp.adapter.constructor.A;
import com.avito.android.video_snippets.g;
import com.avito.android.visual_rubricator.ab.NewRubricatorAbTestGroup;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: SerpConstructorAdvertGridBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f269477a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f269478b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f269479c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f269480d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<g> f269481e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C36135w2> f269482f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<RecyclerView.t> f269483g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<l<NewRubricatorAbTestGroup>> f269484h;

    public b(Provider provider, F0 f02, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f269477a = provider;
        this.f269478b = f02;
        this.f269479c = provider2;
        this.f269480d = provider3;
        this.f269481e = provider4;
        this.f269482f = provider5;
        this.f269483g = provider6;
        this.f269484h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f269477a.get(), (E0) this.f269478b.get(), this.f269479c.get(), this.f269480d.get(), this.f269481e.get(), this.f269482f.get(), this.f269483g.get(), this.f269484h.get());
    }
}
