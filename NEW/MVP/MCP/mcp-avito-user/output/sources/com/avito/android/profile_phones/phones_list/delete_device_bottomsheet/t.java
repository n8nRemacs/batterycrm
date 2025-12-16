package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeleteDeviceBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class t extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeleteDeviceBottomSheetFragment f227629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f227630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f227631n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC22204y1 interfaceC22204y1, com.avito.android.lib.design.bottom_sheet.d dVar, DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment) {
        super(2);
        this.f227629l = deleteDeviceBottomSheetFragment;
        this.f227630m = dVar;
        this.f227631n = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment = this.f227629l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) deleteDeviceBottomSheetFragment.f227523l0.getValue(), androidx.compose.runtime.internal.r.c(1369269564, new s(this.f227631n, this.f227630m, deleteDeviceBottomSheetFragment), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
