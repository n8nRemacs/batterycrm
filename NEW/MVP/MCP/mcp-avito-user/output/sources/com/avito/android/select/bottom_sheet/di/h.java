package com.avito.android.select.bottom_sheet.di;

import Zp0.InterfaceC19588c;
import com.avito.android.select.Arguments;
import com.avito.android.select.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBottomSheetModule_ProvideSelectDialogInteractor$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.android.select.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f265280a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f265281b;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f265280a = lVar;
        this.f265281b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Arguments arguments = (Arguments) this.f265280a.f393949a;
        InterfaceC19588c interfaceC19588c = (InterfaceC19588c) this.f265281b.f393949a;
        int i12 = c.f265261a;
        return (!arguments.isPaginationSuggest() || interfaceC19588c == null) ? new C(arguments.getVariants(), arguments.getVariantIdForEmptySearch()) : new com.avito.android.select.m(interfaceC19588c);
    }
}
