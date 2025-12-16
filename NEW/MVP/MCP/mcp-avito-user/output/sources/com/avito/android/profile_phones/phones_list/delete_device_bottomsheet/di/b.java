package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.DeleteDeviceBottomSheetFragment;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.DeleteDeviceBottomSheetArgument;
import h31.d;
import kotlin.Metadata;

/* compiled from: DeleteDeviceBottomSheetComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/delete_device_bottomsheet/di/b;", "", "a", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: DeleteDeviceBottomSheetComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/delete_device_bottomsheet/di/b$a;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment, @h31.b @k Resources resources, @h31.b @k DeleteDeviceBottomSheetArgument deleteDeviceBottomSheetArgument, @h31.b @k C28478k c28478k, @k c cVar);
    }

    void a(@k DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment);
}
