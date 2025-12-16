package com.avito.android.edit_address.mvi;

import com.avito.android.edit_address.entity.AddressDaysArray;
import com.avito.android.edit_address.entity.AddressWorkSchedule;
import jy.InterfaceC42444b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditAddressReducer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/edit_address/entity/AddressWorkSchedule;", "schedule", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class l extends N implements Y41.l<AddressWorkSchedule, AddressWorkSchedule> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42444b f145968l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC42444b interfaceC42444b) {
        super(1);
        this.f145968l = interfaceC42444b;
    }

    @Override // Y41.l
    public final AddressWorkSchedule invoke(AddressWorkSchedule addressWorkSchedule) {
        AddressDaysArray addressDaysArray = new AddressDaysArray(null, 1, null);
        addressDaysArray.d(((InterfaceC42444b.h) this.f145968l).f405908a);
        G0 g02 = G0.f406611a;
        return AddressWorkSchedule.a(addressWorkSchedule, addressDaysArray, null, null, 27);
    }
}
