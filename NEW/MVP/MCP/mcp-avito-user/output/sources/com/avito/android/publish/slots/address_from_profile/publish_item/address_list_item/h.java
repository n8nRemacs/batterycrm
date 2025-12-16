package com.avito.android.publish.slots.address_from_profile.publish_item.address_list_item;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.analytics.InterfaceC33535v;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Y1;

/* compiled from: SelectAddressItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/address_list_item/h;", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/address_list_item/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f242867b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y1<com.avito.android.publish.slots.address_from_profile.publish_item.k> f242868c;

    @Inject
    public h(@Y61.k InterfaceC33535v interfaceC33535v, @Y61.k Y1<com.avito.android.publish.slots.address_from_profile.publish_item.k> y12) {
        this.f242867b = interfaceC33535v;
        this.f242868c = y12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.publish.slots.address_from_profile.publish_item.k kVar = (com.avito.android.publish.slots.address_from_profile.publish_item.k) aVar;
        ((j) eVar).Hh(kVar, new g(this, kVar));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        com.avito.android.publish.slots.address_from_profile.publish_item.k kVar = (com.avito.android.publish.slots.address_from_profile.publish_item.k) aVar;
        ((j) eVar).Hh(kVar, new g(this, kVar));
    }
}
