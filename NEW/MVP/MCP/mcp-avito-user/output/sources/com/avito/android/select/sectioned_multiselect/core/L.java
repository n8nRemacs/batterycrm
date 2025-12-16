package com.avito.android.select.sectioned_multiselect.core;

import android.os.Bundle;
import cE.C27025b;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectDialogPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class L implements dagger.internal.h<K> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266500a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.select.g> f266501b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f266502c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.select.sectioned_multiselect.Items.section_item.d> f266503d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d> f266504e;

    /* renamed from: f, reason: collision with root package name */
    public final O f266505f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.d f266506g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.core.di.k f266507h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.select.sectioned_multiselect.core.analytics.e f266508i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<io.reactivex.rxjava3.core.z<PaginationState>> f266509j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f266510k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f266511l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f266512m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<C27025b> f266513n;

    public L(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, O o12, com.avito.android.select.sectioned_multiselect.d dVar, com.avito.android.select.sectioned_multiselect.core.di.k kVar, com.avito.android.select.sectioned_multiselect.core.analytics.e eVar, Provider provider5, Provider provider6, dagger.internal.l lVar2, Provider provider7, Provider provider8) {
        this.f266500a = lVar;
        this.f266501b = provider;
        this.f266502c = provider2;
        this.f266503d = provider3;
        this.f266504e = provider4;
        this.f266505f = o12;
        this.f266506g = dVar;
        this.f266507h = kVar;
        this.f266508i = eVar;
        this.f266509j = provider5;
        this.f266510k = provider6;
        this.f266511l = lVar2;
        this.f266512m = provider7;
        this.f266513n = provider8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new K((Bundle) this.f266500a.f393949a, this.f266501b.get(), this.f266502c.get(), this.f266503d.get(), this.f266504e.get(), (N) this.f266505f.get(), (com.avito.android.select.sectioned_multiselect.b) this.f266506g.get(), (P) this.f266507h.get(), (com.avito.android.select.sectioned_multiselect.core.analytics.b) this.f266508i.get(), this.f266509j.get(), this.f266510k.get(), ((Boolean) this.f266511l.f393949a).booleanValue(), this.f266512m.get(), this.f266513n.get());
    }
}
