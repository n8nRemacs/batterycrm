package com.avito.android.profile_phones.phones_list;

import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import kotlin.G0;
import kotlin.Metadata;
import wb0.InterfaceC49590a;

/* compiled from: PhonesListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/device_list_item/DeviceListItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/phones_list/device_list_item/DeviceListItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile_phones.phones_list.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33427l extends kotlin.jvm.internal.N implements Y41.l<DeviceListItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhonesListFragment f227891l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33427l(PhonesListFragment phonesListFragment) {
        super(1);
        this.f227891l = phonesListFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeviceListItem deviceListItem) {
        PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
        this.f227891l.D5().accept(new InterfaceC49590a.c(deviceListItem));
        return G0.f406611a;
    }
}
