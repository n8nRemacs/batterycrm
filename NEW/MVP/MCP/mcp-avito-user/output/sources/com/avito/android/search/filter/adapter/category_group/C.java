package com.avito.android.search.filter.adapter.category_group;

import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CategoryGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/C;", "Lcom/avito/android/lib/design/chips/h;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    public final int f262038b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Cp0.e f262039c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f262040d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f262041e;

    public C(int i12, @Y61.k Cp0.e eVar) {
        this.f262038b = i12;
        this.f262039c = eVar;
        this.f262040d = eVar.f2698c;
        this.f262041e = eVar.f2697b;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@Y61.k Object obj) {
        Cp0.e eVar;
        C c12 = obj instanceof C ? (C) obj : null;
        return (c12 == null || (eVar = c12.f262039c) == null || this.f262039c.getF247679b() != eVar.getF247679b()) ? false : true;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final CharSequence W() {
        return this.f262040d;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean g0() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    @InterfaceC42156l
    public final Integer getIconColor() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean isActive() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }
}
