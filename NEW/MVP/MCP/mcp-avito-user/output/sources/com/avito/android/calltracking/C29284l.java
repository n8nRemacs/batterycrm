package com.avito.android.calltracking;

import javax.inject.Provider;

/* compiled from: CalltrackingBottomSheetViewPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.calltracking.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29284l implements dagger.internal.h<C29283k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC29278f> f113751a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f113752b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f113753c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<l41.g<I>> f113754d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.calltracking.item.k f113755e;

    public C29284l(Provider provider, dagger.internal.l lVar, Provider provider2, Provider provider3, com.avito.android.calltracking.item.k kVar) {
        this.f113751a = provider;
        this.f113752b = lVar;
        this.f113753c = provider2;
        this.f113754d = provider3;
        this.f113755e = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29283k(this.f113751a.get(), (InterfaceC29287o) this.f113752b.f393949a, this.f113753c.get(), this.f113754d.get(), (com.avito.android.calltracking.item.j) this.f113755e.get());
    }
}
