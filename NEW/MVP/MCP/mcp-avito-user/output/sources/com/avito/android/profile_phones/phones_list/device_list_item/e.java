package com.avito.android.profile_phones.phones_list.device_list_item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeviceListItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/device_list_item/e;", "Lcom/avito/android/profile_phones/phones_list/device_list_item/c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f227655b;

    @Inject
    public e(@k i iVar) {
        this.f227655b = iVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        DeviceListItem deviceListItem = (DeviceListItem) aVar;
        gVar.HP(deviceListItem.f227646c, deviceListItem.f227647d);
        gVar.kn(new d(this, deviceListItem), deviceListItem.f227648e);
    }
}
