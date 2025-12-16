package com.avito.android.advert.item.leasing_calculator.link_item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.leasing_calculator.link_item.c;
import jR.InterfaceC42298a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsLeasingLinkItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/link_item/e;", "Lcom/avito/android/advert/item/leasing_calculator/link_item/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28240u f77414b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.leasing_calculator.formatters.k f77415c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c.a f77416d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42298a f77417e;

    @Inject
    public e(@k InterfaceC28240u interfaceC28240u, @k com.avito.android.advert.item.leasing_calculator.formatters.k kVar, @k c.a aVar, @k InterfaceC42298a interfaceC42298a) {
        this.f77414b = interfaceC28240u;
        this.f77415c = kVar;
        this.f77416d = aVar;
        this.f77417e = interfaceC42298a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        String strA = this.f77415c.a(Long.valueOf(((AdvertDetailsLeasingLinkItem) aVar).f77405d));
        InterfaceC28240u interfaceC28240u = this.f77414b;
        if (strA == null) {
            gVar.b(null);
        } else {
            gVar.b(interfaceC28240u.h(strA));
        }
        gVar.Rb(interfaceC28240u.i(), new d(this));
    }
}
