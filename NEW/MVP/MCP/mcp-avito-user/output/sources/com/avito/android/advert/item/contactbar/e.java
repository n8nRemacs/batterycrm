package com.avito.android.advert.item.contactbar;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.remote.model.advert_details.ContactBarData;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsContactBarPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/contactbar/e;", "Lcom/avito/android/advert/item/contactbar/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28265d f74882b;

    @Inject
    public e(@k InterfaceC28265d interfaceC28265d) {
        this.f74882b = interfaceC28265d;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertDetailsContactBarItem advertDetailsContactBarItem = (AdvertDetailsContactBarItem) aVar;
        gVar.E4(new d(this, gVar));
        ContactBarData contactBarData = advertDetailsContactBarItem.f74865g;
        InterfaceC28265d interfaceC28265d = this.f74882b;
        interfaceC28265d.fb(gVar, contactBarData);
        InterfaceC28265d.a.a(interfaceC28265d, gVar, advertDetailsContactBarItem.f74865g, advertDetailsContactBarItem.f74864f);
    }
}
