package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacDevicesBlock.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phones_list_screen_ui/content/iac_devices_block/e;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<DeviceListItem> f228204a;

    public e(@k List<DeviceListItem> list) {
        this.f228204a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.f228204a, ((e) obj).f228204a);
    }

    public final int hashCode() {
        return this.f228204a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("IacDevicesBlockState(devicesList="), this.f228204a, ')');
    }
}
