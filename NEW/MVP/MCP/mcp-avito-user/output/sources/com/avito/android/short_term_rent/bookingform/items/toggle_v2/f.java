package com.avito.android.short_term_rent.bookingform.items.toggle_v2;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ToggleV2Presenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/f;", "LTV0/d;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/c;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/ToggleV2Item;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements TV0.d<c, ToggleV2Item> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> f281738b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar) {
        this.f281738b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        ToggleV2Item toggleV2Item = (ToggleV2Item) aVar;
        cVar.k7(toggleV2Item.f281724d);
        cVar.i5(new e(this, toggleV2Item));
    }
}
