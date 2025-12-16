package com.avito.android.select.sectioned_multiselect.tab;

import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import com.avito.android.select.sectioned_multiselect.core.N;
import com.avito.android.select.sectioned_multiselect.core.O;
import com.avito.android.select.sectioned_multiselect.core.P;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import io.reactivex.rxjava3.core.z;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectTabPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266802a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.select.sectioned_multiselect.Items.section_item.d> f266803b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.d> f266804c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d> f266805d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f266806e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.core.di.k f266807f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.d f266808g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.select.glow_animation.f> f266809h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<z<PaginationState>> f266810i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.select.g> f266811j;

    /* renamed from: k, reason: collision with root package name */
    public final O f266812k;

    public r(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, com.avito.android.select.sectioned_multiselect.core.di.k kVar, com.avito.android.select.sectioned_multiselect.d dVar, Provider provider5, Provider provider6, Provider provider7, O o12) {
        this.f266802a = lVar;
        this.f266803b = provider;
        this.f266804c = provider2;
        this.f266805d = provider3;
        this.f266806e = provider4;
        this.f266807f = kVar;
        this.f266808g = dVar;
        this.f266809h = provider5;
        this.f266810i = provider6;
        this.f266811j = provider7;
        this.f266812k = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((String) this.f266802a.f393949a, this.f266803b.get(), this.f266804c.get(), this.f266805d.get(), this.f266806e.get(), (P) this.f266807f.get(), (com.avito.android.select.sectioned_multiselect.b) this.f266808g.get(), this.f266809h.get(), this.f266810i.get(), this.f266811j.get(), (N) this.f266812k.get());
    }
}
