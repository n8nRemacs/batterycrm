package com.avito.android.advert.item.gig.documents;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigPersonalInfoPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/gig/documents/g;", "Lcom/avito/android/advert/item/gig/documents/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f75731b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f75732c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final E f75733d;

    @Inject
    public g(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC28373a interfaceC28373a, @k E e12) {
        this.f75731b = aVar;
        this.f75732c = interfaceC28373a;
        this.f75733d = e12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        GigPersonalInfoItem gigPersonalInfoItem = (GigPersonalInfoItem) aVar;
        ((c) eVar).XD(new f(this), gigPersonalInfoItem.f75721d, gigPersonalInfoItem.f75722e);
    }
}
