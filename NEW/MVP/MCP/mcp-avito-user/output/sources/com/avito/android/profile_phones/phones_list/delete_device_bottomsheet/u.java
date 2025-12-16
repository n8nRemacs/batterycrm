package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ub0.InterfaceC49013a;

/* compiled from: DeleteDeviceBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class u extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeleteDeviceBottomSheetFragment f227632l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment) {
        super(1);
        this.f227632l = deleteDeviceBottomSheetFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        ((B) this.f227632l.f227520i0.getValue()).accept(new InterfaceC49013a.b(num.intValue()));
        return G0.f406611a;
    }
}
