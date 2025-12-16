package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.device_replacement_bottom_sheet;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeviceReplacementBottomSheetFragment.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/delete_device_bottomsheet/device_replacement_bottom_sheet/h;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<DeviceListItem> f227571a;

    public h(@k List<DeviceListItem> list) {
        this.f227571a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.f227571a, ((h) obj).f227571a);
    }

    public final int hashCode() {
        return this.f227571a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("DeviceReplacementBottomSheetState(devices="), this.f227571a, ')');
    }
}
