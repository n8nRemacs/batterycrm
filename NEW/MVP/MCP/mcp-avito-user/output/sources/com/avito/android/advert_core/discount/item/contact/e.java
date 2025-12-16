package com.avito.android.advert_core.discount.item.contact;

import Y61.k;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.remote.model.advert_details.ContactBarData;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/discount/item/contact/e;", "LTV0/d;", "Lcom/avito/android/advert_core/discount/item/contact/g;", "Lcom/avito/android/advert_core/discount/item/contact/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28265d f83358b;

    @Inject
    public e(@k InterfaceC28265d interfaceC28265d) {
        this.f83358b = interfaceC28265d;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.E4(new d(this, gVar));
        ContactBarData contactBarData = aVar2.f83352d;
        InterfaceC28265d interfaceC28265d = this.f83358b;
        interfaceC28265d.fb(gVar, contactBarData);
        InterfaceC28265d.a.a(interfaceC28265d, gVar, aVar2.f83352d, aVar2.f83351c);
    }
}
