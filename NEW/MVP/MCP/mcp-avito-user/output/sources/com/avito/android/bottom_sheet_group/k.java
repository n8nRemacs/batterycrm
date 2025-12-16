package com.avito.android.bottom_sheet_group;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BottomSheetGroupDialogPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f107398a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f107399b;

    /* renamed from: c, reason: collision with root package name */
    public final t f107400c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.bottom_sheet_group.items.checkable_item.c> f107401d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.bottom_sheet_group.items.multiselect_item.c> f107402e;

    /* renamed from: f, reason: collision with root package name */
    public final x f107403f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<BottomSheetGroupParameterWrapper> f107404g;

    public k(Provider provider, Provider provider2, t tVar, Provider provider3, Provider provider4, x xVar, Provider provider5) {
        this.f107398a = provider;
        this.f107399b = provider2;
        this.f107400c = tVar;
        this.f107401d = provider3;
        this.f107402e = provider4;
        this.f107403f = xVar;
        this.f107404g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f107398a.get();
        com.avito.konveyor.adapter.h hVar = this.f107399b.get();
        s sVar = (s) this.f107400c.get();
        com.avito.android.bottom_sheet_group.items.checkable_item.c cVar = this.f107401d.get();
        com.avito.android.bottom_sheet_group.items.multiselect_item.c cVar2 = this.f107402e.get();
        this.f107403f.getClass();
        return new j(interfaceC35745a5, hVar, sVar, cVar, cVar2, new w(), this.f107404g.get());
    }
}
