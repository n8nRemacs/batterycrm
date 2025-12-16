package com.avito.android.advert.notes;

import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EditAdvertNotePresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f80940a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f80941b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f80942c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<c> f80943d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f80944e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f80945f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f80946g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f80947h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f80948i;

    public u(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6) {
        this.f80940a = lVar;
        this.f80941b = lVar2;
        this.f80942c = lVar3;
        this.f80943d = provider;
        this.f80944e = provider2;
        this.f80945f = provider3;
        this.f80946g = lVar4;
        this.f80947h = lVar5;
        this.f80948i = lVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t((String) this.f80940a.f393949a, (ContactBarData) this.f80941b.f393949a, (String) this.f80942c.f393949a, this.f80943d.get(), this.f80944e.get(), this.f80945f.get(), ((Boolean) this.f80946g.f393949a).booleanValue(), ((Boolean) this.f80947h.f393949a).booleanValue(), (String) this.f80948i.f393949a);
    }
}
