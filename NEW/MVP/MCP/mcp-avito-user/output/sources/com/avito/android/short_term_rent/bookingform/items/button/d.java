package com.avito.android.short_term_rent.bookingform.items.button;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/button/d;", "LTV0/d;", "Lcom/avito/android/short_term_rent/bookingform/items/button/f;", "Lcom/avito/android/short_term_rent/bookingform/items/button/ButtonItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<f, ButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> f281478b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar) {
        this.f281478b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ButtonItem buttonItem = (ButtonItem) aVar;
        fVar.v0(buttonItem.f281467c);
        fVar.a(new c(this, buttonItem));
        ParametrizedEvent parametrizedEvent = buttonItem.f281469e;
        if (parametrizedEvent != null) {
            this.f281478b.invoke(new a.l(parametrizedEvent));
        }
    }
}
