package ub0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeleteDeviceBottomSheetState.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/d;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ub0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C49016d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeviceListItem f440117a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<DeviceListItem> f440118b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f440119c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440120d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeviceListItem f440121e;

    public C49016d(@k DeviceListItem deviceListItem, @k List<DeviceListItem> list, @l Integer num, boolean z12) {
        this.f440117a = deviceListItem;
        this.f440118b = list;
        this.f440119c = num;
        this.f440120d = z12;
        this.f440121e = num != null ? (DeviceListItem) C42745f0.K(num.intValue(), list) : null;
    }

    public static C49016d a(C49016d c49016d, Integer num, boolean z12, int i12) {
        DeviceListItem deviceListItem = c49016d.f440117a;
        List<DeviceListItem> list = c49016d.f440118b;
        if ((i12 & 4) != 0) {
            num = c49016d.f440119c;
        }
        if ((i12 & 8) != 0) {
            z12 = c49016d.f440120d;
        }
        c49016d.getClass();
        return new C49016d(deviceListItem, list, num, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49016d)) {
            return false;
        }
        C49016d c49016d = (C49016d) obj;
        return L.f(this.f440117a, c49016d.f440117a) && L.f(this.f440118b, c49016d.f440118b) && L.f(this.f440119c, c49016d.f440119c) && this.f440120d == c49016d.f440120d;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f440117a.hashCode() * 31, 31, this.f440118b);
        Integer num = this.f440119c;
        return Boolean.hashCode(this.f440120d) + ((iE2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteDeviceBottomSheetState(deviceToDelete=");
        sb2.append(this.f440117a);
        sb2.append(", devicesForReplacement=");
        sb2.append(this.f440118b);
        sb2.append(", selectedReplacementDeviceIndex=");
        sb2.append(this.f440119c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f440120d, ')');
    }

    public /* synthetic */ C49016d(DeviceListItem deviceListItem, List list, Integer num, boolean z12, int i12, C42822w c42822w) {
        this(deviceListItem, list, num, (i12 & 8) != 0 ? false : z12);
    }
}
