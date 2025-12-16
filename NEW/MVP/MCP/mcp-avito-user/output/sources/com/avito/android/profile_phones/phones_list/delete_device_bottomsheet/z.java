package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeleteDeviceBottomSheetFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class z extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f227644l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i12) {
        super(2);
        this.f227644l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f227644l | 1);
        List<DeviceListItem> list = v.f227633a;
        androidx.compose.runtime.B bE2 = a12.E(-1121302690);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            d.f227538a.getClass();
            com.akita.compose.theme.re23.c.a(false, d.f227542e, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new z(iA2);
        }
        return G0.f406611a;
    }
}
