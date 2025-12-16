package com.avito.android.profile_phones.deep_linking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: DeviceDeletingSheetShowLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/DeviceDeletingSheetShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final /* data */ class DeviceDeletingSheetShowLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeviceDeletingSheetShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeviceListItem f227100b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f227101c;

    /* compiled from: DeviceDeletingSheetShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeviceDeletingSheetShowLink> {
        @Override // android.os.Parcelable.Creator
        public final DeviceDeletingSheetShowLink createFromParcel(Parcel parcel) {
            DeviceListItem deviceListItemCreateFromParcel = DeviceListItem.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DeviceListItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DeviceDeletingSheetShowLink(deviceListItemCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceDeletingSheetShowLink[] newArray(int i12) {
            return new DeviceDeletingSheetShowLink[i12];
        }
    }

    public DeviceDeletingSheetShowLink(@Y61.k DeviceListItem deviceListItem, @Y61.k ArrayList arrayList) {
        this.f227100b = deviceListItem;
        this.f227101c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceDeletingSheetShowLink)) {
            return false;
        }
        DeviceDeletingSheetShowLink deviceDeletingSheetShowLink = (DeviceDeletingSheetShowLink) obj;
        return L.f(this.f227100b, deviceDeletingSheetShowLink.f227100b) && L.f(this.f227101c, deviceDeletingSheetShowLink.f227101c);
    }

    public final int hashCode() {
        return this.f227101c.hashCode() + (this.f227100b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceDeletingSheetShowLink(deviceToDelete=");
        sb2.append(this.f227100b);
        sb2.append(", allDevices=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f227101c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f227100b.writeToParcel(parcel, i12);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f227101c, parcel);
        while (itZ.hasNext()) {
            ((DeviceListItem) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
