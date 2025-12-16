package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeleteDeviceBottomSheetArgument.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/delete_device_bottomsheet/mvi/DeleteDeviceBottomSheetArgument;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DeleteDeviceBottomSheetArgument implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<DeleteDeviceBottomSheetArgument> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeviceListItem f227594b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f227595c;

    /* compiled from: DeleteDeviceBottomSheetArgument.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeleteDeviceBottomSheetArgument> {
        @Override // android.os.Parcelable.Creator
        public final DeleteDeviceBottomSheetArgument createFromParcel(Parcel parcel) {
            DeviceListItem deviceListItemCreateFromParcel = DeviceListItem.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DeviceListItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DeleteDeviceBottomSheetArgument(deviceListItemCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DeleteDeviceBottomSheetArgument[] newArray(int i12) {
            return new DeleteDeviceBottomSheetArgument[i12];
        }
    }

    public DeleteDeviceBottomSheetArgument(@Y61.k DeviceListItem deviceListItem, @Y61.k ArrayList arrayList) {
        this.f227594b = deviceListItem;
        this.f227595c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteDeviceBottomSheetArgument)) {
            return false;
        }
        DeleteDeviceBottomSheetArgument deleteDeviceBottomSheetArgument = (DeleteDeviceBottomSheetArgument) obj;
        return L.f(this.f227594b, deleteDeviceBottomSheetArgument.f227594b) && L.f(this.f227595c, deleteDeviceBottomSheetArgument.f227595c);
    }

    public final int hashCode() {
        return this.f227595c.hashCode() + (this.f227594b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteDeviceBottomSheetArgument(deviceToDelete=");
        sb2.append(this.f227594b);
        sb2.append(", devicesForReplacement=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f227595c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f227594b.writeToParcel(parcel, i12);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f227595c, parcel);
        while (itZ.hasNext()) {
            ((DeviceListItem) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
