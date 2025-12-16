package com.avito.android.edit_address.mvi;

import com.avito.android.edit_address.entity.AddressWorkSchedule;
import com.avito.android.edit_address.entity.TimeInterval;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditAddressReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/edit_address/entity/AddressWorkSchedule;", "schedule", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class k extends N implements Y41.l<AddressWorkSchedule, AddressWorkSchedule> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TimeInterval f145967l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TimeInterval timeInterval) {
        super(1);
        this.f145967l = timeInterval;
    }

    @Override // Y41.l
    public final AddressWorkSchedule invoke(AddressWorkSchedule addressWorkSchedule) {
        return AddressWorkSchedule.a(addressWorkSchedule, null, null, this.f145967l, 15);
    }
}
