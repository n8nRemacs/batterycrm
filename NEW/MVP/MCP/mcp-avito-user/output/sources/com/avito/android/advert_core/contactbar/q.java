package com.avito.android.advert_core.contactbar;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.anonymous_number_dialog.k;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.remote.model.advert_details.ContactBarData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kv.C43501a;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class q extends N implements Y41.l<C43501a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28266e f83242l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C28266e c28266e) {
        super(1);
        this.f83242l = c28266e;
    }

    @Override // Y41.l
    public final G0 invoke(C43501a c43501a) {
        String advertId;
        String advertId2;
        C28266e c28266e = this.f83242l;
        c28266e.getClass();
        AbstractC14250d.c cVar = AbstractC14250d.c.f9171c;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        boolean zF2 = L.f(interfaceC14249c, cVar);
        InterfaceC28373a interfaceC28373a = c28266e.f83195g;
        if (zF2) {
            ContactBarData contactBarData = c28266e.f83169M;
            if (contactBarData != null && (advertId2 = contactBarData.getAdvertId()) != null) {
                interfaceC28373a.c(new com.avito.android.analytics.call.a(advertId2, c28266e.f83181Y));
            }
            c28266e.f83173Q = null;
            c28266e.f83184a0 = true;
            c28266e.f83186b0 = System.currentTimeMillis();
        } else if (L.f(interfaceC14249c, k.a.f91297b)) {
            c28266e.Wa();
        } else if (L.f(interfaceC14249c, DetailsSheetLink.b.C3995b.f133240b)) {
            ContactBarData contactBarData2 = c28266e.f83169M;
            if (contactBarData2 != null && (advertId = contactBarData2.getAdvertId()) != null) {
                interfaceC28373a.c(new com.avito.android.analytics.call.a(advertId, c28266e.f83181Y));
            }
            c28266e.f83173Q = null;
        } else if (!(interfaceC14249c instanceof InterfaceC14249c.a)) {
            boolean z12 = interfaceC14249c instanceof InterfaceC14249c.b;
        }
        return G0.f406611a;
    }
}
